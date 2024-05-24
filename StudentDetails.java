package quizzzzzzzz;



import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.text.SimpleDateFormat;

public class  StudentDetails extends JFrame implements ActionListener,FocusListener
{
    
Font font=new Font("Arial",Font.BOLD,19);
        JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,ad;

    ImageIcon icon = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\index student.png");

   ImageIcon i1 = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\Close.png");
JButton b2=new JButton(i1);
ImageIcon i =  new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\save.png");
JButton b=new JButton("save and Next",i);

ImageIcon i2 = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\back student.png");
JButton b1=new JButton("Back",i2);
    JLabel date1=new JLabel("Date :");
    JLabel date2=new JLabel("");
    JTextField t7 =new JTextField("Enter University Name");
    JTextField t8 =new JTextField("Enter Percentage");
    JTextField t9 =new JTextField("Enter Passout Year");
    JTextField t10 =new JTextField("Enter University Name");
    JTextField t11 =new JTextField("Enter Percentage");
    JTextField t12 =new JTextField("Enter Passout Year");
    JTextField t13 =new JTextField("Enter University Name");
    JTextField t14 =new JTextField("Enter Percentage");
    JTextField t15 =new JTextField("Enter Passout Year");
    JTextField t = new JTextField();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t5 =new JTextField();
    JTextField t6 =new JTextField();
    JTextField t16 =new JTextField();
    ButtonGroup g1=new ButtonGroup();
   // JRadioButton r=new JRadioButton("Male");
    
//JRadioButton r1=new JRadioButton("Female");
    JComboBox j=new JComboBox();
    
