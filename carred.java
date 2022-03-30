import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class carred extends parent
{
    int speed =-5;
    public void act()
    {
            carred a= new carred();
    Actor i =getOneIntersectingObject(carred.class);

        move(speed);
        checkdouble(i);
        end();
        
    }
}
