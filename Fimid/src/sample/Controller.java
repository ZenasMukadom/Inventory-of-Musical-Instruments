package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.util.Callback;
import sample.connectivity.ConnectionClass;


public class Controller implements Initializable {

    @FXML
    private TreeTableView<String> tableView;
    @FXML
    private TreeTableColumn<String,String> column1;
    @FXML
    private TableView<Modaltable> tablecontents;
    @FXML
    private TableColumn<Modaltable,String> id;
    @FXML
    private TableColumn<Modaltable,String> familyName;
    @FXML
    private TableColumn<Modaltable,String> brandName;
    @FXML
    private TableColumn<Modaltable,String> modelName;
    @FXML
    private TableColumn<Modaltable,String> pricen;
    @FXML
    private TableColumn<Modaltable,String> shopName;
    @FXML
    private TableColumn<Modaltable,String> shopLocation;
    @FXML
    private TableColumn<Modaltable,String> availability;

    private Connection InsConn=null;
    private PreparedStatement ps=null;
    private Statement InsSt=null;
    private String SQLQuery3=null;
    private ResultSet rs=null;





    //BUTTONS

    private FXMLLoader fxmlLoader=null;
    private Parent root1=null;
    private Stage stage=null;
    @FXML
    ObservableList<Modaltable> oblist= FXCollections.observableArrayList();





    @Override
    public void initialize(URL url,ResourceBundle rb){
/*
        super1.getChildren().setAll(sub11,sub12,sub13);
        super2.getChildren().setAll(sub21,sub22,sub23);
        super3.getChildren().setAll(sub31,sub32,sub33);
        root.getChildren().setAll(super1,super2,super3);

        column1.setCellValueFactory(
                (TreeTableColumn.CellDataFeatures<String,String> param) -> new SimpleStringProperty(param.getValue().getValue()));
        tableView.setRoot(root);
*/

        Connection con= null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectimi","root","");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            ResultSet rs=con.createStatement().executeQuery("select *from instruments");
            while(rs.next()){
                oblist.add(new Modaltable(rs.getString("ID"),rs.getString("Family Name"),rs.getString("Brand Name"),rs.getString("Model Name"),
                        rs.getString("Price"),rs.getString("Shop Name"),rs.getString("Shop Location"),rs.getString("Availability")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        familyName.setCellValueFactory(new PropertyValueFactory<>("family"));
        brandName.setCellValueFactory(new PropertyValueFactory<>("brand"));
        modelName.setCellValueFactory(new PropertyValueFactory<>("modal"));
        pricen.setCellValueFactory(new PropertyValueFactory<>("price"));
        shopName.setCellValueFactory(new PropertyValueFactory<>("shopname"));
        shopLocation.setCellValueFactory(new PropertyValueFactory<>("shoploc"));
        availability.setCellValueFactory(new PropertyValueFactory<>("avail"));

        tablecontents.setItems(oblist);
    }
}