import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;

public class CarPark extends javax.swing.JPanel
{
private void draw(Graphics g)
{
    Graphics2D g2 = (Graphics2D) g;

    //Draw carpark boundary
    g2.drawLine(20, 20, 400, 20);
    g2.drawLine(20, 450, 20, 20);
    g2.drawLine(20, 450, 400, 450);
    g2.drawLine(400, 20, 400, 140);
    g2.drawLine(400, 330, 400, 450);

    g2.drawString("ENTER", 370, 180);           //labels
    g2.drawString("EXIT", 375, 300);

    g2.setColor(Color.WHITE);                   //attendants box
    g2.fill3DRect(330, 200, 70, 70, true);   

    g2.setColor(Color.BLACK);                   
    g2.drawString("Attendant", 338, 230);
    g2.drawString("Station", 345, 245);
    g2.drawRect(330, 200, 70, 70);

    g2.setColor(Color.GREEN);
    g2.fillRect(40, 40, 50, 100);       //8         first row spaces
    g2.fillRect(110, 40, 50, 100);      //7
    g2.fillRect(180, 40, 50, 100);      //6
    g2.fillRect(250, 60, 40, 80);       //2
    g2.fillRect(310, 60, 40, 80);       //1

    g2.setColor(Color.BLACK);           //drawRect palces a black border around shape
    g2.drawRect(40, 40, 50, 100);   
    g2.drawRect(110, 40, 50, 100);  
    g2.drawRect(180, 40, 50, 100);    
    g2.drawRect(250, 60, 40, 80);   
    g2.drawRect(310, 60, 40, 80);

    g2.setColor(Color.GREEN);                       //second row spaces
    g2.fillRect(90, 195, 40, 80);       //13
    g2.fillRect(150, 195, 40, 80);      //12
    g2.fillRect(210, 195, 40, 80);      //11
    g2.fillRect(270, 195, 40, 80);      //3

    g2.setColor(Color.BLACK);
    g2.drawRect(90, 195, 40, 80);  
    g2.drawRect(150, 195, 40, 80);
    g2.drawRect(210, 195, 40, 80);
    g2.drawRect(270, 195, 40, 80);

    g2.setColor(Color.GREEN);                       //3rd row spaces
    g2.fillRect(30, 330, 40, 80);       //15
    g2.fillRect(90, 330, 40, 80);      //14
    g2.fillRect(150, 330, 50, 100);     //10
    g2.fillRect(220, 330, 50, 100);     //9
    g2.fillRect(290, 330, 40, 80);      //5
    g2.fillRect(350, 330, 40, 80);      //4

    g2.setColor(Color.BLACK);
    g2.drawRect(30, 330, 40, 80);
    g2.drawRect(90, 330, 40, 80);
    g2.drawRect(150, 330, 50, 100);
    g2.drawRect(220, 330, 50, 100);
    g2.drawRect(290, 330, 40, 80);
    g2.drawRect(350, 330, 40, 80);

    g2.drawString("1", 328, 105);       //place labels on each shape
    g2.drawString("2", 268, 105);
    g2.drawString("3", 288, 240);
    g2.drawString("4", 368, 375);
    g2.drawString("5", 308, 375);
    g2.drawString("6", 203, 95);
    g2.drawString("7", 133, 95);
    g2.drawString("8", 63, 95);
    g2.drawString("9", 242, 385);
    g2.drawString("10", 168, 385);
    g2.drawString("11", 225, 240);
    g2.drawString("12", 165, 240);
    g2.drawString("13", 105, 240);
    g2.drawString("14", 103, 375);
    g2.drawString("15", 43, 375);
}

@Override
public void paintComponent(Graphics g)
{
    draw(g);
}

}