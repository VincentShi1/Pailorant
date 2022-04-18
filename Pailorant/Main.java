import java.util.Scanner;

public class Main {
  public static void main(String[] a) {
    boolean gameT = true;
    while(gameT){
    Scanner games = new Scanner(System.in);
    int win = 0;
    int lose = 0;
    boolean pail = false;
    boolean repeat = true;
    String agentName = null;
    Agent Sentinel = new Agent("Rage", "Healing of Vengeance", 150);
    Agent Duelist = new Agent("Bett", "Dash of Gambling", 150);
    Agent Initiator = new Agent("Preach", "Blinding of Christ", 150);
    Agent Controller = new Agent("Amen", "Smoke of God", 150);
    Agent Duelist2 = new Agent("Daze", "Pineapple Nade", 150);
    Scanner pickWeapon = new Scanner(System.in);
    Scanner pickAgent = new Scanner(System.in);
    SlowPrint.slowPrint("Agent Selection\nWhat agent do you want to pick?: \n Rage class: Sentinel \n Bett class: Duelist \n Preach class: Initiator \n Amen class: Controller \n Daze class: Duelist \n");
    String agentName2 = pickAgent.nextLine();
    while (agentName == null) {
      if (agentName2.equals("Rage")) {
        SlowPrint.slowPrint("This agent has the ability \"Healing of Vengeance\"");
        agentName = agentName2;
      } else if (agentName2.equals("Bett")) {
        SlowPrint.slowPrint("This agent has the ability \"Dash of Gambling\"");
        agentName = agentName2;
      } else if (agentName2.equals("Preach")) {
        SlowPrint.slowPrint("This agent has the ability \"Blinding of Christ\"");
        agentName = agentName2;
      } else if (agentName2.equals("Daze")) {
        SlowPrint.slowPrint("This agent has the ability \"Pineapple Nade\"");
        agentName = agentName2;
      } else if (agentName2.equals("Amen")) {
        SlowPrint.slowPrint("This agent has the ability \"Smoke of God\"");
        agentName = agentName2;
      } else {
        SlowPrint.slowPrint("There is no such agent as " + agentName2 + ". Please type it right.");
        agentName2 = pickAgent.nextLine();
      }
    }
    SlowPrint.slowPrint("You selected: " + agentName2);
    SlowPrint.slowPrint("The map is Split.");
    ShowPicture pictures = new ShowPicture();
    pictures.picture();
    SlowPrint.slowPrint("Weapon Selection:\nWhat gun do you wish to pick?: \n Vandal: 0-50m Head-160, Body- 40, Leg-34 \n Classic: 0-30m Head-78, Body-26, Leg-22  \n Phantom:0-15m Head-156, Body-39, Leg-33. 15-30m Head-140, Body-35, Leg-29 \n Judge: Shoots 12 pellets, one shot within 10 meters. \n");
    String weaponName = pickWeapon.nextLine();
    if(weaponName.equals("Vandal")||weaponName.equals("Phantom")||weaponName.equals("Classic")||weaponName.equals("Judge")){
    SlowPrint.slowPrint("You have selected " + weaponName + "."); 
    }
    else if (weaponName.equals("hack"))
    {
      SlowPrint.slowPrint("You decided to hack the game. Your health becomes " + Integer.MIN_VALUE + " and you gift yourself a ton of money. Unfortunately, you are instantly destroyed by the anti-cheat system and get booted. Play fairly or don't play at all.");
      System.exit(7);
    }
    else
    {
      SlowPrint.slowPrint("You are dumb. You didn't have enough time to buy a gun. Here have a Classic.");
      System.out.println("You have selected Classic."); 
    }
    SlowPrint.slowPrint("******************************");
    SlowPrint.slowPrint("Game start"); // game start
    Scanner takePail = new Scanner(System.in);
    SlowPrint.slowPrint("Your teammates want you to grab the pail. Do you grab the pail?");
    String havePail = takePail.nextLine();
    String getPail = havePail.toLowerCase();
    if (getPail.equals("yes")) {
      pail = true;
      SlowPrint.slowPrint("You have the pail.");
    }
    if (getPail.equals("no")) {
      pail = true;
      SlowPrint.slowPrint("Your teammates drop the pail on you anyway.");
    }
    if (pail != true) {
      SlowPrint.slowPrint("Error, please input yes or no.");
    }
    SlowPrint.slowPrint("******************************");
    while (win == 0 && lose == 0) {
      Scanner pushA = new Scanner(System.in);
      Scanner pushB = new Scanner(System.in);
      Scanner trust = new Scanner(System.in);
      SlowPrint.slowPrint("Your teammate says to push A. Do you do it? Answer yes or no.");
      String dieA = pushA.nextLine();
      String lowA = dieA.toLowerCase();
      if (lowA.equals("yes")) {
        SlowPrint.slowPrint("You pushed A main with your teammates and an enemy agent peeks you");
        if (Agent.randomNum(3) == 1) {
          SlowPrint.slowPrint("You killed the enemy agent Rage and controlled A main. \nYou pushed onto the site and the enemy Daze killed off 2 of your teammate. You quicky killed her off and planted the pail.");
          if(Agent.randomNum(3)==1)
          {
            if (agentName2.equals("Bett"))
            {
              SlowPrint.slowPrint("Through either a mistake or possibly skill, you manage to use your own \"Dash of Gambling\" and counter the other Bett. You make short work of her and are almost at the site. So close. Aaaaaand, the whole enemy team was waiting. Welp, gt though.");
              lose++;
            }
            else
            {
              SlowPrint.slowPrint("As you decided to peek rafters, enemy Bett used her ability \"Dash of Gambling\" to get near you and shotgun you to death. \nYou became severely depressed and thought about uninstalling the game. Unfortunately you decided not to uninstall. Soon after, your whole team died.");
              lose++;
            }
          }
          else if(Agent.randomNum(3)==2)
          {
            SlowPrint.slowPrint("You decided to play smart and push through screens to suprise the enemy. However, no one who plays this game is smart and people can get away with anything. Some random enemy agent was just jumping around and somehow one taps you.");
            lose++;
          }
          else
          {
            if (agentName2.equals("Daze"))
            {
              SlowPrint.slowPrint("Using your ability, \"Pineapple Nade\", you manage to weaken the enemy before rushing in. You take out 4 of them and are close to the ace when the last one pokes you in the back. You nearly destroy your monitor before your teammates finish him off.");
              win++;
            }
            else
            {            
              SlowPrint.slowPrint("You just decided to play dumb, like you should, and just push the enemy. \n You ran it down and somehow killed 2 of them. As you see the last enemy in front of you, an ace incoming. \n You died. You get killed. Luckily, your teammates killed him and you guys won. ");
              win++;
            }
          }
        }
        else if(Agent.randomNum(3) == 2)
        {
          SlowPrint.slowPrint("You got one tapped and your teammates are just staring at your corpse as the enemy Rage run back to site.");
          SlowPrint.slowPrint("As you sat depresssed out of your mind, thinking that you are going to lose the round. \nDo you trust your teammates? Yes? No?");
          String trustA = trust.nextLine();
          String lowTrust = trustA.toLowerCase();
          SlowPrint.slowPrint("******************************");
          if(lowTrust.equals("yes"))
          {
            SlowPrint.slowPrint("Wow really? You are a weirdo. Who trust their teammates these days? \nYou should not trust your teammates.");
            if(Agent.randomNum(2)==1)
            {
              SlowPrint.slowPrint("As you begin to question your decision trusting your teammates, one of your teammate rushed onto site and killed the enemy Rage.\nYour teammate avenged you and you began to fall in love with that teammate until he/she got murdered by enemy Daze. Soon, the entire squad is mowed down by an Odin. \nYeah you shouldn't trust them, very bad choice. Don't have hope.");
              lose++;
            }
            else //yes else
            {
              SlowPrint.slowPrint("Should you really trust them? Your teammates are legit just staring at your dead body. As you begin to put your face to your hand in disappointment, your team got onto A site and killed all of the enemy. \n You are surprised that your team won a round without you. You begin to have trust in them, maybe even bond with them. You decided to send a friend request to them all, but they rejected you. \n Shouldn't have trusted them in the first place.");
              win++;
            }
          }
          else if(lowTrust.equals("no"))
          {
            SlowPrint.slowPrint("Damn wow okay. Kinda rude ngl. How could you not trust your teammates. They are dying to create opportunties for you. Tsk tsk.");
            if(Agent.randomNum(2)==1)
            {
              SlowPrint.slowPrint("As you continue to feel ashamed about you not trusting your teammates, one of your teammates started trashtalking you. Maybe you are right all along. As you are about to alt f4, the enemy team started to rush in. Miraculously, your teammates turn into TenZ and flawlessly killed them all. You, dumbfounded, is tempted to just uninstall the game.");
              win++;
            }
            else // no else
            {
              SlowPrint.slowPrint("You are stone cold about your decison to not trust your teammates. As you continue to stare with no emotion and no care about the continious of this game, your teammates avenged you by killing the enemy Rage. Soon, your team killed all the other enemy agents with only one left. \nAs you begin to rethink your decision about trusting your teammates, your team started to push the last enemy. They died one by one and you lost the round.");
              lose++;
            }
          }
          else 
          {
            SlowPrint.slowPrint("Please type yes or no.");
          }
        }
        else // push A else
        {
          SlowPrint.slowPrint("You got one tapped and your team peek the enemy Rage one by one. They all died. You lost the round.");
          lose++;
        }
      } else if (lowA.equals("no")) {
        if (Agent.randomNum(3) == 1) {
          SlowPrint.slowPrint("You go to mid, engage in a firefight, and end up acing the whole team.");
          win++;
        } else if (Agent.randomNum(3) == 2) {
          SlowPrint.slowPrint("You go to mid and got peeked. You died.");
          lose++;
        } else {
          SlowPrint.slowPrint("You go to mid and find nobody there. Your teammate rushed into the site and got killed.");
          repeat = true;
          while(repeat){
          SlowPrint.slowPrint("Now that you are the last one alive, do you want to (A) go to vent or (B) go push B heaven.");
          String pushACont = pushA.nextLine();
          String upperA = pushACont.toUpperCase();
          if (upperA.equals("A")) 
          {
            SlowPrint.slowPrint("You decided to push vent. Hope you the best of luck.");
            if (Agent.randomNum(3) == 1) 
            {
              SlowPrint.slowPrint("You creep slowly through vent. Do you want to check your corners? A) Yes  B) No \n");
              String judge = pushA.nextLine().toUpperCase();
              if (judge.equals("A")) 
              {
                if (Agent.randomNum(2) == 1) 
                {
                  SlowPrint.slowPrint("You checked your corner, and obviously there is an enemy sitting there with a Judge. \n The enemy was on their phone and you easily murdered him or her.");
                  SlowPrint.slowPrint("You pushed into A heaven through vent, rushed into A site and planted the pail.");
                  if (Agent.randomNum(2) == 1) 
                  {
                    SlowPrint.slowPrint("After a second after you plant the pail, an enemy gun you down. You died.");
                    repeat = false;
                    lose++;
                  }
                  else
                  {
                    SlowPrint.slowPrint("After you planted the pail, someone peeked you and you hit the flick of your life and murdered him/her. \n As the time tick away, the pail grew bigger and is going to explode. As you begin to dream about the greatest clutch in history, the other 3 enemy agents arrived and gun you down. \n It is quite hard to win a 1v5, quit dreaming. ");
                    repeat = false;
                    lose++;
                  }
                } 
                else
                {
                  SlowPrint.slowPrint("You checked your corner and saw a Judge pointed straight at your face. \n That is the last thing you saw before you died. The enemy then proceeds to t-bag you");
                  repeat = false;
                  lose++;
                }
              }
              else if(judge.equals("B"))
              {
                SlowPrint.slowPrint("You pushed right through vent and got judged in the face.");
                repeat = false;
                lose++;
              }
            }
          }
          else if (upperA.equals("B")) 
          {
            SlowPrint.slowPrint("You decided to push B heaven. Is this a good idea? Only God knows. ");
            while(repeat){
            SlowPrint.slowPrint("As you push up, do you want to check the corners? A)yes. B)ew no, checking corners are for losers. ");
            String check = pushB.nextLine();
            if (check.equals("A")) 
            {
              SlowPrint.slowPrint("While you check the corner, someone peaked you and you died. Should have not checked that corner sonny. ");
              repeat = false;
              lose++;
            }
            else if (check.equals("B")) 
            {
              SlowPrint.slowPrint("Like a chad, you do not check the corner and easily killed the guy confused by your movement. \n Now you run into site, not clearing a single corner and just when you are planting the pail, someone ran up and knifed you. \n You are being too chad. Stop it. ");
              repeat = false;
              lose++;
            }
            else 
            {
              SlowPrint.slowPrint("Please type either A or B. Being blind sucks, so stop acting like you are.");
            }
            }
          }
          else
          {
            SlowPrint.slowPrint("Type A or B or I will assumed that you are dumb.");
          }
        }
      }
    }
    }
    while(lose == 1 && win == 0) //1 loss
    {
      SlowPrint.slowPrint("******************************");
      SlowPrint.slowPrint("Score: 0-1 \nYou are losing. What are you going to do to bring the score up?");
      Scanner round2 = new Scanner(System.in);
      round2.nextLine();
      SlowPrint.slowPrint("Yeah I don't care, you guys should surrender. Might as well end the suffering.");
      repeat = true;
      while(repeat){
      SlowPrint.slowPrint("But for real though, what do you want to do? A clearly is not working out. So do you want to go B? Yes? No?");
      String decision = round2.nextLine();
      String lowD = decision.toLowerCase();
      if(lowD.equals("yes"))
      {
        SlowPrint.slowPrint("Good choice. You and your team are now going to B main.");
        if(Agent.randomNum(2)==1)
        {
          SlowPrint.slowPrint("When your team peeked, two of them die to the person at tower. Luckily, you traded them but your team are still one man down. \nAs you decide to push through into the site, your teammate stays at B main. The enemy then started to push you. You tried your best to kill them, but your team is no where in sight. You died and dropped the pail. Your team are now in a sticky situation. \nWhat can they do now? Run in and hope for the best of course. Dumb moves are the best moves. They all died. You lost");
          repeat = false;
          lose++;
        }
        else
        {
          if (agentName2.equals("Preach"))
          {
            SlowPrint.slowPrint("Deciding upon running in, you use whatever singular brain cell you have to decide to use your ability \"Blinding of Christ\". You end up hitting it perfectly, blinding them long enough to slaughter the poor fools.");
            repeat = false;
            win++;
          }
          else
          {
            SlowPrint.slowPrint("Your team wanted to play smart, but you learned your lesson and decided that running it down is the best method. Since you have the pail, your team must reluctantly follow you. You just run into site, running and gunning every single enemy and secured the site. Your team, learning from past mistakes, decided to not push the remaining enemy. You guys won as the pail grew bigger and bigger and eventually exploded.");
            repeat = false;
            win++;
          }
        }
      }
      else if(lowD.equals("no"))
      {
        SlowPrint.slowPrint("Too bad, your team are already rushing toward B. You better follow them :D");
        if(Agent.randomNum(2)==1)
        {
          if (agentName2.equals("Rage"))
          {
            SlowPrint.slowPrint("As you reach B, gunfire starts coming. Your teammate, Daze, has her ability but is too injured to go in. Using your ability, \"Healing of Vengeance\", you heal her as she takes the risk to use her ability. Although she dies, it gives you and your team the chance to finish them off. See? Teamwork does work. Sometimes.");
            repeat = false;
            win++;
          }
          else
          {
            SlowPrint.slowPrint("Like life, you are always the last to the party. As you ran toward B, you see in the killfeed that 3 of your teammates died and only one of the enemies died. As your teammates scream in your ear to hurry up, you got very annoyed. When you got to B site, you and your teammate got one tapped. You threw your headphone at the wall. Should have never played. ¯\\_(ツ)_/¯");
            repeat = false;
            lose++;
          }
        }
        else
        {
          SlowPrint.slowPrint("Now you decided to go to B through mid. As you slow walk like a snail to B tower, your team already pushed in and caught the attention of the enemy at tower. \nYou quickly rushed into B tower and killed the enemy at tower. Your team completely cleared site and won the round.");
          repeat = false;
          win++;
        }
      }
      else
      {
        SlowPrint.slowPrint("Please type \"yes\" or \"no\". It is not hard.");
      }
      }
    }
    while (lose == 0 && win == 1) //1 win
    {
      SlowPrint.slowPrint("******************************");
      SlowPrint.slowPrint("Score: 1-0 \n You are in the lead! What are you going to do to bring victory?");
      Scanner round = new Scanner (System.in);
      round.nextLine();
      SlowPrint.slowPrint("Sounds good! Now, what's the plan? A)Rush A since it worked for you. B) Rush mid because you have a death wish.");
      String decision = round.nextLine();
      String lowD = decision.toLowerCase();
      repeat = true;
      while(repeat){
      if (lowD.equals("a"))
      {
        SlowPrint.slowPrint("******************************\nSo you decided to go A, idk if that is a good choice but bad luck to you.");
        if(Agent.randomNum(2)==1)
        {
          SlowPrint.slowPrint("You immediately peeked A and got one tapped by Bett. It is a bad idea. Now you have to sit back and watch your teammate die. Hooray! Surpisely, your team killed Bett and rushed into site. They all died to the enemy Daze's ability:' \"Pineapple Nade\". Maybe you should not peeking A.");
          repeat =false;
          lose++;
        }
        else 
        {
          SlowPrint.slowPrint("You decided to wait for the enemy to push your team. After 30 second, the enemy Bett finally push into your team. She died, the last thing she saw was 5 agent having their gun pointed at her face. Now that Bett is dead, your team started pushing into site. The site is free, there is no enemy defending the site. Your strategy worked, somehow. Now all you need to do is to defend the site, and not die. It should be easy right? \"yes\" or \"no\"");
          Scanner easy = new Scanner(System.in);
          String isEasy = easy.nextLine().toLowerCase();
          if(isEasy.equals("yes"))
          {
            SlowPrint.slowPrint("Wow, arrogant. Is this confidence going to work out? Who knows.");
            if(Agent.randomNum(2)==1)
            {
              SlowPrint.slowPrint("You and your team spread out around the site,you push into screens and just sat there like a scum you are. Unfortunately, all the enemy pushed through screens and you died. You didn't even manage to get one kill during that. How sad. Now you sat in shame as the enemy mowed through your team and won. Should have not been so arrogant huh.");
              repeat = false;
              lose++;
            }
            else 
            {
              SlowPrint.slowPrint("You and your team come up with the genius idea to just sit in the same corner (backsite) and kill anyone that comes through screen. All the enemy push through screen and get killed by you and your team. Why did it work? I don't know. This game suck.");
              repeat = false;
              win++;
            }
          }
          else if(isEasy.equals("no"))
          {
            SlowPrint.slowPrint("Wow, so unconfident. That shouldn't be the alittude you should have. Tsk tsk");
            if(Agent.randomNum(2)==1)
            {
              SlowPrint.slowPrint("You decided to play safe because you are a coward. You play around backsite since you planted the pail. Your team ,however, are not cowards and decided to push into A tower and killed all the enemy. Stop being a coward.");
              repeat = false;
              win++;
            }
            else 
            {
              SlowPrint.slowPrint("You planted the pail and went under tower. As the enemy pushed into site, you stayed under tower and killed them one by one. You and your team won the round. Being a coward and camping seems to work, but I still have no respect for you.");
              repeat = false;
              win++;
            }
          }
          else 
          {
            SlowPrint.slowPrint("Please type yes or no.");
          }
        }
      }
      else if (lowD.equals("b"))
      {
        SlowPrint.slowPrint("******************************\nSo you have a death wish. That is good, I think. I wish you the best of luck.");
        if(Agent.randomNum(2)==1)
        {
          System.out.print("You and your team sneak into mid.");
          if(agentName2.equals("Amen"))
          {
            SlowPrint.slowPrint("You decided to use your ability \"Smoke of God\" to smoke off vent and your team push into B tower. The enemy who was defending B tower has potato internet and was easily killed. Your team ran into site and killed the enemy on site. Now you just camp at B tower, hoping to catch the enemy offguard. The rest of the enemy came to B tower and you killed them all.");
            repeat = false;
            win++;
          }
          else
          {
            SlowPrint.slowPrint("Amen used its ability \"Smoke of God\" to smoke off vent and your team pushed into B tower. The enemy who was defending B tower has potato internet and was easily killed. Your team ran into site and killed the enemy on site. Now you just camp at B tower, hoping to catch the enemy offguard. The rest of the enemy came to B tower and you killed them all.");
            repeat = false;
            win++;
          }
        }
        else 
        {
          SlowPrint.slowPrint("You and your team just run it down toward mid, hoping that it would work out. However, enemy Preach peeked from vent and killed you all. I guess your death wish have been granted. Be happy. ( ͡° ͜ʖ ͡ °) ");
          repeat = false;
          lose++;
        }
      }
      else 
      {
        SlowPrint.slowPrint("Please type A or B. It is not case sensitive, so no need to stress out.");
      }
      }
    }
    while (lose == 1 && win == 1) //1 win/1 loss
    {
      SlowPrint.slowPrint("******************************");
      SlowPrint.slowPrint("Score 1-1 It's currently tied. What are you going to do to bring the win home?");
      Scanner roundZ = new Scanner (System.in);
      roundZ.nextLine();
      SlowPrint.slowPrint("I wish you the best. This round is gonna be a tough one. Now, how are you winning this? A)Let your team go A and you go mid or B)Rush A like a maniac"); 
      String decision2 = roundZ.nextLine().toUpperCase();
      SlowPrint.slowPrint("******************************");
      if (decision2.equals("A"))
      {
        SlowPrint.slowPrint("Finally some strategy in the making. Lets hope that it work.");
        if (agentName2.equals("Amen"))
        {
          SlowPrint.slowPrint("You have the ability \"Smoke of God\", do you want to use it to smoke A tower so you don't get killed by the enemy at tower? Yes or no?");
          String decision = roundZ.nextLine().toLowerCase();
          if(decision.equals("yes"))
          {
            SlowPrint.slowPrint("You used your ability \"Smoke of God\" and smoked off A tower.");
            if(Agent.randomNum(2)==1){
            SlowPrint.slowPrint("Now you pushed into A tower, while your team push toward A site without having to worry about enemy at tower due your ability. When you push up to A tower, you killed the enemy there because they didn't expect you to be there. Your team killed the enemy at site, but your teammate Bett died. It is 4v3 now, your team now have an advantage. You now stay at A tower, while your smoke fade away. You went down to site to plant the pail and your team just run toward the enemy and killed them all.");
            win++;
            }
            else
            {
              SlowPrint.slowPrint("As you push up mid, someone peeked you vent and killed you. Your team pushed into site, killed enemy at site, but your teammate Bett died. It is 3v4 now. Your team got destroyed after the enemy team slowly closing in. Should have smoked vent. ");
              lose++;
            }
          }
          else if(decision.equals("no"))
          {
            SlowPrint.slowPrint("You decided to not use your ability. Dumb move bozo.");
            if(Agent.randomNum(2)==1)
            {
              SlowPrint.slowPrint("You pushed toward A tower from mid, and your team all died as they push into site because you didn't smoke off A tower. You quickly pushed up to tower and got killed because you made too much noise. Your team got flawlessed, the enemy team didn't lose a single agent. This is sad.");
              lose++;
             }
            else
            {
              SlowPrint.slowPrint("You pushed toward A tower from mid quickly and killed the enemy on tower. Your team pushed into site and killed the enemy at site while the enemy was distracted by you. Now it is a 5v3, pretty good. Hope that you don't throw the game.... Andddddd     they threw. You drop down to site to plant the pail and your team rushed toward the enemy. They died but they did kill 2 more enemy. Now it is a 1v1. \nWhat are you going to do now? A)Pick up the Judge next to you and pray that you can shotgun the enemy or B) fight to the death.");
              decision = roundZ.nextLine().toUpperCase();
              if(decision.equals("A"))
              {
                SlowPrint.slowPrint("So you chose to pick up the Judge, taking a risky bet here.");
                if(Agent.randomNum(2)==1)
                {
                  SlowPrint.slowPrint("You pick up the Judge and just wait there until you heard a thud. The enemy is dropped down on site. With this new information, you sat at pillar and wait for the enemy to 'defuse' the pail. When the enemy tried to defuse, you peeked and shotgun the enemy to death. Cringe gun for the win.");
                  win++;
                }
                else 
                {
                  SlowPrint.slowPrint("You picked up a judge and decided to swing for no reason. You got killed by the enemy on rafters, easily. Don't you still have your ability? Damn.");
                  lose++;
                }
              }
              else if(decision.equals("B"))
                {
                  SlowPrint.slowPrint("Lets go, fight fight fight. Don't be worry, if you die you die. :)");
                  SlowPrint.slowPrint("You had a " + weaponName + ". You decide to swing and saw the enemy on rafters. You quickly retreat back to pillar and just stay there.");
                  if(weaponName.equals("Classic"))
                  {
                    SlowPrint.slowPrint("The enemy drop down and peeked you immediately. You didn't stood a chance. Your classic right click shots are giving the guy a haircut. Why do you have a classic?");
                    lose++;
                  }
                  else
                  {
                    SlowPrint.slowPrint("You used your gun and just waited by pillar. When you heard the enemy drop down, you started to move. You are playing Ring around the Rosey with the enemy. Time ticks and the pail exploded. You won the round.");
                    win++;
                  }
                }
                else
                {
                  SlowPrint.slowPrint("I do not remember how many times I need to tell you this, but read and type it correctly.");
                }
              }
            }
            else
            {
              SlowPrint.slowPrint("Please type A or B.");
            }
          }
          else if(agentName2.equals("Bett"))
          {
            SlowPrint.slowPrint("You have your ability \"Dash of Gambling\", do you want to use it to dash onto B tower? You might die. A)Yes, im pro. B)Nah Im going to die.");
            String decision = roundZ.nextLine().toUpperCase();
            if(decision.equals("A"))
            {
              SlowPrint.slowPrint("Okayyyy. Sure you are. A pro stuck in iron.");
              if(weaponName.equals("Judge"))
              {
                boolean towerKill = true;
              }
              SlowPrint.slowPrint("You ");
              }
              else if (decision.equals("B"))
              {
                SlowPrint.slowPrint("You decided not to entry on to the site, despite it being your role. You let your other team member entry in and they died. Your team decided to not to retreat, but instead rush in. This is dumb. Your team is dumb. They died, you died.");
                lose++;
              }
              else
              {
                SlowPrint.slowPrint("Type it right pls");
              }
          }
          else if(agentName2.equals("Daze"))
          {
            SlowPrint.slowPrint("You have your ability \"Pineapple Nade\", do you want to clear vent while you up A tower? You might die. A)Yes, im pro. B)Who needs ability anyway.");
            String decision = roundZ.nextLine().toUpperCase();
            if(decision.equals("A"))
            {
              SlowPrint.slowPrint("Okayyyy. Sure you are. A pro stuck in iron.");
              if(Agent.randomNum(2)==1)
              {
                SlowPrint.slowPrint("You threw your nade into vent, while you loudly push into A tower. You got one tapped because you made too much noise and alerted the enemy. Now you hope for your team to win, but like all multiplayer games. Your team sucks and they all died.");
                lose++;
              }
              else
              {
                SlowPrint.slowPrint("You threw a nade into vent, and pushed into A tower. You killed the enemy Rage who heard you and pushed up to A tower. Now you drop down to A site to help your team kill the Preach on site. Your team killed Preach, but lost a teammate. You planted the pail and your team just played for time. As time tick, all the enemy rushed onto the site with no plan and got destroyed.");
                win++;
              }
            }
            else if (decision.equals("B"))
            {
              SlowPrint.slowPrint("You decided to not use any ability. Why?");
              if(Agent.randomNum(2)==1)
              {
                SlowPrint.slowPrint("You pushed quietly into A tower, but Rage is watching the entrance to A tower and saw you. You engage in a firefight. You lost it. Should have used your ability.");
                lose++;
              }
              else
              {
                SlowPrint.slowPrint("You pushed quietly into A tower and just when you peek, Rage turned around. You killed her and controlled A tower. Your team started to push after you killed Rage and controlled the site. The rest of the enemy try to control A tower again, but you killed them all. Good job.");
                win++;
              }
            }
            else
            {
              SlowPrint.slowPrint("Dumbo, it's \"A\" or \"B\", not whatever you typed.");
            }
          }
          else if(agentName2.equals("Preach"))
          {
            SlowPrint.slowPrint("You used your \"Blinding of Christ\" around A tower and killed Rage while she is blinded. You pushed up to site and dueled the enemy Preach at site.");
            if(Agent.randomNum(2)==1)
            {
              SlowPrint.slowPrint("The enemy Preach easily flicked one tapped you. Preach diff.");
              lose++;
            }
            else
            {
              SlowPrint.slowPrint("The enemy Preach started to whiff and make a full body carving of you. You stood still and killed him. Bad day for the enemy Preach.");
              win++;
            }
          }
          else if (agentName2.equals("Rage"))
          {
            SlowPrint.slowPrint("You decided to not push up mid because you are a healer/support. You need to babysit your crying teammates.");
            SlowPrint.slowPrint("Your team's Bett and Daze entry into the site. Enemy team's Preach flashed and peeked. He killed Bett, but got traded by Daze. Daze is now 1 hp, do you want to heal her? A)Yes I need a meatshield b)No I need the heal.");
            String decision = roundZ.nextLine().toUpperCase();
            if(decision.equals("A"))
            {
              SlowPrint.slowPrint("You healed your teammate Daze to 61 hp, now she is two shot. Daze thanked you by rushing down screens and died. This is very sad, you are sad, so you went to push screens and died. The rest of your team got killed later.");
              lose++;
            }
            else if(decision.equals("B"))
            {
              SlowPrint.slowPrint("You decided to save the heal for youself and not heal Daze. Daze is pissed and threw a grenade at you. Daze died from the explosion. Thank god you saved that heal, the grenade took like 10 hp from you. You healed yourself and planted the pail. Then your teammate killed the rest of the enemy team. Guess not healing your teammate is a good idea.");
              win++;
            }
          }
            else
            {
              SlowPrint.slowPrint("Type A or B sir/madam/attack helicopter");
            }
          }
          else if (decision2.equals("B"))
          {
          SlowPrint.slowPrint("You decided to full rush A like a manic. Dumb move, but oh well.");
          if(agentName2.equals("Bett"))
          {
            SlowPrint.slowPrint("You have your ability \"Dash of Gambling\", do you want to use it to entry for your team? You might die. A)Yes, im pro. B)Nah I am no duelist.");
            String decision = roundZ.nextLine().toUpperCase();
            if(decision.equals("A"))
            {
              SlowPrint.slowPrint("Okayyyy. Sure you are. A pro stuck in iron.");
              if(Agent.randomNum(2)==1)
              {
                SlowPrint.slowPrint("You immediately dashed on to site without a care in the world. You saw an enemy Preach in front of you, who didn't notice you are on site. ");
                if(weaponName.equals("Judge"))
                {
                  SlowPrint.slowPrint("You pushed the enemy Preach and 'judged' him to death.");
                }
                else
                {
                  SlowPrint.slowPrint("You stood at long range at shoot his head off. Nice shot.");
                }
                SlowPrint.slowPrint("You killed Preach and planted the pail while your team get on to site. After you planted the pail, you pushed screens to catch the enemy off guard. The enemy Bett was just running with her knife out, you peeked and killed her. Then you went up to A tower and killed the other 3 agent. Ace. Goodjob, you did something.");
                win++;
              }
              else
              {
                SlowPrint.slowPrint("You tried to dash on site, but bumped your head on the wall. You made noise and now the enemy knows that your team are going A. Your team quickly push into site, but the enemy Preach used his ability \"Blinding of Christ\" and blinded all of your team. The enemy peeked and killed all of you. It is all your fault, how sad. Be ready to get flamed.");
                lose++;
              }
            }
          }
          else 
          {
            SlowPrint.slowPrint("You and your team full rush into A site, killing off the Preach on site. You planted the pail and now you pray that your team will win.");
            if(Agent.randomNum(2)==1)
            {
              SlowPrint.slowPrint("Your team clearly did not hear your praying, they immediately peeked and got killed. This is all up to you. Will this be over?       Yes it will, you peeked and died. :)");
            }
            else
            {
              SlowPrint.slowPrint("Your team heard your prayer because you pressed your mic and now they are calling you cringe. You got angry and decided to throw. You started running toward screens, hoping for a quick death. However, you run and down the entire team somehow. Idk if you should be happy or sad.");
            }
          }
        }
        else
        {
          SlowPrint.slowPrint("It's literally a tie. Choose a letter so I can either cheer for you or make fun of you.");
        } 
          }
    if (win == 2)
    {
      SlowPrint.slowPrint("You managed to score yourself a victory! Nice job!");
    }
    else
    {
      SlowPrint.slowPrint("Seems you lost. You suck.");
    }
    SlowPrint.slowPrint("Do you want to play again and suffer? yes? no?");
    String gameY = games.nextLine().toLowerCase();
    if(gameY.equals("yes"))
    {
      SlowPrint.slowPrint("Bad decision, but oh well. \n********************");
    }
    else if(gameY.equals("no"))
    {
      SlowPrint.slowPrint("Good choice, you can now rest easy knowing that you  played a bootleg valorant game.");
      SlowPrint.slowPrint("Now before you go. Have this");
      ShowPicture duckA = new ShowPicture();
      duckA.duck();
      gameT = false;
      
    }
    else
    {
      SlowPrint.slowPrint("Seem like you are not smart enough to type yes or no. So have fun suffering.");
    }
    }
  }
}