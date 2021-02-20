import com.pss.exercicio_1802.model.GerenteGeral;
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
public class GerenteGeralTest {
    
    public GerenteGeralTest() {
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
        GerenteGeral gg = new GerenteGeral();
        double limite = 1500;
        assertEquals(limite, gg.getLimiteAprovacao(), 0.01);
    }
}
