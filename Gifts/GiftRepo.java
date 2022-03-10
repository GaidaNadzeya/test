package by.giftt.questions;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GiftRepo extends CrudRepository<Gift,Integer> {
 /*   @Query("select e from gift as e where position('ремонт' in tags) !=0")
 List<Gift> findByGift(String tags);


  */

}
