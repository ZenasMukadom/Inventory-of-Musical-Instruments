package sample;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;
import sun.reflect.generics.tree.Tree;

import java.awt.*;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.ResourceBundle;


public class tableview1 implements Initializable {

    @FXML
    private Label label1;

    @FXML
    private TableView bassguitartable;



    @Override
    public void initialize(URL url, ResourceBundle rbl){


        TableColumn id=new TableColumn("ID");
        TableColumn bname=new TableColumn("Brand Name");
        TableColumn mname=new TableColumn("Model Name");
        TableColumn price=new TableColumn("Price");

        bassguitartable.getColumns().addAll(id,bname,mname,price);

    }

}
