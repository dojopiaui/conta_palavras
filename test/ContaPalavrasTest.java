import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ContaPalavrasTest {
     @Test
     public void contapalavra(){
    	 ContaPalavras c = new ContaPalavras();
    	 	c.setFrase("o doce de batata doce");
    	 	assertEquals(2, c.quantidade("doce") );
    	 	assertEquals(1, c.quantidade("batata"));
    	 	
    	  	
     }
}
