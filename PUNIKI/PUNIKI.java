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
    GreenfootImage img1;
    GreenfootImage img2;
    static public int flag_swing = 0;
    private boolean flag_tama = false;
    public PUNIKI(){
        img1 = new GreenfootImage( "images/puniki1.png");
        img2 = new GreenfootImage( "images/puniki2.png");
        img1.scale( 300, 100 );
        img2.scale( 300, 100 );
        setImage(img1);
        Greenfoot.playSound("sounds/start.mp3");
        if(flag_swing == 114514){
          
        }
        flag_swing = 0;
    }

    public void act() 
    {

        int x = getX();
        int y = getY();

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
            setImage(img2);
            
            if( flag_tama == false ){
                Greenfoot.playSound("sounds/swing.mp3");
                Actor actor = getOneObjectAtOffset( 0,0 , pitcher.class );
                if( actor != null ){
                    flag_swing++;
                    getWorld().showText( String.valueOf(flag_swing), 100, 50 );
                }
                flag_tama = true;
            }
        }
        else{
            flag_tama = false;
            setImage(img1);
        }
        if( flag_swing == 50){
                Actor actor = getOneObjectAtOffset( 0,0 , pitcher.class );
                getWorld().removeObject( actor );
                getWorld().addObject( new PBUN(),getX(),getY());
                flag_swing = 114514;
                getWorld().showText( String.valueOf(flag_swing), 100, 50 );
        }
        Actor ball = getOneObjectAtOffset( -100,-30, Ball.class );
            if( ball != null ){
                getWorld().addObject( new PBUN(),getX()-100,getY());
                getWorld().removeObject( this );

            }

    }    
}
