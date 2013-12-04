import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.lang.*;
/**
 *  Collection of buttons, panels, labels, text fields, and text areas that makes up the Joe's Airline GUI
 * 
 * @author Austin Herr 
 * @version 1.0
 */
public class PlaneGui extends JPanel
{
    //
    JLabel nameLabel, addressLabel, phoneLabel, row, col;
    JButton zeroZero, zeroOne, zeroTwo, oneZero, oneOne, oneTwo,
            twoZero, twoOne, twoTwo, threeZero, threeOne, threeTwo,
            fourZero, fourOne, fourTwo, fiveZero, fiveOne, fiveTwo,
            sixZero, sixOne, sixTwo, sevenZero, sevenOne, sevenTwo,
            eightZero, eightOne, eightTwo, nineZero, nineOne, nineTwo;
    JButton makeReservation, checkReservation, cancelReservation, clear, search;
    JPanel planePanelZero, planePanelOne, planePanelTwo, planePanelThree, planePanelFour,
           planePanelFive, planePanelSix, planePanelSeven, planePanelEight, planePanelNine,
           topThree, middleThree, bottomThree, last, topSection, finalLayout, inputPanel,
           namePanel, addressPanel, phonePanel, actionPanel, seatPanel1, seatPanel2, finalSeat, clearSearch;
    JTextField passengerName, passengerPhone, passengerSeatRow, passengerSeatCol;   
    JTextArea passengerAddress;
    Plane bob = new Plane();
    
