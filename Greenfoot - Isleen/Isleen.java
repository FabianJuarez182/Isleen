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
    private int speed;
    
    public Isleen(int v)
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/8;
        int myNewWidth = (int)myImage.getWidth()/8;
        myImage.scale(myNewWidth,myNewHeight);
        speed = v;
    }
    public void act()
    {
        moveAndTurn();
        eat();
        checkCollision();
    }
    public void moveAndTurn() /*Movimiento de Isleen*/ 
    {    
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
    public void eat() /*Comida 1, Dona normal*/ 
    {
    Actor Hoja;
    Hoja = getOneObjectAtOffset(0, 0, Hoja.class);
    if (Hoja != null)
    {
        World world;
        world = getWorld();
        world.removeObject(Hoja);
        Greenfoot.playSound("eating.wav");
        MyWorld mundo = (MyWorld)world;
        mundo.aumentar_puntuacion(30);
    }
    }
    public void checkCollision(){
        Actor collided = getOneIntersectingObject(Roca.class);
        if(collided !=null){
            getWorld().removeObject(collided);
            getWorld().removeObject(this);
            Greenfoot.delay(25);
            Greenfoot.setWorld(new EndGameScreen()); 
            Greenfoot.stop();
        }
    }
    public void aumenta_velocidad(){
        speed++;
    }
}

