package com.example.RedditCloneSpringBackend.repository;

import com.example.RedditCloneSpringBackend.model.Post;
import com.example.RedditCloneSpringBackend.model.User;
import com.example.RedditCloneSpringBackend.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface  VoteRepository extends JpaRepository<Vote, Long> {
//    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
