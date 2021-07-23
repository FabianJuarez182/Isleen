import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndGameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndGameScreen extends World
{
    public EndGameScreen() 
    {    
        // Creamos el nuevo mundo con sus dimensiones en x y y.
        super(600, 400, 1); 
        drawScreen(Color.BLACK, Color.RED, "GAME OVER ");// Color de letra, y el mensaje que se quiere mostrar
    
    }
    public EndGameScreen(Color bgColor, Color textColor, String message) //Obtener color de letra y texo
    {    
        // Creamos el nuevo mundo con sus dimensiones en x y y.
        //Se ingresaran los valores a utilizar de la pantalla para ser dibujada.
        super(600, 400, 1); //Tamaño de la pantalla nuevamente para poder dibujar en ella
        drawScreen(bgColor, textColor, message);
    
    }   
    public void drawScreen(Color bgColor, Color textColor, String message){
        GreenfootImage bg = new GreenfootImage(getWidth(), getHeight()); //Obtener imágen de texto
        bg.setColor(bgColor); //Colocar el color
        bg.fillRect(0, 0, getWidth(), getHeight() ); //Obtener cordenadas
        setBackground(bg);
        Font f = new Font("SansSerif", 60); //Función y tamaño de letra
        bg.setFont(f); //Función
        bg.setColor(textColor);//Colocar color
        bg.drawString(message, getWidth()/2- message.length()*20, getHeight()/2); //Lugar en donde se mostrará el mensaje        
        
    }
}
