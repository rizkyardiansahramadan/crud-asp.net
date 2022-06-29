/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksidb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author lenov
 */
public class Konek {
    
    private static Connection konek;
    
    public static Connection getkonek(){
        if(konek == null){
        try{
           String url ="jdbc:mysql://localhost:3306/penjualan1";
           String user="root";
           String pass="";
           
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           konek=DriverManager.getConnection(url, user, pass);
               System.out.println("berhasil" );
        }catch(SQLException e){
            System.out.println("konek ke database gagal" );
        }
        }
        return konek;
    }
    public static void main(String args[]){
    getkonek();
}
}