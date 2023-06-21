package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ReceiptController implements Initializable {

    @FXML
    double item1Amount, item2Amount, item3Amount, item4Amount,item5Amount,item6Amount,item7Amount,item8Amount,item9Amount,
        item10Amount, item11Amount,item12Amount,item13Amount,item14Amount;

    @FXML
    Label qty1, qty2, qty3, qty4,qty5,qty6,qty7,qty8,qty9,qty10,qty11,qty12,qty13,qty14,
          name1, name2, name3, name4,name5,name6,name7,name8,name9,name10,name11,name12,name13,name14,
          price1, price2, price3, price4,price5,price6,price7,price8,price9,price10,price11,price12,price13,price14, 
          amount1,amount2, amount3, amount4,amount5,amount6,amount7,amount8,amount9,amount10,amount11,amount12,amount13,amount14,
            total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (HomeController.bu.getProductStatus()) {
            name1.setText(HomeController.bu.getProductName());
            qty1.setText(Double.toString(HomeController.bu.getProductQuantity()));
            price1.setText(Double.toString(HomeController.bu.getProductPrice()));
            amount1.setText(Double .toString(HomeController.bu.getProductPrice() * HomeController.bu.getProductQuantity()));
                   

            name1.setVisible(true);
            qty1.setVisible(true);
            price1.setVisible(true);
            amount1.setVisible(true);

            item1Amount = HomeController.bu.getProductPrice() * HomeController.bu.getProductQuantity();

        }

        if (HomeController.tn.getProductStatus()) {
            name2.setText(HomeController.tn.getProductName());
            qty2.setText(Double.toString(HomeController.tn.getProductQuantity()));
            price2.setText(Double.toString(HomeController.tn.getProductPrice()));
            amount2.setText(Double.toString(HomeController.tn.getProductPrice() * HomeController.tn.getProductQuantity()));
                    

            name2.setVisible(true);
            qty2.setVisible(true);
            price2.setVisible(true);
            amount2.setVisible(true);

            item2Amount = HomeController.tn.getProductPrice() * HomeController.tn.getProductQuantity();
        }

        if (HomeController.AM.getProductStatus()) {
            name3.setText(HomeController.AM.getProductName());
            qty3.setText(Double.toString(HomeController.AM.getProductQuantity()));
            price3.setText(Double.toString(HomeController.AM.getProductPrice()));
            amount3.setText(Double .toString(HomeController.AM.getProductPrice() * HomeController.AM.getProductQuantity()));

                   
            name3.setVisible(true);
            qty3.setVisible(true);
            price3.setVisible(true);
            amount3.setVisible(true);

            item3Amount = HomeController.AM.getProductPrice() * HomeController.AM.getProductQuantity();

        }

        if (HomeController.sn.getProductStatus()) {
            name4.setText(HomeController.sn.getProductName());
            qty4.setText(Double.toString(HomeController.sn.getProductQuantity()));
            price4.setText(Double.toString(HomeController.sn.getProductPrice()));
            amount4.setText(Double.toString(HomeController.sn.getProductPrice() * HomeController.sn.getProductQuantity()));
                    

            name4.setVisible(true);
            qty4.setVisible(true);
            price4.setVisible(true);
            amount4.setVisible(true);

            item4Amount = HomeController.sn.getProductPrice() *HomeController.sn.getProductQuantity();

        }
         if (HomeController.Ts.getProductStatus()) {
            name5.setText(HomeController.Ts.getProductName());
            qty5.setText(Double.toString(HomeController.Ts.getProductQuantity()));
            price5.setText(Double.toString(HomeController.Ts.getProductPrice()));
            amount5.setText(Double .toString(HomeController.Ts.getProductPrice() * HomeController.Ts.getProductQuantity()));
                   

            name5.setVisible(true);
            qty5.setVisible(true);
            price5.setVisible(true);
            amount5.setVisible(true);

            item5Amount = HomeController.Ts.getProductPrice() *HomeController.Ts.getProductQuantity();
         }
         if (HomeController.cs.getProductStatus()) {
            name6.setText(HomeController.cs.getProductName());
            qty6.setText(Double.toString(HomeController.cs.getProductQuantity()));
            price6.setText(Double.toString(HomeController.cs.getProductPrice()));
            amount6.setText(Double .toString(HomeController.cs.getProductPrice() * HomeController.cs.getProductQuantity()));

                   
            name6.setVisible(true);
            qty6.setVisible(true);
            price6.setVisible(true);
            amount6.setVisible(true);

            item6Amount = HomeController.cs.getProductPrice() *HomeController.cs.getProductQuantity();
         }
         if (HomeController.tc.getProductStatus()) {
            name7.setText(HomeController.tc.getProductName());
            qty7.setText(Double.toString(HomeController.tc.getProductQuantity()));
            price7.setText(Double.toString(HomeController.tc.getProductPrice()));
            amount7.setText(Double .toString(HomeController.tc.getProductPrice() * HomeController.tc.getProductQuantity()));
                   

            name7.setVisible(true);
            qty7.setVisible(true);
            price7.setVisible(true);
            amount7.setVisible(true);

            item7Amount = HomeController.tc.getProductPrice() *HomeController.tc.getProductQuantity();
         }
         if (HomeController.hs.getProductStatus()) {
            name8.setText(HomeController.hs.getProductName());
            qty8.setText(Double.toString(HomeController.hs.getProductQuantity()));
            price8.setText(Double.toString(HomeController.hs.getProductPrice()));
            amount8.setText(Double.toString(HomeController.hs.getProductPrice() * HomeController.hs.getProductQuantity()));

                    
            name8.setVisible(true);
            qty8.setVisible(true);
            price8.setVisible(true);
            amount8.setVisible(true);

            item8Amount = HomeController.hs.getProductPrice() *HomeController.hs.getProductQuantity();
         }
         if (HomeController.Sp.getProductStatus()) {
            name9.setText(HomeController.Sp.getProductName());
            qty9.setText(Double.toString(HomeController.Sp.getProductQuantity()));
            price9.setText(Double.toString(HomeController.Sp.getProductPrice()));
            amount9.setText(Double.toString(HomeController.Sp.getProductPrice() * HomeController.Sp.getProductQuantity()));

                    
            name9.setVisible(true);
            qty9.setVisible(true);
            price9.setVisible(true);
            amount9.setVisible(true);

            item9Amount = HomeController.Sp.getProductPrice() *HomeController.Sp.getProductQuantity();
         }
         if (HomeController.pp.getProductStatus()) {
            name10.setText(HomeController.pp.getProductName());
            qty10.setText(Double.toString(HomeController.pp.getProductQuantity()));
            price10.setText(Double.toString(HomeController.pp.getProductPrice()));
            amount10.setText(Double .toString(HomeController.pp.getProductPrice() * HomeController.pp.getProductQuantity()));
                   

            name10.setVisible(true);
            qty10.setVisible(true);
            price10.setVisible(true);
            amount10.setVisible(true);

            item10Amount = HomeController.pp.getProductPrice() *HomeController.pp.getProductQuantity();
         }
          if (HomeController.GM.getProductStatus()) {
            name11.setText(HomeController.GM.getProductName());
            qty11.setText(Double.toString(HomeController.GM.getProductQuantity()));
            price11.setText(Double.toString(HomeController.GM.getProductPrice()));
            amount11.setText(Double.toString(HomeController.GM.getProductPrice() * HomeController.GM.getProductQuantity()));

                    
            name11.setVisible(true);
            qty11.setVisible(true);
            price11.setVisible(true);
            amount11.setVisible(true);

            item11Amount = HomeController.GM.getProductPrice() *HomeController.GM.getProductQuantity();
         }
          if (HomeController.IT.getProductStatus()) {
            name12.setText(HomeController.IT.getProductName());
            qty12.setText(Double.toString(HomeController.IT.getProductQuantity()));
            price12.setText(Double.toString(HomeController.IT.getProductPrice()));
            amount12.setText(Double .toString(HomeController.IT.getProductPrice() * HomeController.IT.getProductQuantity()));

                   
            name12.setVisible(true);
            qty12.setVisible(true);
            price12.setVisible(true);
            amount12.setVisible(true);

            item12Amount = HomeController.IT.getProductPrice() *HomeController.IT.getProductQuantity();
         }
          if (HomeController.BP.getProductStatus()) {
            name13.setText(HomeController.BP.getProductName());
            qty13.setText(Double.toString(HomeController.BP.getProductQuantity()));
            price13.setText(Double.toString(HomeController.BP.getProductPrice()));
            amount13.setText(Double .toString(HomeController.BP.getProductPrice() * HomeController.BP.getProductQuantity()));
                   

            name13.setVisible(true);
            qty13.setVisible(true);
            price13.setVisible(true);
            amount13.setVisible(true);

            item13Amount = HomeController.BP.getProductPrice() *HomeController.BP.getProductQuantity();
         }
          if (HomeController.Ms.getProductStatus()) {
            name14.setText(HomeController.Ms.getProductName());
            qty14.setText(Double.toString(HomeController.Ms.getProductQuantity()));
            price14.setText(Double.toString(HomeController.Ms.getProductPrice()));
            amount14.setText(Double.toString(HomeController.Ms.getProductPrice() * HomeController.Ms.getProductQuantity()));
                    

            name14.setVisible(true);
            qty14.setVisible(true);
            price14.setVisible(true);
            amount14.setVisible(true);

            item14Amount = HomeController.Ms.getProductPrice() *HomeController.Ms.getProductQuantity();
         }
        double final_amount = item1Amount + item2Amount + item3Amount + item4Amount+item5Amount+item6Amount+item7Amount+item8Amount+item9Amount+item10Amount+item11Amount+item12Amount+item13Amount+item14Amount;
        
        total.setText(Double.toString(final_amount));

    }
}
