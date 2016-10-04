package com.codewars.completed;

import java.util.HashMap;
import java.util.Map;

/**
 * Those wayward Winchester boys are in trouble again, hunting something down in New Orleans. You are Bobby Singer, you know how "idjits" they can be, so you have to prepare. They will call you any minute with the race of the thing, and you want to answer as soon as possible. By answer, I mean: tell them how to kill, or fight it.

 You have something like a database (more like drunken doodling) to help them:

 werewolf : Silver knife or bullet to the heart
 vampire : Behead it with a machete
 wendigo : Burn it to death
 shapeshifter : Silver knife or bullet to the heart
 angel : Use the angelic blade
 demon : Use Ruby's knife, or some Jesus-juice
 ghost : Salt and iron, and don't forget to burn the corpse
 dragon : You have to find the excalibur for that
 djinn : Stab it with silver knife dipped in a lamb's blood
 pagan god : It depends on which one it is
 leviathan : Use some Borax, then kill Dick
 ghoul : Behead it
 jefferson starship : Behead it with a silver blade
 reaper : If it's nasty, you should gank who controls it
 rugaru : Burn it alive
 skinwalker : A silver bullet will do it
 phoenix : Use the colt
 witch : They are humans
 else : I have friggin no idea yet
 You can access the database as drunkenDoodling or drunken_doodling depending on your language.

 So a call would go down like this:

 The guys call you: bob('rugaru')

 ...and you reply (return) with the info, and your signature saying of yours! Burn it alive, idjits!
 */
public class Supernatural {

    public static void main(String[] args) {
        Supernatural supernatural= new Supernatural();
        System.out.println(supernatural.bob("werepuppy"));

    }
    public static String bob(String beast) {
        String str = "werewolf:Silver knife or bullet to the heart\n" +
                "vampire:Behead it with a machete\n" +
                "wendigo:Burn it to death\n" +
                "shapeshifter:Silver knife or bullet to the heart\n" +
                "angel:Use the angelic blade\n" +
                "demon:Use Ruby's knife, or some Jesus-juice\n" +
                "ghost:Salt and iron, and don't forget to burn the corpse\n" +
                "dragon:You have to find the excalibur for that\n" +
                "djinn:Stab it with silver knife dipped in a lamb's blood\n" +
                "pagan god:It depends on which one it is\n" +
                "leviathan:Use some Borax, then kill Dick\n" +
                "ghoul:Behead it\n" +
                "jefferson starship:Behead it with a silver blade\n" +
                "reaper:If it's nasty, you should gank who controls it\n" +
                "rugaru:Burn it alive\n" +
                "skinwalker:A silver bullet will do it\n" +
                "phoenix:Use the colt\n" +
                "witch:They are humans\n" +
                "else:I have friggin no idea yet";
        String[] values = str.split("\n");


        Map<String, String > myMap= new HashMap<String, String>();
        for(String s: values){

            String [] str1=s.split(":",2);
            myMap.put(str1[0], str1[1]);

        }
        StringBuilder stringBuilder = new StringBuilder();

        for(Map.Entry<String,String> entry : myMap.entrySet()){

            if(beast.equals(entry.getKey())){
                return (entry.getValue() + ", idjits!");
            }

        }

        return "I have friggin no idea yet, idjits!";
    }


}
