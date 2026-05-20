
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Close extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Cal implements ActionListener {

    TextField tf;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13,
            b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25,
            b26, b27, b28, b29, b30;
    String fv, sv, op;
    Double fdv, sdv, tot;

    Cal() {
        Frame f = new Frame();
        f.addWindowListener(new Close());
        f.setResizable(false);
        f.setBackground(Color.LIGHT_GRAY);

        f.setSize(390, 600);
        Font f1 = new Font("Palatino Linotype", Font.BOLD, 15);
        Font f2 = new Font("Palatino Linotype", Font.BOLD, 25);

        //Title Bar
        f.setTitle("Calculator");

        //Menu Bar
        MenuBar mb = new MenuBar();
        Menu m1 = new Menu("View");
        Menu m2 = new Menu("Edit");
        Menu m3 = new Menu("Help");
        MenuItem mi1 = new MenuItem("View Help F1");
        MenuItem mi2 = new MenuItem("About Calcualor");
        m1.setFont(f1);
        m2.setFont(f1);
        m3.setFont(f1);
        m3.add(mi1);
        m3.add(mi2);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        //Panel 1 Display and Button panel
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        GridLayout gl = new GridLayout(6, 5, 10, 10);
        p2.setLayout(gl);

        //Display
        tf = new TextField(25);
        tf.setFont(f2);
        tf.setEditable(true);
        tf.setBackground(Color.white);
        tf.setText("0");
        p1.add(tf);

        b1 = new Button("MC");
        b2 = new Button("MR");
        b3 = new Button("M+");
        b4 = new Button("M-");
        b5 = new Button("MS");
        b6 = new Button("%");
        b7 = new Button("+/-");
        b8 = new Button("C");
        b9 = new Button("<-");
        b10 = new Button("CE");
        b11 = new Button("1/x");
        b12 = new Button("x^2");
        b13 = new Button("2√x");
        b14 = new Button("÷");
        b15 = new Button("×");
        b16 = new Button("1");
        b17 = new Button("2");
        b18 = new Button("3");
        b19 = new Button("4");
        b20 = new Button("+");
        b21 = new Button("5");
        b22 = new Button("6");
        b23 = new Button("7");
        b24 = new Button("8");
        b25 = new Button("-");
        b26 = new Button("9");
        b27 = new Button("0");
        b28 = new Button("00");
        b29 = new Button(".");
        b30 = new Button("=");

        b1.setBackground(Color.LIGHT_GRAY);
        b2.setBackground(Color.LIGHT_GRAY);
        b3.setBackground(Color.LIGHT_GRAY);
        b4.setBackground(Color.LIGHT_GRAY);
        b5.setBackground(Color.LIGHT_GRAY);
        b6.setBackground(Color.LIGHT_GRAY);
        b7.setBackground(Color.LIGHT_GRAY);
        b8.setBackground(Color.LIGHT_GRAY);
        b9.setBackground(Color.WHITE);
        b10.setBackground(Color.WHITE);
        b11.setBackground(Color.LIGHT_GRAY);
        b12.setBackground(Color.LIGHT_GRAY);
        b13.setBackground(Color.LIGHT_GRAY);
        b14.setBackground(Color.LIGHT_GRAY);
        b15.setBackground(Color.LIGHT_GRAY);
        b16.setBackground(Color.LIGHT_GRAY);
        b17.setBackground(Color.LIGHT_GRAY);
        b18.setBackground(Color.LIGHT_GRAY);
        b19.setBackground(Color.LIGHT_GRAY);
        b20.setBackground(Color.LIGHT_GRAY);
        b21.setBackground(Color.LIGHT_GRAY);
        b22.setBackground(Color.LIGHT_GRAY);
        b23.setBackground(Color.LIGHT_GRAY);
        b24.setBackground(Color.LIGHT_GRAY);
        b25.setBackground(Color.LIGHT_GRAY);
        b26.setBackground(Color.LIGHT_GRAY);
        b27.setBackground(Color.LIGHT_GRAY);
        b28.setBackground(Color.LIGHT_GRAY);
        b29.setBackground(Color.LIGHT_GRAY);
        b30.setBackground(Color.GRAY);

        b1.setFont(f2);
        b2.setFont(f2);
        b3.setFont(f2);
        b4.setFont(f2);
        b5.setFont(f2);
        b6.setFont(f2);
        b7.setFont(f2);
        b8.setFont(f2);
        b9.setFont(f2);
        b10.setFont(f2);
        b11.setFont(f2);
        b12.setFont(f2);
        b13.setFont(f2);
        b14.setFont(f2);
        b15.setFont(f2);
        b16.setFont(f2);
        b17.setFont(f2);
        b18.setFont(f2);
        b19.setFont(f2);
        b20.setFont(f2);
        b21.setFont(f2);
        b22.setFont(f2);
        b23.setFont(f2);
        b24.setFont(f2);
        b25.setFont(f2);
        b26.setFont(f2);
        b27.setFont(f2);
        b28.setFont(f2);
        b29.setFont(f2);
        b30.setFont(f2);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);
        p2.add(b21);
        p2.add(b22);
        p2.add(b23);
        p2.add(b24);
        p2.add(b25);
        p2.add(b26);
        p2.add(b27);
        p2.add(b28);
        p2.add(b29);
        p2.add(b30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b29.addActionListener(this);
        b30.addActionListener(this);

        f.add(p2);
        f.add(p1, BorderLayout.NORTH);
        f.setMenuBar(mb);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    @Override//Identify the click button
    public void actionPerformed(ActionEvent d) {

        if (tf.getText().equals("0")) {
            tf.setText("");
        }

        Object o = d.getSource();
        if (o.equals(b10)) {
            tf.setText("0");
        } else if (o.equals(b16)) {
            tf.setText(tf.getText() + b16.getLabel());
        } else if (o.equals(b17)) {
            tf.setText(tf.getText() + b17.getLabel());
        } else if (o.equals(b18)) {
            tf.setText(tf.getText() + b18.getLabel());
        } else if (o.equals(b19)) {
            tf.setText(tf.getText() + b19.getLabel());
        } else if (o.equals(b21)) {
            tf.setText(tf.getText() + b21.getLabel());
        } else if (o.equals(b22)) {
            tf.setText(tf.getText() + b22.getLabel());
        } else if (o.equals(b23)) {
            tf.setText(tf.getText() + b23.getLabel());
        } else if (o.equals(b24)) {
            tf.setText(tf.getText() + b24.getLabel());
        } else if (o.equals(b26)) {
            tf.setText(tf.getText() + b26.getLabel());
        } else if (o.equals(b27)) {
            tf.setText(tf.getText() + b27.getLabel());
        } else if (o.equals(b28)) {
            tf.setText(tf.getText() + b28.getLabel());

        } else if (o.equals(b20)) {//+
            fv = tf.getText();
            op = b20.getLabel();
            tf.setText("");

        } else if (o.equals(b25)) {//-
            fv = tf.getText();
            op = b25.getLabel();
            tf.setText("");
        } else if (o.equals(b15)) {//×

            fv = tf.getText();
            op = "*";
            tf.setText("");

        } else if (o.equals(b8)) {
            tf.setText("");
        } else if (o.equals(b14)) {//÷

            fv = tf.getText();
            op = "÷";
            tf.setText("");

        } else if (o.equals(b6)) {//%

            fv = tf.getText();
            op = b6.getLabel();
            tf.setText("");

        } else if (o.equals(b9)) {// Back
            String s = tf.getText();
            if (s.length() > 0) {
                tf.setText(s.substring(0, s.length() - 1));
            }
            if (tf.getText().equals("")) {
                tf.setText("0");
            }
        } else if (o.equals(b11)) {//1/x
            fv = tf.getText();
            op = "x";
            tf.setText("");

        } else if (o.equals(b12)) {//x^2
            fv = tf.getText();
            op = "xx";
            tf.setText("");

        } else if (o.equals(b13)) {//2√x
            fv = tf.getText();
            op = b13.getLabel();
            tf.setText("");

        } else if (o.equals(b7)) {// +/-

            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(-fdv + "");

        }else if (o.equals(b30)) {//=

            fdv = Double.parseDouble(fv);

            if (op.equals("x")) {//1/x
                tot = 1 / fdv;
                tf.setText(tot + "");
            } else if (op.equals("xx")) {//x^2
                tot = fdv * fdv;
                tf.setText(tot + "");
            } else if (op.equals("2√x")) {//2√x
                tot = Math.sqrt(fdv);
                tf.setText(tot + "");

            } else {

                sv = tf.getText();

                sdv = Double.parseDouble(sv);
                tf.setText("");

                if (op.equals("+")) {
                    tot = fdv + sdv;
                    tf.setText(tot + "");
                } else if (op.equals("-")) {
                    tot = fdv - sdv;
                    tf.setText(tot + "");
                } else if (op.equals("*")) {
                    tot = fdv * sdv;
                    tf.setText(tot + "");
                } else if (op.equals("÷")) {
                    tot = fdv / sdv;
                    tf.setText(tot + "");
                } else if (op.equals("%")) {
                    tot = fdv * (sdv / 100);
                    tf.setText(tot + "");

                }
            }
        }

    }

}

public class Calculator {

    public static void main(String[] args) {
        new Cal();
    }
}
