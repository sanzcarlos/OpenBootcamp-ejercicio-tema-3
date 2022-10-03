public class main {

    public static void main (String[] args){
        Coche miCoche = new Coche();
        miCoche.AddDoor();
        
        System.out.println(miCoche.NDoor);
    }

    public static int suma (int a, int b){
        return a + b;
    }

}

class Coche {

    public int NDoor = 0;
    
    public void AddDoor(){
        this.NDoor++;
    }
}