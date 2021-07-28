import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionWorld extends World
{
    public InstructionWorld()
    {    
        // Creamos el nuevo mundo con sus dimensiones en x y y.
        super(600, 400, 1); 
        prepare();
    }
        private void prepare (){
        //Añadiremos los titulos, botones e imagenes que utilizaremos en el mundo de instrucciones.
        addObject(new Reglas(),290, 250);
        drawScreen(Color.ORANGE, Color.BLACK, "Instrucciones ");
    }
        public InstructionWorld(Color bgColor, Color textColor, String message) //Obtener color de letra y texo
    {    
        // Creamos el nuevo mundo con sus dimensiones en x y y.
        //Se ingresaran los valores a utilizar de la pantalla para ser dibujada.
        super(600, 400, 1); //Tamaño de la pantalla
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
        bg.drawString(message, 120 ,80 ); //Lugar en donde se mostrará el mensaje        
        
    }
}
