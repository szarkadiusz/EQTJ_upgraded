package pl.eqtj.DB;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBRepository extends CrudRepository <QuestionsEntity, Long> {
}
