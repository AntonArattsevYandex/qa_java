import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {
    private final Feline feline = new Feline();

    @Test
    public void eatMeat_ShouldReturnPredatorFoodList_WhenCalled() throws Exception {
        List<String> expectedPredatorFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedPredatorFood, feline.eatMeat());
    }

    @Test
    public void getFamily_ShouldReturnFelidae_WhenCalled() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens_ShouldReturnOneKitten_ByDefault() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittens_ShouldReturnSpecifiedCount_WhenParameterProvided() {
        int expectedKittenCount = 5;
        assertEquals(expectedKittenCount, feline.getKittens(expectedKittenCount));
    }
}