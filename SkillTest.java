import static org.junit.Assert.*;
import org.junit.*;

public class SkillTest {
    @Test
    public void factTest() {
        Skill s = new Skill();
        assertEquals(100, s.factorial(5));
    }
}