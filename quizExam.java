/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzzzzzzz;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;



public class quizExam extends JFrame implements ActionListener
{

public String questionId="1";
public String answer;
public int min=0;
public int sec=0;
public int marks=0;
Timer time;



JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18; 
ImageIcon i1 = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\next.png");
    ImageIcon i2 = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\save.png");
JButton b1=new JButton("Next",i1);
JButton b2=new JButton("Submit",i2);
ButtonGroup g1=new ButtonGroup();/*l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;*/
Font font = new Font("Arial", Font.BOLD, 19);
JRadioButton r1=new JRadioButton("111");
JRadioButton r2=new JRadioButton("222");
JRadioButton r3=new JRadioButton("333");
JRadioButton r4=new JRadioButton("444");


quizExam(String rollNo)
{
    
    setLayout(null);
setVisible(true);
setSize(1000,1000); 
    
  
  
  //first question and student Details
  
 
  
  //time program
  //setLocationRelativeTo(this);
  //time=new Timer(1000,new ActionListener())
  //{}




l=new JLabel("WELCOME");

l.setBounds(380,50,400,40);

add(l);

l1=new JLabel("Roll No :");
l1.setBounds(70,100,500,40);
add(l1);
l1.setFont(font);

l2=new JLabel("Name :");
l2.setBounds(70,150,500,40);
add(l2);
l.setFont(new Font("Arial", Font.BOLD, 40));

l15=new JLabel("Your Marks :");
l15.setBounds(70,200,500,40);
add(l15);
l15.setFont(font);
l2.setFont(font);
l3=new JLabel("");
l3.setBounds(160,100,500,40);
add(l3);
l3.setFont(font);
l4=new JLabel("  ");
l4.setBounds(160,150,500,40);
add(l4);
l16=new JLabel("  ");
l16.setBounds(200,200,500,40);
add(l16);
l16.setFont(font);
l4.setFont(font);
l5=new JLabel(" Date : ");
l5.setBounds(700,100,500,40);
add(l5);
l5.setFont(font);
l6=new JLabel(" Total Time :");
l6.setBounds(700,150,500,40);
add(l6);
l6.setFont(font);
l7=new JLabel(" Time Taken : ");
l7.setBounds(700,200,500,40);
add(l7);
l7.setFont(font);
l8=new JLabel(" Total Questions : ");
l8.setBounds(380,250,500,40);
add(l8);
l8.setFont(font);
l9=new JLabel("");
l9.setBounds(770,100,500,40);
add(l9);
l9.setFont(font);
l10=new JLabel(" 10 min ");
l10.setBounds(810,150,500,40);
add(l10);
l10.setFont(font);
l11=new JLabel(" 00");
l11.setBounds(820,200,500,40);
add(l11);
l11.setFont(font);
l18=new JLabel(" 00");
l11.setBounds(860,200,500,40);
add(l18);
l18.setFont(font);
l12=new JLabel(" 10 ");
l12.setBounds(540,250,500,40);
add(l12);
l12.setFont(font);
l13=new JLabel("  Question NO : ");
l13.setBounds(380,300,500,40);
add(l13);
l13.setFont(font);

l14=new JLabel("  ");
l14.setBounds(530,300,500,40);
add(l14);
l14.setFont(font);
l17=new JLabel("Question");
l17.setBounds(240,380,500,40);
add(l17);
l17.setFont(font);

 r1.setBounds(250,450,100,50);
add(r1);
r1.setFont(font);

 r2.setBounds(250,550,200,50);
add(r2);
r2.setFont(font);

 r3.setBounds(250,650,200,50);
add(r3);
r3.setFont(font);

 r4.setBounds(250,750,200,50);
add(r4);
r4.setFont(font);
g1.add(r1);
g1.add(r2);
g1.add(r3);
g1.add(r4);
b1.setBounds(190,850,200,50);
b2.setBounds(580,850,200,50);
b1.setFont(font);
b2.setFont(font);
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);




