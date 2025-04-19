import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {
    private final Feline feline = new Feline();

    @Test
    public void eatMeatShouldReturnPredatorFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyShouldReturnFelidae() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensShouldReturnOneByDefault() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensShouldReturnSpecifiedCount() {
        assertEquals(5, feline.getKittens(5));
    }
}