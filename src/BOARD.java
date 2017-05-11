
public class BOARD {

	private int [] [] feld;
	private boolean bedroht;
	private enum COLOR {w, b};
	private enum CURRENTCOLOR  {w,b};
    private PIECE sf;
    private PIECE tile[][];
    private int v = 0;
    
    private COLOR bcolor;
    private CURRENTCOLOR curcolor;
	
	public BOARD()
	{
		feld = new int [7][7];
	    sf = null;
	    tile = new PIECE [7][7];
	    curcolor = w;
	}
	
	public void setPieces(int x, int y, int number)
	{
		feld[x][y] = number;
	}
	
	public void IstBedroht(int x, int y)
	{
		for (int a = 0; a <= 7; a++)
		{
			if (feld[a][x] == 1)
			{
				bedroht = true;
			}
		}
		for (int b = 0; b<= 7; b++)
		{
			if (feld [x][b] ==1)
			{
				bedroht = true;
			}
		}
	}
	
	
	//
	// Neuer Kommentar
	//
	
	 public void doSomething(int x,int y){
	        if(sf != null){
	            if(tile[x][y] != null && curcolor == tile[x][y].getColor()){
	                sf = tile[x][y];
	            }else{
	                if( sf.moveAllowed(x , y) ){
	                    if(sf.getKind == N){
	                        move(x,y);  // take in move aufrufen, prüfen ob jmd da steht
	                    }else{
	                        if(sf.getKind == K)
	                        {
	                            if(danger(x,y)){
	                                Error();
	                            }else{
	                                move(x,y);
	                            }
	                        }else{
	                            if(wayBlocked(x,y,sf.getPos())){
	                                Error();
	                            }else{
	                                move(x,y);
	                            }
	                        }
	                    }
	                }else{
	                    Error();
	                }
	            }
	        }else{
	            if(tile[x][y] != null){
	                if(currentcolor == tile[x][y].getColor()){
	                    sf = tile[x][y];
	                    sf.showMoves();
	                }else{}              
	            }else{}
	        }
	    }
	    
	    public void move(int x, int y){
	        if(tile[x][y] != null){
	            wasted[v] = tile[x][y];
	            v++;
	        }
	        tile[x][y] = sf;
	        tile[sf.getPos().getX()][sf.getPos().getY()] = null;
	        sf.setPos(x,y);
	        if(currentcolor == w){
	            currentcolor = b;
	        }else{
	            currentcolor = w;
	        }
	    }
}
