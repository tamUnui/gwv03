

public class Spielfeld {
	private char [][] _spielfeld;
	//Dimensionen des Spielfelds
	private int _spielfeldX = 22;
	private int _spielfeldY = 10;
	private int _playerPositionX;
	private int _playerPositionY;
	
	public Spielfeld(){
		
		_spielfeld = new char[_spielfeldY][_spielfeldX];
		
		//leere Zeichen einspeichern
		for(int i =0; i < _spielfeld.length; ++i){	
			for(int j =0; j < _spielfeld[i].length; ++j){
				_spielfeld[i][j]  = ' ';
			}
		}
		
		//äußeren Zeilen mit Grenzen versehen
		for(int j =0; j < _spielfeld[0].length; ++j){
			_spielfeld[0][j]  = 'x';
			_spielfeld[_spielfeldY-1][j]  = 'x';
		}
		
		//äußeren Spalten mit Grenzen versehen
		for(int j =0; j < _spielfeld.length; ++j){
			_spielfeld[j][0]  = 'x';
			_spielfeld[j][_spielfeldX-1]  = 'x';
		}
		
		_spielfeld[_spielfeldY/2][_spielfeldX/2]  = 's';
		findPlayerPosition();
	}
	
	
	//workt nicht zu 100% 
	//speichert iwas komisches in in _spielfeld. 
	public Spielfeld(char [] spielfeld) {
		_spielfeld = new char[_spielfeldY][_spielfeldX];
		
		for(int i =0; i < _spielfeldY; ++i){	
			for(int j =0; j < _spielfeldX; ++j){
				_spielfeld[i][j]  = spielfeld [i * _spielfeldX + j];
			}
		}
		
		findPlayerPosition();
		
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
	
	
	public void bewege1FeldHoch() {
		if(!(_spielfeld[_playerPositionY+1][_playerPositionX] == 'x')) {
			_spielfeld[_playerPositionY+1][_playerPositionX] = _spielfeld[_playerPositionY][_playerPositionX];	
			_spielfeld[_playerPositionY][_playerPositionX] = ' ';
			_playerPositionY +=1 ;
		}
	}
	
	public void bewege1FeldRunter() {
		if(!(_spielfeld[_playerPositionY-1][_playerPositionX] == 'x')) {
			_spielfeld[_playerPositionY-1][_playerPositionX] = _spielfeld[_playerPositionY][_playerPositionX];	
			_spielfeld[_playerPositionY][_playerPositionX] = ' ';
			_playerPositionY -=1 ;
		}
	}
	public void bewege1FeldRechts() {
		if(!(_spielfeld[_playerPositionY][_playerPositionX +1] == 'x')) {
			_spielfeld[_playerPositionY][_playerPositionX+1] = _spielfeld[_playerPositionY][_playerPositionX];	
			_spielfeld[_playerPositionY][_playerPositionX] = ' ';
			_playerPositionX +=1 ;
		}
	}
	public void bewege1FeldLinks() {
		if(!(_spielfeld[_playerPositionY][_playerPositionX -1] == 'x')) {
			_spielfeld[_playerPositionY][_playerPositionX -1] = _spielfeld[_playerPositionY][_playerPositionX];	
			_spielfeld[_playerPositionY][_playerPositionX] = ' ';
			_playerPositionX -=1 ;
		}
	}
	
	public int[] getPlayerPosition() {
		int[] playerPosition = {_playerPositionX, _playerPositionY};
		return playerPosition;
	}
	
	private void findPlayerPosition() {
		for(int i =0; i < _spielfeld.length; ++i){	
			for(int j =0; j < _spielfeld[i].length; ++j){
				if(_spielfeld[i][j]  == 's') {
					_playerPositionX = j;
					_playerPositionY = i;
					return;
				}				 
			}
		}		
	}
}



