package common;

import com.example.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(MockitoJUnitRunner.class)
public class CatFunctionalTests {

    @Mock
    Cat cat;

    @Test
    public void getSoundTest() {
        assertNull(cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        assertEquals(List.of(), cat.getFood());
    }
}
