/**
* @author Melissa Duran
* @since 4/27/2017
* Create new circle1 class
**/

public class Circle1 extends Circle
{


/**
* Create new circle1
* @param x is the x coordinate of the center
* @param y is the y coordinate of the center
* @param radius is the radius
**/
public Circle1(double x, double y, double radius)
{
   super(x,y,radius);
}


/**
* Checks if two circles intersect
* @param other is the other Circle
* 
**/

public boolean intersects(Circle other)
{
   //Returns true if the two circles have an intersection 
   //section
   double rSum = radius + other.radius;
   double rMin = radius - other.radius;
   double distance = Math.sqrt(Math.pow(center.x -                                                           other.center.x, 2) + Math.pow(center.y - other.center.y, 2));


if (Math.abs(rMin) <= distance && distance <= rSum )
	{return true;}
else{	return false;}

}


}

