package co.com.sofka.crudSpringBootReact.controllers;


import co.com.sofka.crudSpringBootReact.models.Todo;
import co.com.sofka.crudSpringBootReact.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/task")
public class TodoController {

    /*
     * GET -> Consultar
     * POST -> Crear
     * PUT -> Modificar
     * DELETE -> Eliminar
     * */

    @Autowired
    private TodoService todoService;

    // mostrar todos los elementos del Todo
    @GetMapping
    public Iterable<Todo>list(){
        return todoService.list();
    }

    // bucar por id
    public Optional<Todo> findTById(Long id){
        return todoService.findTById(id);
    }

    // crear una nueva tarea
    public Todo save(Todo todo){
        return todoService.save(todo);
    }

    // eliminar una tarea
    public void deleteTaskById(Long id){
        todoService.deleteTaskById(id);
    }

    // obtener todo
    public Todo get(Long id){
        // si el id no existe nos muestra una exception
        return todoService.get(id);
    }
}
