package com.project.dreamteam.repository;
import com.project.dreamteam.model.Interest;
import com.project.dreamteam.model.Wish;
import org.springframework.data.mongodb.repository.*;

import java.util.List;

public interface WishRepository extends MongoRepository<Wish, Long>{
    @Query("{ 'corpId' : ?0 }")
    List<Wish> getWishByCorpId(String corpId);
}
