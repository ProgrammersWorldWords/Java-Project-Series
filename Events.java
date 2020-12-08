import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Events{
    JFrame frame = new JFrame();
    static Container c;
    static JLabel l = new JLabel();
    static Font f = new Font("Arial",Font.BOLD,50);
    static JButton btn1 = new JButton("1");
    static JButton btn2 = new JButton("2");
    static JButton btn3 = new JButton("3");
    static JButton btn4 = new JButton("4");
    static JButton btn5 = new JButton("5");
    static JButton btn6 = new JButton("6");
    static JButton btn7 = new JButton("7");
    static JButton btn8 = new JButton("8");
    static JButton btn9 = new JButton("9");
    static JButton btn10 = new JButton("10");
    static JButton btn11 = new JButton("11");
    static JButton btn12 = new JButton("12");
    static JButton btn13 = new JButton("13");

////////////////////////////////////////////////////////////////////////////////    
    static JButton btnColor1 = new JButton("1");
    static JButton btnColor2 = new JButton("2");
    static JButton btnColor3 = new JButton("3");
    static JButton btnColor4 = new JButton("4");
    static JButton btnColor5 = new JButton("5");
    static JButton btnColor6 = new JButton("6");
    static JButton btnColor7 = new JButton("7");
    static JButton btnColor8 = new JButton("8");
    static JButton btnColor9 = new JButton("9");
    static JButton btnColor10 = new JButton("10");
    static JButton btnColor11 = new JButton("11");
    static JButton btnColor12 = new JButton("12");
    static JButton btnColor13 = new JButton("13");
////////////////////////////////////////////////////////////////////////////////Fonts
    static JButton btnFonts1 = new JButton("Bold");
    static JButton btnFonts2 = new JButton("Italic");
    static JButton btnFonts3 = new JButton("Plain");
    static JButton btnFonts4 = new JButton("Center BaseLine");
    static JButton btnFonts5 = new JButton("Roman BaseLine");
    static JButton btnFonts6 = new JButton("Hanging BaseLine");
    static JButton btnFonts7 = new JButton("True Type Font");
    static JButton btnFonts8 = new JButton("Type1 Font");
    static JButton btnFonts9 = new JButton("Bold with Italic ");
    static JButton btnFonts10 = new JButton("Plain with Italic ");
    static JButton btnFonts11 = new JButton("Dialog");
    static JButton btnFonts12 = new JButton("Serif");
    static JButton btnFonts13 = new JButton("Monospaced");
////////////////////////////////////////////////////////////////////////////////
    public static class Button1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            c.setBackground(Color.WHITE);
            //l = new JLabel("White Color ");
            l.setText("White Color ");
            l.setSize(400,50);
            l.setFont(f);
            btn1.setBackground(Color.WHITE);
            l.setLocation(300,100);
            c.add(l);
        }
    }
    public static class Button2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            c.setBackground(Color.LIGHT_GRAY);
            //l = new JLabel("Light Gray Color ");
            l.setText("Light Gray Color ");
            l.setSize(450,50);
            l.setFont(f);
            btn2.setBackground(Color.LIGHT_GRAY);
            l.setLocation(250,100);
            c.add(l);
        }
    }
    public static class Button3 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.GRAY);
        //l = new JLabel();
        l.setText("Gray Color ");
        l.setSize(400,50);
        l.setFont(f);
        btn3.setBackground(Color.GRAY);
        l.setLocation(300,100);
        c.add(l);
    }
}
public static class Button4 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.DARK_GRAY);
        //l = new JLabel();
        l.setText("Dark Gray Color ");
        l.setSize(450,50);
        btn4.setBackground(Color.DARK_GRAY);
        l.setFont(f);
        l.setLocation(230,100);
            c.add(l);
    }
}
public static class Button5 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.BLACK);
        //l = new JLabel();
        l.setText("Black Color ");
        l.setSize(400,50);
        btn5.setBackground(Color.BLACK);
        btn5.setForeground(Color.WHITE);
        l.setFont(f);
        l.setLocation(300,100);
        c.add(l);
    }
}
public static class Button6 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.RED);
        //l = new JLabel();
        l.setText("Red Color ");
        l.setSize(400,50);
        btn6.setBackground(Color.RED);
        l.setFont(f);
        l.setLocation(300,100);
        c.add(l);
    }
}
public static class Button7 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.PINK);
        //l = new JLabel();
        l.setText("Pink Color ");
        l.setSize(400,50);
        btn7.setBackground(Color.PINK);
        l.setFont(f);
        l.setLocation(300,100);
        c.add(l);
    }
}
public static class Button8 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.ORANGE);
        //l = new JLabel();
        l.setText("Orange Color ");
        l.setSize(400,50);
        btn8.setBackground(Color.ORANGE);
        l.setFont(f);
        l.setLocation(300,100);
        c.add(l);
    }
}
public static class Button9 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.YELLOW);
        //l = new JLabel();
        l.setText("Yellow Color ");
        l.setSize(400,50);
        btn9.setBackground(Color.YELLOW);
        l.setFont(f);
        l.setLocation(300,100);
        c.add(l);
    }
}
public static class Button10 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.GREEN);
        //l = new JLabel();
        l.setText("Green Color ");
        l.setSize(400,50);
        btn10.setBackground(Color.GREEN);
        l.setFont(f);
        l.setLocation(300,100);
        c.add(l);
    }
}
public static class Button11 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.MAGENTA);
        //l = new JLabel();
        l.setText("Magenta Color ");
        l.setSize(400,50);
        btn11.setBackground(Color.MAGENTA);
        l.setFont(f);
        l.setLocation(280,100);
        c.add(l);
    }
}
public static class Button12 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.CYAN);
        //l = new JLabel();
        l.setText("Cyan Color ");
        l.setSize(400,50);
        btn12.setBackground(Color.CYAN);
        l.setFont(f);
        l.setLocation(300,100);
        c.add(l);
    }
}
public static class Button13 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.BLUE);
        //l = new JLabel();
        l.setText("Blue Color ");
        l.setSize(400,50);
        btn13.setBackground(Color.BLUE);
        l.setFont(f);
        l.setLocation(300,100);
        c.add(l);
    }
}
////////////////////////////////////////////////////////////////////////////////
   public static class ButtonColor1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            l.setForeground(Color.WHITE);
            btnColor1.setBackground(Color.WHITE);
        }
    }
    public static class ButtonColor2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            l.setForeground(Color.LIGHT_GRAY);
            btnColor2.setBackground(Color.LIGHT_GRAY);
        }
    }
    public static class ButtonColor3 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setForeground(Color.GRAY);
        btnColor3.setBackground(Color.GRAY);
    }
}
public static class ButtonColor4 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setForeground(Color.DARK_GRAY);
        btnColor4.setBackground(Color.DARK_GRAY);
    }
}
public static class ButtonColor5 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setForeground(Color.BLACK);
        btnColor5.setBackground(Color.BLACK);
    }
}
public static class ButtonColor6 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setForeground(Color.RED);
        btnColor6.setBackground(Color.RED);
    }
}
public static class ButtonColor7 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setForeground(Color.PINK);
        btnColor7.setBackground(Color.PINK);
    }
}
public static class ButtonColor8 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setForeground(Color.ORANGE);
        btnColor8.setBackground(Color.ORANGE);
    }
}
public static class ButtonColor9 implements ActionListener{
    public void actionPerformed(ActionEvent e){;
        l.setForeground(Color.YELLOW);
        btnColor9.setBackground(Color.YELLOW);
    }
}
public static class ButtonColor10 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setForeground(Color.GREEN);
        btnColor10.setBackground(Color.GREEN);
    }
}
public static class ButtonColor11 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setForeground(Color.MAGENTA);
        btnColor11.setBackground(Color.MAGENTA);
    }
}
public static class ButtonColor12 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setForeground(Color.CYAN);
        btnColor12.setBackground(Color.CYAN);
    }
}
public static class ButtonColor13 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setForeground(Color.BLUE);
        btnColor13.setBackground(Color.BLUE);
    }
}
////////////////////////////////////////////////////////////////////////////////
   public static class ButtonFonts1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            l.setFont(new Font("Arial",Font.BOLD,50));
        }
    }
    public static class ButtonFonts2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
             l.setFont(new Font("Arial",Font.ITALIC,50));
        }
    }
    public static class ButtonFonts3 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setFont(new Font("Arial",Font.PLAIN,50));
    }
}
public static class ButtonFonts4 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setFont(new Font("Arial",Font.CENTER_BASELINE,50));
    }
}
public static class ButtonFonts5 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setFont(new Font("Arial",Font.ROMAN_BASELINE,50));
    }
}
public static class ButtonFonts6 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setFont(new Font("Arial",Font.HANGING_BASELINE,50));
    }
}
public static class ButtonFonts7 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setFont(new Font("Arial",Font.TRUETYPE_FONT,50));
    }
}
public static class ButtonFonts8 implements ActionListener{
    public void actionPerformed(ActionEvent e){
       l.setFont(new Font("Arial",Font.TYPE1_FONT,50));
    }
}
public static class ButtonFonts9 implements ActionListener{
    public void actionPerformed(ActionEvent e){;
       l.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,50));
    }
}
public static class ButtonFonts10 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setFont(new Font("Arial",Font.PLAIN+Font.ITALIC,50));
    }
}
public static class ButtonFonts11 implements ActionListener{
    public void actionPerformed(ActionEvent e){
       l.setFont(new Font("DIALOG",Font.PLAIN,50));
    }
}
public static class ButtonFonts12 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setFont(new Font("SERIF;",Font.PLAIN,50));
    }
}
public static class ButtonFonts13 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        l.setFont(new Font("MONOSPACED",Font.PLAIN,50));
    }
}
////////////////////////////////////////////////////////////////////////////////
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(900,470);
        frame.setLocation(300,100);
        frame.setDefaultCloseOperation(3);
        frame.setTitle("To Change Background And Font Color As Well As Font Style ");
        frame.setResizable(false);
        frame.setLayout(null);
        
        ImageIcon icon = new ImageIcon("icon.png");
        frame.setIconImage(icon.getImage());
        
        c = frame.getContentPane();
        
        //JButton btn1 = new JButton("1");
        btn1.setSize(40,20);
        btn1.setLocation(20,20);
       // btn1.setForeground(Color.red);
        btn1.addActionListener(new Button1());
        c.add(btn1);
        
        //JButton btn2 = new JButton("2");
        btn2.setSize(40,20);
        btn2.setLocation(80,20);
        btn2.addActionListener(new Button2());
        c.add(btn2);
        
        //JButton btn3 = new JButton("3");
        btn3.setSize(40,20);
        btn3.setLocation(140,20);
        btn3.addActionListener(new Button3());
        c.add(btn3);
        
        //JButton btn4 = new JButton("4");
        btn4.setSize(40,20);
        btn4.setLocation(200,20);
        btn4.addActionListener(new Button4());
        c.add(btn4);
        
        //JButton btn5 = new JButton("5");
        btn5.setSize(40,20);
        btn5.setLocation(260,20);
        btn5.addActionListener(new Button5());
        c.add(btn5);
        
        //JButton btn6 = new JButton("6");
        btn6.setSize(40,20);
        btn6.setLocation(320,20);
        btn6.addActionListener(new Button6());
        c.add(btn6);
        
        //JButton btn7 = new JButton("7");
        btn7.setSize(40,20);
        btn7.setLocation(380,20);
        btn7.addActionListener(new Button7());
        c.add(btn7);
        
        //JButton btn8 = new JButton("8");
        btn8.setSize(40,20);
        btn8.setLocation(440,20);
        btn8.addActionListener(new Button8());
        c.add(btn8);
        
        //JButton btn9 = new JButton("9");
        btn9.setSize(40,20);
        btn9.setLocation(500,20);
        btn9.addActionListener(new Button9());
        c.add(btn9);
        
        //JButton btn10 = new JButton("10");
        btn10.setSize(60,20);
        btn10.setLocation(560,20);
        btn10.addActionListener(new Button10());
        c.add(btn10);
        
        //JButton btn11 = new JButton("11");
        btn11.setSize(60,20);
        btn11.setLocation(640,20);
        btn11.addActionListener(new Button11());
        c.add(btn11);
        
        //JButton btn12 = new JButton("12");
        btn12.setSize(60,20);
        btn12.setLocation(720,20);
        btn12.addActionListener(new Button12());
        c.add(btn12);
        
        //JButton btn13 = new JButton("13");
        btn13.setSize(60,20);
        btn13.setLocation(800,20);
        btn13.addActionListener(new Button13());
        c.add(btn13);
        
