/**
 *Robert Ha collage
 */
public class Collage
{
    public static void main (String[] args)
    {
        Picture wao = new Picture("images/wao.jpg");
        Picture canvas = new Picture("images/LargeCanvas.jpg");
        
        wao.hair();
        canvas.copy(wao,0,0);
        
        wao.mirrorHorizontal();
        canvas.copy(wao,700,0);
        
        wao.mirrorVertical();
        canvas.copy(wao,1400,0);
        
        canvas.explore();
        
        //canvas.write("images.finalcollege.jpg");
    }
}
