package ser.repo;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface DemoRepo extends CrudRepository<DemoEntity, String>, QuerydslPredicateExecutor<DemoEntity> {

}
