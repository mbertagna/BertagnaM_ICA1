// a. Michael Bertagna, Leah Zahn
// b. 2353491, 2341427
// c. bertagna@chapman.edu, zahn@chapman.edu
// d. CPSC 231-01
// e. ICA1: Inheritance & Polymorphism

public class MainCourse extends Food{
  //member variables
  protected int m_servingTemp;

  //basic constructor
  public MainCourse(){
    super();
    m_servingTemp=0;
  }

  //overloaded constructor
  public MainCourse(String name, int numCals, int servingTemp){
    super(name, numCals);
    m_servingTemp=servingTemp;
  }

  //copy constructor
  public MainCourse(MainCourse anotherMainCourse){
    super(anotherMainCourse);
    m_servingTemp=anotherMainCourse.m_servingTemp;
  }

  //accessors
  public int getServingTemp(){
    return m_servingTemp;
  }

  //mutators
  public void setServingTemp(int servingTemp){
    m_servingTemp=servingTemp;
  }

  public String toString(){
    return (super.toString()+", Serving Temperature: "+m_servingTemp);
  }

  public boolean equals(MainCourse anotherMainCourse){
    return (super.equals(anotherMainCourse) && m_servingTemp==anotherMainCourse.m_servingTemp);
  }

  public void tempt(){
    System.out.println("Eat me! I am very Filling!");
  }

  public void servingInstructions(){
    System.out.println("Use a fork and knife!");
  }

  public static void main(String[] args) {

  }
}