////////////////////////////////////////////////////////////////////////////
//JButton btn1 = new JButton("1");
        btnColor1.setSize(40,20);
        btnColor1.setLocation(20,200);
       // btn1.setForeground(Color.red);
        btnColor1.addActionListener(new ButtonColor1());
        c.add(btnColor1);
        
        //JButton btn2 = new JButton("2");
        btnColor2.setSize(40,20);
        btnColor2.setLocation(80,200);
        btnColor2.addActionListener(new ButtonColor2());
        c.add(btnColor2);
        
        //JButton btn3 = new JButton("3");
        btnColor3.setSize(40,20);
        btnColor3.setLocation(140,200);
        btnColor3.addActionListener(new ButtonColor3());
        c.add(btnColor3);
        
        //JButton btn4 = new JButton("4");
        btnColor4.setSize(40,20);
        btnColor4.setLocation(200,200);
        btnColor4.addActionListener(new ButtonColor4());
        c.add(btnColor4);
        
        //JButton btn5 = new JButton("5");
        btnColor5.setSize(40,20);
        btnColor5.setLocation(260,200);
        btnColor5.addActionListener(new ButtonColor5());
        c.add(btnColor5);
        
        //JButton btn6 = new JButton("6");
        btnColor6.setSize(40,20);
        btnColor6.setLocation(320,200);
        btnColor6.addActionListener(new ButtonColor6());
        c.add(btnColor6);
        
        //JButton btn7 = new JButton("7");
        btnColor7.setSize(40,20);
        btnColor7.setLocation(380,200);
        btnColor7.addActionListener(new ButtonColor7());
        c.add(btnColor7);
        
        //JButton btn8 = new JButton("8");
        btnColor8.setSize(40,20);
        btnColor8.setLocation(440,200);
        btnColor8.addActionListener(new ButtonColor8());
        c.add(btnColor8);
        
        //JButton btn9 = new JButton("9");
        btnColor9.setSize(40,20);
        btnColor9.setLocation(500,200);
        btnColor9.addActionListener(new ButtonColor9());
        c.add(btnColor9);
        
        //JButton btn10 = new JButton("10");
        btnColor10.setSize(60,20);
        btnColor10.setLocation(560,200);
        btnColor10.addActionListener(new ButtonColor10());
        c.add(btnColor10);
        
        //JButton btn11 = new JButton("11");
        btnColor11.setSize(60,20);
        btnColor11.setLocation(640,200);
        btnColor11.addActionListener(new ButtonColor11());
        c.add(btnColor11);
        
        //JButton btn12 = new JButton("12");
        btnColor12.setSize(60,20);
        btnColor12.setLocation(720,200);
        btnColor12.addActionListener(new ButtonColor12());
        c.add(btnColor12);
        
        //JButton btn13 = new JButton("13");
        btnColor13.setSize(60,20);
        btnColor13.setLocation(800,200);
        btnColor13.addActionListener(new ButtonColor13());
        c.add(btnColor13);
