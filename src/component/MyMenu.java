package component;

import java.awt.Font;

import javax.swing.JMenu;

public class MyMenu extends JMenu {

	/**
	 * set font and size
	 */
	private static final long serialVersionUID = 1L;

	public MyMenu(String text) {
		super(text);
		setBorder(null);
		setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
	}

}
