import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Botones
{
        public Instructions(){
        // Se creara el boton con sus caracteristicas y la frase que llevara
        GreenfootImage myTitle = new GreenfootImage(260,60);
        Font adjustedFont = new Font(true,false, 40);
        myTitle.setFont(adjustedFont);
        myTitle.setColor(Color.BLACK);
        myTitle.drawString("Instrucciones ",0,50);
        setImage(myTitle);
    }
        public void act()
    {
        //Se verificara si el mouse esta encima del boton, de ser asi ejecutara la accion de abrir el mundo de instrucciones
        checkMouse();
        checkClick(new InstructionWorld());
    }
}
