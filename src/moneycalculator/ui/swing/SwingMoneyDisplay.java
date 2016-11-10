package moneycalculator.ui.swing;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.ui.MoneyDisplay;


public class SwingMoneyDisplay extends JPanel implements MoneyDisplay{
    
    public SwingMoneyDisplay(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(amount());
        add(currency());
    }
    
    public JLabel amount(){
        return new JLabel("500");
    }
    
    public JLabel currency(){
        return new JLabel("$");
    }
}
