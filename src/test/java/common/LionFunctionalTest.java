package common;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionFunctionalTest {

    private final String sex = "Самка";
    private final Lion lion = new Lion(sex, new Feline());

    public LionFunctionalTest() throws Exception {
    }

    @Test
    public void getKittens() {
        assertEquals("Количество котят/львят отличается от требований", 1, lion.getKittens());
    }

    @Test
    public void doesHaveMane() {
        assertEquals("Наличие гривы отличается от требований", sex.equals("Самец"), lion.doesHaveMane());
    }

    @Test
    public void getFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
