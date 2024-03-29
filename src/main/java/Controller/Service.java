/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Database.MyConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.List;
import javax.swing.JTable;
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
    public boolean UpdateData(String tableName, List<Object> columnNames, List<Object> textFields, String condition) {
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
            sql.append(" WHERE Id =").append(condition);

            st.executeUpdate(sql.toString());

            success = true; // Gán giá trị true cho biến success khi cập nhật thành công
        } catch (Exception e) {
            e.printStackTrace();
        }

        return success;
    }

    //-----------DeleteData
    public boolean DeleteData(String tableName, String condition) {
        boolean success = false;

        try {
            Statement st = conn.createStatement();
            String sql = "Delete from " + tableName + " Where Id=" + condition;

            st.executeUpdate(sql);

            success = true; // Gán giá trị true cho biến success khi cập nhật thành công
        } catch (Exception e) {
            e.printStackTrace();
        }

        return success;
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

}
