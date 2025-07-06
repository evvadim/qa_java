package mocks;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private final Feline feline = new Feline();

    @Spy
    private Lion lion = new Lion("Самец", feline);

    public LionTest() throws Exception {
    }

    @Test
    public void getKittens() {
        lion.getKittens();
        Mockito.verify(lion, Mockito.times(1)).getKittens();
    }
}
