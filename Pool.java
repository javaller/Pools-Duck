package pool;

import ducks.Drake;
import ducks.Mandarin;
import ducks.Duck;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pool {
         
        private List<Duck> ducks = new ArrayList<Duck>();
        
        public Pool(){
            System.out.println("Pool is initialized");
        }
    
	public static void main (String[] args){
		System.out.println("Program start");
                
                Pool pool = new Pool();
                
                Duck firstDuck = new Drake();
                firstDuck.quack();
                pool.addDuck(firstDuck);
                
                Duck secondDuck = new Mandarin();
                secondDuck.quack();
                pool.addDuck(secondDuck);
                
                Duck thirdDuck = new Mandarin();
                thirdDuck.quack();
                pool.addDuck(thirdDuck);
                
                pool.allDucksQuack();
                pool.allDucksSwim();
                pool.allDucksFly();
                
                pool.removeDuck(secondDuck);
                
                pool.printDucks();
                
                pool.allDucksQuack();
                pool.allDucksSwim();
                pool.allDucksFly();
               
                pool.printDucks();
                
                pool.removeDuck(firstDuck);
                pool.removeDuck(thirdDuck);
                
                pool.printDucks();
                
                pool.allDucksQuack();
                pool.allDucksSwim();
                pool.allDucksFly();
                          
		System.out.println("Program end");			
	}
        
        public void addDuck(Duck pDuck){
           ducks.add(pDuck);
           System.out.println("New duck "+pDuck+" is added to the pool");	
        }
        
        public void removeDuck(Duck pDuck){
           ducks.remove(pDuck);
           System.out.println("Duck "+pDuck+" is removed from the pool");	
        }
        
        public void allDucksQuack(){
            Iterator<Duck> iter = ducks.iterator();
            
            while(iter.hasNext()){
                Duck duck = iter.next();
                duck.quack();
            }
            
        }
        
        public void allDucksSwim(){
            Iterator<Duck> iter = ducks.iterator();
            int i = 0;
            
            while(iter.hasNext()){
                Duck duck = iter.next();
                duck.swim(i++);
            }
        }
        
        public void allDucksFly(){
            Iterator<Duck> iter = ducks.iterator();
            int i = 5;
            
            while(iter.hasNext()){
                Duck duck = iter.next();
                duck.fly(i++);
            }
        }
        
        public void printDucks(){
            System.out.println(ducks.size()+" ducks in the pool.");
        }

}
