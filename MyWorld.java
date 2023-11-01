import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

public class MyWorld extends World
{

    public MyWorld()
    {    
        super(600, 400, 1); 
        Dummkopf dummkopf = new Dummkopf();
        addObject(dummkopf,300,200);
    }
}