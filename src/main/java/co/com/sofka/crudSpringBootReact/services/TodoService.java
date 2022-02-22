package co.com.sofka.crudSpringBootReact.services;

import co.com.sofka.crudSpringBootReact.models.Todo;
import co.com.sofka.crudSpringBootReact.repositories.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private ITodoRepository itodoRepository;

    // mostrar todos los elementos del Todo
    public Iterable<Todo>list(){
        return itodoRepository.findAll();
    }

    // bucar por id
    public Optional<Todo> findTById(Long id){
        return itodoRepository.findById(id);
    }

    // crear una nueva tarea
    public Todo save(Todo todo){
        return itodoRepository.save(todo);
    }

    // eliminar una tarea
    public void deleteTask(Long id){
        itodoRepository.delete();
    }

    // obtener todo
    public Todo get(Long id){
        // si el id no existe nos muestra una exception
        return itodoRepository.findById(id).orElseThrow();
    }



}
