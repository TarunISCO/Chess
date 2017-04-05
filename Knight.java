/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TARUN BHARDWAJ
 */
public class Knight extends Pieces{
	public Knight(boolean isalive , int x , int y)
	{
        	super(isalive,x,y);
   	}
    	@Override
   	public boolean isValid(Board board, int iniX, int iniY, int finalX, int finalY)
   	{
        	boolean check1=super.isValid(board, iniX, iniY, finalX, finalY);
        	if (check1==false)
            		return false;
            	int xshift=Math.abs(iniX-finalX);
            	int yshift=Math.abs(iniY-finalY);
            	if((xshift==2&&yshift==1)||(xshift==1&&yshift==2))
            		return true;
            	return false;
        }
}
