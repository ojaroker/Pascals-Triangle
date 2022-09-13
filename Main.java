import java.util.*;
class Main {
  public static void main(String[] args) {
    Solution prog = new Solution();
    Scanner scan = new Scanner(System.in);
    System.out.println("Input number of rows you wish to print of Pascal's Triangle");
    int numrows=scan.nextInt();
    
    System.out.println(prog.generate(numrows));
    scan.close();
  }
}