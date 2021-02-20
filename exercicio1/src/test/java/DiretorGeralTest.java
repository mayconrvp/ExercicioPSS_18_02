import com.pss.exercicio_1802.model.DiretorGeral;
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
public class DiretorGeralTest {
    
    public DiretorGeralTest() {
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
    public void hello() {
        DiretorGeral dg = new DiretorGeral();
        double limite = 15000;
        assertEquals(limite, dg.getLimiteAprovacao(), 0.01);
    }
}
