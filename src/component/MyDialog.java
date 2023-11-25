package component;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class MyDialog extends JDialog {

	/**
	 * menu
	 */
	private static final long serialVersionUID = 1L;

	public MyDialog(Frame owner, String title) {
		super(owner, title);
		setSize(300, 150);
		setVisible(true);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.white);

		setLayout(null);

		JLabel info = new JLabel("ÒÑÐÞ¸ÄÎÄ¼þ£¬ÊÇ·ñ±£´æÐÞ¸Ä£¿");
		info.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 14));
		info.setBounds(50,0,200,60);
		getContentPane().add(info);
		
		JButton yes=new JButton("ÊÇ");
		yes.setBounds(60,70,60,25);
		yes.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		yes.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MyDialog.this.dispose();
				MainFrame.window.save();
				MainFrame.window.edited=false;
				MainFrame.window.newFile();
				MainFrame.window.lblNewLabel_3.setEnabled(false);
				MainFrame.window.lblNewLabel_4.setEnabled(false);
				MainFrame.window.filepath=null;
			}
			
		});
		getContentPane().add(yes);
		
		JButton no=new JButton("·ñ");
		no.setBounds(150,70,60,25);
		no.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		no.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MyDialog.this.dispose();
				MainFrame.window.edited=false;
				MainFrame.window.newFile();
				MainFrame.window.lblNewLabel_3.setEnabled(false);
				MainFrame.window.lblNewLabel_4.setEnabled(false);
				MainFrame.window.filepath=null;
			}
			
		});
		getContentPane().add(no);
	}

}
