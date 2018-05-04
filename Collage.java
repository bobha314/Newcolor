/**
 *Robert Ha collage
 */
public class Collage
{
    public static void main (String[] args)
    {
        Picture wao = new Picture("images/wao.jpg");
        Picture kennef = new Picture("images/kennef.jpg");
        Picture ogkennef = new Picture("images/kennef.jpg");
        Picture canvas = new Picture("images/LargeCanvas.jpg");
        /*
        kennef.mirrorHorizontal();
        canvas.copy(kennef,0,0);
        
        kennef.invert();
        canvas.copy(kennef,700,0);
        
        kennef.gray();
        canvas.copy(kennef,1400,0);
        
        canvas.copy(ogkennef,0,700);
        
        ogkennef.gray();
        canvas.copy(ogkennef,700,700);
        
        ogkennef.mirrorHorizontal();
        canvas.copy(ogkennef,1400,700);
        */
        canvas.recursive(kennef,2);
        
        canvas.explore();
        
        //canvas.write("images.finalcollege.jpg");
    }
}