////////////////////////////////////////////////////////////////////////////////
        
        btnFonts1.setSize(150,40);
        btnFonts1.setLocation(20,250);
       // btn1.setForeground(Color.red);
        btnFonts1.addActionListener(new ButtonFonts1());
        c.add(btnFonts1);
        
        //JButton btn2 = new JButton("2");
        btnFonts2.setSize(150,40);
        btnFonts2.setLocation(190,250);
        btnFonts2.addActionListener(new ButtonFonts2());
        c.add(btnFonts2);
        
        //JButton btn3 = new JButton("3");
        btnFonts3.setSize(150,40);
        btnFonts3.setLocation(360,250);
        btnFonts3.addActionListener(new ButtonFonts3());
        c.add(btnFonts3);
        
        //JButton btn4 = new JButton("4");
        btnFonts4.setSize(150,40);
        btnFonts4.setLocation(530,250);
        btnFonts4.addActionListener(new ButtonFonts4());
        c.add(btnFonts4);
        
        //JButton btn5 = new JButton("5");
        btnFonts5.setSize(160,40);
        btnFonts5.setLocation(700,250);
        btnFonts5.addActionListener(new ButtonFonts5());
        c.add(btnFonts5);
        
        //JButton btn6 = new JButton("6");
        btnFonts6.setSize(160,40);
        btnFonts6.setLocation(20,310);
        btnFonts6.addActionListener(new ButtonFonts6());
        c.add(btnFonts6);
        
        //JButton btn7 = new JButton("7");
        btnFonts7.setSize(160,40);
        btnFonts7.setLocation(190,310);
        btnFonts7.addActionListener(new ButtonFonts7());
        c.add(btnFonts7);
        
        //JButton btn8 = new JButton("8");
        btnFonts8.setSize(160,40);
        btnFonts8.setLocation(360,310);
        btnFonts8.addActionListener(new ButtonFonts8());
        c.add(btnFonts8);
        
        //JButton btn9 = new JButton("9");
        btnFonts9.setSize(160,40);
        btnFonts9.setLocation(530,310);
        btnFonts9.addActionListener(new ButtonFonts9());
        c.add(btnFonts9);
        
        //JButton btn10 = new JButton("10");
        btnFonts10.setSize(160,40);
        btnFonts10.setLocation(700,310);
        btnFonts10.addActionListener(new ButtonFonts10());
        c.add(btnFonts10);
        
        //JButton btn11 = new JButton("11");
        btnFonts11.setSize(220,40);
        btnFonts11.setLocation(70,370);
        btnFonts11.addActionListener(new ButtonFonts11());
        c.add(btnFonts11);
        
        //JButton btn12 = new JButton("12");
        btnFonts12.setSize(220,40);
        btnFonts12.setLocation(320,370);
        btnFonts12.addActionListener(new ButtonFonts12());
        c.add(btnFonts12);
        
        //JButton btn13 = new JButton("13");
        btnFonts13.setSize(220,40);
        btnFonts13.setLocation(570,370);
        btnFonts13.addActionListener(new ButtonFonts13());
        c.add(btnFonts13);
        
    }  
}

