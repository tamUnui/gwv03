import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class StartUp {

	public static void main (String args[]){
		
		
		JFileChooser chooser = new JFileChooser();
		
		//ADD GUI Class
		if(chooser.showOpenDialog(null) == JFileChooser.CANCEL_OPTION) System.exit(0);
		File file = chooser.getSelectedFile();
		InputParser parser = new InputParser(file);
		Spielfeld spielfeld = new Spielfeld(parser.getParsedInput()); //
		spielfeld.print();
		
//		try {
//			spielfeld.bewege1FeldRunter();
//			spielfeld.bewege1FeldRunter();
//			spielfeld.bewege1FeldRunter();
//			spielfeld.bewege1FeldRunter();
//		} catch (ObstructedFieldEfxception e) {
//		JOptionPane.showMessageDialog(null, "Das Feld ist nicht betretbar");
//		}
//		
//		spielfeld.print();
	}
}
