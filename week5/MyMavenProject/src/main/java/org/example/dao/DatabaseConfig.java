package org.example.dao;

import java.sql.*;

public class DatabaseConfig {
    static Connection connection=null;
    static PreparedStatement crunchifyPrepareStat = null;
    public static void main(String [] args){
        try{
            System.out.println("Testing JDBC connection by adding values to customer table");
            makeJDBCConnection();
//            addDataToDB("Nurlanbek","Tashpolotov","0777777777","Kyrgyzstan,Biskek, Chui 11");
//            addDataToDB("Kasym","Usonov","0777777778","Kyrgyzstan,Osh, Datka 12");
//            editCustomerFirstName("Nurlanbek","Nurlan");
//            deleteCustomer("Kasym");
            getDataFromDB();

            crunchifyPrepareStat.close();
            connection.close();

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    private static void makeJDBCConnection (){
        String url="jdbc:mysql://localhost:3306/mydb";
        String username="root";
        String password="1111";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);

        }
        catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
            return;
        }
    }
    private static void addDataToDB(String firstName, String lastName, String phoneNumber, String address) {

        try {
            String insertQueryStatement = "INSERT  INTO  customer  VALUES  (default,?,?,?,?)";

            crunchifyPrepareStat = connection.prepareStatement(insertQueryStatement);
            crunchifyPrepareStat.setString(1, firstName);
            crunchifyPrepareStat.setString(2, lastName);
            crunchifyPrepareStat.setString(3, phoneNumber);
            crunchifyPrepareStat.setString(4, address);

            // execute insert SQL statement
            crunchifyPrepareStat.executeUpdate();
            System.out.println("Customer "+firstName + " added successfully");
        } catch (

                SQLException e) {
            e.printStackTrace();
        }
    }
    private static void editCustomerFirstName(String firstName,String newName){
        try {
            String insertQueryStatement = "update customer set firstName = ? where firstName = ?";

            crunchifyPrepareStat = connection.prepareStatement(insertQueryStatement);
            crunchifyPrepareStat.setString(1, newName);
            crunchifyPrepareStat.setString(2, firstName);

            crunchifyPrepareStat.executeUpdate();
            System.out.println("Customer's firstName "+firstName + " updated successfully to "+ newName);
        } catch (

                SQLException e) {
            e.printStackTrace();
        }
    }
    private static void deleteCustomer(String firstName){
        try {
            String insertQueryStatement = "delete from customer where firstName = ?";

            crunchifyPrepareStat = connection.prepareStatement(insertQueryStatement);
            crunchifyPrepareStat.setString(1, firstName);

            crunchifyPrepareStat.executeUpdate();
            System.out.println("Customer " +firstName + " deleted successfully from DB");
        } catch (

                SQLException e) {
            e.printStackTrace();
        }
    }
    private static void getDataFromDB(){
        try{
            String getQueryStatement ="Select * from customer";
            crunchifyPrepareStat = connection.prepareStatement(getQueryStatement);
            ResultSet rs=crunchifyPrepareStat.executeQuery();
            System.out.println("\n---------- Let's get Data from DB ----------");
            while (rs.next()){
                System.out.format("%s, %s, %s, %s\n",rs.getString("firstName"),rs.getString("lastName"),rs.getString("phoneNumber"),rs.getString("address"));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

}

