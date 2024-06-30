package ru.gb.post;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    /**
     * Используя hibernate, создать таблицы:
     * 1. Post (публикация) (id, title)
     * 2. PostComment (комментарий к публикации) (id, text, post_id)
     * <p>
     * Написать стандартные CRUD-методы: создание, загрузка, удаление.
     * <p>
     * Доп. задания:
     * 1. * В сущностях post и postComment добавить поля timestamp с датами.
     * 2. * Создать таблицу users(id, name) и в сущностях post и postComment добавить ссылку на юзера.
     * 3. * Реализовать методы:
     * 3.1 Загрузить все комментарии публикации
     * 3.2 Загрузить все публикации по идентификатору юзера
     * 3.3 ** Загрузить все комментарии по идентификатору юзера
     * 3.4 **** По идентификатору юзера загрузить юзеров, под чьими публикациями он оставлял комменты.
     * // userId -> List<User>
     * <p>
     * <p>
     * Замечание:
     * 1. Можно использовать ЛЮБУЮ базу данных (например, h2)
     * 2. Если запутаетесь, приходите в группу в телеграме или пишите мне @inchestnov в личку.
     */

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            initTables(sessionFactory);
        }

    }

    private static void initTables(SessionFactory sessionFactory) {
        try (Session session = sessionFactory.openSession()) {
            User user1 = new User();
            user1.setId(1L);
            user1.setName("John");

            User user2 = new User();
            user2.setId(2L);
            user2.setName("Peter");

            Post post1 = new Post();
            post1.setId(1L);
            post1.setTitle("Title #1");
            post1.setUser(user1);

            Post post2 = new Post();
            post2.setId(2L);
            post2.setTitle("Title #2");
            post2.setUser(user2);

            PostComment postComment1 = new PostComment();
            postComment1.setId(1L);
            postComment1.setComment("Comment #1");
            postComment1.setPost(post1);

            PostComment postComment2 = new PostComment();
            postComment2.setId(2L);
            postComment2.setComment("Comment #2");
            postComment2.setPost(post1);

            Transaction tx = session.beginTransaction();
            session.persist(user1);
            session.persist(user2);
            session.persist(post1);
            session.persist(post2);
            session.persist(postComment1);
            session.persist(postComment2);

            tx.commit();
        }
    }
}
