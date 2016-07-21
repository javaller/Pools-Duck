package ducks;

public class Drake implements Duck {
    
    public Drake(){
        
    }

    @Override
    public void quack() {
        System.out.println("Drake says quack quack quack!!!");
    }

    @Override
    public void swim(int pMeters) {
        System.out.println("Drake is swimming "+pMeters+ "  meters" );
    }

    @Override
    public void fly(int pMeters) {
        System.out.println("Drake is flying "+pMeters+ "  meters" );
    }
    
}
