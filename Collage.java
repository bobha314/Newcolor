/**
 *Robert Ha collage
 */
public class Collage
{
    public static void main (String[] args)
    {
        Picture kennef = new Picture("images/kennef.jpg");
        Picture ogkennef = new Picture("images/kennef.jpg");
        Picture canvas = new Picture("images/LargeCanvas.jpg");    
        
        canvas.copy(kennef,0,0);
        canvas.recursive(kennef,2,0,0);
        
        kennef.invert();
        canvas.copy(kennef,700,0);
        
        kennef.gray();
        canvas.copy(kennef,1400,0);  
        
        kennef.mirrorVertical();
        canvas.copy(kennef,0,700);
        
        kennef.mirrorHorizontal();
        canvas.copy(kennef,700,700);                                               
        
        canvas.rotate(kennef,1400,700);
        
        canvas.explore();
        
        //canvas.write("images.finalcollege.jpg");
    }
}