 try
  {
  
  Connection con=ConnectionProvider.getCon();
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select *from student where rollNo='"+rollNo +"'" );
    while(rs.next())
    {
        l3.setText(rs.getString(1));
    l4.setText(rs.getString(2));
    
    
    }
    Statement st1=con.createStatement();
    ResultSet rs1=st1.executeQuery("select *from question where id='"  +questionId+"'");
    
    while(rs1.next())
    {
   l14.setText(rs1.getString(1));
    l17.setText(rs1.getString(2));
    r1.setText(rs1.getString(3));
    r2.setText(rs1.getString(4));
    r3.setText(rs1.getString(5));
    r4.setText(rs1.getString(6));
    answer=rs1.getString(7);
        
    
    }
    
    
  
  }
  catch(Exception e)
  {
  JOptionPane.showMessageDialog(null,e);
  
  }
 SimpleDateFormat dFormat=new SimpleDateFormat("dd-mm-yyyy");
  Date date=new Date();
  l9.setText(dFormat.format(date));

//time program
/*
setLocationRelativeTo(this);
time=new Timer(1000,new ActionListener()
{
    
    public void actionPerformed(ActionEvent e)
    {
  
    
    
    l11.setText(String.valueOf(min));
    l18.setText(String.valueOf(sec));
    if(sec==60)
    {
    sec=0;
    min++;
    if(min==10)
    {
    
    time.stop();
    answerCheck();
    submit();
    }
    
    
    
    }
    sec++;
    
    
    
    
    
    
    
    }
    
});
time.stop();

*/



}

public void answerCheck()
{
String studentAnswer="";
if(r1.isSelected())
{

studentAnswer=r1.getText();

}
else if(r2.isSelected())
{

studentAnswer=r2.getText();

}
else if(r3.isSelected())
{

studentAnswer=r3.getText();

}
else if(r4.isSelected())
{

studentAnswer=r4.getText();

}
if(studentAnswer.equals(answer))
{

marks=marks+1;
String marks1=String.valueOf(marks);
l16.setText(marks1);
}
//question number change
int questionId1=Integer.parseInt(questionId);
questionId1=questionId1+1;
questionId=String.valueOf(questionId1);

//
//last question
  if(questionId.equals("10"))
  {
  b1.setVisible(false);
  
  }      


}


public void question()
{

 try
  {
  
  Connection con=ConnectionProvider.getCon();
    Statement st=con.createStatement();
    
    Statement st1=con.createStatement();
    ResultSet rs1=st1.executeQuery("select *from question where id='"  +questionId+"'");
    
    while(rs1.next())
    {
   l14.setText(rs1.getString(1));
    l17.setText(rs1.getString(2));
    r1.setText(rs1.getString(3));
    r2.setText(rs1.getString(4));
    r3.setText(rs1.getString(5));
    r4.setText(rs1.getString(6));
    answer=rs1.getString(7);
        
    
    }
    
    
  
  }
  catch(Exception e)
  {
  JOptionPane.showMessageDialog(null,e);
  
  }



}
public void actionPerformed(ActionEvent e) {
        
    if(e.getSource()==b1)
    {
    answerCheck();
    question();
    
    }
    else if(e.getSource()==b2)
    {
    int a=JOptionPane.showConfirmDialog(null,"Do you really want to Submit","Select",JOptionPane.YES_NO_OPTION);    
    if(a==0)
    {
        JOptionPane.showMessageDialog(null,"Successfully Submitted");
    //answerCheck();
    //submit();
    }
    
    }
}
public void submit()
{

String rollNo=l3.getText();
answerCheck();
try{
    Connection con=ConnectionProvider.getCon();
Statement st=con.createStatement();
st.executeUpdate("update student set marks='"+marks+"' where rollNo='"+rollNo+"'");
String marks1=String.valueOf(marks);
JOptionPane.showMessageDialog(null,marks1);
}

catch(Exception e)
{JOptionPane.showMessageDialog(null,e);


}

}


quizExam()
{}




public static void main(String[] args) 
{
        
      quizExam qe= new quizExam();
    }

    
    
    
}
