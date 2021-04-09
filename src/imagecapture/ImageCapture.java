/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imagecapture;


import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class ImageCapture {

    public static void main(String[] args) throws Exception {
        for(int i=0;i<2;i++){
           captureScreen(System.currentTimeMillis()+"_"+i); 
        }
    }
    
    public static void captureScreen(String fileName) throws Exception {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle screenRectangle = new Rectangle(screenSize);
        Robot robot = new Robot();
        BufferedImage image = robot.createScreenCapture(screenRectangle);
        ImageIO.write(image, "png", new File(fileName));

    }
}