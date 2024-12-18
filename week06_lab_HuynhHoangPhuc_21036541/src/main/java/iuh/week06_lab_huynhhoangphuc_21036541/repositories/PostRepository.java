package iuh.week06_lab_huynhhoangphuc_21036541.repositories;


import iuh.week06_lab_huynhhoangphuc_21036541.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByAuthorId(Long authorId);
}