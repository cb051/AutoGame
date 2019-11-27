/*  Author: Carter Buckner
    project: Assignment 2
    Course: CSCE 3193H | L. Streeter
    Last Modified: 10 September 2019 10:02 AM
*/




 class Assignment2 {
  public static void main(String args[]){
      // System.out.println("main");
      // GasTank gas = new GasTank(120);
      Engine engineType = new Engine("V8", 120, 100);
      Auto auto = new Auto("", 10, engineType);

      System.out.println("TEST");
      auto.fillUp();
      System.out.println(auto.getDescription());
      auto.drive(100, 1.0, 2.0);
      // System.out.println("TEST");
      System.out.println(auto.getDescription());
  }
}
