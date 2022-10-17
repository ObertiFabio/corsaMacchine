import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random tempo=new Random(); 
    corsaAuto ferrari = new corsaAuto(5,"ferrari",1);
    corsaAuto mercedes = new corsaAuto(5,"mercedes",2);
    corsaAuto redbull = new corsaAuto(5,"redbull",3);
    corsaAuto alpine = new corsaAuto(5,"alpine",4);
    ferrari.start();
    mercedes.start();
    redbull.start();
    alpine.start();
  }
}