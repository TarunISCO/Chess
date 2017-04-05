/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TARUN BHARDWAJ
 */
public class Bishop extends Pieces{
	public Bishop(boolean isalive,int x,int y)
	{
		super(isalive,x,y);
	}
	
	@Override
	public boolean isValid(Board board,int iniX,int finalX,int iniY,int finalY)
	{
		boolean check1=super.isValid(board,iniX,finalX,iniY,finalY);
        	if (check1==false)
        		return false;
        	int xshift=Math.abs(iniX-finalX);
        	int yshift=Math.abs(iniY-finalY);
        	if(xshift==yshift)
                {
                    if((iniX<finalX)&&(iniY<finalY))
                    {
                        for(int i=iniX+1 ,j=iniY+1;i<finalX;i++,j++)
                        {
                            if(board.getSpot(i, j)!=null)
                                return false;
                        }
                        return true;
                    }
                    else if((iniX>finalX)&&(iniY>finalY))
                    {
                        for(int i=finalX+1 ,j=finalY+1;i<iniX;i++,j++)
                        {
                            if(board.getSpot(i, j)!=null)
                                return false;
                        }
                        return true;
                    }
                    else if((iniX>finalX)&&(iniY<finalY))
                    {
                        for(int i=finalX+1 ,j=finalY+1;i<iniX;i++,j--)
                        {
                            if(board.getSpot(i, j)!=null)
                                return false;
                        }
                        return true;
                    }
                    else
                    {
                        for(int i=iniX+1 ,j=iniY-1;i<finalX;i++,j--)
                        {
                            if(board.getSpot(i, j)!=null)
                                return false;
                        }
                        return true;
                    }
                }
        	return false;
        }
}
