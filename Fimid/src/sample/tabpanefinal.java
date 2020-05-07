package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class tabpanefinal implements Initializable {

    @FXML
    private TreeTableView<String> tableView;
    @FXML
    private TreeTableColumn<String,String> column1;
    @FXML
    private TableView<Modaltable> keyboardobj;
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
    @FXML
    private Tab keyboardtab;

    private Connection InsConn=null;
    private PreparedStatement ps=null;
    private Statement InsSt=null;
    private String SQLQuery3=null;
    private ResultSet rs=null;









    @FXML
    ObservableList<Modaltable> oblist= FXCollections.observableArrayList();



    @Override
    public void initialize(URL location, ResourceBundle resources) {

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



        keyboardobj.setItems(oblist);

    }
}
