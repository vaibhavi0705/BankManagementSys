package bankSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class signup2 extends JFrame implements ActionListener{
    JComboBox<String> combobox1,combobox2,combobox3,combobox4,combobox5;

    JTextField textpanNo, textAadhar;

    JRadioButton button1,button2,button3,button4;

    JButton next;

    String formno;

    signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT); 
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2 : ");
        l1.setFont(new Font("RaleWay",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setBounds(300,60,600,40);
        l2.setFont(new Font("RaleWay",Font.BOLD,22));
        add(l2);

        JLabel l3 = new JLabel("Religion : ");
        l3.setBounds(100,150,100,30);
        l3.setFont(new Font("RaleWay",Font.BOLD,18));
        add(l3);

        String religion[] = {"Hindu" , "Muslim", "Sikh", "Christian","Others"};
        combobox1 = new JComboBox<>(religion);
        combobox1.setBackground(new Color(244, 152, 156));
        combobox1.setFont(new Font("Raleway",Font.BOLD,14));
        combobox1.setBounds(350,150,320,30);
        add(combobox1);

        JLabel l4 = new JLabel("Category : ");
        l4.setBounds(100,200,100,30);
        l4.setFont(new Font("RaleWay",Font.BOLD,18));
        add(l4);

        String category[] = {"OPEN" , "OBC", "SC/ST", "NT","Others"};
        combobox2 = new JComboBox<>(category);
        combobox2.setBackground(new Color(244, 152, 156));
        combobox2.setFont(new Font("Raleway",Font.BOLD,14));
        combobox2.setBounds(350,200,320,30);
        add(combobox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setBounds(100,250,100,30);
        l5.setFont(new Font("RaleWay",Font.BOLD,18));
        add(l5);

        String income[] = {"Null","less than 50,000" , "50,000 - 1,00,000", "1,00,000 - 3,00,000", "3,00,000 - 6,00,000","6,00,000 - 8,00,000","more than 8,00,000"};
        combobox3 = new JComboBox<>(income);
        combobox3.setBackground(new Color(244, 152, 156));
        combobox3.setFont(new Font("Raleway",Font.BOLD,14));
        combobox3.setBounds(350,250,320,30);
        add(combobox3);

        JLabel l6 = new JLabel("Educarional : ");
        l6.setBounds(100,300,150,30);
        l6.setFont(new Font("RaleWay",Font.BOLD,18));
        add(l6);

        String education[] = {"10th Pass" , "12th Pass", "Under-Graduate", "Post-Graduated"};
        combobox4 = new JComboBox<>(education);
        combobox4.setBackground(new Color(244, 152, 156));
        combobox4.setFont(new Font("Raleway",Font.BOLD,14));
        combobox4.setBounds(350,300,320,30);
        add(combobox4);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setBounds(100,350,150,30);
        l7.setFont(new Font("RaleWay",Font.BOLD,18));
        add(l7);

        String occupation[] = {"Salaried" , "Non-Salaried"};
        combobox5 = new JComboBox<>(occupation);
        combobox5.setBackground(new Color(244, 152, 156));
        combobox5.setFont(new Font("Raleway",Font.BOLD,14));
        combobox5.setBounds(350,350,320,30);
        add(combobox5);

        JLabel l8 = new JLabel("PAN Number : ");
        l8.setBounds(100,400,150,30);
        l8.setFont(new Font("RaleWay",Font.BOLD,18));
        add(l8);

        textpanNo = new JTextField();
        textpanNo.setBounds(350,400,320,30);
        textpanNo.setFont(new Font("RaleWay",Font.BOLD,14));
        add(textpanNo);

        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setBounds(100,450,200,30);
        l9.setFont(new Font("RaleWay",Font.BOLD,18));
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setBounds(350,450,320,30);
        textAadhar.setFont(new Font("RaleWay",Font.BOLD,14));
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setBounds(100,500,200,30);
        l10.setFont(new Font("RaleWay",Font.BOLD,18));
        add(l10);

        button1 = new JRadioButton("Yes");
        button1.setBackground(new Color(235, 210, 180));
        button1.setFont(new Font("Raleway", Font.BOLD ,14));
        button1.setBounds(350,500,60,30);
        add(button1);

        button2 = new JRadioButton("No");
        button2.setBackground(new Color(235, 210, 180));
        button2.setFont(new Font("Raleway", Font.BOLD ,14));
        button2.setBounds(480,500,60,30);
        add(button2);

        JLabel l11 = new JLabel("Senior Citizen : ");
        l11.setBounds(100,550,200,30);
        l11.setFont(new Font("RaleWay",Font.BOLD,18));
        add(l11);

        button3 = new JRadioButton("Yes");
        button3.setBackground(new Color(235, 210, 180));
        button3.setFont(new Font("Raleway", Font.BOLD ,14));
        button3.setBounds(350,550,60,30);
        add(button3);

        button4 = new JRadioButton("No");
        button4.setBackground(new Color(235, 210, 180));
        button4.setFont(new Font("Raleway", Font.BOLD ,14));
        button4.setBounds(480,550,60,30);
        add(button4);

        ButtonGroup buttonGrp1 = new ButtonGroup();
        buttonGrp1.add(button1);
        buttonGrp1.add(button2);

        ButtonGroup buttonGrp2 = new ButtonGroup();
        buttonGrp2.add(button3);
        buttonGrp2.add(button4);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD ,14));
        next.setBackground(Color.GRAY);
        next.setForeground(Color.WHITE);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        JLabel l12 = new JLabel("FORM NO. : " + formno);
        l12.setBounds(700,10,150,30);
        l12.setFont(new Font("RaleWay",Font.BOLD,18));
        add(l12);

        

   












        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(235, 210, 180));
        setVisible(true);
    }

     @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new signup2("");
    }
    
}
