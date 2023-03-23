//A simple loan calculator applet
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
/*
<applet code = "FutVal" width =380 height=240>
</applet>
*/

public abstract class FutVal extends JApplet
implements ActionListener
{
    JTextField amountText, futvalText, periodText, rateText, compText;
    JButton dewIt;

    double principal;       //original principal
    double rateOfRet;    //rate of return
    double numYears;        //length of investment in years
    int compPerYear;        //number of compounding per year

    NumberFormat nf;

    public void init()
    {
        try
        {
            SwingUtilities.invokeAndWait(new Runnable()
            {
                public void run()
                {
                 makeGUI(); //initialize the GUI
                }
            });
        } catch(Exception exc)
        {
            System.out.println("can't create because of: "+exc);
        }
    }

    //Set up and initialize the GUI
    private void makeGUI()
    {

        //Use a grid bag layout
        GridBagLayout gbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbag);

        JLabel heading  = new
               JLabel("Future value of the investment");
        JLabel amountLab = new JLabel("Principal ");
        JLabel periodLab = new JLabel("Years");
        JLabel rateLab = new JLabel("Rate of Interest");
        JLabel futvalLab =
                new JLabel("Future Value of the Investment ");
        JLabel compLab =
                new JLabel("Compounding Periods per Year ");

        amountText = new JTextField(10);
        periodText = new JTextField(10);
        futvalText = new JTextField(10);
        rateText = new JTextField(10);
        compText = new JTextField(10);

        //Future value field for display only.
        futvalText.setEditable(false);

        dewIt = new JButton("Compute");

        //Define the grid bag
        gbc.weighty = 1.0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;
        gbag.setConstraints(heading, gbc);

        //Anchor most components to the right.
        gbc.anchor = GridBagConstraints.EAST;

        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(amountLab, gbc);
        gbc.gridwidth=GridBagConstraints.REMAINDER;
        gbag.setConstraints(amountText, gbc);

        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(periodLab, gbc);
        gbc.gridwidth=GridBagConstraints.REMAINDER;
        gbag.setConstraints(periodText, gbc);

        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(rateLab, gbc);
        gbc.gridwidth=GridBagConstraints.REMAINDER;
        gbag.setConstraints(rateText, gbc);

        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(compLab, gbc);
        gbc.gridwidth=GridBagConstraints.REMAINDER;
        gbag.setConstraints(compText, gbc);

        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(futvalLab, gbc);
        gbc.gridwidth=GridBagConstraints.REMAINDER;
        gbag.setConstraints(futvalText, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbag.setConstraints(dewIt, gbc);

        add(heading);
        add(amountLab);
        add(amountText);
        add(periodLab);
        add(periodText);
        add(rateLab);
        add(rateText);
        add(compLab);
        add(compText);
        add(futvalLab);
        add(futvalText);
        add(dewIt);

        //Register to recieve action events.
        amountText.addActionListener(this);
        periodText.addActionListener(this);
        rateText.addActionListener(this);
        compText.addActionListener(this);
        dewIt.addActionListener(this);

        //Create a number format
        nf=NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
    }

    /*
        User pressed Enter on the text Field or
        pressed Compute. Display the result if all
        fields are completed.
    */
    public void actionPerformed(ActionEvent ae)
    {
        double result;

        String amountStr = amountText.getText();
        String periodStr = periodText.getText();
        String rateStr = rateText.getText();
        String compStr = compText.getText();

        try
        {
            if(amountStr.length() != 0 &&
               periodStr.length() != 0 &&
               rateStr.length() != 0 &&
               compStr.length() != 0 )
            {

                principal = Double.parseDouble(amountStr);
                numYears = Double.parseDouble(periodStr);
                rateOfRet = Double.parseDouble(rateStr)/100;
                compPerYear = Integer.parseInt(compStr);

                result = compute();

                futvalText.setText(nf.format(result));
            }
            showStatus(""); //erase any previous error message
        } catch (NumberFormatException exc)
        {
            showStatus("invalid data");
            futvalText.setText("");
        }
    }

    //Compute the future value.
    double compute()
    {
        double b,e;

        b = (1+rateOfRet/compPerYear);
        e = compPerYear*numYears;

        return principal*Math.pow(b , e);
    }
}