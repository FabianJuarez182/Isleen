import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Botones
{
    public Play(){
        // Se creara el boton con sus caracteristicas y la frase que llevara
        GreenfootImage playButton = new GreenfootImage(260,60);
        Font adjustedFont = new Font(true,false, 40);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.BLACK);
        playButton.drawString("Jugar",0,50);
        setImage(playButton);
    }
    public void act()
    {
        //Se verificara si el mouse esta encima del boton, de ser asi ejecutara la accion de abrir el mundo de instrucciones
        checkMouse();
        checkClick(new MyWorld());
    }
}
