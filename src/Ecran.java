import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextArea;

public class Ecran {

	JTextArea ecran = new JTextArea();
	JTextArea ecranResultat = new JTextArea();
	
	public Ecran() {
		
		ecranResultat.setPreferredSize(new Dimension(320, 200));
		ecranResultat.setFont(new Font("Press Start", Font.BOLD, 45));
		ecranResultat.setLineWrap(true);
		ecranResultat.setBackground(new Color(146, 179, 121));
		ecran.setFont(new Font("Press Start", Font.BOLD, 25));
		ecran.setPreferredSize(new Dimension(320, 60));
		ecran.setBackground(new Color(146, 179, 121));
		ecran.setEditable(false);
		ecranResultat.setEditable(false);
	}
	
	
}
