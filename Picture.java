import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from
 * SimplePicture and allows the student to add functionality to
 * the Picture class.
 *
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture
{
  ///////////////////// constructors //////////////////////////////////

  /**
   * Constructor that takes no arguments
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor
     */
    super();
  }

  public void gray()
  {   
      //copies all pixels into one array takes a lot of spacesd
      Pixel[] pix = this.getPixels();
      Pixel pixel = null;
      int intensity = 0;
      
      for (Pixel spot: pix) 
      {
          int ave = (spot.getRed() + spot.getBlue() + spot.getGreen())/3;
          
          spot.setRed(ave);
          spot.setGreen(ave);
          spot.setBlue(ave);
      }
  }
  
  public void copyKatie(/*String sourceFile*/)
  {
      String sourceFile = ("images/weirdtrain.jpg");
      
      Picture sourcePicture = new Picture(sourceFile);
      
      Pixel sourcePixel = null;
      Pixel targetPixel = null;
      
      for (int sourceX = 0, targetX = 200;
            sourceX < sourcePicture.getWidth();
            sourceX++, targetX++)
      {
           for (int sourceY = 0, targetY = 200;
            sourceY < sourcePicture.getHeight();
            sourceY++, targetY++)
            {
                //sets the target pixel color to the source pixel color
                sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
                targetPixel = this.getPixel(targetX, targetY);
                targetPixel.setColor(sourcePixel.getColor());
            }
        }
    }
           
    /**
     * mirrors around a vertical line in the middle of the picture
     * based on its width
     */
    public void mirrorVertical()
    {
        int width = this.getWidth();
        int mirrorPoint = width/2;
        
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        
        for (int y = 0; y < getHeight(); y++)
        {
            //loop from 0 to middle
            for (int x = 0; x < mirrorPoint; x++)
            {
                leftPixel = getPixel(x,y);
                rightPixel = getPixel(width-1-x,y);
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
    
    /**
     * mirrors around a horizontal line in the middle of the picture
     * based on its width
     */
    public void mirrorHorizontal()
    {
        int height = this.getHeight();
        int mirrorPoint = height/2;
        
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        
        for (int x = 0; x < getWidth(); x++)
        {
            //loop from 0 to middle
            for (int y = 0; y < mirrorPoint; y++)
            {
                topPixel = getPixel(x,y);
                bottomPixel = getPixel(x,height-1-y);
                bottomPixel.setColor(topPixel.getColor());
            }
        }
    }
  //277,30
  
    public void mirrorTemple()
    {
        int width = this.getWidth();
        int mirrorPoint = width/2;
        
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        for (int y = 0; y < 148; y++)
        {
            //loop from 0 to middle
            for (int x = 0; x < mirrorPoint; x++)
            {
                leftPixel = getPixel(x,y);
                rightPixel = getPixel(width-1-x,y);
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
        
        
  /**
   * Constructor that takes a file name and creates the picture
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }

  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }

  /**
   * Constructor that takes a picture and creates a
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }

  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }

  ////////////////////// methods ///////////////////////////////////////

  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() +
      " height " + getHeight()
      + " width " + getWidth();
    return output;

  }

  public static void main(String[] args)
  {
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
  }

} // this } is the end of class Picture, put all new methods before this