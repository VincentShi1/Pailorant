public class Agent
{
    private String name;
    private String weapon;
    private String ability;
    private int health;
    public Agent(String n, String ab, int hp)
    {
        n = name;
        ab = ability;
        hp = health;
    }
    public Agent(String n, String ab)
    {
      n = name; 
      ab = ability;
    }
    public String kill()
    {
      if (health>=1)
      {
        health = 0;
        return ("You have killed " + name + ".");
      }
      else
      {
        return ("You suck at videogames.");
      }
    }
    public String getAbility()
    {
      return ability;
    }
    public String toString()
    {
      return("Agent: "+ name + "Weapon: " + weapon + "Ability: " + ability);
    }
    public int buyArmor()
    {
      return (health + 50);
    }
    public void setHeatlh (int n)
    {
      n = 100;
      health = 100;
    }
    public void setHealth()
    {
      health = 100; 
    }
    public static int randomNum(int max)
    {
      return ((int)(Math.random()*max)+1);
    }
    public String getName()
    {
      return name;
    }
}