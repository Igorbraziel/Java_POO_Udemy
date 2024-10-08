package Enumerations_Compositions.Exercise2;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
        Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", Post.dateTimeFormatter)
        , "Traveling to New Zealand"
        , "I'm going to visit this wonderful country!",
        12);

        Post p2 = new Post(LocalDateTime.parse("28/07/2018 23:14:19", Post.dateTimeFormatter)
        , "Good night guys"
        , "See you tomorrow",
        5);

        p1.addComment(new Comment("Have a nice trip"));
        p1.addComment(new Comment("Wow that's awesome!"));

        p2.addComment(new Comment("Good night"));
        p2.addComment(new Comment("May The Force be with you"));

        System.out.println(p1);
        System.out.print(p2);
    } 
}
