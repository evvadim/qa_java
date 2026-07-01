package param;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParamTests {

    Feline feline = Mockito.mock(Feline.class);

    // переменные для параметризации
    private final String sex;
    private final boolean haveMane;


    public LionParamTests(String sex, boolean haveMane) {
        this.sex = sex;
        this.haveMane = haveMane;
    }

    @Parameterized.Parameters(name = "")
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(feline, sex);
        assertEquals("Наличие гривы отличается от требований", haveMane, lion.doesHaveMane());
    }

}
