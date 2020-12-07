package com.example.RedditCloneSpringBackend.repository;

import com.example.RedditCloneSpringBackend.model.Comment;
import com.example.RedditCloneSpringBackend.model.Post;
import com.example.RedditCloneSpringBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  CommentRepository extends JpaRepository<Comment, Long>{

//    List<Comment> findByPost(Post post);
//
//    List<Comment> findAllByUser(User user);


}
