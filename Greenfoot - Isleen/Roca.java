import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Roca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roca extends Actor
{
    /**
     * Act - do whatever the Roca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    public Roca(int v){
        speed =v;
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/11;
        int myNewWidth = (int)myImage.getWidth()/11;
        myImage.scale(myNewWidth,myNewHeight);
    }
    public void act()
    {
        setLocation(getX(),getY()+ speed);
        if( getY() >= getWorld().getHeight()-1){
        MyWorld mundo = (MyWorld) getWorld();
        mundo.removeObject(this);
        mundo.aumentar_puntuacion(5);
        mundo.disminuir_num_rivales();
        mundo.aumentar_num_adelantamientos();
        }
    }
}
