package com.project.dreamteam.repository;
import com.project.dreamteam.model.Interest;
import org.springframework.data.mongodb.repository.*;

import java.util.List;

public interface InterestRepository extends MongoRepository<Interest, Long>{

    @Query("{ 'corpId' : ?0 }")
    List<Interest> getInterestByCorpId(String corpId);
}
