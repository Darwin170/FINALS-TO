package Controller;

import Model.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.AmbientLight;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class DrinksController implements Initializable {

    @FXML
    Label name9, name10, name11,name12,name13,name14,price9, price10, price11,price12,price13,price14;

    @FXML
    ImageView img9, img10, img11,img12,img13,img14;

    @FXML
    Button button9, button10, button11,button12,button13,button14, cartbutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController = HomeController.checkoutController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== SPRITE ==================//
        name9.setText(HomeController.Sp.getProductName());
        price9.setText(Double.toString(HomeController.Sp.getProductPrice()));
        Image sprite = new Image(HomeController.Sp.getProductImage());
        img9.setImage(sprite);

        // ============== PEPSI ==================//
        name10.setText(HomeController.pp.getProductName());
        price10.setText(Double.toString(HomeController.pp.getProductPrice()));
        Image pepsi = new Image(HomeController.pp.getProductImage());
        img10.setImage(pepsi);

        // ============== GULAMAN ==================//
        name11.setText(HomeController.GM.getProductName());
        price11.setText(Double.toString(HomeController.GM.getProductPrice()));
        Image gulaman = new Image(HomeController.GM.getProductImage());
        img11.setImage(gulaman);

        // ============== ICE TEA ==================//
        name12.setText(HomeController.IT.getProductName());
        price12.setText(Double.toString(HomeController.IT.getProductPrice()));
        Image icetea = new Image(HomeController.IT.getProductImage());
        img12.setImage(icetea);

        // ============== BUKO PANDAN ==================//
        name13.setText(HomeController.BP.getProductName());
        price13.setText(Double.toString(HomeController.BP.getProductPrice()));
        Image bukopandan= new Image(HomeController.BP.getProductImage());
        img13.setImage(bukopandan);

        // ============== MILO SHAKE ==================//
        name14.setText(HomeController.Ms.getProductName());
        price14.setText(Double.toString(HomeController.Ms.getProductPrice()));
        Image cornsilog = new Image(HomeController.Ms.getProductImage());
        img14.setImage(cornsilog);
    }

    public void buy(ActionEvent event) throws IOException {

         AlertMaker.showSimpleAlert("", "item added");

         Button sourceButton = (Button) event.getSource();

         //If addtocart Button is pressed, set product status to true

         if (sourceButton.equals(button9)) {
             HomeController.Sp.setProductStatus(true);
             checkoutController.addDrinks(checkoutController.pane9);
         }

            else if (sourceButton == button10) {
             HomeController.pp.setProductStatus(true);
             checkoutController.addDrinks(checkoutController.pane10);
         }

            else if (sourceButton == button11) {
             HomeController.GM.setProductStatus(true);
            checkoutController.addDrinks(checkoutController.pane11);
        }
            else if (sourceButton == button12) {
            HomeController. IT.setProductStatus(true);
             checkoutController.addDrinks(checkoutController.pane12);
       }
            else if (sourceButton == button13) {
            HomeController.BP.setProductStatus(true);
             checkoutController.addDrinks(checkoutController.pane13);
       }
       
            else if (sourceButton == button14) {
            HomeController. Ms.setProductStatus(true);
             checkoutController.addDrinks(checkoutController.pane14);
       }
       
     } 

   //Goes to Checkout.fxml
    
    public void gotocart(ActionEvent event) throws IOException {

        Scene scene = new Scene(HomeController.root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
