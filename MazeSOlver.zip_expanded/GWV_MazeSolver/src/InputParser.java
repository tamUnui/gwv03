import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.activation.UnsupportedDataTypeException;

public class InputParser {
	
	FileReader in;
	BufferedReader br;
	char[] input;
	
	public InputParser(File path){
		
		try{	
		ensureFileTxt(path);	
		in = new FileReader(path);	
		br = new BufferedReader(in);
	}
		catch (FileNotFoundException e){
			System.out.print("Datei nicht gefunden");
		} catch (UnsupportedDataTypeException e) {
			System.out.print("Nicht unterstützte Datei. Entweder keine .txt oder nicht lesbar");
			e.printStackTrace();
			System.exit(0);
		}
		input  = readInput();
	}
	
	private void ensureFileTxt(File path) throws UnsupportedDataTypeException {
		if(!path.getName().endsWith(".txt")){
			throw new UnsupportedDataTypeException();
		}
		
	}
	private char[] readInput ()  {
		//FIXENENENENENENENNE
		char [] cbuf = new char[500];
		
		try {
			br.read(cbuf);
		} catch (IOException e) {
			System.out.print("failed");
			e.printStackTrace();
		}
		return cbuf;
	}

	public char[] getParsedInput(){
		return input;
	}
}
