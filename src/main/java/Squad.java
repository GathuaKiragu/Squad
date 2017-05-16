import java.util.List;
import java.util.ArrayList;

public class Squad {
  private int mSize;
  private String mName;
  private String mDedication;
  private static List<Squad> instances = new ArrayList<Squad>();
  private int mId;
  private List<Hero> mHeroes;

public Squad(int size, String name, String dedication) {
  mSize = size;
  mName = name;
  mDedication = dedication;
  instances.add(this);
  mId = instances.size();
  mHeroes = new ArrayList<Hero>();
}
// getter method to get the size of the squad
public int getSize(){
  return mSize;
  }
// method to get name
public String getName(){
    return mName;
  }
// method to get Dedication
  public String getDedication(){
    return mDedication;
  }
// method to get squadID`
  public int getId() {
    return mId;
  }

  public List<Hero> getHeroes() {
    return mHeroes;
  }
// method to clear all instances of squad
  public static void clear() {
    instances.clear();
  }

  public static List<Squad> all() {
    return instances;
  }
// method to find squad
  public static Squad find(int id) {
    return instances.get(id - 1);
  }
// method to add hero to squad
  public void addHero(Hero hero) {
    mHeroes.add(hero);
  }
}
