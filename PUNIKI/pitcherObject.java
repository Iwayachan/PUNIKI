import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pitcherObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pitcherObject extends Actor
{
    /**
     * Act - do whatever the pitcherObject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int flag_ball = 0;
    GreenfootImage img1;
    GreenfootImage img2;
    public pitcherObject()
    {
        img1 = new GreenfootImage( "images/pitcher1.png");
        img2 = new GreenfootImage( "images/pitcher2.png");
        setImage(img1);
    }
    public void act() 
    {
        if(flag_ball<=0)flag_ball = 10;
        else flag_ball--;
        if(flag_ball>5 && flag_ball<=10){
            setImage(img1);
        }
        else{
            setImage(img2);
        }        
    }    
}
