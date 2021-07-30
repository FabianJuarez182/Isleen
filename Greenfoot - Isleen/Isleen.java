import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Isleen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Isleen extends Actor
{
    /**
     * Act - do whatever the Isleen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Se inicializaran la variable a utilizar en el videojuego 
    private int speed;
    
    public Isleen(int v)
    {
        // Se creara la imagen con sus caracteristicas y la imagen que llevara junto con la velocidad que adquirira
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/8;
        int myNewWidth = (int)myImage.getWidth()/8;
        myImage.scale(myNewWidth,myNewHeight);
        speed = v;
    }
    public void act()
    {
        //Se llamaran a las funciones para ser utilizadas en esta clase
        moveAndTurn();
        eat();
        checkCollision();
    }
    public void moveAndTurn() /*Movimiento de Isleen*/ 
    {    
    // Se creara el movimiento del personaje principal y sus ejes en los que se ira moviendo
    int y= getY();
        if (Greenfoot.isKeyDown("right"))
    {       
        if(getX()<520)
           setLocation(getX() + speed, getY());     
    }    
        if (Greenfoot.isKeyDown("left"))
    {   
        if(getX() >130) 
        setLocation(getX() - speed, getY());    
    }   
    setLocation(getX(),y);
    }
    public void eat() /*Comida, Hoja*/ 
    {
    //Se llamara al actor y se le dara un lugar en el mundo
    Actor Hoja;
    Hoja = getOneObjectAtOffset(0, 0, Hoja.class);
    if (Hoja != null)
    {
        //Se verificara que no hayan y se removera mientras suena un sonido y aumenta la puntuacion
        World world;
        world = getWorld();
        world.removeObject(Hoja);
        Greenfoot.playSound("eating.wav");
        MyWorld mundo = (MyWorld)world;
        mundo.aumentar_puntuacion(30);
    }
    }
    public void checkCollision(){
        //Se creara una variable para verificar si el objeto choca con el personaje principal
        Actor collided = getOneIntersectingObject(Roca.class);
        if(collided !=null){
            //Se verificara que se haya chocado con las rocas y de ser asi sacara la pantalla de finaliza rel juego y se parara
            getWorld().removeObject(collided);
            getWorld().removeObject(this);
            Greenfoot.delay(25);
            Greenfoot.setWorld(new EndGameScreen()); 
            Greenfoot.stop();
        }
    }
    public void aumenta_velocidad(){
        //Aumentara la velocidad de los personajes
        speed++;
    }
}

