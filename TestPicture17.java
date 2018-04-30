
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
      /*
      //opens picture using a dialog box
      Color sample = new Color(255,51,0);
      Color sample2 = Color.orange;
      
      System.out.println(sample2);
      /**
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
     */
     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     
     //relative path
     Picture apic = new Picture("images\\beach.jpg");
     Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     Picture ferris2 = new Picture("images/2000 ferris wheel2.jpg");
     Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");
     Picture newpic = new Picture("images/koala.jpg");
     
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
     
     //myCanvas.copyKatie();
     //myCanvas.explore();
     
     /*
     Pixel[] koalapix;
     koalapix = newpic.getPixels();

     apic.explore();
     ferris1.explore();
     
     //makes an array of pixels
     Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     pixels = ferris1.getPixels();
     
     
     Pixel[] pixels_arr;
     pixels_arr = ferris1.getPixels();
     
     int i = 0;
     /*
     for (Pixel spot1 : pixels) {
         //System.out.println(spot1);
         if ((spot1.getX() + spot1.getY()) % 2 == 0){
             spot1.setColor(Color.green);
            }
            
         i++;
        }
        ferris1.explore();
     
     //how many pixels or how large array
    System.out.println("This is a large array"+pixels.length  );

/*
    
        //access each index
   // System.out.println(pixels[2]);
    //access each pixel
    Pixel spot = ferris1.getPixel(100,100);
    Pixel lampspot = ferris1.getPixel(252, 394);
    
    System.out.println(pixels[17].getColor());
    System.out.println(spot);
    System.out.println(lampspot);
/*
    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    lampspot.setColor(Color.blue);
    pixels[500034].setColor(Color.blue);
    
// change pic and then look at it again
    ferris1.explore();
/*
   // loop to access indexes of array or collection
   
    //for each loop spot  is a ?
    for (Pixel spot : pixels)
    System.out.println( spot );


   
 /**/

 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /**/
 //goes through every pixel
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
    
/**/
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
