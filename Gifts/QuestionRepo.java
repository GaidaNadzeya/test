package by.giftt.questions;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface QuestionRepo extends CrudRepository<Question,Integer> {


}
