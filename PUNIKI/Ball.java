import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    int width=20;
    int height= 20;
    public Ball(){
        setImage("images/ball.png");
        getImage().scale( width++,height++ );
    }
    public void act() 
    {
        int x =getX();
        int y =getY();
        setImage("images/ball.png");
        getImage().scale( width++,height++ );
        setLocation( x,y+1);
        
    }    
}
