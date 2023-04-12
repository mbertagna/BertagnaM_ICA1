// a. Michael Bertagna, Leah Zahn
// b. 2353491, 2341427
// c. bertagna@chapman.edu, zahn@chapman.edu
// d. CPSC 231-01
// e. ICA1: Inheritance & Polymorphism

public class Food{
  //member variables
  protected String m_name;
  protected int m_numCals;

  //default constructor
  public Food(){
    m_name = null;
    m_numCals = 0;
  }

  //overloaded constructor
  public Food(String name, int numCals){
    m_name=name;
    m_numCals=numCals;
  }

  //copy constructor
  public Food(Food anotherFood){
    m_name=anotherFood.m_name;
    m_numCals=anotherFood.m_numCals;
  }

  //accessors
  public String getName(){
    return m_name;
  }

  public int getNumCals(){
    return m_numCals;
  }

  //mutators
  public void setName(String name){
    m_name=name;
  }

  public void setNumCals(int numCals){
    m_numCals=numCals;
  }

  public String toString(){
    return ("Name: "+m_name+", Number of Calories: "+m_numCals);
  }

  public boolean equals(Food anotherFood){
    return (m_name.equals(anotherFood.m_name)&&
    m_numCals==anotherFood.m_numCals);
  }

  public void tempt(){
    System.out.println("Eat me! I'm basic!");
  }

  public void servingInstructions(){
    System.out.println("Grab some utensils!");
  }
  public static void main(String[] args) {

  }


}
