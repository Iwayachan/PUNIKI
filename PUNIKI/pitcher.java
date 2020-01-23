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
    GreenfootImage img1;
    GreenfootImage img2;
    public pitcher()
    {
        img1 = new GreenfootImage( "images/pitcher1.png");
        img2 = new GreenfootImage( "images/pitcher2.png");
        setImage(img1);
    }
    public void act() 
    {
        if(flag_ball<=0)flag_ball = 50;
        else flag_ball--;
        if(flag_ball>25 && flag_ball<=50){
            setImage(img1);
        }
        else if(flag_ball==25){
            setImage(img2);
            getWorld().addObject( new Ball(),290,110);
            Greenfoot.playSound("sounds/rakka.mp3");
        }
        else{
            setImage(img2);
        }        
    }    
}
