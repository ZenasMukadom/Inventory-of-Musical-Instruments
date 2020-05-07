package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;
import sample.connectivity.ConnectionClass;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class tabpane  implements Initializable {

    @FXML
    private Label insertLabel;
    @FXML
    private Label deleteLabel;
    @FXML
    private Label updateLabel;
    @FXML
    private TabPane tabView;
    @FXML
    private Tab insertTab;
    @FXML
    private Tab deleteTab;
    @FXML
    private Tab updateTab;
    @FXML
    private TextField insertId;
    @FXML
    private TextField insertFname;
    @FXML
    private TextField insertBname;
    @FXML
    private TextField insertMname;
    @FXML
    private TextField insertPrice;
    @FXML
    private TextField insertSname;
    @FXML
    private TextField insertLname;
    @FXML
    private TextField insertAvail;
    @FXML
    private TextField deleteid;
    @FXML
    private TextField updateid;
    @FXML
    private TextField updateavil;
    @FXML
    private TextField updateprice;



    @FXML
    private Button insertButton;
    @FXML
    private Button updateButton;
    @FXML
    private Button deleteButton;


    private Alert alert = new Alert(Alert.AlertType.INFORMATION);

    private String Fname,Bname,Mname,price,Sname,id,Slname,avail;
    private Connection InsConn=null;
    private PreparedStatement ps=null;
    private Statement InsSt=null;
    private String SQLQuery=null;
    private String SQLQuery1=null;
    private String SQLQuery2=null;
    private String SQLQuery3=null ;
    private Alert ialert = new Alert(Alert.AlertType.INFORMATION);
    private ResultSet rs=null;

    public void getUserData(){
        id=insertId.getText();
        Fname = insertFname.getText();
        Bname=insertBname.getText();
        Mname=insertMname.getText();
        price=insertPrice.getText();
        Sname=insertSname.getText();
        Slname=insertLname.getText();
        avail=insertAvail.getText();


    }


    public void insertButtonAction()throws SQLException {

        System.out.println("Query");
        try {

            InsConn=ConnectionClass.getConnection();
            InsSt=InsConn.createStatement();

        //    SQLQuery2="INSERT INTO projectimi.`instruments` (`ID`, `Family Name`, `Brand Name`, `Model Name`, `Price`, `Shop Name`, `Shop Location`, `Availability`) VALUES (NULL, 'Guitar', 'Cort', 'A1', '12', 'asd', 'asda', '5');";
            SQLQuery3="INSERT INTO projectimi.`instruments` (`ID`,`Family Name`, `Brand Name`, `Model Name`, `Price`, `Shop Name`, `Shop Location`, `Availability`) VALUES ('"+insertId.getText()+"','"+insertFname.getText()+"', '"+insertBname.getText()+"', '"+insertMname.getText()+"','"+insertPrice.getText()+"','"+insertSname.getText()+"', '"+insertLname.getText()+"','"+insertAvail.getText()+"');";
            InsSt.executeUpdate(SQLQuery3);



            System.out.println("\n LOG :: DATA INSERTED");
            insertLabel.setText("Record Inserted");
        }catch (SQLException e){
            System.err.println(e);
            System.out.println("Query");
        }finally {
            if(InsSt!=null){
                InsSt.close();
                System.out.println("close statement");
            }
            if(InsConn!=null){
                InsConn.close();
                System.out.println("close connection");
            }
        }
    }


    public void updateButtonAction()throws SQLException {

        try {

            InsConn=ConnectionClass.getConnection();
            InsSt=InsConn.createStatement();
            SQLQuery3="UPDATE `instruments` SET Price='"+updateprice.getText()+"',Availability='"+updateavil.getText()+"' WHERE `instruments`.`ID`='"+updateid.getText()+"';";
            InsSt.executeUpdate(SQLQuery3);
            System.out.println("\n LOG :: DATA UPDATED");
            updateLabel.setText("Record Updated");
        }catch (SQLException e){
            System.err.print(e);
        }finally {
            if(InsSt!=null){
                InsSt.close();
            }
            if(InsConn!=null){
                InsConn.close();
            }
        }


    }




    public void deleteButtonAction()throws SQLException {

        try {

            InsConn=ConnectionClass.getConnection();
            InsSt=InsConn.createStatement();
            SQLQuery3="DELETE FROM `instruments` WHERE `instruments`.`ID`=  '"+deleteid.getText()+"';";
            InsSt.executeUpdate(SQLQuery3);
            System.out.println("\n LOG :: DATA Deleted");
            deleteLabel.setText("Record Deleted");
        }catch (SQLException e){
            System.err.print(e);
        }finally {
            if(InsSt!=null){
                InsSt.close();
            }
            if(InsConn!=null){
                InsConn.close();
            }
        }


    }


    @Override
    public void initialize(URL url, ResourceBundle rbl){



    }

}


