/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author tuann
 */
public class Test_Connect {
    public static void main(String[] args) {
        try{
           Connection conn = new MyConnect().getConnection();
            if(conn !=null)
            {
                System.out.println("Ket noi db thanh cong");
            }
            else
                System.out.println("ket noi ko thanh cong");

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
