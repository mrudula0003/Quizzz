/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzzzzzzz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author Hp
 */
public class instructionStudent extends JFrame implements ActionListener {
    
    
    public String rollNo;
    
    
    instructionStudent(String rollNo1)
    {
    
        setVisible(true);
  setSize(1000,1000);
  setLayout(null);
    rollNo=rollNo1;
  Font font=new Font("Arial",Font.BOLD,19);
        
    JLabel l=new JLabel("INSTRUCTIONS");
 ImageIcon icon =  new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\index student.png");
 l.setIcon(icon);
    l.setBounds(310,50,700,60);
l.setFont(new Font("Arial",Font.BOLD,40));
JTextArea jt=new JTextArea();
jt.setBounds(45,150,900,580);
jt.setText("\n\n       During the Exam\n \n      1.The student may not use his or her textbook, course notes, or receive help from a \n        proctor or any other outside sourse.\n\n\n       2.Students must complete the 10-multiple-choice exam within the 10-minute time \n        frame alloted for the exam \n\n\n       3.Students must not stop the session and then return to it.This is especially important \n        in the online environment where the system will time-out and not alllow the student \n       or you to reenter the exam. \n\n\n\n        Number of Question: 10 \n       Exam Duration: 10min \n        All the Best!!");
jt.setFont(font);
add(jt);
jt.setEditable(false);
JButton b=new JButton("START QUIZ/EXAM");
b.setBounds(380,800,250,50);
add(b);
b.setFont(font);


add(l);

b.addActionListener(this);


    }
    
    instructionStudent()
    { 
   
   }
    
    
    public void actionPerformed(ActionEvent ae) { 
    
    setVisible(false);
                new quizExam(rollNo).setVisible(true);
    
    }


    public static void main(String[] args) 
{
        
       
        instructionStudent i= new instructionStudent();
    }
}