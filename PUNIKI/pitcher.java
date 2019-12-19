import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pitcher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pitcher extends Actor
{
    /**
     * Act - do whatever the pitcher wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int flag_ball = 0;
    public void act() 
    {
        if(flag_ball<=0)flag_ball = 50;
        else flag_ball--;
        if(flag_ball>25 && flag_ball<=50){
            setImage("images/pitcher1.png");
            getImage().scale( 90, 90 );
        }
        else if(flag_ball==25){
            setImage("images/pitcher2.png");
            getImage().scale( 90, 90 );
            getWorld().addObject( new Ball(),290,110);
        }
        else{
            setImage("images/pitcher2.png");
            getImage().scale( 90, 90 );
        }
        
        
    }    
}
