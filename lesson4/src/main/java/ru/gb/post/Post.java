package ru.gb.post;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "post")
public class Post {
    @Id
    long id;

    @Column(name = "title")
    String title;

    @ManyToOne
    User user;
}
