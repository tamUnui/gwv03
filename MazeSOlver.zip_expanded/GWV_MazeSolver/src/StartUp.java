import java.io.File;

import javax.swing.JFileChooser;

public class StartUp {

	public static void main (String args[]){
		
		
		JFileChooser chooser = new JFileChooser();
		//ADD Cancel Dialog
		//ADD GUI Class
		chooser.showOpenDialog(null);
		File file = chooser.getSelectedFile();
		InputParser parser = new InputParser(file);
		Spielfeld spielfeld = new Spielfeld(); 
		parser.print();
		spielfeld.print();
		
		spielfeld.bewege1FeldHoch();
		
		spielfeld.print();
	}
}
