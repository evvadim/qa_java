package common;

import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineFunctionalTests {

    private final Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {
        assertEquals("Список потребляемой пищи отличается от требований", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamily() {
        assertEquals("Семейство отличается от требований", "Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensNoParam() {
        assertEquals("Количество котят/львят отличается от требований", 1, feline.getKittens());
    }

    @Test
    public void getKittensWithParam() {
        int n = 4;
        assertEquals("Возвращаемое количество котят отличается от требований", n, feline.getKittens(n));
    }
}
