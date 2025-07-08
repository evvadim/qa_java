package alex;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTests {

    private final LionAlex alex = new LionAlex(new Feline());

    public LionAlexTests() throws Exception {
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
