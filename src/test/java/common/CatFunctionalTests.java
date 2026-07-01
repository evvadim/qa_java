package common;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatFunctionalTests {

    @Mock
    Feline feline;
    Cat cat = new Cat(feline);

    @Test
    public void getSoundTest() {
        assertEquals("Мяу", cat.getSound());
    }
}
