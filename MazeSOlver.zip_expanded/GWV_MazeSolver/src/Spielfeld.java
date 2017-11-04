

public class Spielfeld {
	private char [][] _spielfeld;
	private int _spielfeldX = 8;
	private int _spielfeldY = 8;
	
	public Spielfeld(){
		
		_spielfeld = new char[_spielfeldX][_spielfeldY];
		
		for(int i =0; i < _spielfeld.length; ++i){	
			for(int j =0; j < _spielfeld[i].length; ++j){
				_spielfeld[i][j]  = '0';
			}
		}
	}
	
	public Spielfeld(char [] spielfeld) {
		_spielfeld = new char[_spielfeldX][_spielfeldY];
		
		for(int i =0; i < _spielfeldX; ++i){	
			for(int j =0; j < _spielfeldY; ++j){
				_spielfeld[i][j]  = spielfeld [i * j + j];
				System.out.print(_spielfeld[i][j]);
				
			}
		}
	}
	
	public void print(){
		String rep = "";
		for(int i =0; i < _spielfeld.length; ++i){	
			String rep2 = "";
			for(int j =0; j < _spielfeld[i].length; ++j){
				char a = _spielfeld[i][j];
				rep2 = rep2 + a + " ";
			}
			rep = rep + rep2 + "\n";
		}
		System.out.print(rep);
	}
	
	
}


