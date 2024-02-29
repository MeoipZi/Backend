package MeoipZi.loginMeoipZi.repository;

import MeoipZi.loginMeoipZi.domain.CommentOutfit;
import MeoipZi.loginMeoipZi.domain.Scrap;
import MeoipZi.loginMeoipZi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentOutfitRepository extends JpaRepository<CommentOutfit, Long> {
    List<CommentOutfit> findTop3ByUserOrderByCreatedAtDesc(User user);
}
