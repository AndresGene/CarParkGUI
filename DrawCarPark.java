import javax.swing.*;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;


public class DrawCarPark extends javax.swing.JFrame
{
    public DrawCarPark()
    {   
        JButton addACar = new JButton("Add Car");
        JButton removeACar = new JButton("Remove Car");
        JButton searchCars = new JButton("Search Cars");


        JFrame frame = new JFrame();
        frame.add(new CarPark());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Car Park System");
        frame.setSize(435, 600);
        frame.setVisible(true);
        frame.setResizable(false);
    //frame.add(addACar);
    //frame.add(removeACar);
    //frame.add(searchCars);

    GroupLayout mainLayout = new GroupLayout(getContentPane());      //chosen to display components in group layout
    getContentPane().setLayout(mainLayout);
    mainLayout.setAutoCreateGaps(true);
    mainLayout.setAutoCreateContainerGaps(true);

    mainLayout.setHorizontalGroup(mainLayout.createSequentialGroup()
        .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(frame)
            .addGroup(mainLayout.createSequentialGroup()
                .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(addACar))
                .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(removeACar))
                .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(searchCars))))
            );

    mainLayout.setVerticalGroup(mainLayout.createSequentialGroup()
        .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(frame)
        .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(addACar)
            .addComponent(removeACar)
            .addComponent(searchCars)))
        );

    //addCarForm();
    //removeCarForm();
    //searchCarForm();
}

private void addCarForm()
{        
    /*JPanel panel = new JPanel();
    //frame.add(panel);
    panel.setSize(450, 650);
    panel.setVisible(true);
    panel.getSize();*/

    JLabel regNumLabel = new JLabel("Registration Number:");
    JLabel highValLabel = new JLabel("High Value?");
    JLabel largeLabel = new JLabel("Large Vehicle?");

    JRadioButton btnYesHighVal = new JRadioButton("Yes", false);
    JRadioButton btnNoHighVal = new JRadioButton("No", true);
    JRadioButton btnYesLarge = new JRadioButton("Yes", false);
    JRadioButton btnNoLarge = new JRadioButton("No", true);

    ButtonGroup highVal = new ButtonGroup();        //allows just one radio button from the group to be selected
    highVal.add(btnYesHighVal);
    highVal.add(btnNoHighVal);

    ButtonGroup largeCar = new ButtonGroup();       //allows just one radio button from the group to be selected
    largeCar.add(btnYesLarge);
    largeCar.add(btnNoLarge);

    JTextField regNumField = new JTextField();

    JButton addCar = new JButton("   Add  ");
    JButton addCancel = new JButton("Cancel");

    GroupLayout addLayout = new GroupLayout(getContentPane());      //chosen to display components in group layout
    getContentPane().setLayout(addLayout);
    addLayout.setAutoCreateGaps(true);
    addLayout.setAutoCreateContainerGaps(true);

    addLayout.setHorizontalGroup(addLayout.createSequentialGroup()
        .addGroup(addLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(regNumLabel)
            .addComponent(highValLabel)
            .addComponent(largeLabel))
        .addGroup(addLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(regNumField)
            .addGroup(addLayout.createSequentialGroup()
                .addGroup(addLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(btnYesHighVal)
                .addComponent(btnYesLarge))
            .addGroup(addLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(btnNoHighVal)
                .addComponent(btnNoLarge))))
        .addGroup(addLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(addCar)
            .addComponent(addCancel))
    );

    addLayout.setVerticalGroup(addLayout.createSequentialGroup()
        .addGroup(addLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(regNumLabel)
            .addComponent(regNumField)
            .addComponent(addCar))
        .addGroup(addLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGroup(addLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(highValLabel)
                    .addComponent(btnYesHighVal)
                    .addComponent(btnNoHighVal))
                .addGroup(addLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(largeLabel)    
                    .addComponent(btnYesLarge)
                    .addComponent(btnNoLarge)))
                .addComponent(addCancel))
        );

    setSize(375, 150);
    setTitle("Add Car");
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
}

private void removeCarForm()
{
    JLabel regNumLabel = new JLabel("Registration Number:");
    JTextField regNumField = new JTextField();
    JButton removeCar = new JButton("Remove");
    JButton removeCancel = new JButton("Cancel");

    GroupLayout removeLayout = new GroupLayout(getContentPane());
    getContentPane().setLayout(removeLayout);
    removeLayout.setAutoCreateGaps(true);
    removeLayout.setAutoCreateContainerGaps(true);

    removeLayout.setHorizontalGroup(removeLayout.createSequentialGroup()
        .addGroup(removeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(regNumLabel))
        .addGroup(removeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(regNumField))
        .addGroup(removeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(removeCar)
            .addComponent(removeCancel))
    );

    removeLayout.setVerticalGroup(removeLayout.createSequentialGroup()
        .addGroup(removeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(regNumLabel)
            .addComponent(regNumField)
            .addComponent(removeCar))
        .addGroup(removeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(removeCancel))
    );                

    setSize(375, 150);
    setTitle("Search Car");
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
}

private void searchCarForm()
{
    JLabel regNumLabel = new JLabel("Registration Number:");
    JTextField regNumField = new JTextField();
    JButton searchCar = new JButton("Search");
    JButton searchCancel = new JButton("Cancel");

    GroupLayout searchLayout = new GroupLayout(getContentPane());
    getContentPane().setLayout(searchLayout);
    searchLayout.setAutoCreateGaps(true);
    searchLayout.setAutoCreateContainerGaps(true);

    searchLayout.setHorizontalGroup(searchLayout.createSequentialGroup()
        .addGroup(searchLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(regNumLabel))
        .addGroup(searchLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(regNumField))
        .addGroup(searchLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(searchCar)
            .addComponent(searchCancel))
    );

    searchLayout.setVerticalGroup(searchLayout.createSequentialGroup()
        .addGroup(searchLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(regNumLabel)
            .addComponent(regNumField)
            .addComponent(searchCar))
        .addGroup(searchLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(searchCancel))
    );                

    setSize(375, 150);
    setTitle("Remove Car");
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
}

public static void main(String[]args)
{
    DrawCarPark carPark = new DrawCarPark();
    carPark.setVisible(true);
}
}