/*
 * Created by: Michael Balcerzak
 * Created on: 8-Sep-2016
 * Created for: ICS4U
 * Daily Assignment – #1-02
 * This program displays log companies that the user choose a company and shows the price of logs to fit in a 1100 kg truck. 
*/


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Button;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class LoggingCompanyWindow extends JFrame {

 private JPanel contentPane;
 double firstLog = 0.25;
 double secondLog = 0.5;
 double thirdLog = 1;
 double logCompany = 55;
 double cost;


 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     LoggingCompanyWindow frame = new LoggingCompanyWindow();
     frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }
 
  /**
  * Create the frame.
  */
 public LoggingCompanyWindow() {
  setBackground(Color.BLACK);
  setForeground(Color.BLACK);
  setFont(null);
  setTitle("Loging Company");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 579, 414);
  contentPane = new JPanel();
  contentPane.setForeground(Color.DARK_GRAY);
  contentPane.setBackground(Color.CYAN);
  contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
  setContentPane(contentPane);
  GridBagLayout gbl_contentPane = new GridBagLayout();
  gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
  gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
  gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
  gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
  contentPane.setLayout(gbl_contentPane);
  
  JLabel lblChooseYourCompany = new JLabel("Choose your company");
  lblChooseYourCompany.setFont(new Font("Tahoma", Font.PLAIN, 19));
  GridBagConstraints gbc_lblChooseYourCompany = new GridBagConstraints();
  gbc_lblChooseYourCompany.fill = GridBagConstraints.VERTICAL;
  gbc_lblChooseYourCompany.gridwidth = 10;
  gbc_lblChooseYourCompany.insets = new Insets(0, 0, 5, 5);
  gbc_lblChooseYourCompany.gridx = 2;
  gbc_lblChooseYourCompany.gridy = 1;
  contentPane.add(lblChooseYourCompany, gbc_lblChooseYourCompany);
  
  JLabel lblmPerLogFirst = new JLabel("0.25m per log");
  lblmPerLogFirst.setFont(new Font("Tahoma", Font.PLAIN, 16));
  GridBagConstraints gbc_lblmPerLogFirst = new GridBagConstraints();
  gbc_lblmPerLogFirst.fill = GridBagConstraints.VERTICAL;
  gbc_lblmPerLogFirst.gridwidth = 3;
  gbc_lblmPerLogFirst.insets = new Insets(0, 0, 5, 5);
  gbc_lblmPerLogFirst.gridx = 2;
  gbc_lblmPerLogFirst.gridy = 5;
  contentPane.add(lblmPerLogFirst, gbc_lblmPerLogFirst);
  
  JLabel lblMPerLogSecond = new JLabel("0.5m per log");
  lblMPerLogSecond.setFont(new Font("Tahoma", Font.PLAIN, 16));
  GridBagConstraints gbc_lblMPerLogSecond = new GridBagConstraints();
  gbc_lblMPerLogSecond.fill = GridBagConstraints.VERTICAL;
  gbc_lblMPerLogSecond.insets = new Insets(0, 0, 5, 5);
  gbc_lblMPerLogSecond.gridx = 6;
  gbc_lblMPerLogSecond.gridy = 5;
  contentPane.add(lblMPerLogSecond, gbc_lblMPerLogSecond);
  
  JLabel lblMPerLogThird = new JLabel("1m per log");
  lblMPerLogThird.setFont(new Font("Dialog", Font.PLAIN, 16));
  GridBagConstraints gbc_lblMPerLogThird = new GridBagConstraints();
  gbc_lblMPerLogThird.fill = GridBagConstraints.VERTICAL;
  gbc_lblMPerLogThird.gridwidth = 3;
  gbc_lblMPerLogThird.insets = new Insets(0, 0, 5, 5);
  gbc_lblMPerLogThird.gridx = 8;
  gbc_lblMPerLogThird.gridy = 5;
  contentPane.add(lblMPerLogThird, gbc_lblMPerLogThird);
  
  JLabel lblCost = new JLabel("Cost:");
  lblCost.setFont(new Font("Tahoma", Font.PLAIN, 25));
  GridBagConstraints gbc_lblCost = new GridBagConstraints();
  gbc_lblCost.fill = GridBagConstraints.VERTICAL;
  gbc_lblCost.gridwidth = 9;
  gbc_lblCost.insets = new Insets(0, 0, 0, 5);
  gbc_lblCost.gridx = 2;
  gbc_lblCost.gridy = 7;
  contentPane.add(lblCost, gbc_lblCost);
  
  Button btnFirstCompany = new Button("first company");
  btnFirstCompany.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent arg0) {    
    cost = logCompany/firstLog;
    
    lblCost.setText("Cost: " + Double.toString(cost) + "$");
   }
  });
  
  btnFirstCompany.setFont(new Font("Dialog", Font.PLAIN, 15));
  GridBagConstraints gbc_btnFirstCompany = new GridBagConstraints();
  gbc_btnFirstCompany.fill = GridBagConstraints.BOTH;
  gbc_btnFirstCompany.gridwidth = 3;
  gbc_btnFirstCompany.insets = new Insets(0, 0, 5, 5);
  gbc_btnFirstCompany.gridx = 2;
  gbc_btnFirstCompany.gridy = 4;
  contentPane.add(btnFirstCompany, gbc_btnFirstCompany);
  
  Button btnSecondCompany = new Button("second company");
  btnSecondCompany.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent arg0) {
    cost = logCompany/secondLog;
    
    lblCost.setText("Cost: " + Double.toString(cost) + "$");
   }
  });
  btnSecondCompany.setFont(new Font("Dialog", Font.PLAIN, 15));
  GridBagConstraints gbc_btnSecondCompany = new GridBagConstraints();
  gbc_btnSecondCompany.fill = GridBagConstraints.BOTH;
  gbc_btnSecondCompany.insets = new Insets(0, 0, 5, 5);
  gbc_btnSecondCompany.gridx = 6;
  gbc_btnSecondCompany.gridy = 4;
  contentPane.add(btnSecondCompany, gbc_btnSecondCompany);
  
  Button btnThirdCompany = new Button("third company");
  btnThirdCompany.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    cost = logCompany/thirdLog;
    
    lblCost.setText("Cost: " + Double.toString(cost) + "$");
   }
  });
  btnThirdCompany.setFont(new Font("Dialog", Font.PLAIN, 15));
  GridBagConstraints gbc_btnThirdCompany = new GridBagConstraints();
  gbc_btnThirdCompany.fill = GridBagConstraints.BOTH;
  gbc_btnThirdCompany.gridwidth = 3;
  gbc_btnThirdCompany.insets = new Insets(0, 0, 5, 5);
  gbc_btnThirdCompany.gridx = 8;
  gbc_btnThirdCompany.gridy = 4;
  contentPane.add(btnThirdCompany, gbc_btnThirdCompany);
  contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblChooseYourCompany, lblmPerLogFirst, lblMPerLogSecond, lblMPerLogThird, lblCost, btnFirstCompany, btnSecondCompany, btnThirdCompany}));
  setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, lblChooseYourCompany, lblmPerLogFirst, lblMPerLogSecond, lblMPerLogThird, lblCost, btnFirstCompany, btnSecondCompany, btnThirdCompany}));
 }
}
