import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NewWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewWorld extends World
{

    /**
     * Constructor for objects of class NewWorld.
     * 
     */
    public NewWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        if(PUNIKI.flag_swing==114514){
            addObject( new pitcherObject(), 300, 100 );
            addObject( new PUNIKI(), 350, 300 );
            showText( "GAME CLEAR", 300, 200 );
        }
        else{
            GreenfootImage img2 = new GreenfootImage( "images/bakusi.jpg" );
            img2.scale(600,400);
            getBackground().drawImage( img2, 0, 0 );
            showText( "GAME OVER", 300, 200 );
        }
        
    }
}
