/**
 * Robert Ha
 * Colorlab
 * modify pictures
 */
import java.awt.*;
import java.util.*;
import java.util.List;
public class colorlab
{
    public static void main(String[] args) 
    {
        Picture p = new Picture("images\\gorge.jpg");
        Picture p2 = new Picture("images\\gorge.jpg");
        Picture p3 = new Picture("images\\gorge.jpg");
        Picture p4 = new Picture("images\\gorge.jpg");
        Picture p5 = new Picture("images\\gorge.jpg");
        Picture p6 = new Picture("images\\gorge.jpg");
        Picture p7 = new Picture("images\\gorge.jpg");
        Picture p8 = new Picture("images\\gorge.jpg");
        Picture p9 = new Picture("images\\gorge.jpg");
        Picture p10 = new Picture("images\\gorge.jpg");
        
        
        Pixel[] pix;
        pix = p.getPixels();
        p.explore();
        
        
        /**
          * Method to max blue, red,and green in picture
          * @param none
          * @return none
         /**/
        for (Pixel spot: pix) {
            spot.setBlue(255);
        }
        p.explore();
        
        pix = p2.getPixels();
        for (Pixel spot: pix) {
            spot.setRed(255);
        }
        p2.explore();
        
        pix = p3.getPixels();
        for (Pixel spot: pix) {
            spot.setGreen(255);
        }
        p3.explore();
        
        /**
          * Method to change picture negative
          * @param none
          * @return none
         /**/
        
        int value1, value2, value3;
        pix = p4.getPixels();      
        for (Pixel spot: pix) {
            value1 = 255-spot.getRed();
            spot.setRed(value1);
            
            value2 = 255-spot.getBlue();
            spot.setBlue(value2);
            
            value3 = 255-spot.getGreen();
            spot.setGreen(value3);
        }
        p4.explore();
        
        /**
          * Method to adjust red to 50%, green to 150%, and blue to 25%
          * @param none
          * @return none
         /**/
        
        pix = p5.getPixels();
        double val1, val2, val3;
        for (Pixel spot: pix) {
            val1 = (double)(spot.getRed() * .5);
            val2 = (double)(spot.getGreen() * 1.5);
            val3 = (double)(spot.getBlue() * .25);
            
            spot.setRed((int)val1);
            spot.setGreen((int)val2);
            spot.setBlue((int)val3);
        }
        p5.explore();
        
        /**
          * Method to convert to grayscale
          * @param none
          * @return none
         /**/
        
        pix = p6.getPixels();
        int ave;
        for (Pixel spot: pix) {
            ave = (spot.getRed() + spot.getBlue() + spot.getGreen())/3;
            
            spot.setRed(ave);
            spot.setGreen(ave);
            spot.setBlue(ave);
        }
        p6.explore();
        
        /**
          * Method to lighten and darken
          * @param none
          * @return none
         /**/
        
        pix = p7.getPixels(); 
        int v1, v2, v3;
        //lighten
        for (Pixel spot: pix) {
            v1 = spot.getRed() + 40;
            v2 = spot.getGreen() + 40;
            v3 = spot.getBlue() + 40;
            
            spot.setRed(v1);
            spot.setRed(v2);
            spot.setRed(v3);
        }
        p7.explore();
        //darken
        for (Pixel spot: pix) {
            v1 = spot.getRed() - 40;
            v2 = spot.getGreen() - 40;
            v3 = spot.getBlue() - 40;
            
            spot.setRed(v1);
            spot.setRed(v2);
            spot.setRed(v3);
        }
        p7.explore();
        
        /**
          * Method to change some aspect of face
          * @param none
          * @return none
         /**/
        pix = p8.getPixels();
        
        for (Pixel spot: pix) {
            if ((spot.getRed() > 130 && spot.getRed() < 150) && (spot.getBlue() > 73 && spot.getBlue() < 93) && (spot.getGreen() > 143 && spot.getGreen() < 163)) {
                spot.setRed(30);
                spot.setBlue(200);
                spot.setGreen(20);
            }
        }
        p8.explore();
        
        /**
          * Method to swap green for red 
          * @param none
          * @return none
         /**/
        
        pix = p9.getPixels();
        int newgreen;
        int newred;
        
        for (Pixel spot: pix) {
            newred = spot.getGreen();
            newgreen = spot.getRed();
            
            spot.setRed(newred);
            spot.setGreen(newgreen);
        }
        p9.explore();
        
        /**
          * Method to swap all three red = green, green = blue, blue = red
          * @param none
          * @return none
         /**/
        pix = p10.getPixels();
        int red;
        int green;
        int blue;
        
        for (Pixel spot: pix) {
            red = spot.getGreen();
            blue = spot.getRed();
            green = spot.getBlue();
            
            spot.setRed(red);
            spot.setBlue(blue);
            spot.setGreen(green);
        }
        p10.explore();
    }
}
