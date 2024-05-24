/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzzzzzzz;

/**
 *
 * @author Hp
 */


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

public class Admin extends JFrame implements ActionListener
{

   
    Icon icon2=new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\Back.PNG");
    Icon icon=new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\login.PNG");
    Font font=new Font("Arial",Font.BOLD,24);
    JLabel l1=new JLabel("Username");
    JLabel l2=new JLabel("Password");
     JLabel l3=new JLabel(icon);
    JTextField t1=new JTextField();
    JPasswordField t2=new JPasswordField();
    JButton b1=new JButton("Login",icon2);
     JButton b2=new JButton("Back",icon);
    

Admin()
{  
   
    b2.setFont(font);
    b1.setFont(font);
    
    l1.setBounds(340,80,230,230);
    t1.setBounds(290,220,230,40);
    l2.setBounds(340,200,230,200);
    t2.setBounds(290,340,230,40);
    b1.setBounds(250,440,130,40);
    b2.setBounds(420,440,130,40);
 
    
     l1.setFont(font);
     l2.setFont(font);
add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
add(b2);
add(l3);
setLayout(null);
setVisible(true);
setSize(900,900);
b1.addActionListener(this);
b2.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{

 if(ae.getSource()== b2)
{
  
   setVisible(false);
    new index().setVisible(true);
}
 else if(ae.getSource()== b1)
if(t1.getText().equals("qems") &&  t2.getText().equals("admin"))
{
    setVisible(false);
    new adminHome().setVisible(true);
    
}
 else
    
{
    Icon iconn=new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\Incorrect Password.PNG");
    JOptionPane.showMessageDialog(null,"<html><b style=\"color: red; font-size:10px\">Incorrect  <br>Username or Password</b></html>","Show",JOptionPane.INFORMATION_MESSAGE,iconn);
    
}
}
public static void main(String args[])
{
    Admin m=new Admin();



}

}