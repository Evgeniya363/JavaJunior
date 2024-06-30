package ru.gb;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Lesson4 {
    // create nable ( id bigint primary key, name varchar(256);
    @Entity
    @Table(name = "author")
    public class Author {
        @Id
        @Column(name="id")
        private long id;
        @Column(name="name")
        private String name;

        public Author() {
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
