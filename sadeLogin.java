import javax.swing.*;
public class sadeLogin {
    public static void main(String[] args){

        JFrame f;
        JLabel l,l1,l2;
        JTextField t;
        JPasswordField p;
        JButton b1,b2;

        f = new JFrame("Login");
        f.setBounds(600,100,220,180);
        f.setVisible(true);
        f.setLayout(null);

        l = new JLabel("Daxil ol!");
        l.setBounds(80,10,50,25);

        l1 = new JLabel("İstifadəçi adı: ");
        l1.setBounds(10,40,100,25);

        t = new JTextField();
        t.setBounds(100,40,100,25);

        l2 = new JLabel("Parol: ");
        l2.setBounds(10,70,100,25);

        p = new JPasswordField();
        p.setBounds(100,70,100,25);

        b1 = new JButton("Daxil ol");
        b1.setBounds(15,100,80,25);
        b2 = new JButton("Ləğv et");
        b2.setBounds(105,100,80,25);

        f.add(l);
        f.add(l1);
        f.add(t);
        f.add(l2);
        f.add(p);
        f.add(b1);
        f.add(b2);

    }
}
