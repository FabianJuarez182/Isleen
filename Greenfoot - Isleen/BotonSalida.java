import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonSalida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotonSalida extends Botones
{
    public BotonSalida(){
       GreenfootImage myTitle = new GreenfootImage(260,60);
        Font adjustedFont = new Font(true,false, 30);
        myTitle.setFont(adjustedFont);
        myTitle.setColor(Color.BLACK);
        myTitle.drawString("Regresar al menú ",0,50);
        setImage(myTitle);
    }
    public void act()
    {
        checkMouse();
        checkClick(new Menu());
    }
}