    public PlaneGui()
    {
        //initializes all of the buttons
        init();
        
        //makes all of the non-plane buttons and attaches action listeners
        makeReservation = new JButton("Make Reservation");
        makeReservation.addActionListener(new makeListener());
        checkReservation = new JButton("View Reservation");
        checkReservation.addActionListener(new checkListener());
        cancelReservation = new JButton("Cancel Reservation");
        cancelReservation.addActionListener(new cancelListener());
        clear = new JButton("Clear");
        clear.addActionListener(new clearListener());
        search = new JButton("Search");
        search.addActionListener(new searchListener());
        passengerSeatRow = new JTextField(1);
        passengerSeatCol = new JTextField(1);
        passengerSeatRow.setEditable(true);
        passengerSeatCol.setEditable(true);
        
        //makes the clearSearch panel to be added to the GUI
        clearSearch = new JPanel();
        clearSearch.setLayout(new BorderLayout());
        clearSearch.add(clear, BorderLayout.EAST);
        clearSearch.add(search, BorderLayout.WEST);
        
        //adds all of the action buttons to a single Panel
        actionPanel = new JPanel();
        actionPanel.setLayout(new BorderLayout());
        actionPanel.add(makeReservation, BorderLayout.WEST);
        actionPanel.add(checkReservation, BorderLayout.CENTER);
        actionPanel.add(cancelReservation, BorderLayout.EAST);
        actionPanel.add(clearSearch, BorderLayout.SOUTH);
        
        //makes the first row of the plane buttons
        planePanelZero = new JPanel();
        planePanelZero.setLayout(new BorderLayout());
        planePanelZero.add(zeroZero, BorderLayout.WEST);
        planePanelZero.add(zeroOne, BorderLayout.CENTER);
        planePanelZero.add(zeroTwo, BorderLayout.EAST);
        
        //makes the second row of plane buttons
        planePanelOne = new JPanel();
        planePanelOne.setLayout(new BorderLayout());
        planePanelOne.add(oneZero, BorderLayout.WEST);
        planePanelOne.add(oneOne, BorderLayout.CENTER);
        planePanelOne.add(oneTwo, BorderLayout.EAST);
        
        //makes the third row of the plane buttons
        planePanelTwo = new JPanel();
        planePanelTwo.setLayout(new BorderLayout());
        planePanelTwo.add(twoZero, BorderLayout.WEST);
        planePanelTwo.add(twoOne, BorderLayout.CENTER);
        planePanelTwo.add(twoTwo, BorderLayout.EAST);
        
        //makes the fourth row of plane buttons
        planePanelThree = new JPanel();
        planePanelThree.setLayout(new BorderLayout());
        planePanelThree.add(threeZero, BorderLayout.WEST);
        planePanelThree.add(threeOne, BorderLayout.CENTER);
        planePanelThree.add(threeTwo, BorderLayout.EAST);
        
        //makes the fifth row of plane buttons
        planePanelFour = new JPanel();
        planePanelFour.setLayout(new BorderLayout());
        planePanelFour.add(fourZero, BorderLayout.WEST);
        planePanelFour.add(fourOne, BorderLayout.CENTER);
        planePanelFour.add(fourTwo, BorderLayout.EAST);
        
        //makes the sixth row of plane buttons
        planePanelFive = new JPanel();
        planePanelFive.setLayout(new BorderLayout());
        planePanelFive.add(fiveZero, BorderLayout.WEST);
        planePanelFive.add(fiveOne, BorderLayout.CENTER);
        planePanelFive.add(fiveTwo, BorderLayout.EAST);
        
        //makes the seventh row of plane buttons
        planePanelSix = new JPanel();
        planePanelSix.setLayout(new BorderLayout());
        planePanelSix.add(sixZero, BorderLayout.WEST);
        planePanelSix.add(sixOne, BorderLayout.CENTER);
        planePanelSix.add(sixTwo, BorderLayout.EAST);
        
        //makes the eigth row of plane buttons
        planePanelSeven = new JPanel();
        planePanelSeven.setLayout(new BorderLayout());
        planePanelSeven.add(sevenZero, BorderLayout.WEST);
        planePanelSeven.add(sevenOne, BorderLayout.CENTER);
        planePanelSeven.add(sevenTwo, BorderLayout.EAST);
        
        //makes the ninth row of plane buttons
        planePanelEight = new JPanel();
        planePanelEight.setLayout(new BorderLayout());
        planePanelEight.add(eightZero, BorderLayout.WEST);
        planePanelEight.add(eightOne, BorderLayout.CENTER);
        planePanelEight.add(eightTwo, BorderLayout.EAST);
        
        //makes the tenth row of plane buttons
        planePanelNine = new JPanel();
        planePanelNine.setLayout(new BorderLayout());
        planePanelNine.add(nineZero, BorderLayout.WEST);
        planePanelNine.add(nineOne, BorderLayout.CENTER);
        planePanelNine.add(nineTwo, BorderLayout.EAST);
        
        //adds the top 3 rows to one panel
        topThree = new JPanel();
        topThree.setLayout(new BorderLayout());
        topThree.add(planePanelZero, BorderLayout.NORTH);
        topThree.add(planePanelOne, BorderLayout.CENTER);
        topThree.add(planePanelTwo, BorderLayout.SOUTH);
        
        //adds the middle 3 rows to one panel
        middleThree = new JPanel();
        middleThree.setLayout(new BorderLayout());
        middleThree.add(planePanelThree, BorderLayout.NORTH);
        middleThree.add(planePanelFour, BorderLayout.CENTER);
        middleThree.add(planePanelFive, BorderLayout.SOUTH);
        
        //adds the bottom 3 rows to one panel
        bottomThree = new JPanel();
        bottomThree.setLayout(new BorderLayout());
        bottomThree.add(planePanelSix, BorderLayout.NORTH);
        bottomThree.add(planePanelSeven, BorderLayout.CENTER);
        bottomThree.add(planePanelEight, BorderLayout.SOUTH);
        
        //adds the last row to one panel
        last = new JPanel();
        last.setLayout(new BorderLayout());
        last.add(planePanelNine, BorderLayout.NORTH);
        
        //adds all of the plane button rows to one panel
        topSection = new JPanel();
        topSection.setLayout(new BorderLayout());
        topSection.add(topThree, BorderLayout.NORTH);
        topSection.add(middleThree, BorderLayout.CENTER);
        topSection.add(bottomThree, BorderLayout.SOUTH);
        
        //sets the various text fields
        passengerName = new JTextField(25);
        passengerName.setEditable(true);
        passengerAddress = new JTextArea(5, 25);
        passengerAddress.setMargin(new Insets(5,5,5,5));
        passengerAddress.setEditable(true);
        passengerPhone = new JTextField(10);
        passengerPhone.setEditable(true);
        
        //sets the name panel
        namePanel = new JPanel();
        namePanel.setLayout(new BorderLayout());
        namePanel.add(nameLabel, BorderLayout.WEST);
        namePanel.add(passengerName, BorderLayout.EAST);
        
        //sets the address panel
        addressPanel = new JPanel();
        addressPanel.setLayout(new BorderLayout());
        addressPanel.add(addressLabel, BorderLayout.WEST);
        addressPanel.add(passengerAddress, BorderLayout.EAST);
        
        //sets the phone panel
        phonePanel= new JPanel();
        phonePanel.setLayout(new BorderLayout());
        phonePanel.add(phoneLabel, BorderLayout.WEST);
        phonePanel.add(passengerPhone, BorderLayout.EAST);
        
        //sets the seat row panel
        seatPanel1 = new JPanel();
        seatPanel1.setLayout(new BorderLayout());
        seatPanel1.add(row, BorderLayout.WEST);
        seatPanel1.add(passengerSeatRow, BorderLayout.EAST);
        
        //sets the seat column panel
        seatPanel2 = new JPanel();
        seatPanel2.setLayout(new BorderLayout());
        seatPanel2.add(col, BorderLayout.WEST);
        seatPanel2.add(passengerSeatCol, BorderLayout.EAST);
        
        //adds the row and column panels to one panel
        finalSeat = new JPanel();
        finalSeat.setLayout(new BorderLayout());
        finalSeat.add(seatPanel1, BorderLayout.WEST);
        finalSeat.add(seatPanel2, BorderLayout.EAST);
        
        //adds the name, address, and phone number panels to one panel
        inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(namePanel, BorderLayout.NORTH);
        inputPanel.add(addressPanel, BorderLayout.CENTER);
        inputPanel.add(phonePanel, BorderLayout.SOUTH);
        
        //adds all of the plane buttons and seat buttons to one panel
        finalLayout = new JPanel();
        finalLayout.setLayout(new BorderLayout());
        finalLayout.add(topSection, BorderLayout.NORTH);
        finalLayout.add(last, BorderLayout.CENTER);
        finalLayout.add(finalSeat, BorderLayout.SOUTH);
        
        //adds all of the buttons and panels to one layout
        setLayout(new BorderLayout());
        add(finalLayout, BorderLayout.EAST);
        add(inputPanel, BorderLayout.WEST);
        add(actionPanel, BorderLayout.SOUTH);
        
    }
    /** 
     * initializes all of the buttons and labels
     */
    public void init()
    {
        phoneLabel = new JLabel("Phone");
        nameLabel = new JLabel("Name:");
        addressLabel = new JLabel("Address:");
        col = new JLabel("Column");
        row = new JLabel("Row");
        zeroZero = new JButton("");
        zeroZero.setBackground(Color.green);
        zeroZero.setOpaque(true);
        zeroOne = new JButton("");
        zeroOne.setBackground(Color.green);
        zeroOne.setOpaque(true);
        zeroTwo = new JButton("");
        zeroTwo.setBackground(Color.green);
        zeroTwo.setOpaque(true);
        oneZero = new JButton("");
        oneZero.setBackground(Color.green);
        oneZero.setOpaque(true);
        oneOne = new JButton("");
        oneOne.setBackground(Color.green);
        oneOne.setOpaque(true);
        oneTwo = new JButton("");
        oneTwo.setBackground(Color.green);
        oneTwo.setOpaque(true);
        twoZero = new JButton("");
        twoZero.setBackground(Color.green);
        twoZero.setOpaque(true);
        twoOne = new JButton("");
        twoOne.setBackground(Color.green);
        twoOne.setOpaque(true);
        twoTwo = new JButton("");
        twoTwo.setBackground(Color.green);
        twoTwo.setOpaque(true);
        threeZero = new JButton("");
        threeZero.setBackground(Color.green);
        threeZero.setOpaque(true);
        threeOne = new JButton("");
        threeOne.setBackground(Color.green);
        threeOne.setOpaque(true);
        threeTwo = new JButton("");
        threeTwo.setBackground(Color.green);
        threeTwo.setOpaque(true);
        fourZero = new JButton("");
        fourZero.setBackground(Color.green);
        fourZero.setOpaque(true);
        fourOne = new JButton("");
        fourOne.setBackground(Color.green);
        fourOne.setOpaque(true);
        fourTwo = new JButton("");
        fourTwo.setBackground(Color.green);
        fourTwo.setOpaque(true);
        fiveZero = new JButton("");
        fiveZero.setBackground(Color.green);
        fiveZero.setOpaque(true);
        fiveOne = new JButton("");
        fiveOne.setBackground(Color.green);
        fiveOne.setOpaque(true);
        fiveTwo = new JButton("");
        fiveTwo.setBackground(Color.green);
        fiveTwo.setOpaque(true);
        sixZero = new JButton("");
        sixZero.setBackground(Color.green);
        sixZero.setOpaque(true);
        sixOne = new JButton("");
        sixOne.setBackground(Color.green);
        sixOne.setOpaque(true);
        sixTwo = new JButton("");
        sixTwo.setBackground(Color.green);
        sixTwo.setOpaque(true);
        sevenZero = new JButton("");
        sevenZero.setBackground(Color.green);
        sevenZero.setOpaque(true);
        sevenOne = new JButton("");
        sevenOne.setBackground(Color.green);
        sevenOne.setOpaque(true);
        sevenTwo = new JButton("");
        sevenTwo.setBackground(Color.green);
        sevenTwo.setOpaque(true);
        eightZero = new JButton("");
        eightZero.setBackground(Color.green);
        eightZero.setOpaque(true);
        eightOne = new JButton("");
        eightOne.setBackground(Color.green);
        eightOne.setOpaque(true);
        eightTwo = new JButton("");
        eightTwo.setBackground(Color.green);
        eightTwo.setOpaque(true);
        nineZero = new JButton("");
        nineZero.setBackground(Color.green);
        nineZero.setOpaque(true);
        nineOne = new JButton("");
        nineOne.setBackground(Color.green);
        nineOne.setOpaque(true);
        nineTwo = new JButton("");
        nineTwo.setBackground(Color.green);
        nineTwo.setOpaque(true);
    }
    /**
     * adds all of the buttons and things to one JFrame
     */
    public void display()
    {
        JFrame frame = new JFrame("Joe's Airline");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(this);
        frame.pack();
        frame.setVisible(true);
    }
    /**
     * resets all of the text fields
     */
    public void resetStuff()
    {
        passengerName.setText("");
        passengerAddress.setText("");
        passengerPhone.setText("");
        passengerSeatRow.setText("");
        passengerSeatCol.setText("");
    }
    public class clearListener implements ActionListener
    {
        public void actionPerformed( ActionEvent event)
        {
            resetStuff();
        }
    }
    public class makeListener implements ActionListener 
    {
        String name = "";
        String address = "";
        String phone = "";
        int _row = 0;
        int _col = 0;
        public void actionPerformed(ActionEvent event)
        {
            name = passengerName.getText();
            address = passengerAddress.getText();
            phone = passengerPhone.getText();
            _row = Integer.parseInt(passengerSeatRow.getText());
            _col = Integer.parseInt(passengerSeatCol.getText());
            JOptionPane bleh = new JOptionPane();
            if(bob.checkIf(_row, _col) == true)
            {
                if(name != "" && address != "" && phone != "" && ( _col < 3 && _col > 0)  && (_row < 10 && _row > 0))
                {
                    
                    bob.makeReservation(name, address, phone, _row, _col);
                    resetStuff();
                    if(_row == 0 & _col == 0)
                    {
                        zeroZero.setBackground(Color.black);
                    }
                    if(_row == 0 & _col == 1)
                    {
                        zeroOne.setBackground(Color.black);
                    }
                    if(_row == 0 & _col == 2)
                    {
                        zeroTwo.setBackground(Color.black);
                    }
                    if(_row == 1 & _col == 0)
                    {
                        oneZero.setBackground(Color.black);
                    }
                    if(_row == 1 & _col == 1)
                    {
                        oneOne.setBackground(Color.black);
                    }
                    if(_row == 1 & _col == 2)
                    {
                        oneTwo.setBackground(Color.black);
                    }
                    if(_row == 2 & _col == 0)
                    {
                        twoZero.setBackground(Color.black);
                    }
                    if(_row == 2 & _col == 1)
                    {
                        twoOne.setBackground(Color.black);
                    }
                    if(_row == 2 & _col == 2)
                    {
                        twoTwo.setBackground(Color.black);
                    }
                    if(_row == 3 & _col == 0)
                    {
                        threeZero.setBackground(Color.black);
                    }
                    if(_row == 3 & _col == 1)
                    {
                        threeOne.setBackground(Color.black);
                    }
                    if(_row == 3 & _col == 2)
                    {
                        threeTwo.setBackground(Color.black);
                    }
                    if(_row == 4 & _col == 0)
                    {
                        fourZero.setBackground(Color.black);
                    }
                    if(_row == 4 & _col == 1)
                    {
                        fourOne.setBackground(Color.black);
                    }
                    if(_row == 4 & _col == 2)
                    {
                        fourTwo.setBackground(Color.black);
                    }
                    if(_row == 5 & _col == 0)
                    {
                        fiveZero.setBackground(Color.black);
                    }
                    if(_row == 5 & _col == 1)
                    {
                        fiveOne.setBackground(Color.black);
                    }
                    if(_row == 5 & _col == 2)
                    {
                        fiveTwo.setBackground(Color.black);
                    }
                    if(_row == 6 & _col == 0)
                    {
                        sixZero.setBackground(Color.black);
                    }
                    if(_row == 6 & _col == 1)
                    {
                        sixOne.setBackground(Color.black);
                    }
                    if(_row == 6 & _col == 2)
                    {
                        sixTwo.setBackground(Color.black);
                    }
                    if(_row == 7 & _col == 0)
                    {
                        sevenZero.setBackground(Color.black);
                    }
                    if(_row == 7 & _col == 1)
                    {
                        sevenOne.setBackground(Color.black);
                    }
                    if(_row == 7 & _col == 2)
                    {
                        sevenTwo.setBackground(Color.black);
                    }
                    if(_row == 8 & _col == 0)
                    {
                        eightZero.setBackground(Color.black);
                    }
                    if(_row == 8 & _col == 1)
                    {
                        eightOne.setBackground(Color.black);
                    }
                    if(_row == 8 & _col == 2)
                    {
                        eightTwo.setBackground(Color.black);
                    }
                    if(_row == 9 & _col == 0)
                    {
                        nineZero.setBackground(Color.black);
                    }
                    if(_row == 9 & _col == 1)
                    {
                        nineOne.setBackground(Color.black);
                    }
                    if(_row == 9 & _col == 2)
                    {
                        nineTwo.setBackground(Color.black);
                    }
                }
                else
                {
                    bleh.showMessageDialog(null, "Enter All Information", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
                    
            else
            {
                bleh.showMessageDialog(null, "Seat Is Reserved", "Message", JOptionPane.ERROR_MESSAGE);
                passengerSeatRow.setText("");
                passengerSeatCol.setText("");
            }
                
        }
    }
    public class checkListener implements ActionListener
    {
        int _row = 0;
        int _col = 0;
        boolean check;
        JOptionPane bleh = new JOptionPane();
        public void actionPerformed(ActionEvent event)
        {
            _row = Integer.parseInt(passengerSeatRow.getText());
            _col = Integer.parseInt(passengerSeatCol.getText());
            check = bob.checkIf(_row, _col);
            if(( _col < 3 && _col > 0)  && (_row < 10 && _row > 0))
            {
                if(check == true)
                {
                    bleh.showMessageDialog(null, "Passenger Not Found", "Message", JOptionPane.ERROR_MESSAGE);
                    resetStuff();
                }
                else
                {
                    bleh.showMessageDialog(null, "Reservation Found:" + "\n" + bob.checkReservation(_row, _col), "Message", JOptionPane.INFORMATION_MESSAGE);
                    resetStuff();
                }    
            }
            else
            {
                bleh.showMessageDialog(null, "Wrong Number Range", "Message", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    public class searchListener implements ActionListener
    {
        String _name = "";
        JOptionPane bleh = new JOptionPane();
        boolean check;
        public void actionPerformed(ActionEvent event)
        {
            _name = passengerName.getText();
            check = bob.checkIf(_name);
            if(_name != "")
            {
               
                if(check == false)
                {
                    bleh.showMessageDialog(null, "Passenger Not Found", "Message", JOptionPane.ERROR_MESSAGE);
                    resetStuff();
                }
                else
                {
                    bleh.showMessageDialog(null, "Passenger Found:" + "\n" + bob.searchPassenger(_name), "Message", JOptionPane.INFORMATION_MESSAGE);
                    resetStuff();
                } 
            }
            else
            {
                bleh.showMessageDialog(null, "No Name Given", "Message", JOptionPane.ERROR_MESSAGE);
            }
                
        }
    }
    public class cancelListener implements ActionListener
    {
        int _row = 0;
        int _col = 0;
        JOptionPane bleh = new JOptionPane();
        public void actionPerformed(ActionEvent event)
        {
            _row = Integer.parseInt(passengerSeatRow.getText());
            _col = Integer.parseInt(passengerSeatCol.getText());
            if(( _col < 3 && _col > 0)  && (_row < 10 && _col > 0))
            {
                bob.cancelReservation(_row, _col);
                resetStuff();
                if(_row == 0 & _col == 0)
                {
                    zeroZero.setBackground(Color.green);
                }
                if(_row == 0 & _col == 1)
                {
                    zeroOne.setBackground(Color.green);
                }
                if(_row == 0 & _col == 2)
                {
                    zeroTwo.setBackground(Color.green);
                }
                if(_row == 1 & _col == 0)
                {
                    oneZero.setBackground(Color.green);
                }
                if(_row == 1 & _col == 1)
                {
                    oneOne.setBackground(Color.green);
                }
                if(_row == 1 & _col == 2)
                {
                    oneTwo.setBackground(Color.green);
                }
                if(_row == 2 & _col == 0)
                {
                    twoZero.setBackground(Color.green);
                }
                if(_row == 2 & _col == 1)
                {
                    twoOne.setBackground(Color.green);
                }
                if(_row == 2 & _col == 2)
                {
                    twoTwo.setBackground(Color.green);
                }
                if(_row == 3 & _col == 0)
                {
                    threeZero.setBackground(Color.green);
                }
                if(_row == 3 & _col == 1)
                {
                    threeOne.setBackground(Color.green);
                }
                if(_row == 3 & _col == 2)
                {
                    threeTwo.setBackground(Color.green);
                }
                if(_row == 4 & _col == 0)
                {
                    fourZero.setBackground(Color.green);
                }
                if(_row == 4 & _col == 1)
                {
                    fourOne.setBackground(Color.green);
                }
                if(_row == 4 & _col == 2)
                {
                    fourTwo.setBackground(Color.green);
                }
                if(_row == 5 & _col == 0)
                {
                    fiveZero.setBackground(Color.green);
                }
                if(_row == 5 & _col == 1)
                {
                    fiveOne.setBackground(Color.green);
                }
                if(_row == 5 & _col == 2)
                {
                    fiveTwo.setBackground(Color.green);
                }
                if(_row == 6 & _col == 0)
                {
                    sixZero.setBackground(Color.green);
                }
                if(_row == 6 & _col == 1)
                {
                    sixOne.setBackground(Color.green);
                }
                if(_row == 6 & _col == 2)
                {
                    sixTwo.setBackground(Color.green);
                }
                if(_row == 7 & _col == 0)
                {
                    sevenZero.setBackground(Color.green);
                }
                if(_row == 7 & _col == 1)
                {
                    sevenOne.setBackground(Color.green);
                }
                if(_row == 7 & _col == 2)
                {
                    sevenTwo.setBackground(Color.green);
                }
                if(_row == 8 & _col == 0)
                {
                    eightZero.setBackground(Color.green);
                }
                if(_row == 8 & _col == 1)
                {
                    eightOne.setBackground(Color.green);
                }
                if(_row == 8 & _col == 2)
                {
                    eightTwo.setBackground(Color.green);
                }
                if(_row == 9 & _col == 0)
                {
                    nineZero.setBackground(Color.green);
                }
                if(_row == 9 & _col == 1)
                {
                    nineOne.setBackground(Color.green);
                }
                if(_row == 9 & _col == 2)
                {
                    nineTwo.setBackground(Color.green);
                }
                
            }
            else
            {
                bleh.showMessageDialog(null, "No Such Seat", "Message", JOptionPane.ERROR_MESSAGE);
                passengerSeatRow.setText("");
                passengerSeatCol.setText("");
            }
        }
    }
        
    
}
