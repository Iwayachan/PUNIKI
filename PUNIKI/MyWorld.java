import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject( new pitcher(), 300, 100 );
        addObject( new PUNIKI(), 350, 300 );
        GreenfootImage img2 = new GreenfootImage( "images/haikei.png" );
        img2.scale(600,400);
        getBackground().drawImage( img2, 0, 0 );
        
        setActOrder(pitcher.class,  PUNIKI.class, Ball.class);
    }  
}
  