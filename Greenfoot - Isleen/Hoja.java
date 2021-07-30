import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hoja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hoja extends Actor
{
    //Se llama a la variable speed para que tenga una velocidad como las demas clases
    private int speed;
    public Hoja(int v)
    {
        // Se creara la imagen con sus caracteristicas y la imagen que llevara junto con la velocidad que adquirira
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/10;
        int myNewWidth = (int)myImage.getWidth()/10;
        myImage.scale(myNewWidth,myNewHeight);
        speed = v;
    }
    public void act()
    {
        //Se dira en donde poner la hoja y a que velocidad ira
        setLocation(getX(), getY() + speed);
        if( getY() >= getWorld().getHeight() - 1 ){
            //Se creara la hoja y de no habersela comido el principal solo se seguira reiniciando para que el principal pueda comerla
            MyWorld juego = (MyWorld) getWorld();
            juego.removeObject(this);
            juego.disminuir_num_hojas();
            juego.aumentar_num_adelantamientos();
        }
    }
}
