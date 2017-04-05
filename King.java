/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TARUN BHARDWAJ
 */

        
public class King extends Pieces{
    public King(boolean isalive , int x , int y){
        super(isalive,x,y);
    }
    @Override
    public boolean isValid(Board board, int iniX, int iniY, int finalX, int finalY){
        boolean check1=super.isValid(board, iniX, iniY, finalX, finalY);
        if (check1==false)
            return false;
        boolean check2=false;
        int xshift=Math.abs(iniX-finalX);
        int yshift=Math.abs(iniY-finalY);
        if((xshift==1&&yshift==0)||(yshift==1&&xshift==0)||(xshift==1&&yshift==1))
            check2=true;
        return check2;
        
    }
    
}
