package simuduck;

//extends (extiende) -> generalizada
//implements (implementa) -> especializa

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    
    @Override
    public void display() {
        System.out.println( "Hola, soy un pato silvestre" );
    }
}
