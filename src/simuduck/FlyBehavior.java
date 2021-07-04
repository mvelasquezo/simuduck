package simuduck;

public interface FlyBehavior {
    public void fly();
}

class FlyWithWings implements FlyBehavior {
    public FlyWithWings(){}
    
    @Override
    public void fly(){
        System.out.println( "Estoy volando..." );
    }
}

class FlyNoWay implements FlyBehavior {
    public FlyNoWay(){}
    
    @Override
    public void fly() {
        System.out.println( ":[ no puedo volar" );
    }
}

class FlyLikeRocket implements FlyBehavior {
    public FlyLikeRocket(){}
    
    @Override
    public void fly(){
        System.out.println( "Estoy volando: Al infinito y más allá" );
    }
}
//¿Qué es una interface?
//Es una clase abstracta pura
