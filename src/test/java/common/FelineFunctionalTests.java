package common;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineFunctionalTests {

    @Spy
    Feline feline;

    @Test
    public void eatMeatTest() throws Exception {
        assertEquals("Список потребляемой пищи отличается от требований", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void getFamily() {
        assertEquals("Семейство отличается от требований", "Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensNoParam() {
        assertEquals("Количество котят/львят отличается от требований", 1, feline.getKittens());
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittensWithParam() {
        int n = 4;
        assertEquals("Возвращаемое количество котят отличается от требований", n, feline.getKittens(n));
    }
}
