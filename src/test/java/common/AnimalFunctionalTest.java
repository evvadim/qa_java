package common;

import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalFunctionalTest {

    private final Animal animal = new Animal();

    @Test
    public void getFamilyTest() {

        assertEquals("Текст отличается от требований", "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());

    }

}
