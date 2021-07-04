package simuduck;

public interface QuackBehavior {
    public void quack();
}

class Quack implements QuackBehavior {
    public Quack(){}
    @Override
    public void quack(){
        System.out.println( "¡Quack, quack!" );
    }
}

class Squeak implements QuackBehavior {
    public Squeak(){}
    @Override
    public void quack(){
        System.out.println( "¡Squeak!" );
    }
}

class MuteQuack implements QuackBehavior {
    public MuteQuack(){}
    @Override
    public void quack() {
        System.out.println( "<< Mute >>" );
    }
}
