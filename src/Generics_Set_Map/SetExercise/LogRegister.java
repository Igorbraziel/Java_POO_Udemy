package Generics_Set_Map.SetExercise;

import java.util.Set;
import java.util.HashSet;

public class LogRegister {
    private Set<User> userSet = new HashSet<User>();

    public void login(User user){
        userSet.add(user);
    }

    public void logout(User user){
        userSet.remove(user);
    }

    public int userSetSize(){
        return userSet.size();
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }
}