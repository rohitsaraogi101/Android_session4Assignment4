package packageOne;
public class Assignment4_1
{
protected void display(){
system.out.println("in Base");
}
}


package packageTwo;
public class Derived extends packageOne.Assignment4_1{
public void show(){
new Assignment4_1().display();//this is not working 
new Derived().display();//is working
display();//is working
}
}
