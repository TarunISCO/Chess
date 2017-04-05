/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TARUN BHARDWAJ
 */
public class Queen extends Pieces{
	public Queen(boolean isalive,int x,int y)
	{
		super(isalive,x,y);
	}
	@Override
	public boolean isValid(Board board,int iniX,int finalX,int iniY,int finalY)
	{
		boolean check1=super.isValid(board,iniX,finalX,iniY,finalY);
		if(check1==false)
			return false;
		int xshift=Math.abs(iniX-finalX);
		int yshift=Math.abs(iniY-finalY);
		//if(xshift==0||yshift==0||xshift==yshift)
		//	return true;
                if(xshift==0)
                {
                    int min=Math.min(iniY, finalY);
                    int max=Math.max(iniY, finalY);
                    for(int m=min+1;m<max;m++)
                    {
                        if(board.getSpot(iniX, m)!=null)
                        return false;
                    }
                    return true;
                }
                if(yshift==0)
                {
                    int min=Math.min(iniX, finalX);
                    int max=Math.max(iniX, finalX);
                    for(int m=min+1;m<max;m++)
                    {
                        if(board.getSpot(m, iniY)!=null)
                        return false;    
                    }
                    return true;
                }
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
