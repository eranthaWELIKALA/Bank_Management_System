
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Welikala EY
 */
public class DBConnect {
    private Connection connect;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public DBConnect() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/neluma","root","");
            st = connect.createStatement();
            }
        catch(SQLException ex){
            System.out.println(ex);
        }
    }
    public Connection returnConnection(){
        return this.connect;
    }
    public Statement returnStatement(){
        return this.st;
    }
    public void addAccount(String acc, String name, String dob, String password, String acc_type, String nationality, String caste,String gender, String mobile, String landline, String address, String branch,int balance) throws Exception{
        String query = "INSERT INTO `account` (`Acc`, `Name`, `DOB`, `Password`, `Acc_Type`, `Nationality`, `Caste`, `Gender`, `Mobile`, `Landline`, `Address`, `Branch`, `Balance`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?) ";
        pst = connect.prepareStatement(query);
        pst.setString(1, acc);
        pst.setString(2, name);
        pst.setString(3, dob);
        pst.setString(4, password);
        pst.setString(5, acc_type);
        pst.setString(6, nationality);
        pst.setString(7, caste);
        pst.setString(8, gender);
        pst.setString(9, mobile);
        pst.setString(10, landline);
        pst.setString(11, address);
        pst.setString(12, branch);
        pst.setInt(13, balance);        
        pst.execute(); 
        pst.close();
    }
    
    public void addBalance(int acc,int credit,int debit,int balance) throws SQLException{
        String query = "INSERT INTO `balance` (`Acc`, `Credit`, `Debit`, `Balance`) VALUES (?,?,?,?)";
        pst = connect.prepareStatement(query);
        pst.setInt(1,acc);
        pst.setInt(2,credit);
        pst.setInt(3,debit);
        pst.setInt(4,balance);
        pst.execute();
        pst.close();
    }
    //,int password
    public boolean verify(int acc) throws SQLException{
        String query = "select * from account where Acc=?";
        pst = connect.prepareStatement(query);
        pst.setInt(1, acc);
       // pst.setInt(2, password);
        rs = pst.executeQuery();
        pst.close();
        return rs.next();
    }
}
