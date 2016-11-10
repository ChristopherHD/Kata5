package moneycalculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.ui.swing.SwingMoneyDisplay;

public class MainFrame extends JFrame{
    
    public MainFrame(){
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setMinimumSize(new Dimension(400,400));
        setLocationRelativeTo(null);
        this.setMenuBar(menuBar());
        setLayout(new BorderLayout());
        add(label(), BorderLayout.NORTH);
        add(new SwingMoneyDisplay());
        setVisible(true);
    }

    private MenuBar menuBar() {
        MenuBar menuBar = new MenuBar();
        menuBar.add(calculate());
        return menuBar;
    }
    
    private Menu calculate(){
        Menu menu = new Menu("Calculate");
        menu.add(newExchange());
        return menu;
    }

    private MenuItem newExchange() {
        MenuItem menuItem = new MenuItem("New");
        menuItem.addActionListener(doNewExchange());
        return menuItem;
    }

    private ActionListener doNewExchange() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Evento");            
            }
        };
    }  

    private JPanel label() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        jPanel.add(new JLabel("A0"));
        jPanel.add(new JLabel("A1"));
        jPanel.add(new JLabel("A2"));
        return jPanel;
    }
}