import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Botones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Botones extends Actor
{
    //Se inicializaran las variables y se les dara un valor
    private boolean mouseOver = false;
    private static int MAX_TRANS = 255;
    public void checkMouse(){
        //Se verificara si el mouse esta encima de algun boton para poder mandar a esa pantalla
        if(Greenfoot.mouseMoved(null)){
            mouseOver =  Greenfoot.mouseMoved(this);
        }
        //Si esta encima se volvera transparente el boton en el que se encuentra
        if(mouseOver){
            adjTrans(MAX_TRANS/2);
        }
        else{
            adjTrans(MAX_TRANS);
        }
        
    }
    public void adjTrans(int adjust){
        //Se creara para ajustar la transparencia del boton y la imagen que se le dara
        GreenfootImage tempImage = getImage();
        tempImage.setTransparency(adjust);
        setImage(tempImage);
    }
    public void checkClick(World world)
    {
        //Se creara para solo utilizarlo con todos los botones y saber a que lugar mandarlos
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(world);
        }
    }
}
