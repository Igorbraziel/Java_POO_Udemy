package Enumerations_Compositions.Exercise2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

public class Post {
    public static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes; 
    private List<Comment> comments = new ArrayList<>();
    
    public Post(LocalDateTime moment, String title, String content, Integer likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void setMoment(LocalDateTime moment){
        this.moment = moment;
    }

    public LocalDateTime getMoment(){
        return this.moment;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public void setLikes(Integer likes){
        this.likes = likes;
    }

    public Integer getLikes(){
        return this.likes;
    }

    public void addComment(Comment comment){
        this.comments.add(comment);
    }

    public String returnComments(){
        String commentsString = "";
        for(Comment comment : this.comments){
            commentsString += comment.getText() + "\n";
        }
        return commentsString;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.title + "\n");
        stringBuilder.append(this.likes + " Likes - " + this.moment.format(dateTimeFormatter) + "\n");
        stringBuilder.append(this.content + "\n");
        stringBuilder.append("Comments:\n" + this.returnComments());
        return stringBuilder.toString();
    }
}
