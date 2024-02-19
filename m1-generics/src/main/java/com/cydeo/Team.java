package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team < T extends Player > { // Any class you van pass to Team...putting a restriction to class or interface it means generics
    //T means any class --- SoccerPlayer, FootballPlayer, BaseballPlayer
    //Should accept only Player Class or subclasses

    private String name;
    private List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)) {
            System.out.println(((Player)player).getName() + " is already on the team");
            return false;
        } else members.add(player);
        System.out.println(((Player)player).getName()+ " picked for the team" + this.name); // this.  meaning that current object
        return true;

    }
}
