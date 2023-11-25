package component;

import javax.swing.JLabel;
import javax.swing.JToolTip;

public class MyLabel extends JLabel {

	/**
	 * lable use on sidebar
	 */
	private static final long serialVersionUID = 1L;

	public JToolTip createToolTip() {
		return new MyToolTip();
	}
}
