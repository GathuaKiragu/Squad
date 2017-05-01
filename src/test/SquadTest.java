import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

// Test to check if Squad instantiates correctly
  @Test
  public void SquadInstantiatesCorrectly_true() {
    Squad firstSquad = new Squad("Moringa Gung","Bringing Technology to Life");
    assertTrue(firstSquad instanceof Squad);
  }
  
}
