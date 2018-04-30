
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
         //opens selfie picture 
          /**/  
         //relative path
         //og pics
         Picture apic = new Picture("images/selfie.jpg");
         Picture obama = new Picture("images/obama.jpg");
         apic.explore();
         obama.explore();

         //change with selfie picture
         Picture me = new Picture("images/selfie.jpg"); 
         Picture me1 = new Picture("images/selfie.jpg");
         Picture me2 = new Picture("images/selfie.jpg");
         
         //initializes array pix
         Pixel[] pix;
                  
         /**
          * method 1 change
          * divides colors into 4 equal groups
          */
         //initializes vars for rgb values
         int red;
         int blue;
         int green;
         pix = me.getPixels();         
                  
         for (Pixel spot: pix) {
             //gets rgb values of colors
             red = spot.getRed();
             blue = spot.getBlue();
             green = spot.getGreen();
             
             //if pixel under a certain value then the color is changed
             if (red < 63 && blue < 63 && green < 63) {
                 spot.setColor(new Color(2, 32, 62));
                }
             else if (red < 127 && blue < 127 && green < 127) {
                 spot.setColor(new Color(198, 37, 8));
                }
             else if (red < 191 && blue < 191 && green < 191) {
                 spot.setColor(new Color(102, 157, 160));
                }
             else {
                 spot.setColor(new Color(250, 238, 192));
                }
            }
            me.explore();
            me.write("images/selfie1.jpg");

         /**
          * method 2 change
          * changes color based on intensity using max and min grayscale values
          */
         pix = me1.getPixels(); 
         int s = 0; //smallest pix value
         int b = 255; //largest pix value
         int ave;
         int quads; //size of four equal range of colors
         
         for (Pixel spot: pix) {
             red = spot.getRed();
             blue = spot.getBlue();
             green = spot.getGreen();
             
             ave = (red + blue + green)/3;
             if (ave > b) { //gets maximum grayscale
                 b = ave;
                }
             if (ave < s) { //gets min grayscale
                 s = ave;
                }
             quads = (b-s)/4; //divides range of pix values into 4
             
             //sees if pixel value is less than the factor of quad
             if (red < quads && blue < quads && green < quads) {
                 spot.setColor(new Color(2, 32, 62));
                }
             else if (red < quads*2 && blue < quads*2 && green < quads*2 ) {
                 spot.setColor(new Color(198, 37, 8));
                }
             else if (red < quads*3 && blue < quads*3 && green < quads*3) {
                 spot.setColor(new Color(102, 157, 160));
                }
             else {
                 spot.setColor(new Color(250, 238, 192));
                }
            }
            me1.explore();
            me1.write("images/selfie2.jpg");
         
         /**
          * custom color palette
          */
         pix = me2.getPixels();
         
         for (Pixel spot: pix) {
             red = spot.getRed();
             blue = spot.getBlue();
             green = spot.getGreen();
             
             //sets color to new value if under a certain value
             if (red < 63 && blue < 63 && green < 63) {
                 spot.setColor(new Color(77, 105, 170));
                }
             else if (red < 127 && blue < 127 && green < 127) {
                 spot.setColor(new Color(71, 183, 116));
                }
             else if (red < 191 && blue < 191 && green < 191) {
                 spot.setColor(new Color(254, 129, 99));
                }
             else {
                 spot.setColor(new Color(254, 202, 99));
                }
            }
         me2.explore();
         me2.write("images/selfie3.jpg");
         
    }//main       
}//class
