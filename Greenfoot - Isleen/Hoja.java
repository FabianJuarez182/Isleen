import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hoja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hoja extends Actor
{
    private int speed;
    public Hoja(int v)
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/8;
        int myNewWidth = (int)myImage.getWidth()/8;
        myImage.scale(myNewWidth,myNewHeight);
        speed = v;
    }
    public void act()
    {
        setLocation(getX(), getY() + speed);
        if( getY() >= getWorld().getHeight() - 1 ){
            MyWorld juego = (MyWorld) getWorld();
            juego.removeObject(this);
            juego.disminuir_num_hojas();
            juego.aumentar_num_adelantamientos();
        }
    }
}
