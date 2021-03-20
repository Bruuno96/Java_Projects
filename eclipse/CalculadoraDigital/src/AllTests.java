import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TesteCalculadoraDiv.class, TesteCalculadoraMulti.class, TesteCalculadoraSomas.class,
		TesteCalculadoraSub.class, TesteDivCalc.class })
public class AllTests {

}
