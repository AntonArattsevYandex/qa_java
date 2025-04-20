import com.example.Lion;
import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class LionTest {
    private final Feline feline = new Feline(); // Создаем один раз

    @Test
    public void maleLionShouldHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline); // Добавлен второй параметр
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void femaleLionShouldNotHaveMane() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void invalidSexShouldThrowException() throws Exception {
        new Lion("Некорректный", feline);
    }

    @Test
    public void getKittensShouldReturnOne() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodShouldReturnPredatorFood() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}