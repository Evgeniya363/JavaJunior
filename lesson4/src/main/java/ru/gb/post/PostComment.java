package ru.gb.post;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "post_comment")
public class PostComment {
    @Id
    @Column(name = "id")
    long id;

    @Column(name = "post")
    Post post;

    @Column(name = "comment")
    String comment;
}
