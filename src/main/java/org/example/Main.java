package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException{

        //String query = "create table contact (id INTEGER PRIMARY KEY AUTOINCREMENT,nom varchar(20) not null, prenom varchar(20) not null, numTel varchar(20) not null)";
        //Contact contact = new Contact();
        //contact.selectAllContacts();

       /* String url = "jdbc:sqlite:contacts.db";
        Connection conn = DriverManager.getConnection(url);

        //String query = "create table contacts (id INTEGER PRIMARY KEY AUTOINCREMENT,nom varchar(20) not null, prenom varchar(20) not null, numTel varchar(20) not null)";
        //String query = "insert into contacts values ('eunice', 'scintich', '09998877')";
        String query = "SELECT * FROM contacts";
        Statement state = conn.createStatement();
        //state.executeUpdate(query);
        /*int rows = state.executeUpdate(query);
        if(rows > 0){
            System.out.println("insertion ok");
        }*/
        /*ResultSet result = state.executeQuery(query);
        while (result.next()){
            Integer id = result.getInt("id");
            String nom = result.getString("nom");
            String prenom = result.getString("prenom");                String name = result.getString("nom");
            String numTel = result.getString("numTel");
            System.out.println(id + " | " + nom + " | " + prenom + " | " + numTel );

        }*/
        //System.out.println("Table créée");



        /*System.out.println("Hello world!");
        String jdbcUrl = "jdbc:sqlite:/C:\\Sqlite\\sqlite-tools-win32-x86-3400000\\usersdb.db";
        try{
            Connection connection = DriverManager.getConnection(jdbcUrl);
            //String sql = "SELECT * FROM contact";
            String sql = "SELECT rowid, * FROM contact";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()){
                Integer id = result.getInt("id");
                String nom = result.getString("nom");
                String prenom = result.getString("prenom");                String name = result.getString("nom");
                String numTel = result.getString("numTel");
                System.out.println(id + " | " + nom + " | " + prenom + " | " + numTel );

            }
        }
        catch (SQLException e){
            System.out.println("Erreur de connection à la base de données !!!");
            e.printStackTrace();
        }*/
    }
}