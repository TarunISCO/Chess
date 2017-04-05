/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TARUN BHARDWAJ
 */
public class Spot {
    int x;
    int y;
    Pieces piece;

    public Spot(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        piece = null;
    }

    public void occupySpot(Pieces piece){
        //if piece already here, delete it, i. e. set it dead
        if(this.piece != null)
            this.piece.setAlive(false);
        //place piece here
        this.piece = piece;
    }

    public boolean isOccupied() {
        if(piece != null)
            return true;
        return false;
    }

    public Pieces releaseSpot() {
        Pieces releasedPiece = this.piece;
        this.piece = null;
        return releasedPiece;
    }

    
}
