package exceptions;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mock;

public class LionUnexpectedSexValueTest {

    @Mock
    Feline feline;

    @Test (expected = Exception.class)
    public void lionUnexpectedSexValue() throws Exception {
        new Lion(feline, "не определен");
    }

}
