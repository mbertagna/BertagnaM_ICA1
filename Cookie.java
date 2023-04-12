// a. Michael Bertagna, Leah Zahn
// b. 2353491, 2341427
// c. bertagna@chapman.edu, zahn@chapman.edu
// d. CPSC 231-01
// e. ICA1: Inheritance & Polymorphism

public class Cookie extends Dessert{
  //member variables
  protected String m_shape;

  //basic constructor
  public Cookie(){
    super();
    m_shape=null;
  }

  //overloaded constructor
  public Cookie(String name, int numCals, String glutenFree, String shape){
    super(name, numCals, glutenFree);
    m_shape=shape;
  }

  //copy constructor
  public Cookie(Cookie anotherCookie){
    super(anotherCookie);
    m_shape=anotherCookie.m_shape;
  }

  //accessors
  public String getShape(){
    return m_shape;
  }

  //mutators
  public void setShape(String shape){
    m_shape=shape;
  }

  public String toString(){
    return (super.toString()+", Shape: "+m_shape);
  }

  public boolean equals(Cookie anotherCookie){
    return (super.equals(anotherCookie) && m_shape.equals(anotherCookie.m_shape));
  }

  public void tempt(){
    System.out.println("I'm fresh out of the oven! And portable!");
  }

  public void servingInstructions(){
    System.out.println("No utensils required!");
  }

  public static void main(String[] args) {

  }

}
