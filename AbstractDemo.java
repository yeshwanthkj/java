/*Abstract Class: Abstraction can be acheived using abstract classes and interfaces.
There are two types of abstractions:
1. Partial(0 to 100%) - Acheived using abstract classes
2. Complete(100%) - Acheived using interfaces.
A class which cannot be instantiated directly is called abstract class.
Syntax:
abstract class Figure {
   //attributes and methods      
}
Abstract method: An abstract method is declared without an implementation.
Syntax:
abstract int no_of_sides();
Properties:
1. An abstract class may or may not have abstract methods.
2. If a class consists of atleast one abstract method, then the class must be declared as
abstract class.
3. Abstract classes can't be instantiated directly
4. It can have constructors and static methods.
5. It can have final methods which will prevent method overriding.
*/



/*abstract class Shape{
	abstract public void no_of_sides();
	public void demo(){
		System.out.println("Abstract class Demo");
	}
}
class Rect extends Shape{
	public void no_of_sides(){
		System.out.println("No of sides are:2");
	}
}
class Square extends Shape{
	public void no_of_sides(){
		System.out.println("No of sides are:4");
	}
}
class AbstractDemo{
	public static void main(String ar[])
	{
		Shape s;
		s=new Rect();
		s.no_of_sides();
		s.demo();
		s=new Square();
		s.no_of_sides();
		s.demo();
	}
}*/
/*abstract class Shape{
	abstract public void no_of_sides();
	public void message(){
		System.out.println("Abstract class Demo");
	}
}
class Rect extends Shape{
	public void no_of_sides(){
		System.out.println("No of sides are:2");
	}
}
class Square extends Shape{
	public void no_of_sides(){
		System.out.println("No of sides are:4");
	}
}
class AbstractDemo{
	public static void main(String ar[])
	{
		Shape s;
		s=new Rect();
		s.message();
		s.no_of_sides();
		s=new Square();
		s.no_of_sides();
	}
}*/