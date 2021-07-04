package simuduck;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class SimUDuck {
    
    private static final String DUCK_TYPE = "ducktype";
    
    public static Properties ldaPropiedades() throws IOException {
        Properties p = new Properties();
        InputStream stream = SimUDuck.class.getClassLoader().getResourceAsStream( "META-INF/ducks.properties" );
        p.load(stream);
        return p;
    }

    public static void main(String[] args) {
        try {
            Properties p = ldaPropiedades();
            Duck d1;
            d1 = (Duck)Class.forName( p.getProperty( DUCK_TYPE ) ).newInstance();
            
            d1.performQuack();
            d1.swim();
            d1.performFly();
            d1.display();
            
//            System.out.println("Comprando kit");
//            d1.setFlyBehavior( new FlyLikeRocket() );
//            d1.performFly();
        }
        catch( IOException | ClassNotFoundException | IllegalAccessException | InstantiationException ex1 ) {
            ex1.printStackTrace();
        }        
    }
    
}
