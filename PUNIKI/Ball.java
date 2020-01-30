import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private GreenfootImage img_bkup = null;
    int width=20;
    int height= 20;
    public Ball(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( width++,height++ );
    }
    public void act() 
    {
        int x =getX();
        int y =getY();
        GreenfootImage img = new GreenfootImage(img_bkup);
        img.scale( width++,height++ );
        setImage(img);
        setLocation( x,y+1);
        
            if( width >= 1100 ){
                World game = new NewWorld();
                Greenfoot.setWorld( game );
            }
        
    }    
}
