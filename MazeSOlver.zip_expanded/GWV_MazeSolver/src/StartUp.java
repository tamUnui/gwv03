import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class StartUp {

	public static void main (String args[]){
		
		
		JFileChooser chooser = new JFileChooser();
		//ADD Cancel Dialog
		//ADD GUI Class
		chooser.showOpenDialog(null);
		File file = chooser.getSelectedFile();
		InputParser parser = new InputParser(file);
		Spielfeld spielfeld = new Spielfeld(); //parser.getParsedInput()
		spielfeld.print();
		
		try {
			spielfeld.bewege1FeldHoch();
		} catch (ObstructedFieldException e) {
		JOptionPane.showMessageDialog(null, "Das Feld ist nicht betretbar");
		}
		
		spielfeld.print();
	}
}
