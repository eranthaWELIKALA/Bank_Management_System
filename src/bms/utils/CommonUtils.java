/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bms.utils;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author erant
 */
public class CommonUtils {    
    public static ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {        
        Image originalImage = icon.getImage();        
        Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        return scaledIcon;
    }
    
}
