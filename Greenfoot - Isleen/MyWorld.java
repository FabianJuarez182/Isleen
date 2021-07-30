import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    //Se inicializaran y nombraran las variables a utilizar en el videojuego 
    public Contador score;
    private Contador level;
    //Se inicializan variables que estaran en la jugabilidad de los personajes
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
        super(600, 600, 1); 
        // Se pondran valores iniciales y se crearan nuevas para poder utilizarlas en la pantalla principal
        //Se pondran tambien los ejes x y y para el personaje principal y los distintos contadores a utilizar
        num_adelantamientos = 0;
        num_nivel = 4;
        velocidad_roca = 2;
        score = new Contador("Score: ");
        level = new Contador("Level: ");
        level.add(1);
        serpiente = new Isleen (velocidad_roca);
        addObject(serpiente, 300,550);
        addObject(level, 105,90);
        addObject(score, 105,60);
    }
    
    public void act(){
        //Se llamaran a las funciones para ser utilizadas en la pantalla principal
        aumentar_dificultad();
        aniadir_rivales();
        aniadir_hojas();
    }
    
    public int getRandomNumber(int start,int end){
        //Se generaran numeros random para los carriles y regresaran los nuevos valores
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
    
    public void aumentar_puntuacion(int valor){
        //Se agregara el valor que se proponga en los punteos de los enemigos
        score.add(valor);
    }
    public void aumentar_num_adelantamientos(){
        //Se tomara para poderse utilizar al subir de nivel
        num_adelantamientos++;
    }
    public void disminuir_num_rivales(){
        //Se haran desaparecer a los rivales al caer
        num_rivales--;
    }
    public void disminuir_num_hojas(){
        //Se haran desaparecer las hojas al caer
        num_hojas--;
    }
    
    public void aumentar_dificultad(){
        //Si se corrobora que las variables son iguales  se subira de nivel y se aumentara la velocidad
        if (num_adelantamientos == num_nivel ){
            num_adelantamientos = 0;
            num_nivel = num_nivel + 2;
            velocidad_roca++;
            level.add(1);
            serpiente.aumenta_velocidad();
        }
    }
    
    public void aniadir_rivales(){
        // Se corroborrara si no se poseen enemigos, de ser asi se agregaran en un carril random sin estar encima
        if(num_rivales == 0){
            
            int carril = getRandomNumber(0,4);
            
            if(carril == 0){
                addObject(new Roca(velocidad_roca),160, 10);
            }
            else if( carril == 1){
                addObject(new Roca(velocidad_roca),270, 10);
            }
            else if(carril==2){
                addObject(new Roca(velocidad_roca),380, 10);
            }
            else{
                addObject(new Roca(velocidad_roca),490, 10);
            }
            carril++;
            carril = carril % 4;
            // se volvera a verificar en donde colocar el otro enemigo y en que carril ponerlo con el numero random
            if(carril == 0){
                addObject(new Roca(velocidad_roca),160, 10);
            }
            else if( carril == 1){
                addObject(new Roca(velocidad_roca),270, 10);
            }
            else if( carril == 2){
                addObject(new Roca(velocidad_roca),380, 10);
            }
            else{
                addObject(new Roca(velocidad_roca),490, 10);
            }
        }
        num_rivales = 2;
    }
        public void aniadir_hojas()
        {
            // Se corroborrara si no se poseen hojas previamente
            if(num_hojas == 0){
                
                int carril = getRandomNumber(0,4);
                
                if(carril == 0){
                    addObject(new Hoja(velocidad_roca),160, 10);
                }
                else if( carril == 1){
                    addObject(new Hoja(velocidad_roca),270, 10);
                }
                else if(carril==2){
                    addObject(new Hoja(velocidad_roca),380, 10);
                }
                else{
                    addObject(new Hoja(velocidad_roca),490, 10);
                }
                carril++;
                carril = carril % 4;
            }
            num_hojas = 1;
    }
}
