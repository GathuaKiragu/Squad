import java.util.List;
import java.util.ArrayList;

public class Hero {
  private String mName;
  private int mAge;
  private String mPower;
  private String mWeakness;
  private static List<Hero> instances = new ArrayList<Hero>();
  private int mId;

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

  public String getName() {
    return mName;
  }
  public int getAge() {
  return mAge;
  }
  public String getPower() {
    return mPower;
  }
}
