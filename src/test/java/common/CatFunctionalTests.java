package common;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatFunctionalTests {

    private final Cat cat = new Cat(new Feline());

    @Test
    public void getSoundTest() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
