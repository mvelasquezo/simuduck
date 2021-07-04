package simuduck;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    
    @Override
    public void display(){
        System.out.println( "Hola, soy un patito modelo/prototipo" );
    }
}
