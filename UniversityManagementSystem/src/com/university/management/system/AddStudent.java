package com.university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class AddStudent extends JFrame implements ActionListener {



    JDateChooser dcDateOfBirth;
    JComboBox cbCourse,cbBranch;
    JLabel lblRandomNo;
    Random random = new Random();
    JButton submitButton,cancelButton;
    long firstFour = Math.abs((random.nextLong()%9000L)+1000L);

    JTextField tfName,tfFatherName,tfAddress,tfPhoneNo,tfEmail,tfCNIC,tfMatric,tfInter,tfCBCourse;
    AddStudent(){
        setSize(900,700);
        setLocation(350,50);
        setLayout(null);
        // heading
         JLabel heading = new JLabel("New Student Details");
         heading.setBounds(310,30,500,50);
         heading.setFont(new Font("serif",Font.BOLD,30));
         add(heading);
        //name
        JLabel lblName = new JLabel("Name");
        lblName.setBounds(50,150,100,30);
        lblName.setFont(new Font("serif",Font.BOLD,30));
        add(lblName);
        //name text field
        tfName= new JTextField();
        tfName.setBounds(200,150,200,30);
        add(tfName);
        //father name
        JLabel lblFatherName = new JLabel("Father Name");
        lblFatherName.setBounds(450,150,200,30);
        lblFatherName.setFont(new Font("serif",Font.BOLD,30));
        add(lblFatherName);
        //father name text field
        tfFatherName= new JTextField();
        tfFatherName.setBounds(650,150,200,30);
        add(tfFatherName);
        //roll no
        JLabel lblRollNo = new JLabel("Roll No");
        lblRollNo.setBounds(50,200,100,30);
        lblRollNo.setFont(new Font("serif",Font.BOLD,30));
        add(lblRollNo);
        //Roll text field
        lblRandomNo = new JLabel("1544"+firstFour);
        lblRandomNo.setBounds(200,200,200,30);
        lblRandomNo.setFont(new Font("serif",Font.BOLD,30));
        add(lblRandomNo);
        //date of birth
        JLabel lblDateOfBirth = new JLabel("Date Of Birth");
        lblDateOfBirth.setBounds(450,200,200,30);
        lblDateOfBirth.setFont(new Font("serif",Font.BOLD,30));
        add(lblDateOfBirth);
        //date of birth object
        dcDateOfBirth = new JDateChooser();
        dcDateOfBirth.setBounds(650,200,200,30);
        add(dcDateOfBirth);
        //address
        JLabel lblAddress = new JLabel("Address");
        lblAddress.setBounds(50,250,200,30);
        lblAddress.setFont(new Font("serif",Font.BOLD,30));
        add(lblAddress);
        //address
        tfAddress= new JTextField();
        tfAddress.setBounds(200,250,200,30);
        add(tfAddress);
        //phone no
        JLabel lblPhoneNo = new JLabel("Phone No");
        lblPhoneNo.setBounds(450,250,200,30);
        lblPhoneNo.setFont(new Font("serif",Font.BOLD,30));
        add(lblPhoneNo);
        //phone no
        tfPhoneNo= new JTextField();
        tfPhoneNo.setBounds(650,250,200,30);
        add(tfPhoneNo);
        //email label
        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(450,300,200,30);
        lblEmail.setFont(new Font("serif",Font.BOLD,30));
        add(lblEmail);
        //email
        tfEmail= new JTextField();
        tfEmail.setBounds(200,300,200,30);
        add(tfEmail);
        //cnic no
        JLabel lblCNIC = new JLabel("CNIC No");
        lblCNIC.setBounds(50,300,300,30);
        lblCNIC.setFont(new Font("serif",Font.BOLD,30));
        add(lblCNIC);
        //cnic
        tfCNIC= new JTextField();
        tfCNIC.setBounds(650,300,200,30);
        add(tfCNIC);
        //class x
        JLabel lblMatric = new JLabel("ClassX%");
        lblMatric.setBounds(450,350,200,30);
        lblMatric.setFont(new Font("serif",Font.BOLD,30));
        add(lblMatric);
        //class x
        tfMatric= new JTextField();
        tfMatric.setBounds(200,350,200,30);
        add(tfMatric);
        //inter
        JLabel lblInter = new JLabel("ClassXII%");
        lblInter.setBounds(50,350,250,30);
        lblInter.setFont(new Font("serif",Font.BOLD,30));
        add(lblInter);
        //inter
        tfInter= new JTextField();
        tfInter.setBounds(650,350,200,30);
        add(tfInter);
        //combo box courses
        JLabel lblCBCourse = new JLabel("Course");
        lblCBCourse.setBounds(50,400,250,30);
        lblCBCourse.setFont(new Font("serif",Font.BOLD,30));
        add(lblCBCourse);
        //combo box courses
        String[] course= {"B.Tech","BBA","BCA","BSc","MSc","MBA","MCA","MCom","MA","BA"};
        cbCourse = new JComboBox(course);
        cbCourse.setBounds(200,400,150,30);
        cbCourse.setBackground(Color.white);
        add(cbCourse);
        //branch
        JLabel lblBranch = new JLabel("Department");
        lblBranch.setBounds(450,400,200,30);
        lblBranch.setFont(new Font("serif",Font.BOLD,30));
        add(lblBranch);
        //branch
        String[] branch= {"Computer Science","Electronics","Mechanical","Civil",
                "Electrical","Biomedical","IT","Mathematics","Software","Biotechnology"};
        cbBranch = new JComboBox(branch);
        cbBranch.setBounds(650,400,150,30);
        cbBranch.setBackground(Color.white);
        add(cbBranch);
        //submit button
        submitButton =  new JButton("SUBMIT");
        submitButton.setBounds(250,550,120,40);
        submitButton.setBackground(Color.black);
        submitButton.setForeground(Color.white);
        submitButton.setFont(new Font("serif",Font.BOLD,20));
        submitButton.addActionListener(this);
        add(submitButton);
        //cancel button
        cancelButton = new JButton("CANCEL");
        cancelButton.setBounds(450,550,120,40);
        cancelButton.setBackground(Color.black);
        cancelButton.setForeground(Color.white);
        cancelButton.setFont(new Font("serif",Font.BOLD,20));
        cancelButton.addActionListener(this);
        add(cancelButton);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== submitButton){
            String name=tfName.getText();
            String fatherName=tfFatherName.getName();
            String rollNo=lblRandomNo.getText();
            String dob= ((JTextField) dcDateOfBirth.getDateEditor().getUiComponent()).getText();
            String address=tfAddress.getText();
            String phone=tfPhoneNo.getText();
            String email=tfEmail.getText();
            String matric=tfMatric.getText();
            String inter=tfInter.getText();
            String cnic=tfCNIC.getText();
            String course=(String)cbCourse.getSelectedItem();
            String depart=(String)cbBranch.getSelectedItem();

            //database connect
            try {
                String query = "insert into student values('" + name + "','" + fatherName + "','" + rollNo + "','" + dob + "','" + address + "','" + phone + "','" + email + "','" + matric + "','" + inter + "','" + cnic + "','" + course + "','" + depart + "')";
                Conn con = new Conn();
                con.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Student Details Insert Successfully");
                setVisible(false);

            }catch (Exception ae){
                ae.printStackTrace();
            }


        }
        else {
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new AddStudent();
    }
}
