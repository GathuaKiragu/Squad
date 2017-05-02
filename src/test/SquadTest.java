import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

// Test to check if Squad instantiates correctly
  @Test
  public void SquadInstantiatesCorrectly_true() {
    Squad firstSquad = new Squad("Moringa Gung","Bringing Technology to Life");
    assertTrue(firstSquad instanceof Squad);
  }
// Test to get the size of the squad
  @Test
    public void Squad_getSize_int(){
    Squad firstSquad = new Squad(4);
    assertEquals(4, firstSquad.getSize());
  }
// Test to check if we can get the name form the user
  @Test
public void Squad_getName_String(){
  Squad firstSquad = new Squad("Moringa Team");
  assertEquals("Moringa Team", firstSquad.getName());
  }
// Test to check if we can get the Squads passion
  @Test
  public void Squad_getPassion_String(){
    Squad firstSquad = new Squad("Moringa Team");
    assertEquals("raising awareness about windowWashing", firstSquad.getPassion());
  }

  @Test
  public void Squad_instancesListClearsCorrectly_0(){
    Squad.clear();
    assertEquals(0, Squad.all().size());
  }

  @Test
  public void Squad_allReturnsAll_true() {
    assertTrue(Squad.all().contains(firstSquad));
  }

  @Test
  public void Squad_findReturnsById_Squad() {
    assertEquals(Squad.find(firstSquad.getId()), firstSquad);
  }

}
