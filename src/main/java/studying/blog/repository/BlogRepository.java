package studying.blog.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import studying.blog.domain.Article;

public interface BlogRepository extends JpaRepository<Article,Long> {
}
