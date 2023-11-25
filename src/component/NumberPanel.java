package component;

import java.awt.*;

import javax.swing.JPanel;

public class NumberPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int rows;
	int hoff=1;
	NumberLabel l;
	public int size=16;
	public NumberPanel() {
		super();
		setLayout(null);
		rows = MainFrame.lines;
		setSize(18*((int)Math.log10(rows)/2+1), MainFrame.lines*(size+5+size/16));
	}

	public void paintComponent(Graphics g) {
		removeAll();
		
		rows = MainFrame.lines;
		setSize(18*((int)Math.log10(rows)/2+1), rows*(size+5+size/16));
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, getWidth(), getHeight());

		for (int i = 1; i <= rows; i++) {
			l = new NumberLabel(i + "");
			l.setLocation(0, (size+5+size/16) * (i - 1));
			l.setSize(18*((int)Math.log10(rows)/2+1),size+5+size/16);
			l.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, size));
			add(l);
		}
	}
}
