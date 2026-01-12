package bankSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;

public class signUp extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4,r5,r6;

    JButton next;

    JDateChooser dateChooser;

    JTextField textName, textFName , textEmail, textAddress, textCity, textPinCode , textState;

    Random ran = new Random();

    long first4 =(ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    signUp(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT); 
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO. " + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway", Font.BOLD , 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1 : Personal Details ");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Raleway", Font.BOLD , 22));
        add(label2);

        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Raleway", Font.BOLD ,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD ,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelFName = new JLabel("Father's Name : ");
        labelFName.setFont(new Font("Raleway", Font.BOLD ,20));
        labelFName.setBounds(100,240,200,30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD ,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        JLabel DOB= new JLabel("Date of Birth : ");
        DOB.setFont(new Font("Raleway", Font.BOLD ,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Raleway", Font.BOLD ,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setBackground(new Color(222,255,228));
        r1.setFont(new Font("Raleway", Font.BOLD ,14));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(222,255,228));
        r2.setFont(new Font("Raleway", Font.BOLD ,14));
        r2.setBounds(425,290,90,30);
        add(r2);
;

        r3 = new JRadioButton("Other");
        r3.setBackground(new Color(222,255,228));
        r3.setFont(new Font("Raleway", Font.BOLD ,14));
        r3.setBounds(550,290,90,30);
        add(r3);

        

        JLabel email = new JLabel("Email Address :");
        email.setFont(new Font("Raleway", Font.BOLD ,20));
        email.setBounds(100,390,200,30);
        add(email);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD ,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMarried = new JLabel("Marital Status :");
        labelMarried.setFont(new Font("Raleway", Font.BOLD ,20));
        labelMarried.setBounds(100,440,200,30);
        add(labelMarried);

        r4 = new JRadioButton("Married");
        r4.setBackground(new Color(222,255,228));
        r4.setFont(new Font("Raleway", Font.BOLD ,14));
        r4.setBounds(300,440,90,30);
        add(r4);

        r5 = new JRadioButton("Unmarried");
        r5.setBackground(new Color(222,255,228));
        r5.setFont(new Font("Raleway", Font.BOLD ,14));
        r5.setBounds(425,440,110,30);
        add(r5);

        r6 = new JRadioButton("Other");
        r6.setBackground(new Color(222,255,228));
        r6.setFont(new Font("Raleway", Font.BOLD ,14));
        r6.setBounds(550,440,90,30);
        add(r6);

        JLabel labelAddress = new JLabel("Address :");
        labelAddress.setFont(new Font("Raleway", Font.BOLD ,20));
        labelAddress.setBounds(100,490,200,30);
        add(labelAddress);

        textAddress = new JTextField();
        textAddress.setFont(new Font("Raleway", Font.BOLD ,14));
        textAddress.setBounds(300,490,400,30);
        add(textAddress);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD ,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD ,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel labelPinCode = new JLabel("Pin-Code :");
        labelPinCode.setFont(new Font("Raleway", Font.BOLD ,20));
        labelPinCode.setBounds(100,590,200,30);
        add(labelPinCode);

        textPinCode = new JTextField();
        textPinCode.setFont(new Font("Raleway", Font.BOLD ,14));
        textPinCode.setBounds(300,590,400,30);
        add(textPinCode);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway", Font.BOLD ,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD ,14));
        textState.setBounds(300,640,400,30);
        add(textState);


        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);
        buttonGroup1.add(r3);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r4);
        buttonGroup2.add(r5);
        buttonGroup2.add(r6);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD ,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }else if(r3.isSelected()){
            gender = "Other";
        }
        String email = textEmail.getText();
        String maritial = null;
        if(r4.isSelected()){
            maritial = "Married";
        }else if(r5.isSelected()){
            maritial = "Unmarried";
        }else if(r6.isSelected()){
            maritial = "Other";
        }
        String address = textAddress.getText();
        String city = textCity.getText();
        String pincode = textPinCode.getText();
        String state = textState.getText();

        try{
            if(textName.getText().trim().isEmpty() ||
                textFName.getText().trim().isEmpty() ||
                textEmail.getText().trim().isEmpty() ||
                textAddress.getText().trim().isEmpty() ||
                textCity.getText().trim().isEmpty() ||
                textPinCode.getText().trim().isEmpty() ||
                textState.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "fill all the feilds");
                return;
            }else{
                connection con1 = new connection();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+maritial+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(query);
                new signup2();
                setVisible(false);
                
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }     
    public static void main(String[] args){
        new signUp();

    }
    
}
