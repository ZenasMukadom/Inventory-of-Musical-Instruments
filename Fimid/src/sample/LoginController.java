package sample;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;
import sun.reflect.generics.tree.Tree;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable{

    @FXML
    private Button submitform;
    @FXML
    private Button custid;
    @FXML
    private Label imislabe1l;
    @FXML
    private TextField userid;
    @FXML
    private PasswordField passid;


    private FXMLLoader fxmlLoader=null;
    private Parent root1=null;
    private Stage stage=null;


    public void CustomerLoginAction() throws  IOException{


                fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
                root1 = (Parent) fxmlLoader.load();
                stage = new Stage();
                stage.setTitle("Main Page");
                stage.setScene(new Scene(root1));
                stage.show();
            }



    public void AdminLoginAction() throws  IOException{

        if(userid.getText().equals("user")&& passid.getText().equals("user")){
            try {
                fxmlLoader = new FXMLLoader(getClass().getResource("tab.fxml"));
                root1 = (Parent) fxmlLoader.load();
                stage = new Stage();
                stage.setTitle("Main Page");
                stage.setScene(new Scene(root1));
                stage.show();
            }
            catch (Exception e){
                System.err.print(e);
            }

        }
        else{
            System.out.println("Login Falied");
        }
    }



    @Override
    public void initialize(URL url, ResourceBundle rbl){


    }

}
