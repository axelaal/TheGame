import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

public class Dummkopf extends Actor
{
    public void act() {
        // Move with WASD-Keys
        if(Greenfoot.isKeyDown("a"))
            setLocation(getX() - 3, getY());
        if(Greenfoot.isKeyDown("d"))
            setLocation(getX() + 3, getY());
            if(Greenfoot.isKeyDown("w"))
            setLocation(getX(), getY()-3);
        if(Greenfoot.isKeyDown("s"))
            setLocation(getX() , getY()+3);
    }    
}