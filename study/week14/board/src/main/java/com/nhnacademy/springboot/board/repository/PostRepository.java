package com.nhnacademy.springboot.board.repository;

import com.nhnacademy.springboot.board.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
    Optional<Post> findByIdAndDeleted(Long id, boolean deleted);

    Page<Post> findBy(Pageable pageable);
    @Transactional
    @Modifying
    @Query("update Post set deleted = :deleted where id = :postId")
    void updateByPostId(@Param("postId") Long postId, @Param("deleted") boolean deleted);

}
