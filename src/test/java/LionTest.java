import com.example.Lion;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LionTest {
    private static final String MALE = "Самец";
    private static final String FEMALE = "Самка";
    private static final String INVALID_SEX = "Неизвестный";

    @Test
    public void doesHaveMane_ShouldReturnTrue_ForMaleLion() throws Exception {
        Lion lion = new Lion(MALE);
        assertTrue("У самца должна быть грива", lion.doesHaveMane());
    }

    @Test
    public void doesHaveMane_ShouldReturnFalse_ForFemaleLion() throws Exception {
        Lion lion = new Lion(FEMALE);
        assertFalse("У самки не должно быть гривы", lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void constructor_ShouldThrowException_ForInvalidSex() throws Exception {
        new Lion(INVALID_SEX);
    }

    @Test
    public void getKittens_ShouldReturnOne_ByDefault() throws Exception {
        Lion lion = new Lion(MALE);
        assertEquals("Должно возвращаться 1 котенок по умолчанию", 1, lion.getKittens());
    }

    @Test
    public void getFood_ShouldReturnPredatorFood_WhenCalled() throws Exception {
        Lion lion = new Lion(FEMALE);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}