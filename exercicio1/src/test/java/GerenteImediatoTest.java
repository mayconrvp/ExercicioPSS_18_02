import com.pss.exercicio_1802.model.GerenteImediato;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mayco
 */
public class GerenteImediatoTest {
    
    public GerenteImediatoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void ct001() {
        GerenteImediato gi = new GerenteImediato();
        double limiteParaAprovar = 500;
        assertEquals(limiteParaAprovar, gi.getLimiteAprovacao(), 0.01);
    }
   
}
