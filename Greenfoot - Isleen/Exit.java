import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Botones
{
        public Exit(){
        // Se creara el boton con sus caracteristicas y la frase que llevara
       GreenfootImage myTitle = new GreenfootImage(260,60);
        Font adjustedFont = new Font(true,false, 40);
        myTitle.setFont(adjustedFont);
        myTitle.setColor(Color.BLACK);
        myTitle.drawString("Salir",0,50);
        setImage(myTitle);
    }
        public void act()
    {
        //Se verificara si el mouse esta encima del boton, de ser asi ejecutara la accion de cerrar el programa
        checkMouse();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
        }
    }
}
