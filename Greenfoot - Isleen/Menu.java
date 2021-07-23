import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Creamos el nuevo mundo con sus dimensiones en x y y.
        super(600, 400, 1); 
        prepare();
        drawScreen(Color.YELLOW, Color.DARK_GRAY, "Isleen ");// Color de letra, y el mensaje que se quiere mostrar
    
    }
    
    private void prepare (){
        //Añadiremos los distintos botones y logo a utilizar en el programa.
        addObject(new Logo(),290, 40); 
        Play play = new Play();
        addObject(play,380,150);
        Instructions instructions = new Instructions();
        addObject(instructions,300,250);
        Exit exit = new Exit();
        addObject(exit,380,350);
    }
    public Menu(Color bgColor, Color textColor, String message) //Obtener color de letra y texo
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
        bg.drawString(message, 240 ,120); //Lugar en donde se mostrará el mensaje        
        
    }
}
