/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzzzzzzz;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddnewQuestion extends JFrame implements ActionListener {

    
    JLabel l, l1, l2, l3, l4, l5, l6, l7;
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();
    JTextField t5 = new JTextField();
    JTextField t6 = new JTextField();

    JTextField Id = new JTextField();

    ImageIcon i = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\save.png");
    JButton b = new JButton("save", i);
    ImageIcon i1 = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\clear.png");
    ImageIcon i2 = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\add new question.png");
    ImageIcon i3 = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\Close.png");
    JButton b1 = new JButton("Clear", i1);
    JButton b3 = new JButton(i3);

    Font font = new Font("Arial", Font.BOLD, 19);

    AddnewQuestion() {
        
        
        try{
        Connection con=ConnectionProvider.getCon();
        Statement st=con.createStatement();
       /* ResultSet rs=st.executeQuery("select count(id) from question");
        if(rs.first())
        {
          int id=rs.getInt(1);
          id=id+1;
          String str=String.valueOf(id);
          Id.setText(str);
          
        }
        else
        {
            Id.setText("1");
            
            
        }*/}
        
        catch(Exception e)
        {
            JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, e);
        }
    
        
        
        
        
        
    

        setVisible(true);
        setSize(1000, 1000);
        setLayout(null);

        l7 = new JLabel("ADD NEW QUESTION");
        l7.setIcon(i2);
        l = new JLabel("Ouestion ID:");
        l7.setBounds(140, 20, 500, 60);
        l.setBounds(140, 120, 210, 40);
        l7.setFont(new Font("Arial", Font.BOLD, 40));
        l.setFont(font);

        l1 = new JLabel("Ouestion :");
        l1.setBounds(140, 180, 300, 40);
        l1.setFont(font);
        l2 = new JLabel("Option 1 :");
        l2.setBounds(140, 240, 350, 40);
        l2.setFont(font);

        l3 = new JLabel("Option 2 :");
        l3.setBounds(140, 300, 400, 40);
        l3.setFont(font);

        l4 = new JLabel("Option 3 :");
        l4.setBounds(140, 360, 450, 40);
        l4.setFont(font);

        l5 = new JLabel("Option 4 :");
        l5.setBounds(140, 420, 500, 40);
        l5.setFont(font);

        l6 = new JLabel("Answer :");
        l6.setBounds(140, 490, 550, 40);
        l6.setFont(font);

        Id.setBounds(280, 120, 150, 40);

        t1.setBounds(240, 180, 400, 40);

        t2.setBounds(240, 250, 400, 40);

        t3.setBounds(240, 310, 400, 40);

        t4.setBounds(240, 370, 400, 40);

        t5.setBounds(240, 430, 400, 40);

        t6.setBounds(240, 500, 400, 40);

        b.setBounds(160, 600, 200, 60);
        b.setFont(new Font("Arial", Font.BOLD, 27));

        b1.setBounds(420, 600, 200, 60);

        b3.setBounds(870, 10, 100, 50);
        b1.setFont(new Font("Arial", Font.BOLD, 27));

        add(l);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);

        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(Id);

        add(b);
        add(b1);
        add(b3);
        b.addActionListener(this);
        b1.addActionListener(this);
        b3.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {
            String id = Id.getText();
            String name = t1.getText();
            String opt1 = t2.getText();
            String opt2 = t3.getText();
            String opt3 = t4.getText();
            String opt4 = t5.getText();
            String answer = t6.getText();

            
            
            try {
            
            Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("insert into question values(?,?,?,?,?,?,?)");
            ps.setString(1, id);
             ps.setString(2, name);
              ps.setString(3, opt1);
               ps.setString(4, opt2);
                ps.setString(5, opt3);
                 ps.setString(6, opt4);
                  ps.setString(7, answer);
                  ps.executeUpdate();
                  
            JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, "Successfullty Updated");
                setVisible(false);
                new AddnewQuestion().setVisible(true);
            
            
            
            
            }
               /* Class.forName("org.apache.derby.jdbc.ClientDriver");
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/QuestionT", "app", "app");
                st = con.createStatement();

                String q = "insert into question values('" + nm + "','" + opt1 + "','" + opt2 + "','" + opt3 + "','" + opt4 + "','" + ans + "','" + id + "')";
                st.executeUpdate(q);

                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, "Successfullty Updated");
                setVisible(false);
                new AddnewQuestion().setVisible(true);

            } 
            */
            catch (Exception e) {
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, e);

            }

        }

        if (ae.getSource() == b1) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");

        }
        if (ae.getSource() == b3) {
            adminHome.open = 0;
            setVisible(false);

        }

    }

    public static void main(String[] args) {
        AddnewQuestion a = new AddnewQuestion();
    }

}
