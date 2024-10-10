package com.university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project extends JFrame implements ActionListener {

    Project(){
        //frame size
        setSize(1540,850);
        //image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540,750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        //menu bar
        JMenuBar menuBar=new JMenuBar();
        JMenu info=new JMenu("New Information");
        info.setForeground(Color.BLUE );
        menuBar.add(info);
        //faculty info
        JMenuItem facultyInfo =new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.white);
        facultyInfo.addActionListener(this);
        info.add(facultyInfo);
        //student info
        JMenuItem studentInfo =new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.white);
        studentInfo.addActionListener(this);
        info.add(studentInfo);
        //details
        JMenu details=new JMenu("Details");
        details.setForeground(Color.RED );
        menuBar.add(details);
        //faculty info
        JMenuItem facultyDetails =new JMenuItem("View Faculty Details");
        facultyDetails.setBackground(Color.white);
        details.add(facultyDetails);
        setJMenuBar(menuBar);
        //student info
        JMenuItem studentDetails =new JMenuItem("View Student Details");
        studentInfo.setBackground(Color.white);
        details.add(studentDetails);
        //leave
        JMenu leave=new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        menuBar.add(leave);
        //faculty leave
        JMenuItem facultyLeave =new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.white);
        leave.add(facultyLeave);
        //student leave
        JMenuItem studentLeave =new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.white);
        leave.add(studentLeave);
        //leave details
        JMenu leaveDetails=new JMenu("Leave Details");
        leaveDetails.setForeground(Color.RED );
        menuBar.add(leaveDetails);
        //faculty leave
        JMenuItem facultyLeaveDetailis =new JMenuItem("Faculty Leave Details");
        facultyLeaveDetailis.setBackground(Color.white);
        leaveDetails.add(facultyLeaveDetailis);
        //student leave
        JMenuItem studentLeaveDetails =new JMenuItem("Student Leave Details");
        studentLeaveDetails.setBackground(Color.white);
        leaveDetails.add(studentLeaveDetails);
       // examination
        JMenu examination=new JMenu("Examinaton");
        examination.setForeground(Color.BLUE );
        menuBar.add(examination);
        //faculty leave
        JMenuItem examinationResult =new JMenuItem("Examination Result");
        examinationResult.setBackground(Color.white);
        examination.add(examinationResult);
        //student leave
        JMenuItem enterMarks =new JMenuItem("Enter Marks");
        enterMarks.setBackground(Color.white);
        examination.add(enterMarks);
        //update details
        JMenu updateDetails=new JMenu("Update Details");
        updateDetails.setForeground(Color.RED );
        menuBar.add(updateDetails);
        //faculty details
        JMenuItem updateFacultyDetails =new JMenuItem("Update Faculty Details");
        updateFacultyDetails.setBackground(Color.white);
        updateDetails.add(updateFacultyDetails);
        //student Details
        JMenuItem updateStudentDetails =new JMenuItem("Update Student Details");
        updateStudentDetails.setBackground(Color.white);
        updateDetails.add(updateStudentDetails);
        //fee
        JMenu fee=new JMenu("Fee Details");
        fee.setForeground(Color.blue );
        menuBar.add(fee);
        //fee structure
        JMenuItem feeStructure =new JMenuItem("Fee Structure");
        feeStructure.setBackground(Color.white);
        fee.add(feeStructure);
        //student Details
        JMenuItem feeFom =new JMenuItem("Fee Fom");
        feeFom.setBackground(Color.white);
        fee.add(feeFom);
        //utility
        JMenu utility=new JMenu("Utility");
        utility.setForeground(Color.RED );
        menuBar.add(utility);
        //notepad
        JMenuItem notepad =new JMenuItem("Notepad");
        notepad.setBackground(Color.white);
        notepad.addActionListener(this);
        utility.add(notepad);
        //Calculator
        JMenuItem calc =new JMenuItem("Calculator");
        calc.setBackground(Color.white);
        calc.addActionListener(this);
        utility.add(calc);
        //exit
        JMenu exit=new JMenu("exit");
        exit.setForeground(Color.BLUE );
        menuBar.add(exit);
        //exit
        JMenuItem ex =new JMenuItem("Exit");
        ex.addActionListener(this);
        ex.setBackground(Color.white);
        exit.add(ex);

        setJMenuBar(menuBar);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        String msg = e.getActionCommand();
        if(msg.equals("Exit")){
            setVisible(false);
        } else if (msg.equals("Notepad")) {
           try {
               Runtime.getRuntime().exec("notepad.exe");
           }catch (Exception b){}
        } else if (msg.equals("Calculator")) {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception a){}
        } else if (msg.equals("New Faculty Information")) {
            new AddTeacher();
        } else if (msg.equals("New Student Information")) {
            new AddStudent();

        }

    }

    public static void main(String[] args){
        new Project();
    }
}
