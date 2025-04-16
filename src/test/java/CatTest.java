import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline mockFeline;

    @Test
    public void getSound_ShouldReturnMeow_WhenCalled() {
        Cat cat = new Cat(mockFeline);
        assertEquals("Ожидается звук 'Мяу'", "Мяу", cat.getSound());
    }

    @Test
    public void getFood_ShouldDelegateToFeline_WhenCalled() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(mockFeline.eatMeat()).thenReturn(expectedFood);

        Cat cat = new Cat(mockFeline);
        assertEquals("Рацион должен соответствовать хищнику", expectedFood, cat.getFood());
        verify(mockFeline, times(1)).eatMeat();
    }
}