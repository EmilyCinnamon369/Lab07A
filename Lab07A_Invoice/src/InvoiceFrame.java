import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvoiceFrame extends JFrame {

    public InvoiceFrame() {

        setTitle("Invoice Creator");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        Font font1 = new Font("Times New Roman", Font.BOLD, 56);
        Font font2 = new Font("Times New Roman", Font.PLAIN, 18);
        Font font3 = new Font("Times New Roman", Font.PLAIN, 14);

        JLabel jabel = new JLabel("Invoice Creator", JLabel.CENTER);
        jabel.setBounds(20, 50, 600, 100);
        jabel.setFont(font1);

        JTextArea jerria = new JTextArea("Product      |      Quantity      |      Total");
        jerria.setFont(font3);

        JScrollPane jane = new JScrollPane(jerria);
        jane.setBounds(300, 200, 300, 300);


        JTextArea a1 = new JTextArea("Enter your product name here.");
        a1.setFont(font3);
        a1.setBounds(20, 200, 200, 50);

        JTextArea a2 = new JTextArea("Enter your product price here.");
        a2.setFont(font3);
        a2.setBounds(20, 300, 200, 50);

        JTextArea a3 = new JTextArea("Enter your product quantity here.");
        a3.setFont(font3);
        a3.setBounds(20, 400, 200, 50);


        JButton read_butt = new JButton("Create Invoice");
        read_butt.setBounds(40, 515, 200, 25);
        read_butt.setFont(font2);
        read_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String b1 = a1.getText();
                String b2 = a2.getText();
                String b3 = a3.getText();

                jerria.append(b1+"      |      "+b3+"      |      "+b2);

            }
        });

        JButton quit_butt = new JButton("Quit");
        quit_butt.setBounds(440, 515, 200, 25);
        quit_butt.setFont(font2);
        quit_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(jabel);
        add(jane);
        add(read_butt);
        add(quit_butt);
        add(a1);
        add(a2);
        add(a3);

        setVisible(true);

    }}