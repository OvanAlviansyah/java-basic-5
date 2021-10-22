package javabasic6;

public class Main {
  public static void main(String[] args) {
  Hero hero = new Hero();
    
  hero.setProfile("Ovan Alviansyah", 19, 21);
  hero.profile();
      
    System.out.println("\n");

    // walk
    for(int i=1; i<=10; i++){
      hero.walk();
    }
    
    System.out.println("\n");

    // run
    for(int i=1; i<=6; i++){
      hero.run();
    }

    System.out.println("\n");

    // run
    for(int i=1; i<=6; i++){
      hero.run();
    }
      
    System.out.println("\n");

    // eat
    for(int i=1; i<=3; i++){
      hero.eat();
    }

    System.out.println("\n");

    // drink
    for(int i=1; i<=6; i++){
      hero.drink();
    }

    System.out.println("\n");

    // jump
    for(int i=1; i<=2; i++){
      hero.jump();
    }

    System.out.println("\n");

    // sit
    for(int i=1; i<=5; i++){
      hero.sit();
    }

    System.out.println("\n");

    // attack
    for(int i=1; i<=2; i++){
      hero.attack();
    }
  
    System.out.println("\n");

    // View remaining energy
    hero.remainingEnergy();
  }
}
// Group 4: walk 10x, run 6x, walk 30x, eat 3x, drink 2x, jump 6x, sit 5x, attack 2x
