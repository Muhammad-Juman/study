package com.university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton loginButton,cancelButton;
    JTextField tfUsername,tfPassword;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        //login user_name
        JLabel username = new JLabel("User Name : ");
        username.setBounds(50,30,100,20);
        add(username);
        //login user_name text field
        tfUsername = new JTextField();
        tfUsername.setBounds(140,30,150,20);
        add(tfUsername);
        //login password
        JLabel lbPassword = new JLabel("Password : ");
        lbPassword.setBounds(50,80,100,20);
        add(lbPassword);
        //login password field
        tfPassword = new JPasswordField();
        tfPassword.setBounds(140,80,150,20);
        add(tfPassword);
        //login button
        loginButton =  new JButton("LOGIN");
        loginButton.setBounds(40,160,120,40);
        loginButton.setBackground(Color.black);
        loginButton.setForeground(Color.white);
        loginButton.setFont(new Font("serif",Font.BOLD,20));
        loginButton.addActionListener(this);
        add(loginButton);
        //cancel button
        cancelButton = new JButton("CANCEL");
        cancelButton.setBounds(200,160,120,40);
        cancelButton.setBackground(Color.black);
        cancelButton.setForeground(Color.white);
        cancelButton.setFont(new Font("serif",Font.BOLD,20));
        cancelButton.addActionListener(this);
        add(cancelButton);
        //Image login screen
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);


        setSize(600,300);
        setLocation(500,250);
        setVisible(true);

    }
    //abstract method
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==loginButton){
            //connection database
            String username=tfUsername.getText();
            String password=tfPassword.getText();
            String query=
                    "select* from login where username='"+username+"'and password='"+password+"'";
            try{
                // 4 Executing sql queries
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    //next frame after login page
                    new Project();
                }else {
                    JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                    setVisible(false);
                }
                // 5 close database
                c.s.close();
            }catch (Exception b){
                b.printStackTrace();
            }
        }

        else if(e.getSource()==cancelButton){
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new Login();
    }
}
