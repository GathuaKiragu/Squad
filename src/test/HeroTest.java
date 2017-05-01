import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
  private Hero firstHero;
  private Hero secondHero;

// indicates this method must be executed before each test in the class, so as to execute some pre-conditions necessary for the test
   @Before
  public void initialize() {
    Hero.clear();
    firstHero = new Hero("SuperMan", 22, "Flying", "Cryptonite");
    secondHero = new Hero("Smallvile", 23, "Speed", "Cryptonite");
  }
// Test to check if hero class initializes correctly
  @Test
  public void HeroinstantiatesCorrectly_true() {
    assertTrue(firstHero instanceof Heroq);
  }
// Test to get user Name
  @Test
  public void getHeroNameAndReturn_String() {
    assertEquals("SuperMan", firstHero.getName());
  }
// Test to check if we can get the Heros Age
  @Test
  public void getHeroAgeAndReturn_int() {
    assertEquals(22, firstHero.getAge());
  }

  @Test
    public void getHeroSuperPower_String() {
      assertEquals("Flying", firstHero.getPower());
    }

}
