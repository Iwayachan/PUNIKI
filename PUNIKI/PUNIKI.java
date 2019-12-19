import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PUNIKI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PUNIKI extends Actor
{
    /**
     * Act - do whatever the PUNIKI wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        if( Greenfoot.isKeyDown( "left" ) ){
           setLocation( x-1,y );
           setImage("images/puniki1.png");
           getImage().scale( 240, 90 );
        }
        if( Greenfoot.isKeyDown( "right" ) ){
           setLocation( x+1,y );
           setImage("images/puniki2.png");
           getImage().scale( 240, 90 );
        }
        getImage().scale( 240, 90 );
    }    
}
