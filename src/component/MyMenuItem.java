package component;

import java.awt.Font;

import javax.swing.JMenuItem;

public class MyMenuItem extends JMenuItem{

	/**
	 * set font and size
	 */
	private static final long serialVersionUID = 1L;
	
	public MyMenuItem(String text){
		super(text);
		setBorder(null);
		setFont(new Font("΢���ź�", Font.PLAIN, 12));
	}

}
