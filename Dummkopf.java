import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

public class Dummkopf extends Actor
{
    public void act() {
        if(Greenfoot.isKeyDown("left"))
            setLocation(getX() - 3, getY());
        if(Greenfoot.isKeyDown("right"))
            setLocation(getX() + 3, getY());
    }    
}