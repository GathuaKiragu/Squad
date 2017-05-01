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
    assertTrue(firstHero instanceof Hero);
  }
// Test to get user Name
  @Test
  public void getHeroNameAndReturnsit_String() {
    assertEquals("SuperMan", firstHero.getName());
  }
// Test to check if we can get the Heros Age
  @Test
  public void getHeroAgeAndReturnsit_int() {
    assertEquals(22, firstHero.getAge());
  }
// Test to check if we can get Hero Super power
  @Test
    public void getHeroSuperPowerandReturnsit_String() {
      assertEquals("Flying", firstHero.getPower());
    }
// Test to check if we can get Hero Weakness from the user
  @Test
  public void getWeakness_returnsWeakness_String() {
    assertEquals("Cryptonite", firstHero.getWeakness());
}
  @Test
  public void all_returnsHeroList_true() {
    assertTrue(Hero.all().contains(firstHero));
    assertTrue(Hero.all().contains(secondHero));
  }
// Test to check if we can find the Hero object using Id
  @Test
  public void getHeroIdandreturnsId_int() {
    assertEquals(1, firstHero.getId());
  }
// Test to check if we can find a hero using their specific Id
  @Test
  public void findandReturnsWantedHero_Hero() {
    assertEquals(Hero.find(secondHero.getId()), secondHero);
  }
// This test empties all the instances ArrayList.
  @Test
  public void all_instancesListClearsCorrectly_0(){
    Hero.clear();
    assertEquals(0, Hero.all().size());
  }

}
