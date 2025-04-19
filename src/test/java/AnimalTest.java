import com.example.Animal;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class AnimalTest {
    private final Animal animal = new Animal();

    @Test
    public void getFamilyShouldReturnGeneralAnimalFamily() {
        assertTrue(animal.getFamily().contains("несколько семейств"));
    }

    @Test
    public void getFoodShouldReturnPredatorFoodForPredatorType() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, animal.getFood("Хищник"));
    }

    @Test
    public void getFoodShouldReturnHerbivoreFoodForHerbivoreType() throws Exception {
        List<String> expected = List.of("Трава", "Различные растения");
        assertEquals(expected, animal.getFood("Травоядное"));
    }

    @Test(expected = Exception.class)
    public void getFoodShouldThrowExceptionForUnknownType() throws Exception {
        animal.getFood("Всеядное");
    }
}