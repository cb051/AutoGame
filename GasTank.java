/*  Author: Carter Buckner
    project: Assignment2 - GasTank Class
    Course: CSCE 3193H | L. Streeter
    Last Modified: 17 September 2019 17:38 PM
*/
public class GasTank{
  //private ---------------------------------------
  private int maxCapacity;
  // private double currentLevel;
  private double currentCapacity;

  //public ----------------------------------------
  public GasTank(int setMaxCapacity){
      currentCapacity = 0;
    if(setMaxCapacity < 0){
      maxCapacity = 0;
    } else {
      maxCapacity = setMaxCapacity;
    }
  }
  public int getCapacity(){
    //shows max capacity
    return maxCapacity;
  }
  public double getLevel(){
    //shows current level
    return currentCapacity;
  }
  public void setLevel(double levelIn){
    if(levelIn < 0){
      currentCapacity = 0;
    } else {
      currentCapacity = levelIn;
    }
  }

}
