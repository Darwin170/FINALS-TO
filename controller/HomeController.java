package Controller;

import Model.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
import Alert.AlertMaker;

public class HomeController implements Initializable {

    @FXML
    Label name1, name2, name3,name4,name5,name6,name7,name8, price1, price2, price3,price4,price5,price6,price7,price8;

    @FXML
    ImageView img1, img2, img3,img4,img5,img6,img7,img8;

    @FXML
    Button button1, button2, button3,button4,button5,button6,button7,button8,Drinks ,cartbutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    static Parent root = null;

    FXMLLoader loader;

    @FXML
    static CheckoutController checkoutController = null;

    static AdobongManok AM = new AdobongManok();
    static Bulalo bu = new Bulalo();
    static Sinigang sn = new Sinigang();
    static Tinola tn= new Tinola();
    static Tapsilog Ts=new Tapsilog();
    static Cornsilog cs=new Cornsilog();
    static Tocinosilog tc= new Tocinosilog();
    static Hotsilog hs=new Hotsilog();

    static Sprite Sp = new Sprite();
    static Pepsi pp = new Pepsi();
    static Gulaman GM = new Gulaman();
    static Icetea IT= new Icetea();
    static  Bukopandan BP=new Bukopandan();
    static Miloshake Ms=new Miloshake();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== BULALO ==================//
        bu.setProductName("Bulalo");
        name1.setText(bu.getProductName());

        bu.setProductPrice(150.00);
        price1.setText(Double.toString(bu.getProductPrice()));

        bu.setProductImage("images/Bulalo.jpg");
        Image bulalo = new Image(bu.getProductImage());
        img1.setImage(bulalo);

        // ============== TINOLA ==================//

        tn.setProductName("Tinola");
        name2.setText(tn.getProductName());

        tn.setProductPrice(60.00);
        price2.setText(Double.toString(tn.getProductPrice()));

        tn.setProductImage("images/Tinola.jpg");
        Image tinola = new Image(tn.getProductImage());
        img2.setImage(tinola);

        // ============== ADOBONG MANOK ==================//
        AM.setProductName("Adobong Manok");
        name3.setText(AM.getProductName());

        AM.setProductPrice(70.00);
        price3.setText(Double.toString(AM.getProductPrice()));

        AM.setProductImage("Images/Adobong Manok.jpg");
        Image adobongmanok = new Image(AM.getProductImage());
        img3.setImage(adobongmanok);

        // ============== SINIGANG ==================//
        sn.setProductName("Sinigang");
        name4.setText(sn.getProductName());

        sn.setProductPrice(90.00);
        price4.setText(Double.toString(sn.getProductPrice()));

        sn.setProductImage("Images/Sinigang.jpg");
        Image sinigang = new Image(sn.getProductImage());
        img4.setImage(sinigang);

        // ============== TAPSILOG ==================//
        Ts.setProductName("Tapsilog");
        name5.setText(Ts.getProductName());

        Ts.setProductPrice(65.00);
        price5.setText(Double.toString(Ts.getProductPrice()));

        Ts.setProductImage("Images/Tapsilog.jpg");
        Image tapsilog = new Image(Ts.getProductImage());
        img5.setImage(tapsilog);

        // ============== CORNSILOG ==================//
        cs.setProductName("Cornsilog");
        name6.setText(cs.getProductName());

        cs.setProductPrice(50.00);
        price6.setText(Double.toString(cs.getProductPrice()));

        cs.setProductImage("Images/Cornsilog.jpg");
        Image cornsilog = new Image(cs.getProductImage());
        img6.setImage(cornsilog);

        // ============== TOCINOSILOG ==================//

        tc.setProductName("Tocinosilog");
        name7.setText(tc.getProductName());

        tc.setProductPrice(75.00);
        price7.setText(Double.toString(tc.getProductPrice()));

        tc.setProductImage("Images/Tocinosilog.jpg");
        Image tocinosilog = new Image(tc.getProductImage());
        img7.setImage(tocinosilog);

        // ============== HOTSILOG ==================//

        hs.setProductName("Hotsilog");
        name8.setText(hs.getProductName());

        hs.setProductPrice(40.00);
        price8.setText(Double.toString(hs.getProductPrice()));

        hs.setProductImage("Images/Tocinosilog.jpg");
        Image hotsilog = new Image(hs.getProductImage());
        img8.setImage(hotsilog);

 // ============== SPRITE ==================//
        Sp.setProductName("SPRITE");
        Sp.setProductPrice(30.00);
        Sp.setProductImage("Images/Sprite.png");
       
        // ============== PEPSI ==================//

        pp.setProductName("PEPSI");
        pp.setProductPrice(30.00);
        pp.setProductImage("Images/Pepsi.png");
        // ============== GULAMAN ==================//
        GM.setProductName("GULAMAN");
        GM.setProductPrice(35.00);
        GM.setProductImage("Images/Gulaman.png");
        
        // ============== ICE TEA ==================//
        IT.setProductName("Icetea");
        IT.setProductPrice(45.00);
        IT.setProductImage("Images/Icetea.png");
      
        // ============== BUKO PANDAN ==================//
        BP.setProductName("BUKO PANDAN");
        BP.setProductPrice(50.00);
        BP.setProductImage("Images/Bukopandan.jpg");
        
        // ============== MILO SHAKE ==================//
        Ms.setProductName("MILO SHAKE");
        Ms.setProductPrice(60.00);
        Ms.setProductImage("Images/Miloshake.jpg");
    
        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            root = loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());
        checkoutController.myvbox2.getChildren().removeAll(checkoutController.myvbox2.getChildren());
    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("", "item added");

         Button sourceButton = (Button) event.getSource();

         //If addtocart Button is pressed, set product status to true

         if (sourceButton.equals(button1)) {
             bu.setProductStatus(true);
             checkoutController.addFood(checkoutController.pane1);
         }

            else if (sourceButton == button2) {
             tn.setProductStatus(true);
             checkoutController.addFood(checkoutController.pane2);
         }

            else if (sourceButton == button3) {
             AM.setProductStatus(true);
            checkoutController.addFood(checkoutController.pane3);
        }
            else if (sourceButton == button4) {
             sn.setProductStatus(true);
             checkoutController.addFood(checkoutController.pane4);
       }
            else if (sourceButton == button5) {
             Ts.setProductStatus(true);
             checkoutController.addFood(checkoutController.pane5);
       }
       
            else if (sourceButton == button6) {
             cs.setProductStatus(true);
             checkoutController.addFood(checkoutController.pane6);
       }
            else if (sourceButton == button7) {
             tc.setProductStatus(true);
             checkoutController.addFood(checkoutController.pane7);
       }
            else if (sourceButton == button8) {
             hs.setProductStatus(true);
             checkoutController.addFood(checkoutController.pane8);
       }
     }

   //Goes to Checkout.fxml
    
    public void gotocart(ActionEvent event) throws IOException {

        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void gotodrinks(ActionEvent event) throws IOException {

       Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Drinks.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

}
