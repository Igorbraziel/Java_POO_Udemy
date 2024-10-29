package Generics_Set_Map.SetExercise;

import java.time.Instant;

public class User implements Comparable<User> {
    private String name;
    private Instant accessDate;

    public User(String name, Instant accessDate){
        this.name = name;
        this.accessDate = accessDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getAccessDate() {
        return accessDate;
    }

    public void setAccessDate(Instant accessDate) {
        this.accessDate = accessDate;
    }

    @Override
    public int compareTo(User otherUser){
        return this.name.compareTo(otherUser.name);
    }

    @Override 
    public int hashCode(){
        return this.name.hashCode();   
    }

    @Override
    public boolean equals(Object otherUser){
        if(this == otherUser){
            return true;
        }
        if(otherUser == null){
            return false;
        }
        if(this.getClass() != otherUser.getClass()){
            return false;
        }
        if(!this.name.equals(((User) otherUser).name)){
            return false;
        }
        return true;
    }
}
