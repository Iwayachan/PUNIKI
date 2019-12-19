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
    public int flag_swing = 0;
    private boolean flag_tama = false;

    public void act() 
    {
        
        int x = getX();
        int y = getY();
        Actor actor2 = getOneObjectAtOffset( 0, 0, Ball.class );
       if( actor2 != null ){
           getWorld().showText( "Dead", 50, 50 ); 
       }  
        getImage();
        setImage("images/puniki1.png");
        getImage().scale( 500, 500 );
        if( Greenfoot.isKeyDown( "left" ) ){
           setLocation( x-3,y );
        }
        if( Greenfoot.isKeyDown( "right" ) ){
           setLocation( x+3,y );
        }
        if( Greenfoot.isKeyDown( "down" ) ){
           setLocation( x,y+3 );
        }
        if( Greenfoot.isKeyDown( "up" ) ){
           setLocation( x,y-3 );
        }
        if( Greenfoot.isKeyDown( "space" ) ){
           setImage("images/puniki2.png");
           getImage().scale( 500, 500 );
           if( flag_tama == false ){
               Actor actor = getOneObjectAtOffset( x, y, pitcher.class );
               if( actor != null ){
                   flag_swing++;   
                   getWorld().showText( String.valueOf(flag_swing), 100, 50 );
               }
                flag_tama = true;
           }
        }
        else flag_tama = false;
        getImage().scale( 240, 90 );
    }    
}
