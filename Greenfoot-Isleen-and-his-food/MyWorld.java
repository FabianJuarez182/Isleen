import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public Contador score;
    private Contador level;
    
    private int velocidad_roca;
    private int num_adelantamientos;
    private int num_nivel;
    private Isleen serpiente;
    private int velocidad_hoja;
    private int num_rivales;
    private int num_hojas;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        //Creamos el nuevo mundo con sus dimensiones en x y y.
        super(600, 400, 1); 
        
        num_adelantamientos = 0;
        num_nivel = 4;
        velocidad_roca = 2;
        score = new Contador("Score: ");
        level = new Contador("Level: ");
        level.add(1);
        serpiente = new Isleen (velocidad_roca);
        addObject(serpiente, 300,350);
        addObject(level, 105,90);
        addObject(score, 105,60);
    }
    
    public void act(){
        aumentar_dificultad();
        aniadir_rivales();
        aniadir_hojas();
    }
    
    public int getRandomNumber(int start,int end){
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
    
    public void aumentar_puntuacion(int valor){
        score.add(valor);
    }
    public void aumentar_num_adelantamientos(){
        num_adelantamientos++;
    }
    public void disminuir_num_rivales(){
        num_rivales--;
    }
    public void disminuir_num_hojas(){
        num_hojas--;
    }
    
    public void aumentar_dificultad(){
        if (num_adelantamientos == num_nivel ){
            num_adelantamientos =0;
            num_nivel = num_nivel +2;
            velocidad_roca++;
            level.add(1);
            serpiente.aumenta_velocidad();
        }
    }
    
    public void aniadir_rivales(){
        
        if(num_rivales == 0){
            
            int carril = getRandomNumber(0,4);
            
            if(carril == 0){
                addObject(new Roca(velocidad_roca),160, 40);
            }
            else if( carril == 1){
                addObject(new Roca(velocidad_roca),270, 40);
            }
            else if(carril==2){
                addObject(new Roca(velocidad_roca),380, 40);
            }
            else{
                addObject(new Roca(velocidad_roca),490, 40);
            }
            carril++;
            carril = carril % 4;
            
            if(carril == 0){
                addObject(new Roca(velocidad_roca),160, 40);
            }
            else if( carril == 1){
                addObject(new Roca(velocidad_roca),270, 40);
            }
            else if( carril == 2){
                addObject(new Roca(velocidad_roca),380, 40);
            }
            else{
                addObject(new Roca(velocidad_roca),490, 40);
            }
        }
        num_rivales = 2;
    }
        public void aniadir_hojas()
        {
            if(num_hojas == 0){
                
                int carril = getRandomNumber(0,4);
                
                if(carril == 0){
                    addObject(new Hoja(velocidad_roca),160, 40);
                }
                else if( carril == 1){
                    addObject(new Hoja(velocidad_roca),270, 40);
                }
                else if(carril==2){
                    addObject(new Hoja(velocidad_roca),380, 40);
                }
                else{
                    addObject(new Hoja(velocidad_roca),490, 40);
                }
                carril++;
                carril = carril % 4;
            }
            num_hojas = 1;
    }
}
