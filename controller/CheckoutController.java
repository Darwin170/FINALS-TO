package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckoutController implements Initializable {

    @FXML
    Pane pane1, pane2, pane3,pane4,pane5,pane6,pane7,pane8,pane9,pane10,pane11,pane12,pane13,pane14;

    @FXML
    VBox myvbox,myvbox2;

    @FXML
    Label name1, name2, name3,name4,name5,name6,name7,name8,name9,name10,name11,name12,name13,name14,
     price1, price2, price3,price4,price5,price6,price7,price8,price9,price10,price11,price12,price13,price14, 
     total;

    @FXML
    ImageView img1, img2, img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14;

    @FXML
    private ChoiceBox<String> choicebox1, choicebox2, choicebox3,choicebox4,choicebox5,choicebox6,choicebox7,choicebox8,choicebox9,choicebox10,
    choicebox11,choicebox12,choicebox13,choicebox14;

    private String[] quantity = { "1", "2", "3" };

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        name1.setText(HomeController.bu.getProductName());
        price1.setText(Double.toString(HomeController.bu.getProductPrice()));
        Image bulalo = new Image(HomeController.bu.getProductImage());
        img1.setImage(bulalo);

        name2.setText(HomeController.tn.getProductName());
        price2.setText(Double.toString(HomeController.tn.getProductPrice()));
        Image tinola = new Image(HomeController.tn.getProductImage());
        img2.setImage(tinola);

        name3.setText(HomeController.AM.getProductName());
        price3.setText(Double.toString(HomeController.AM.getProductPrice()));
        Image adobongmanok = new Image(HomeController.AM.getProductImage());
        img3.setImage(adobongmanok);

        name4.setText(HomeController.sn.getProductName());
        price4.setText(Double.toString(HomeController.sn.getProductPrice()));
        Image sinigang= new Image(HomeController.sn.getProductImage());
        img4.setImage(sinigang);

        name5.setText(HomeController.Ts.getProductName());
        price5.setText(Double.toString(HomeController.Ts.getProductPrice()));
        Image tapsilog= new Image(HomeController.Ts.getProductImage());
        img5.setImage(tapsilog);

        name6.setText(HomeController.cs.getProductName());
        price6.setText(Double.toString(HomeController.cs.getProductPrice()));
        Image cornsilog= new Image(HomeController.cs.getProductImage());
        img6.setImage(cornsilog);
        
        name7.setText(HomeController.tc.getProductName());
        price7.setText(Double.toString(HomeController.tc.getProductPrice()));
        Image tocinosilog= new Image(HomeController.tc.getProductImage());
        img7.setImage(tocinosilog);

        name8.setText(HomeController.hs.getProductName());
        price8.setText(Double.toString(HomeController.hs.getProductPrice()));
        Image hotsilog= new Image(HomeController.hs.getProductImage());
        img8.setImage(hotsilog);

        name9.setText(HomeController.Sp.getProductName());
        price9.setText(Double.toString(HomeController.Sp.getProductPrice()));
        Image sprite= new Image(HomeController.Sp.getProductImage());
        img9.setImage(sprite);

        name10.setText(HomeController.pp.getProductName());
        price10.setText(Double.toString(HomeController.pp.getProductPrice()));
        Image pepsi= new Image(HomeController.pp.getProductImage());
        img10.setImage(pepsi);

        name11.setText(HomeController.GM.getProductName());
        price11.setText(Double.toString(HomeController.GM.getProductPrice()));
        Image gulaman= new Image(HomeController.GM.getProductImage());
        img11.setImage(gulaman);
        
        name12.setText(HomeController.IT.getProductName());
        price12.setText(Double.toString(HomeController.IT.getProductPrice()));
        Image icetea= new Image(HomeController.IT.getProductImage());
        img12.setImage(icetea);

        name13.setText(HomeController.BP.getProductName());
        price13.setText(Double.toString(HomeController.BP.getProductPrice()));
        Image bukopandan= new Image(HomeController.BP.getProductImage());
        img13.setImage(bukopandan);

        name14.setText(HomeController.Ms.getProductName());
        price14.setText(Double.toString(HomeController.Ms.getProductPrice()));
        Image miloshake= new Image(HomeController.Ms.getProductImage());
        img14.setImage(miloshake);
        
        
        
        
        // Set default quantities in choicebox to 1
        choicebox1.setValue("1");
        choicebox2.setValue("1");
        choicebox3.setValue("1");
        choicebox4.setValue("1");
        choicebox5.setValue("1");
        choicebox6.setValue("1");
        choicebox7.setValue("1");
        choicebox8.setValue("1");
        choicebox9.setValue("1");
        choicebox10.setValue("1");
        choicebox11.setValue("1");
        choicebox12.setValue("1");
        choicebox13.setValue("1");
        choicebox14.setValue("1");
        

        // Insert quantity array to choicebox
        choicebox1.getItems().addAll(quantity);
        choicebox2.getItems().addAll(quantity);
        choicebox3.getItems().addAll(quantity);
        choicebox4.getItems().addAll(quantity);
        choicebox5.getItems().addAll(quantity);
        choicebox6.getItems().addAll(quantity);
        choicebox7.getItems().addAll(quantity);
        choicebox8.getItems().addAll(quantity);
        choicebox9.getItems().addAll(quantity);
        choicebox10.getItems().addAll(quantity);
        choicebox11.getItems().addAll(quantity);
        choicebox12.getItems().addAll(quantity);
        choicebox13.getItems().addAll(quantity);
        choicebox14.getItems().addAll(quantity);
        // Add event handler on all choiceboxes
        choicebox1.setOnAction(this::computeTotal);
        choicebox2.setOnAction(this::computeTotal);
        choicebox3.setOnAction(this::computeTotal);
        choicebox4.setOnAction(this::computeTotal);
        choicebox5.setOnAction(this::computeTotal);
        choicebox6.setOnAction(this::computeTotal);
        choicebox7.setOnAction(this::computeTotal);
        choicebox8.setOnAction(this::computeTotal);
        choicebox9.setOnAction(this::computeTotal);
        choicebox10.setOnAction(this::computeTotal);
        choicebox11.setOnAction(this::computeTotal);
        choicebox12.setOnAction(this::computeTotal);
        choicebox13.setOnAction(this::computeTotal);
        choicebox14.setOnAction(this::computeTotal);
    }

    
    public void addFood(Pane pane) {
        myvbox.getChildren().add(pane);
    }
    public void addDrinks(Pane pane){
        myvbox2.getChildren().add(pane);
    }

    public void computeTotal(ActionEvent event) {

        double totalAmount = 0;
        double item1Amount = 0;
        double item2Amount = 0;
        double item3Amount = 0;
        double item4Amount = 0;
        double item5Amount = 0;
        double item6Amount = 0;
        double item7Amount = 0;
        double item8Amount = 0;
        double item9Amount = 0;
        double item10Amount = 0;
        double item11Amount = 0;
        double item12Amount = 0;
        double item13Amount = 0;
        double item14Amount = 0;

        ChoiceBox source = (ChoiceBox) event.getSource();

        // If product is chosen, compute item amount
        if (HomeController.bu.getProductStatus()) {

            double qty = Double.parseDouble(choicebox1.getValue());
            HomeController.bu.setProductQuantity(qty);
            item1Amount = HomeController.bu.getProductPrice() * qty;

            if (source == choicebox1) {
                item1Amount = HomeController.bu.getProductPrice() * qty;
                
            }
        }

        if (HomeController.tn.getProductStatus()) {

            double qty = Double.parseDouble(choicebox2.getValue());
            HomeController.tn.setProductQuantity(qty);
            item2Amount = HomeController.tn.getProductPrice() * qty;

            if (source == choicebox2) {
                item2Amount = HomeController.tn.getProductPrice() * qty;
            }
        }

        if (HomeController.AM.getProductStatus()) {

            double qty = Double.parseDouble(choicebox3.getValue());
            HomeController.AM.setProductQuantity(qty);
            item3Amount = HomeController.AM.getProductPrice() * qty;

            if (source == choicebox3) {
                item3Amount = HomeController.AM.getProductPrice() * qty;
            }
        }
         if (HomeController.sn.getProductStatus()) {

            double qty = Double.parseDouble(choicebox4.getValue());
            HomeController.sn.setProductQuantity(qty);
            item4Amount = HomeController.sn.getProductPrice() * qty;

            if (source == choicebox4) {
                item4Amount = HomeController.sn.getProductPrice() * qty;
            }
        }
         if (HomeController.Ts.getProductStatus()) {

            double qty = Double.parseDouble(choicebox5.getValue());
            HomeController.Ts.setProductQuantity(qty);
            item5Amount = HomeController.Ts.getProductPrice() * qty;

            if (source == choicebox5) {
                item5Amount = HomeController.Ts.getProductPrice() * qty;
            }
        }
         if (HomeController.cs.getProductStatus()) {

            double qty = Double.parseDouble(choicebox6.getValue());
            HomeController.cs.setProductQuantity(qty);
            item6Amount = HomeController.cs.getProductPrice() * qty;

            if (source == choicebox6) {
                item6Amount = HomeController.cs.getProductPrice() * qty;
            }
        }
         if (HomeController.tc.getProductStatus()) {

            double qty = Double.parseDouble(choicebox7.getValue());
            HomeController.tc.setProductQuantity(qty);
            item7Amount = HomeController.tc.getProductPrice() * qty;

            if (source == choicebox7) {
                item7Amount = HomeController.tc.getProductPrice() * qty;
            }
        }
         if (HomeController.hs.getProductStatus()) {

            double qty = Double.parseDouble(choicebox8.getValue());
            HomeController.hs.setProductQuantity(qty);
            item8Amount = HomeController.hs.getProductPrice() * qty;

            if (source == choicebox8) {
                item8Amount = HomeController.hs.getProductPrice() * qty;
            }

         
        }
        if (HomeController.Sp.getProductStatus()) {

            double qty = Double.parseDouble(choicebox9.getValue());
            HomeController.Sp.setProductQuantity(qty);
            item9Amount = HomeController.Sp.getProductPrice() * qty;

            if (source == choicebox9) {
                item9Amount = HomeController.Sp.getProductPrice() * qty;
            }

       }
        if (HomeController.pp.getProductStatus()) {

            double qty = Double.parseDouble(choicebox10.getValue());
            HomeController.pp.setProductQuantity(qty);
            item10Amount = HomeController.pp.getProductPrice() * qty;

            if (source == choicebox10) {
                item10Amount = HomeController.pp.getProductPrice() * qty;
            }
       }
        if (HomeController.GM.getProductStatus()) {

            double qty = Double.parseDouble(choicebox11.getValue());
            HomeController.GM.setProductQuantity(qty);
            item11Amount = HomeController.GM.getProductPrice() * qty;

            if (source == choicebox11) {
                item11Amount = HomeController.GM.getProductPrice() * qty;
            }
       }
        if (HomeController.IT.getProductStatus()) {

            double qty = Double.parseDouble(choicebox12.getValue());
            HomeController.IT.setProductQuantity(qty);
            item12Amount = HomeController.IT.getProductPrice() * qty;

            if (source == choicebox12) {
                item12Amount = HomeController.IT.getProductPrice() * qty;
            }

       }
        if (HomeController.BP.getProductStatus()) {

            double qty = Double.parseDouble(choicebox13.getValue());
            HomeController.BP.setProductQuantity(qty);
            item13Amount = HomeController.BP.getProductPrice() * qty;

            if (source == choicebox10) {
                item13Amount = HomeController.BP.getProductPrice() * qty;
            }

       }
        if (HomeController.Ms.getProductStatus()) {

            double qty = Double.parseDouble(choicebox14.getValue());
            HomeController.Ms.setProductQuantity(qty);
            item14Amount = HomeController.Ms.getProductPrice() * qty;

            if (source == choicebox14) {
                item14Amount = HomeController.Ms.getProductPrice() * qty;
            }

       }
       
        
     // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount +item4Amount + item5Amount+ item6Amount + item7Amount + item8Amount + item9Amount + item10Amount + item11Amount + item12Amount + item13Amount + item14Amount;
    // Display total amount in total label
        total.setText(Double.toString(totalAmount));
        

}

    public void getInitialAmount() {

        double totalAmount = 0.00;

        if (HomeController.bu.getProductStatus()) {
            totalAmount += HomeController.bu.getProductPrice();
        }

        if (HomeController.tn.getProductStatus()) {
            totalAmount += HomeController.tn.getProductPrice();
        }

        if (HomeController.AM.getProductStatus()) {
            totalAmount += HomeController.AM.getProductPrice();
        }
        if (HomeController.sn.getProductStatus()) {
            totalAmount += HomeController.sn.getProductPrice();
        }
        if (HomeController.Ts.getProductStatus()) {
            totalAmount += HomeController.Ts.getProductPrice();
        }
        if (HomeController.cs.getProductStatus()) {
            totalAmount += HomeController.cs.getProductPrice();
        }
        if (HomeController.tc.getProductStatus()) {
            totalAmount += HomeController.tc.getProductPrice();
        }
        if (HomeController.hs.getProductStatus()) {
            totalAmount += HomeController.hs.getProductPrice();
        }
         if (HomeController.Sp.getProductStatus()) {
            totalAmount += HomeController.Sp.getProductPrice();
        }
         if (HomeController.pp.getProductStatus()) {
            totalAmount += HomeController.pp.getProductPrice();
        }
         if (HomeController.GM.getProductStatus()) {
            totalAmount += HomeController.GM.getProductPrice();
        }
         if (HomeController.IT.getProductStatus()) {
            totalAmount += HomeController.IT.getProductPrice();
        }
         if (HomeController.BP.getProductStatus()) {
            totalAmount += HomeController.BP.getProductPrice();
        }
         if (HomeController.Ms.getProductStatus()) {
            totalAmount += HomeController.Ms.getProductPrice();
        }

        total.setText(Double.toString(totalAmount));
    }

    public void checkout(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Receipt.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
