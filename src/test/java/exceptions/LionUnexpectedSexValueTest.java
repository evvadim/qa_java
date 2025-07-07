package exceptions;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

public class LionUnexpectedSexValueTest {

    @Test (expected = Exception.class)
    public void lionUnexpectedSexValue() throws Exception {
        new Lion("не определен", new Feline());
    }

}
