package ru.gb.post;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import static java.time.LocalDate.now;

@Entity
@Table(name = "post_comment")
public class PostComment {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name="timestamp")
    LocalDate timestamp;
    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private MyUser myUser;

    @Column(name = "comment")
    String comment;

    public PostComment() {
        timestamp = now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public MyUser getMyUser() {
        return myUser;
    }

    public void setMyUser(MyUser myUser) {
        this.myUser = myUser;
    }

    @Override
    public String toString() {
        return "PostComment{" +
                "id=" + id +
                ", timestamp=" + timestamp +
//                ", post=" + post +
                ", comment='" + comment + '\'' +
                '}';
    }
}
