/**
 *Robert Ha collage
 */


public class Collage
{
    public static void main (String[] args)
    {
        Picture kennef = new Picture("images/kennef.jpg");
        Picture canvas = new Picture("images/LargeCanvas.jpg");    
        
        //copies original picture
        canvas.copy(kennef,0,0);
        
        //copies recursive of picture onto original picture
        canvas.recursive(kennef,2,0,0);
        
        //inverts colors
        kennef.invert();
        canvas.copy(kennef,700,0);
        
        //converts to grey
        kennef.gray();
        canvas.copy(kennef,1400,0);  
        
        //mirrors over vertical line
        kennef.mirrorVertical();
        canvas.copy(kennef,0,700);
        
        //mirrors over horizontal line
        kennef.mirrorHorizontal();
        canvas.copy(kennef,700,700);                                               
        
        //rotates image 90 degrees clockwise
        canvas.rotate(kennef,1400,700);       
        
        canvas.explore();
        
    	canvas.write("images/finalcollege.jpg");
    }
}
