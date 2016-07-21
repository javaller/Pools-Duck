package ducks;

public class Mandarin implements Duck {
    
    public Mandarin(){
        
    }
    
    @Override
    public void quack() {
        System.out.println("Mandarin says quack quack quack!!!");
    }

    @Override
    public void swim(int pMeters) {
        System.out.println("Mandarin is swimming "+pMeters+ "  meters" );
    }

    @Override
    public void fly(int pMeters) {
        System.out.println("Mandarin is flying "+pMeters+ "  meters" );
    }
    
}
