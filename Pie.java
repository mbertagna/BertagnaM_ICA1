// a. Michael Bertagna, Leah Zahn
// b. 2353491, 2341427
// c. bertagna@chapman.edu, zahn@chapman.edu
// d. CPSC 231-01
// e. ICA1: Inheritance & Polymorphism

public class Pie extends Dessert{
  //member variables
  protected String m_flavor;

  //basic constructor
  public Pie(){
    super();
    m_flavor=null;
  }

  //overloaded constructor
  public Pie(String name, int numCals, String glutenFree, String flavor){
    super(name, numCals, glutenFree);
    m_flavor=flavor;
  }

  //copy constructor
  public Pie(Pie anotherPie){
    super(anotherPie);
    m_flavor=anotherPie.m_flavor;
  }

  //accessors
  public String getFlavor(){
    return m_flavor;
  }

  //mutators
  public void setFlavor(String flavor){
    m_flavor=flavor;
  }

  public String toString(){
    return (super.toString()+", Flavor: "+m_flavor);
  }

  public boolean equals(Pie anotherPie){
    return (super.equals(anotherPie) && m_flavor.equals(anotherPie.m_flavor));
  }

  public void tempt(){
    System.out.println("Take a big Slice!");
  }

  public void servingInstructions(){
    System.out.println("Grab a fork!");
  }

  public static void main(String[] args) {

  }

}
