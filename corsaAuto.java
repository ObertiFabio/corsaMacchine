import java.util.Random;
class corsaAuto extends Thread {
  private Random tempo;
  int giri;
  int numAuto;
  String nome;
  

  public   corsaAuto(int giri, String nome,int numAuto){
    this.giri=giri;
    this.numAuto=numAuto;
    this.nome=nome;
    tempo=new Random();
  }
  public void run(){
  try {
    int tempoGiri;
    for(int i=0;i<this.giri;i++){
      tempoGiri = tempo.nextInt(3) +1;
      sleep(tempoGiri*1000);
      System.out.println(" L'auto " + this.numAuto +" - " + this.nome + " - " + " ha completato " + (i+1) + " giri");
    }
  }
      catch(Exception e){
        System.out.println("errore");
      }
  }
         
}