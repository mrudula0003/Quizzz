/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzzzzzzz;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class deleteQuestion extends JFrame implements ActionListener
{
   JLabel l=new JLabel("Ouestion ID:");
    JLabel l1=new JLabel("Question :");
    JLabel l2=new JLabel("Option 1 :");
    JLabel l3=new JLabel("Option 2 :");
   JLabel l4=new JLabel("Option 3 :");
  JLabel l5=new JLabel("Option 4 :");
   JLabel l6=new JLabel("Answer :");
   ImageIcon i4 = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\Close.png");
   JButton b4=new JButton(i4); 
   JTextField Id =new JTextField();
   JTextField t1 =new JTextField();
   JTextField t2 =new JTextField();
   JTextField t3 =new JTextField();
   JTextField t4 =new JTextField();
   JTextField t5 =new JTextField();
   JTextField t6 =new JTextField();

    ImageIcon icon =  new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\delete Question.png");
    ImageIcon icon2 =  new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\delete.png");
    ImageIcon icon3 =  new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\search.png");
    ImageIcon icon4 =  new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\clear.png");
    JLabel l7=new JLabel("DELETE QUESTIONS");
   Font font=new Font("Arial",Font.BOLD,19);
   
   JButton b2=new JButton("search",icon3);
   
JButton b1=new JButton("Clear",icon4);
ImageIcon i =  new ImageIcon("C:\\Users\\rashm\\Desktop\\save.png");
JButton b=new JButton("Delete",icon2);

ImageIcon i1 = new ImageIcon("C:\\Users\\rashm\\Desktop\\clear.png");

  deleteQuestion()
{



  setVisible(true);
  setSize(1000,1000);
  setLayout(null);
 l7.setIcon(icon);
 b4.setBounds(870,10,100,50);


l7.setBounds(140,20,500,60);
l7.setFont(new Font("Arial",Font.BOLD,40));
 
 l.setBounds(140,120,210,40);
l.setFont(font);

 
 l1.setBounds(140,180,300,40);

 l1.setFont(font);
 l2.setBounds(140,240,350,40);
l2.setFont(font);
 
 l3.setBounds(140,300,400,40);
l3.setFont(font);
 
 l4.setBounds(140,360,450,40);
l4.setFont(font);
 
 l5.setBounds(140,420,500,40);
l5.setFont(font);
 
l6.setBounds(140,490,550,40);
l6.setFont(font);


Id.setBounds(280,120,150,40);


t1.setBounds(260,180,400,40);


t2.setBounds(260,250,400,40);


t3.setBounds(260,310,400,40);


t4.setBounds(260,370,400,40);


t5.setBounds(260,430,400,40);


t6.setBounds(260,500,400,40);

b2.setBounds(450,120,150,40);
b2.setFont(font);

b.setBounds(180,600,200,60);
b.setFont(font);
b1.setBounds(450,600,200,60);
b1.setFont(font);

add(l);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);

add(Id);
add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);

add(b2);
add(b);
add(b1);
add(b4);
b4.addActionListener((ActionListener) this);
b1.addActionListener((ActionListener) this);
b2.addActionListener((ActionListener) this);
b.addActionListener((ActionListener) this);
} 
 public void actionPerformed(ActionEvent ae)
 {
       if(ae.getSource()== b4)
{ 
 adminHome.open=0;
setVisible(false);
}
         if(ae.getSource()== b2)
{ 
      
       //search
    String id = Id.getText();
    try{   
    ResultSet rs; 
    String sql = "select *from question where id='"+id+"'";
    Connection con=ConnectionProvider.getCon();
   // Statement st=con.createStatement(sql);
    
    PreparedStatement ps=con.prepareStatement(sql);
   // ps.setString(1, id);
   
    
rs =ps.executeQuery();

    if(rs.next())
    {
       t1.setText(rs.getString(2));
    t2.setText(rs.getString(3));
    t3.setText(rs.getString(4));
    t4.setText(rs.getString(5));
    t5.setText(rs.getString(6));
    t6.setText(rs.getString(7));
    Id.setEditable(false);
    }
    else
    {
    Frame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"Question Id does not exist");
    
    }
    
    
    
    
    }
    catch(Exception e)
    {
    
      JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, e);
    }
    
    
    
       
       
 }
         
         else if(ae.getSource()== b)
{ 
      
       //delete
       String id = Id.getText();
       try{
       Connection con=ConnectionProvider.getCon();
 
    //String sql = "delete *from question where id='"+id+"'";
    
    PreparedStatement ps=con.prepareStatement("delete from question where id=?");
    ps.setString(1, id);
      ps.executeUpdate();
      JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"Successfully Updated");
                new deleteQuestion().setVisible(true);
       
       
       
       }
       catch(Exception e)
       {
       JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, e);}
       
       
       
 }
         
        else if(ae.getSource()== b1)
{ 
      t1.setText("");
    t2.setText("");
    t3.setText("");
    t4.setText("");
    t5.setText("");
    t6.setText("");
     Id.setEditable(true);  
       
 }
 
 }
 
    public static void main(String[] args) 
{
        
       
        deleteQuestion i= new deleteQuestion();
    }
    
}