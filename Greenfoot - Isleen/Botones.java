import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Botones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Botones extends Actor
{
    private boolean mouseOver = false;
    private static int MAX_TRANS = 255;
    public void checkMouse(){
        if(Greenfoot.mouseMoved(null)){
            mouseOver =  Greenfoot.mouseMoved(this);
        }
        if(mouseOver){
            adjTrans(MAX_TRANS/2);
        }
        else{
            adjTrans(MAX_TRANS);
        }
        
    }
    public void adjTrans(int adjust){
        GreenfootImage tempImage = getImage();
        tempImage.setTransparency(adjust);
        setImage(tempImage);
    }
    public void checkClick(World world)
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(world);
        }
    }
    public void act()
    {
        
    }
}
