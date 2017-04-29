import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @Test
  public void HeroinstantiatesCorrectly_true() {
    assertTrue(firstHero instanceof Hero);
  }
}
