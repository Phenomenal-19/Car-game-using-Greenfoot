import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    
    public MyWorld()
    {    
        
        super(600, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
        ambulance ambulance = new ambulance();
        addObject(ambulance,296,561);
    }
    public void act(){
        if(Greenfoot.getRandomNumber(100)<1){
           addObject(new carblue(), Greenfoot.getRandomNumber(200) +200,0); 
        }
        if(Greenfoot.getRandomNumber(500)<1){
           addObject(new carred(), Greenfoot.getRandomNumber(200) +200,0); 
        }
        if(Greenfoot.getRandomNumber(10)<1){
           addObject(new tree(), Greenfoot.getRandomNumber(170),0); 
           addObject(new tree(), Greenfoot.getRandomNumber(170) +440,0);
        }
        if(Greenfoot.getRandomNumber(300)<1){
           addObject(new coin(), Greenfoot.getRandomNumber(200) +200,0); 
        }
    }
}
