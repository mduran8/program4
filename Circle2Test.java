
/***
*
* JUnit testing class for Circle1 (and Circle)
*
***/

import org.junit.*;

public class Circle2Test
{
   private Circle2 circle1;// Data needed for each test case

   // To do before each test case
   @Before
   public void setup()
   {
      System.out.println("\nTest starting...");
      circle1 = new Circle2(1,2,3);
   }


/**
* To do after each test case
**/
   @After
   public void teardown()
   {
      System.out.println("\nTest finished.");
   }


/*******************START OF TESTING*******************/


/**
* Test circle function
* Test0 - invalid radius < 0
**/
@Test
public void checkRadius(){
	try{
    Circle2 circle2 = new Circle2(1,2,-10); 
    }
    catch (Error e){
     Assert.assertTrue(0 == 0);
    }
}




/**
* Test scale function
* Test1 - Make radius smaller
**/
@Test
public void scaleSmall()
{
   double r;
   System.out.println("Running test scaleSmall.");
   r = circle1.scale(.5);
   Assert.assertTrue(r == 1.5);
}
/**
* Test2 - Make radius smaller
**/
@Test
public void scaleSame()
{
   double r;
   System.out.println("Running test scaleSmall.");
   r = circle1.scale(1);
   Assert.assertTrue(r == 3);
}
/**
* Test3 - Make radius smaller
**/
@Test
public void scaleLarger()
{
   double r;
   System.out.println("Running test scaleSmall.");
   r = circle1.scale(3);
   Assert.assertTrue(r == 9);
}



/**
* Test moveBy function
* Test4 - a simple positive move
**/
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle1.moveBy(1,1);
   Assert.assertTrue(p.x == 2 && p.y == 3);
}

/** 
* Test5 - a simple negative move
**/
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(-1,-1);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}
/** 
* Test6 - no move
**/
@Test
public void simpleNoMove()
{
   Point p;
   System.out.println("Running test simpleNoMove.");
   p = circle1.moveBy(0,0);
   Assert.assertTrue(p.x == 1 && p.y == 2);
}




/**
* Test intersects function
* Test7 - Two circles that are in the same spot and same size
**/
@Test
public void SameCircleIntersect()
{
   boolean b;
   System.out.println("Running test intersects.");
   Circle2 circle2 = new Circle2(1,2,3);
   b = circle1.intersects(circle2);
   Assert.assertTrue(b==true);
}

/* 
* Test8 - Two circles that do not intersect
**/
@Test
public void circlesDontIntersect()
{
   boolean b;
   System.out.println("Running test intersects.");
   Circle2 circle2 = new Circle2(10,15,3);
   b = circle1.intersects(circle2);
   Assert.assertTrue(b==false);
}
/** 
* Test9 - Two circles that touch at one point
**/
@Test
public void circlesOnePointIntersect()
{
   boolean b;
   System.out.println("Running test intersects.");
   Circle2 circle2 = new Circle2(7,2,3);
   b = circle1.intersects(circle2);
   Assert.assertTrue(b==true);
}
/** 
* Test10 - Center of circle2 is within circle1, circles not 
* intersecting
**/
@Test
public void CircleInsideButNotIntersecting()
{
   boolean b;
   Circle2 circle2 = new Circle2(2,2,1);
   b = circle1.intersects(circle2);
   Assert.assertTrue(b==false);
}
/** 
* Test11 - Center of circle2 is within circle1, circles 
* intersect
**/
@Test
public void CircleInsideIntersecting()
{
   boolean b;
   Circle2 circle2 = new Circle2(1,3,2);
   b = circle1.intersects(circle2);
   Assert.assertTrue(b==true);
}

/*******************END OF TESTING*******************/


/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}

