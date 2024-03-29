package meoipzi.meoipzi.scrap.repository;

import meoipzi.meoipzi.login.domain.User;
import meoipzi.meoipzi.outfit.domain.Outfit;
import meoipzi.meoipzi.product.domain.Product;
import meoipzi.meoipzi.scrap.domain.Scrap;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ScrapRepository extends JpaRepository<Scrap, Long> {
    Optional<Scrap> findByUserAndProduct(User user, Product product);
    Optional<Scrap> findByUserAndOutfit(User user, Outfit outfit);

    List<Scrap> findTop3ByUserAndProductNotNullOrderByCreatedAtDesc(User user);
    List<Scrap> findTop3ByUserAndOutfitNotNullOrderByCreatedAtDesc(User user);

    List<Scrap> findAllByUserAndProductNotNullOrderByCreatedAtDesc(User user);
    List<Scrap> findAllByUserAndOutfitNotNullOrderByCreatedAtDesc(User user);
}