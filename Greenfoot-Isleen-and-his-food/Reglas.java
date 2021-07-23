import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Reglas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reglas extends Actor
{
       public Reglas()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight();
        int myNewWidth = (int)myImage.getWidth();
        myImage.scale(myNewWidth,myNewHeight);
    }
    public void act()
    {
        // Add your action code here.
    }
}
