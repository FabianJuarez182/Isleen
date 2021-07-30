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
        // Se creara la imagen con sus caracteristicas y cual foto ira designada 
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight();
        int myNewWidth = (int)myImage.getWidth();
        myImage.scale(myNewWidth,myNewHeight);
    }
}
