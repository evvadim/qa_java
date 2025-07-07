package exceptions;

import com.example.Animal;
import org.junit.Test;

public class AnimalGetFoodUnexpectedKindTest {

    @Test (expected = Exception.class)
    public void unexpectedAnimalKind() throws Exception {
        Animal animal = new Animal();
        String animalKind = "Всеядное";
        animal.getFood(animalKind);
    }

}
