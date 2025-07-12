package param;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParamTests {

    Feline feline = new Feline();
    Feline felineSpy = Mockito.spy(feline);

    // переменные для параметризации
    private final String sex;
    private final int kittensCount;
    private final boolean haveMane;
    private final List<String> foodList;


    public LionParamTests(String sex, int kittensCount, boolean haveMane, List<String> foodList) {
        this.sex = sex;
        this.kittensCount = kittensCount;
        this.haveMane = haveMane;
        this.foodList = foodList;
    }

    @Parameterized.Parameters(name = "")
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", 1, true, List.of("Животные", "Птицы", "Рыба")},
                {"Самка", 1, false, List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(felineSpy, sex);
        assertEquals("Количество котят/львят отличается от требований", kittensCount, lion.getKittens());
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(felineSpy, sex);
        assertEquals("Наличие гривы отличается от требований", haveMane, lion.doesHaveMane());
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(felineSpy, sex);
        assertEquals("Список потребляемой пищи отличается от требований", foodList, lion.getFood());
    }
}
