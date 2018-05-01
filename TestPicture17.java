
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{
    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {  
     Picture myCanvas = new Picture("images/LargeCanvas.jpg");
     Picture katie = new Picture("images/KatieFancy.jpg");
     Picture train = new Picture("images/weirdtrain.jpg");
     Picture wao = new Picture("images/wao.jpg");
     train.gray();

     Picture temple = new Picture("images/temple.jpg");
     temple.mirrorTemple();
     temple.explore();
     
     Picture choke = new Picture("images/i just want to choke u.jpg");
     choke.mirrorHorizontal();
     choke.explore();
     
     myCanvas.copyflowerSmaller(train,"b");
     myCanvas.explore();
     
     /*
    for (Pixel pixelObj : pixels_arr)//grabs array)
        {
            //set the red value of the current pixel to the new value
            if (pixelObj.getColor() == Color.red()) {
                pixelObj.setColor(Color.blue);
            }
            
            i++;
        }
    ferris1.explore();
    
    /*
     /**
      * Method to reduce red from picture by a factor of n
      * @param none
      * @return none
      */
    
    /*
    int value;
    final double  FACTOR = .5;
        for (Pixel pixelObj : pixels)
        {
    
            //get the redvalue
            value = pixelObj.getRed();
            System.out.println(value);
            
            //decrease the red value by 50%
            pixelObj.setRed((int)(value * FACTOR));
            //set the red value of the current pixel to the new value
            
            
    
        }
        // use new picture when changing or it will make changes to 
        // pic you already changed
        ferris1.explore();
        ferris2.explore();
    
      /*
        //write/save a picture as a file
        ferris1.write("images/ferristest.jpg");
    
        */
  }//main
}//class