  StudentDetails()
{

    SimpleDateFormat dFormat=new SimpleDateFormat("dd-mm-yyyy");
  Date date=new Date();
    date2.setText(dFormat.format(date));
    
    
  setVisible(true);
  setSize(1400,1400);
  setLayout(null);
JTextArea a= new JTextArea();
a.setBounds(800,200,580,200);
a.setText("\n\n     Quiz Management System is managing all the activities \n     related to examination management right from receipt of \n     Enrollment Form and Examination Forms through the\n      processing of Results and certificates and Grading Reports.\n");
a.setFont(font);
a.setEditable(false);

 JLabel head=new JLabel("FILL UP THE FORM",icon,JLabel.CENTER);
head.setBounds(60,30,300,70); 




head.setFont(new Font("Arial",Font.BOLD,24));



 l=new JLabel("Roll Number :");
 l.setBounds(70,120,210,40);
l.setFont(font);
 l1=new JLabel("Name : ");
 l1.setBounds(70,180,300,40);
l1.setFont(font);
 l2=new JLabel("Father Name :");
 l2.setBounds(70,240,350,40);
 l2.setFont(font);

 l3=new JLabel("Mother Name:");
 l3.setBounds(70,300,400,40);
l3.setFont(font);

 l4=new JLabel("Gender") ;
 l4.setBounds(70,360,450,40);
l4.setFont(font);

 l5=new JLabel("Contact No : ");
 l5.setBounds(70,420,500,40);
l5.setFont(font);

 l6=new JLabel("Email :");
l6.setBounds(70,490,550,40);
l6.setFont(font);

l7=new JLabel("10th :");
l7.setBounds(70,550,600,40);
l7.setFont(font);

l8=new JLabel("12th :");
l8.setBounds(70,610,650,40);
l8.setFont(font);

l9=new JLabel("Graduation :");
l9.setBounds(70,680,700,40);
l9.setFont(font);


t.setBounds(200,120,400,40);


t1.setBounds(200,180,400,40);


t2.setBounds(200,250,400,40);


t3.setBounds(200,310,400,40);

j.addItem("Male");
j.addItem("Female");
j.setBounds(200,370,150,40);
j.setFont(font);
add(j);
 //r.setBounds(200,360,100,50);
//r.setFont(font);

// r1.setBounds(300,360,200,50);
//r1.setFont(font);

//g1.add(r);
//g1.add(r1);


t5.setBounds(200,430,400,40);


t6.setBounds(200,500,400,40);


t7.setBounds(200,560,400,40);


t8.setBounds(620,560,400,40);


t9.setBounds(1040,560,400,40);


t10.setBounds(200,620,400,40);


t11.setBounds(620,620,400,40);

t12.setBounds(1040,620,400,40);


t13.setBounds(200,680,400,40);


t14.setBounds(620,680,400,40);


t15.setBounds(1040,680,400,40);


t16.setBounds(200,750,1250,40);
ad=new JLabel("Address :");
ad.setBounds(70,750,450,40);
add(ad);
ad.setFont(font);


b.setBounds(320,820,800,40);
b.setFont(font);


b1.setBounds(1100,40,150,70);
b1.setFont(font);
date1.setBounds(850,40,100,50);
date2.setBounds(950,40,100,50);
b2.setBounds(1300,40,150,70);
b2.setFont(font);
date1.setFont(font);
date2.setFont(font);
add(head);
add(date1);
add(date2);
add(l);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6); 
add(l7);
add(l8);
add(l9);
//add(r);
//add(r1);

add(t);
add(t1);
add(t2);
add(t3);

add(t5);
add(t6);
add(t7);
add(t8);
add(t9);
add(t10);
add(t11);
add(t12);
add(t13);
add(t14);
add(t15);
add(t16);

add(b);
add(b2);
add(b1);
add(a);
b.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
t7.addFocusListener(this);
t8.addFocusListener(this);
t9.addFocusListener(this);
t10.addFocusListener(this);
t11.addFocusListener(this);
t12.addFocusListener(this);
t13.addFocusListener(this);
t14.addFocusListener(this);
t15.addFocusListener(this);

} 
  
  public void focusGained(FocusEvent e)
  {
  if(t7.getText().equals("Enter University Name"))
          {
          t7.setText("");
          }
  
  else if(t8.getText().equals("Enter Percentage"))
          {
          t8.setText("");
          }
  else if(t9.getText().equals("Enter Passout Year"))
          {
          t9.setText("");
          }
  else if(t10.getText().equals("Enter University Name"))
          {
          t10.setText("");
          }
           
  else if(t11.getText().equals("Enter Percentage"))
          {
          t11.setText("");
          
           }
  else if(t12.getText().equals("Enter Passout Year"))
          {
          t12.setText("");
          }
  else if(t13.getText().equals("Enter University Name"))
          {
          t13.setText("");
          }
  else if(t14.getText().equals("Enter Percentage"))
          {
          t14.setText("");
          
           }
  else if(t15.getText().equals("Enter Passout Year"))
          {
          t15.setText("");
          }
  
  
  }
  
  public void focusLost(FocusEvent e)
  {
 /*  if(t7.getText().equals(""))
          {
          t7.setText("Enter University Name");
          }
   
   else if(t8.getText().equals(""))
          {
          t8.setText("Enter Percentage");
          }
  else if(t9.getText().equals(""))
          {
          t9.setText("Enter Passout Year");
          }
  else if(t10.getText().equals(""))
          {
          t10.setText("Enter University Name");
          }
           
  else if(t11.getText().equals(""))
          {
          t11.setText("Enter Percentage");
          
           }
  else if(t12.getText().equals(""))
          {
          t12.setText("Enter Passout Year");
          }
  else if(t13.getText().equals(""))
          {
          t13.setText("Enter University Name");
          }
  else if(t14.getText().equals(""))
          {
          t14.setText("Enter Percentage");
          
           }
  else if(t15.getText().equals(""))
          {
          t15.setText("Enter Passout Year");
          }
   
   
  */
  
  
  }
  
  
  
  public void actionPerformed(ActionEvent ae)
 {
       if(ae.getSource()== b2)
{ 
 adminHome.open=0;
setVisible(false);
}
       
       
       else if(ae.getSource()== b1)
{ 
 
setVisible(false);
new index().setVisible(true);


}
       else if(ae.getSource()== b)
{
    String rollNo=t.getText();
    String name=t1.getText();
    String fatherName=t2.getText();
    String motherName=t3.getText();
   String gender=(String)j.getSelectedItem();
    String contactNo=t5.getText();
    String email=t6.getText();
    String tenthUniversityName=t7.getText();
    String tenthPercentage=t8.getText();
    String tenthPassoutYear=t9.getText();
    String twelveUniversityName=t10.getText();
    String twelvePercentage=t11.getText();
    String twelvePassoutYear=t12.getText();
    String graduationUniversityName=t13.getText();
    String graduationPercentage=t14.getText();
    String graduationPassoutYear=t15.getText();
    String address=t16.getText();
    
    String marks="0";
    
    
    try{
    
     Connection con=ConnectionProvider.getCon();
   // Statement st=con.createStatement(sql);
    
    PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
    ps.setString(1,rollNo);
     ps.setString(2,name);
      ps.setString(3,fatherName);
       ps.setString(4,motherName);
        ps.setString(5,gender);
         ps.setString(6,contactNo);
          ps.setString(7,email);
           ps.setString(8,tenthUniversityName);
            ps.setString(9,tenthPercentage);
             ps.setString(10,tenthPassoutYear);
              ps.setString(11,twelveUniversityName);
               ps.setString(12,twelvePercentage);
                ps.setString(13,twelvePassoutYear);
                 ps.setString(14,graduationUniversityName);
                  ps.setString(15,graduationPercentage);
                   ps.setString(16,graduationPassoutYear);
                    ps.setString(17,address);
                     ps.setString(18,marks);
                     
                     ps.executeUpdate();
                     
    //JOptionPane.showMessageDialog(null, "Successfully Inserted");
    setVisible(false);
    new instructionStudent(rollNo).setVisible(true);
    
    
    }
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null,e);
    
    
    
    }
    
    
    
    
    
    
}
}
 
  
 
  

    public static void main(String[] args) 
{
        
       
       StudentDetails i= new  StudentDetails();
    }

   // private void add(ButtonGroup g1) {
      
    //}

    
}

