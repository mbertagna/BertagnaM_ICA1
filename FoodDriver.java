// a. Michael Bertagna, Leah Zahn
// b. 2353491, 2341427
// c. bertagna@chapman.edu, zahn@chapman.edu
// d. CPSC 231-01
// e. ICA1: Inheritance & Polymorphism

import java.util.ArrayList;
import java.util.*;
public class FoodDriver{
  public static void main(String[] args) {
    ArrayList<Food> foodList=new ArrayList<Food>();
    foodList.add(new Food("Stuffing",200));
    foodList.add(new MainCourse("Turkey",250,165));
    foodList.add(new Dessert("Candied Apples",100,"Yes"));
    foodList.add(new Pie("Pumpkin Pie",300,"No","Pumpkin"));
    foodList.add(new Cookie("Chocolate Chip Cookie",230,"No","Circular"));
    foodList.add(new Food("Green Bean Cassarole",150));
    foodList.add(new MainCourse("Sweet Potatoes",240,180));
    foodList.add(new Dessert("Jello",150,"Yes"));
    foodList.add(new Pie("Cherry Pie",290,"No","Cherry"));
    foodList.add(new Cookie("Frosted Sugar Cookie",210,"No","Turkey"));

    //shuffle foods in list
    Collections.shuffle(foodList);

    for (int i=0 ; i < foodList.size() ; i++){
      if (foodList.get(i) instanceof Cookie){
        System.out.println(((Cookie)foodList.get(i)).toString());
        ((Cookie)foodList.get(i)).tempt();
        ((Cookie)foodList.get(i)).servingInstructions();
        System.out.println();
      }
      else if (foodList.get(i) instanceof Pie){
        System.out.println(((Pie)foodList.get(i)).toString());
        ((Pie)foodList.get(i)).tempt();
        ((Pie)foodList.get(i)).servingInstructions();
        System.out.println();
      }
      else if (foodList.get(i) instanceof Dessert){
        System.out.println(((Dessert)foodList.get(i)).toString());
        ((Dessert)foodList.get(i)).tempt();
        ((Dessert)foodList.get(i)).servingInstructions();
        System.out.println();
      }
      else if (foodList.get(i) instanceof MainCourse){
        System.out.println(((MainCourse)foodList.get(i)).toString());
        ((MainCourse)foodList.get(i)).tempt();
        ((MainCourse)foodList.get(i)).servingInstructions();
        System.out.println();
      }
      else if (foodList.get(i) instanceof Food){
        System.out.println(foodList.get(i).toString());
        foodList.get(i).tempt();
        foodList.get(i).servingInstructions();
        System.out.println();
      }
    }





  }




}
