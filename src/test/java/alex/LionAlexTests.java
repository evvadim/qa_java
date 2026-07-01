package alex;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTests {

    @Mock
    Feline feline;

    private final LionAlex alex = new LionAlex(feline);

    public LionAlexTests() throws Exception {
    }

    // тестирование методов родительского класса
    @Test
    public void getKittensTest() {
        assertEquals("Количество котят/львят отличается от требований", 0, alex.getKittens());
    }

    @Test
    public void doesHaveManeTest() {
        assertTrue("Наличие гривы отличается от требований", alex.doesHaveMane());
    }

    @Test
    public void getFriendsTest() {
        assertEquals("Список друзей на совпадает с требованиями", List.of("Марти", "Глория","Мелман"), alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() {
        assertEquals("Место жительства отличается от требований", "Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
}
