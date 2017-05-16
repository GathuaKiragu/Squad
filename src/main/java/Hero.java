import java.util.List;
import java.util.ArrayList;

public class Hero {
  private String mName;
  private int mAge;
  private String mPower;
  private String mWeakness;
  private static List<Hero> instances = new ArrayList<Hero>();
  private int mId;
// Hero Constructor
  public Hero(String name, int age, String power, String weakness) {
    mName = name;
    mAge = age;
    mPower = power;
    mWeakness = weakness;
    instances.add(this);
    mId = instances.size();
  }
  public static void clear(){
    instances.clear();
  }
// getter method to get the hero name
  public String getName() {
    return mName;
  }
  // getter method to get the hero age
  public int getAge() {
    return mAge;
  }
  // getter method to get power
  public String getPower() {
    return mPower;
  }
  // getter method to get hero weakness
  public String getWeakness() {
    return mWeakness;
  }
  // method to return all instances of hero
  public static List<Hero> all() {
    return instances;
  }
}
