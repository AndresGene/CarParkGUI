import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Dimension;


public class DrawCarParkV2 extends JFrame
{
    public static void main(String [] args)
    { 
       JFrame frame = new JFrame("Car Park");
       frame.setSize(500, 400);
       
       JLabel AvailableSpaces = new JLabel("Number of Available Spaces:  ");
       JTextField spotdisplay = new JTextField(8);
       spotdisplay.setEditable(false);
       
       JLabel OccupiedSpaces = new JLabel("Number of Occupied Spaces: ");
       JTextField occupiedDisplay = new JTextField(8);
       occupiedDisplay.setEditable(false);
       
       JLabel OccupancyPercentage = new JLabel("Occupancy Percentage:           ");
       JTextField avaiabilityPercentage = new JTextField(8);
       avaiabilityPercentage.setEditable(false);
       
       JFrame spotCheckFrame = new JFrame("Spot Check");
       frame.setSize(800, 600);
       
       JLabel outputLabel = new JLabel("Spot is Occupied by:                  ");
       JTextField outputField = new JTextField(8);
       outputField.setEditable(false);
       
       JLabel spotCheck = new JLabel("Spot: ");
       JTextField spot = new JTextField(8);

       JButton addACar = new JButton("Add Car");
       JButton removeACar = new JButton("Remove Car");
       JButton searchSpots = new JButton("Search Available Spots");
       JButton checkSpots = new JButton("Check Spots");
       JButton getCapacity = new JButton("Get Capacity");
       
        Box verticalBox = Box.createVerticalBox();
 
        Box horizontalBox1 = Box.createHorizontalBox();
        Box horizontalBox2 = Box.createHorizontalBox();
        Box horizontalBox3 = Box.createHorizontalBox();
        Box horizontalBox4 = Box.createHorizontalBox();
        Box horizontalBox5 = Box.createHorizontalBox();
        
        horizontalBox1.add(AvailableSpaces);
        horizontalBox1.add(spotdisplay);
        
        horizontalBox2.add(OccupiedSpaces);
        horizontalBox2.add(occupiedDisplay);
        
        horizontalBox3.add(OccupancyPercentage);
        horizontalBox3.add(avaiabilityPercentage);
        
        horizontalBox4.add(outputLabel);
        horizontalBox4.add(outputField);
        
        horizontalBox5.add(addACar);
        horizontalBox5.add(removeACar);
        horizontalBox5.add(getCapacity);
        horizontalBox5.add(searchSpots);
        horizontalBox5.add(checkSpots);

        verticalBox.add(horizontalBox1);
        verticalBox.add(horizontalBox2);
        verticalBox.add(horizontalBox3);
        verticalBox.add(horizontalBox4);
        verticalBox.add(horizontalBox5);


     frame.add(verticalBox);
     frame.setVisible(true);
}
}
