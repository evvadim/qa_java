package common;

import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionFunctionalTests {

    Lion lion = Mockito.mock(Lion.class);

    @Test
    public void getKittens() {
        assertEquals(0, lion.getKittens());
    }

    @Test
    public void getFood() throws Exception {
        assertEquals(List.of(), lion.getFood());
    }

}
