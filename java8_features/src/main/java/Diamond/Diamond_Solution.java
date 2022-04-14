package main.java.Diamond;

interface Interface1
{
    public default void display()
    {
        System.out.println("the display() method of Interface1 invoked");
    }
}

interface Interface2
{
    public default void display()
    {
        System.out.println("the display() method of Interface2 invoked");
    }
}
interface interface3{
    public default void show(){
        System.out.println("the show() method of Interface3 invoked");
    }
}
public class Diamond_Solution implements Interface1, Interface2,interface3
{
    public void display()
    {
        Interface1.super.display();
        Interface2.super.display();

    }
    public void show(){
        interface3.super.show();
    }
    public static void main(String args[])
    {
        Diamond_Solution obj = new Diamond_Solution();
        obj.display();
        obj.show();
    }
}