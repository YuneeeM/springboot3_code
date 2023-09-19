package me.yuni.springboot3.repository;

import me.yuni.springboot3.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Article,Long> {
}
