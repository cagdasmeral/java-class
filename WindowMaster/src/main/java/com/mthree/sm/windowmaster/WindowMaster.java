
/**
 *
 * @author cagdasmeral 
 * @since  2022-08-19 
 *purpose: My first Hello World program in an IDE
 */

package com.mthree.sm.windowmaster;

import java.util.Scanner;

public class WindowMaster {

    public static void main(String[] args) {
        
        
        float height;
        float width;
        
        String stringHeight;
        String stringWidth;
        
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        areaOfWindow = height * width;
        perimeterOfWindow = 2 * (height + width);
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        
        
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost =  " + cost);
    }
    
}
