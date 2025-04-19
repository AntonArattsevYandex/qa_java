import com.example.Lion;
import java.util.List; // Добавлен этот импорт
import org.junit.Test;
import static org.junit.Assert.*;

public class LionTest {
    @Test
    public void maleLionShouldHaveMane() throws Exception {
        Lion lion = new Lion("Самец");
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void femaleLionShouldNotHaveMane() throws Exception {
        Lion lion = new Lion("Самка");
        assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void invalidSexShouldThrowException() throws Exception {
        new Lion("Некорректный");
    }

    @Test
    public void getKittensShouldReturnOne() throws Exception {
        Lion lion = new Lion("Самец");
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodShouldReturnPredatorFood() throws Exception {
        Lion lion = new Lion("Самка");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}