/**
 * @program: editor
 * @classname: SettingMenu
 * @author: ToiletBowl
 * @create: 2023-11-10 23:56:43
 **/

package component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class SettingMenu extends JDialog {
    JTextArea jta;
    NumberPanel np;
    public SettingMenu(Frame owner, String title) {
        super(owner, title);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);

        JPanel p = new JPanel();
        p.setBounds(0,0,getContentPane().getWidth(),getContentPane().getHeight());
        p.setLayout(null);
        add(p);

        JLabel l1 = new JLabel("×ÖºÅ£º");
        l1.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,16));
        l1.setBounds(140,20,200,100);
        p.add(l1);

        JTextField t1 = new JTextField(10);
        t1.setBounds(200,60,100,20);
        p.add(t1);

        JButton b1 = new JButton("È·ÈÏ");
        b1.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,10));
        b1.setBounds(320,60,70,20);
        p.add(b1);
    }

    public SettingMenu(Frame owner, String title,JTextArea jta,NumberPanel np) {
        super(owner, title);
        this.jta = jta;
        this.np = np;
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);

        JPanel p = new JPanel();
        p.setBounds(0,0,getContentPane().getWidth(),getContentPane().getHeight());
        p.setLayout(null);
        add(p);

        JLabel l1 = new JLabel("×ÖºÅ£º");
        l1.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,12));
        l1.setBounds(140,20,100,100);
        p.add(l1);

        JTextField t1 = new JTextField(String.valueOf(jta.getFont().getSize()),10);
        t1.setBounds(170,60,40,20);
        p.add(t1);

        JButton b1 = new JButton("È·ÈÏ");
        b1.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,10));
        b1.setBounds(220,60,70,20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int size = Integer.parseInt(t1.getText());
                jta.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, size));
                np.size = size;
                np.repaint();
                jta.repaint();
            }
        });
        p.add(b1);

        JComboBox<String> jcb = new JComboBox<>();
        String[] color = {"light","dark"};
        for (String i :color) {
            jcb.addItem(i);
        }
        jcb.setBounds(210,100,100,20);
        jcb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String color = jcb.getSelectedItem().toString();
                switch (color){
                    case "light":
                        jta.setFont(new Font("Inconsolata",Font.PLAIN,jta.getFont().getSize()));
                        jta.setBackground(Color.white);
                        jta.setForeground(Color.black);
                        jta.repaint();
                        break;
                    case "dark":
                        jta.setFont(new Font("Inconsolata",Font.PLAIN,jta.getFont().getSize()));
                        jta.setBackground(Color.black);
                        jta.setForeground(Color.white);
                        jta.setCaretColor(Color.red);
                        jta.repaint();
                        break;
                }
            }
        });
        p.add(jcb);

        JLabel l2 = new JLabel("Ö÷Ìâ£º");
        l2.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,12));
        l2.setBounds(140,100,70,20);
        p.add(l2);

        JLabel l3 = new JLabel("ÎÄ×ÖÑÕÉ«£º");
        l3.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,12));
        l3.setBounds(140,140,100,20);
        p.add(l3);

        JComboBox<String> tColor = new JComboBox<>();
        String[] textColor = {"ºÚ","°×","ºì","»Æ","ÂÌ","À¶"};
        for(String i : textColor){
            tColor.addItem(i);
        }
        tColor.setBounds(240,140,30,20);
        tColor.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String color = tColor.getSelectedItem().toString();
                switch (color){
                    case "°×":
                        jta.setForeground(Color.white);
                        break;
                    case "ºì":
                        jta.setForeground(Color.red);
                        break;
                    case "»Æ":
                        jta.setForeground(Color.yellow);
                        break;
                    case "ÂÌ":
                        jta.setForeground(Color.green);
                        break;
                    case "À¶":
                        jta.setForeground(Color.blue);
                        break;
                    case "ºÚ":
                        jta.setForeground(Color.black);
                        break;
                }
            }
        });
        p.add(tColor);
    }

}
