import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddDVD extends JFrame{
    DigitalVideoDisc dvd = new DigitalVideoDisc(aims.getOrders().get(orderId).getItemsOrdered().size(),
                                                                txtTitle.getText(),
                                                                txtCategory.getText(),
                                                                txtDirector.getText(),
                                                                Float.parseFloat(txtCost.getText()),
                                                                Integer.parseInt(txtLength.getText()));
                    
                    try {
                        aims.addItemToOrder(orderId, dvd);
                    } catch (LimitExceededException e1) {
                        e1.printStackTrace();
                        error(txtMessage);
                    }
                    
                    newMedia = dvd;
}
public static void main(String args[]) {

}