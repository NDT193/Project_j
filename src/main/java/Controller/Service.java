/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Database.MyConnect;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tuann
 */
public class Service {

    Connection conn = new MyConnect().getConnection();

//---------------Hàm Loadata-------------   
    public void Loadata(JTable table, String tablename) {
        try {
            Connection conn = new MyConnect().getConnection();
            if (conn != null) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tablename);

                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();

                // Thêm dữ liệu từ ResultSet vào DefaultTableModel
                while (resultSet.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = resultSet.getObject(i);
                    }
                    model.addRow(row);
                }

                resultSet.close();
                statement.close();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //-----------Hàm Addata
    public boolean Addata(String tableName, List<Object> columnNames, List<Object> textFields) {
        boolean success = false;

        try {
            Statement st = conn.createStatement();
            StringBuilder sql = new StringBuilder("INSERT INTO " + tableName + " (");

            // Thêm danh sách tên cột vào câu lệnh SQL
            for (int i = 0; i < columnNames.size(); i++) {
                String columnName = (String) columnNames.get(i);
                sql.append(columnName);
                if (i < columnNames.size() - 1) {
                    sql.append(", ");
                }
            }

            sql.append(") VALUES (");

            for (int i = 0; i < textFields.size(); i++) {
                if (isInteger(textFields.get(i).toString())) {
                    sql.append(textFields.get(i));
                } else {
                    sql.append("'").append(textFields.get(i)).append("'");
                }
                if (i < textFields.size() - 1) {
                    sql.append(", ");
                }
            }

            sql.append(")");

            st.executeUpdate(sql.toString());

            success = true; // Gán giá trị true cho biến success khi thêm thành công
        } catch (Exception e) {
            e.printStackTrace();
        }

        return success;

    }

    //-------------UpdateData--------
    public boolean UpdateData(String tableName, String column, List<Object> columnNames, List<Object> textFields, String condition) {
        boolean success = false;

        try {
            Statement st = conn.createStatement();
            StringBuilder sql = new StringBuilder("UPDATE " + tableName + " SET ");

            // Xây dựng phần SET của câu lệnh UPDATE
            for (int i = 0; i < columnNames.size(); i++) {
                String columnName = (String) columnNames.get(i);
                Object columnValue = textFields.get(i);
                sql.append(columnName).append(" = ");
                if (isInteger(columnValue.toString())) {
                    sql.append(columnValue);
                } else {
                    sql.append("'").append(columnValue).append("'");
                }
                if (i < columnNames.size() - 1) {
                    sql.append(", ");
                }
            }

            // Thêm điều kiện WHERE vào câu lệnh UPDATE
            if (isInteger(condition.toString())) {
                sql.append(" WHERE ").append(column).append(" = ").append(condition);
            } else {
                sql.append(" WHERE ").append(column).append(" = ").append("'").append(condition).append("'");
            }

            st.executeUpdate(sql.toString());

            success = true; // Gán giá trị true cho biến success khi cập nhật thành công
        } catch (Exception e) {
            e.printStackTrace();
        }

        return success;
    }

    //-----------DeleteData---------
    public boolean DeleteData(String tableName, String columname, String key) {
        boolean success = false;

        try {
            Statement st = conn.createStatement();
            String sql = "Delete from " + tableName + " where " + columname + " = " + "'" + key + "'";

            st.executeUpdate(sql);

            success = true; // Gán giá trị true cho biến success khi cập nhật thành công
        } catch (Exception e) {
            e.printStackTrace();
        }

        return success;
    }

    //------------SearchData-------
    public void Searchdata(JTable table, String tablename, String column, String key) {
        try {
            Connection conn = new MyConnect().getConnection();
            if (conn != null) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tablename + " WHERE " + column + " LIKE '%" + key + "%'");

                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();

                // Thêm dữ liệu từ ResultSet vào DefaultTableModel
                while (resultSet.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = resultSet.getObject(i);
                    }
                    model.addRow(row);
                }

                resultSet.close();
                statement.close();

            }

        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    //------------PushData2Txt------
    public void PushDataTotxt(JTable table, JTextField[] textFields) {
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) { // Kiểm tra chỉ nhấp chuột một lần
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        int columnCount = model.getColumnCount();
                        if (columnCount == textFields.length) {
                            for (int i = 0; i < columnCount; i++) {
                                Object value = model.getValueAt(selectedRow, i);
                                textFields[i].setText(value != null ? value.toString() : "");
                            }
                        } else {
                            System.out.println("Số cột của bảng không khớp với số lượng textfield");
                        }
                    }
                }
            }
        });

    }

    //---------------- Đẩy dữ liệu lên text box và combobox
    public void PushDataToComponent(JTable table, JComponent[] components) {
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        int columnCount = model.getColumnCount();
                        if (columnCount == components.length) {
                            for (int i = 0; i < columnCount; i++) {
                                Object value = model.getValueAt(selectedRow, i);
                                JComponent component = components[i];
                                if (component instanceof JTextField) {
                                    ((JTextField) component).setText(value != null ? value.toString() : "");
                                } else if (component instanceof JComboBox) {
                                    JComboBox comboBox = (JComboBox) component;
                                    comboBox.setSelectedItem(value);
                                }
                            }
                        } else {
                            System.out.println("Số cột của bảng không khớp với số lượng thành phần");
                        }
                    }
                }
            }
        });
    }

    //----------Lấy dữ liệu lên combobox--------
    public ArrayList<String> SetData4combobox(String column, String table) {
        ArrayList<String> data = new ArrayList<>();

        try {
            // Tạo kết nối đến cơ sở dữ liệu
            Connection conn = new MyConnect().getConnection();

            // Tạo câu truy vấn SQL
            String sql = " SELECT " + column + " FROM " + table;

            // Thực thi câu truy vấn
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // Lấy dữ liệu từ kết quả truy vấn và thêm vào ArrayList
            while (resultSet.next()) {
                String item = resultSet.getString("maDm");
                data.add(item);
            }

            // Đóng kết nối và các tài nguyên
            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return data;
    }

    //-----------------
    private boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //----------------SwitchPanel------
    public void Switch(JPanel panel1, JPanel panel2) {
        panel1.removeAll();
        panel1.add(panel2,BorderLayout.CENTER);
        panel1.revalidate();
        panel1.repaint();
    }

    public boolean isPrimaryKeyDuplicate(String tableName, String columnName, String value) {
        boolean isDuplicate = false;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        Connection conn = new MyConnect().getConnection();
        try {
            String query = "SELECT COUNT(*) FROM " + tableName + " WHERE " + columnName + " = ?";
            statement = conn.prepareStatement(query);
            statement.setString(1, value);

            // Thực thi truy vấn
            resultSet = statement.executeQuery();

            // Kiểm tra kết quả
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                isDuplicate = (count > 0);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDuplicate;
    }
    //--------Login------
    public boolean Login(String tableName,String user , String pass,String role) {
        boolean success = false;

        ResultSet resultSet = null;
        Connection conn = new MyConnect().getConnection();
        try {
            Statement st = conn.createStatement();
            StringBuilder sql = new StringBuilder("SELECT COUNT(*) FROM " + tableName 
               + " where  username = '"+user+"' and password = '" +pass+ "' and role = '" + role + "'"  );

             resultSet = st.executeQuery(sql.toString());
              if (resultSet.next()) {
                int count = resultSet.getInt(1);
                success = (count > 0);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return success;

    }
    
    
}