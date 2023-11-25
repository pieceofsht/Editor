package component;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class MyDialog3 extends JDialog {

	/**
	 * menu
	 */
	private static final long serialVersionUID = 1L;

	public MyDialog3(Frame owner, String title) {
		super(owner, title);
		setSize(300, 150);
		setVisible(true);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.white);

		setLayout(null);

		JLabel info = new JLabel("���޸��ļ����Ƿ񱣴��޸ģ�");
		info.setFont(new Font("΢���ź�", Font.PLAIN, 14));
		info.setBounds(50,0,200,60);
		getContentPane().add(info);
		
		JButton yes=new JButton("��");
		yes.setBounds(60,70,60,25);
		yes.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		yes.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MyDialog3.this.dispose();
				MainFrame.window.save();
				System.exit(0);
			}
			
		});
		getContentPane().add(yes);
		
		JButton no=new JButton("��");
		no.setBounds(150,70,60,25);
		no.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		no.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MyDialog3.this.dispose();
				System.exit(0);
			}
			
		});
		getContentPane().add(no);
	}

}

