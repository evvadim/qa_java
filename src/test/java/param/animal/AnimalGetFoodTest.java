package param.animal;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalGetFoodTest {

    private final String animalKind;
    private final List<String> preferredFood;

    public AnimalGetFoodTest(String animalKind, List<String> preferredFood){
        this.animalKind = animalKind;
        this.preferredFood = preferredFood;
    }

    @Parameterized.Parameters (name = "Тестовые данные {index}: класс {0}")
    public static Object[][] getKindData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void animalGetFoodTest() throws Exception {
        Animal animal = new Animal();
        assertEquals("Список предпочитаемой еды отличается от требований", animal.getFood(animalKind), preferredFood);
    }

}
