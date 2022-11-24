import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class A1073327_scroll extends JFrame{
    private JPanel contentPane;
    JButton btnBack,btnNext;
    JLabel lblName,lblPage,lblShow;
    String[]pageName = {"Hello","My name is Louis","Nice to meet you"};
    int n = 0;
    
    A1073327_scroll(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(900,330,330,430);
        setTitle("Hello Guys");
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lblName = new JLabel(pageName[n],JLabel.CENTER);
        lblName.setBounds(60,120,180,25);
        contentPane.add(lblName);

        String show = "Page " + (n+1) + ", Total "+ pageName.length+" page";
        lblShow = new JLabel(show);
        lblShow.setBounds(20,300,180,25);
        contentPane.add(lblShow);

        lblPage = new JLabel();
        lblPage.setIcon(new ImageIcon("../image/" + pageName[n]+".png"));
        lblPage.setBounds(20,50,180,135);
        contentPane.add(lblPage);

        btnNext = new JButton("Next");
        btnNext.setBounds(180,320,100,50);
        contentPane.add(btnNext);
        btnNext.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent e){
                    n++;
                    if(n>= pageName.length){
                        n = 0;
                    }
                    lblPage.setIcon(new ImageIcon("../Image/" + pageName[n] +".png"));
                    lblName.setText(pageName[n]);
                    lblShow.setText("Page "+(n+1)+", Total "+ pageName.length+" page");
            }
        });

        btnBack = new JButton("Back");
        btnBack.setBounds(40,320,100,50);
        contentPane.add(btnBack);
        btnBack.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent e){
                    n--;
                    if(n<0){
                        n = pageName.length-1;
                    }
                    lblPage.setIcon(new ImageIcon("../Image/" + pageName[n] +".png"));
                    lblName.setText(pageName[n]);
                    lblShow.setText("Page "+(n+1)+", Total "+ pageName.length+" page");
            }
        });
        
        setVisible(true);

    }
    public class A1073327_scrolll{

        public static void main(String[] args){
            A1073327_scroll page = new A1073327_scroll();
    
        }
    
    }
    
}