package co.com.sofka.crudSpringBootReact.repositories;

import co.com.sofka.crudSpringBootReact.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface ITodoRepository extends CrudRepository<Todo, Long> {

}
