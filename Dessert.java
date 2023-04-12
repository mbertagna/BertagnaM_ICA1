// a. Michael Bertagna, Leah Zahn
// b. 2353491, 2341427
// c. bertagna@chapman.edu, zahn@chapman.edu
// d. CPSC 231-01
// e. ICA1: Inheritance & Polymorphism

public class Dessert extends Food{
  //member variables
  protected String m_glutenFree;

  //basic constructor
  public Dessert(){
    super();
    m_glutenFree=null;
  }

  //overloaded constructor
  public Dessert(String name, int numCals, String glutenFree){
    super(name, numCals);
    m_glutenFree=glutenFree;
  }

  //copy constructor
  public Dessert(Dessert anotherDessert){
    super(anotherDessert);
    m_glutenFree=anotherDessert.m_glutenFree;
  }

  //accessors
  public String getGlutenFree(){
    return m_glutenFree;
  }

  //mutators
  public void setGlutenFree(String glutenFree){
    m_glutenFree=glutenFree;
  }

  public String toString(){
    return (super.toString()+", Gluten Free: "+m_glutenFree);
  }

  public boolean equals(Dessert anotherDessert){
    return (super.equals(anotherDessert) && m_glutenFree.equals(anotherDessert.m_glutenFree));
  }


  public void tempt(){
    System.out.println("I hope you saved room for me!");
  }

  public void servingInstructions(){
    System.out.println("Grab a spoon!");
  }

  public static void main(String[] args) {

  }



}
