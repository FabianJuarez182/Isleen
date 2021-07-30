import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador extends Actor
{
    //Se inicializaran las variables y se les dara un valor
    private int value = 0;
    private int target = 0;
    private String text;
    private int stringLength;
    
    public Contador(){
        //Se generara el contador vacio
        this("");
    }
    public Contador(String prefix){
        //Servira para ponerle la forma al contador y el texto, también que tamaño y color llevara
        text = prefix;
        stringLength = (text.length() + 2)*16;
        
        setImage(new GreenfootImage(stringLength, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(24.0F));
        image.setColor(Color.BLACK);
        
        updateImage();
    }
    public void act() {
        //Se corroborara que el valor sea menor para ponerla en valor
        if(value < target) {
            value++;
            updateImage();
        }
        else if(value > target) {
            value--;
            updateImage();
        }
    }
    public void add(int score){
        //Se realizara la suma de puntaje
        target += score;
    }
    public void subtract(int score){
        //Se realizara la resta de target a puntaje
        target -= score;
    }
    public int getValue(){
        //Se devolvera el valor de la variable value
        return value;
    }
    private void updateImage(){
        //Se ejecutara el comando para crear una nueva imagen y limpiarla para crear un nuevo contado
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 18);
    }
}
