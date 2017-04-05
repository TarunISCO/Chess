/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TARUN BHARDWAJ
 */
public class Pieces {
    
    private boolean alive;
    private int x;
    private int y;

    Pieces(boolean alive, int x, int y) {
        super();
        this.alive = alive;
        this.x = x;
        this.y = y;
    }
    public boolean isAlive() {
        return alive;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public boolean isValid(Board board, int iniX, int iniY, int finalX, int finalY){
        if(finalX == iniX && finalY == iniY)
            return false;  //no movement
        if(finalX < 0 || finalX > 7 || iniX < 0 || iniX > 7 || finalY < 0 || finalY > 7 || iniY <0 || iniY > 7)
            return false;  //out of board 
        return true;
    }
    
}
