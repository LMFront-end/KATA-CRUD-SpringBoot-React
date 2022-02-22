package co.com.sofka.crudSpringBootReact.services;

import co.com.sofka.crudSpringBootReact.models.Todo;
import co.com.sofka.crudSpringBootReact.repositories.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private ITodoRepository itodoRepository;

    // mostrar todos los elementos del Todo
    public Iterable<Todo>list(){
        return itodoRepository.findAll();
    }

    
}
