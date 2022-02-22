package co.com.sofka.crudSpringBootReact.controllers;


import co.com.sofka.crudSpringBootReact.models.Todo;
import co.com.sofka.crudSpringBootReact.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/todo")
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
    @GetMapping("api/todo/list")
    public Iterable<Todo>list(){
        return todoService.list();
    }

    // bucar por id
    /*
    @GetMapping("/id={id}")
    public Optional<Todo> findTById(@PathVariable Long id){
        return todoService.findTById(id);
    }
     */

    // crear una nueva tarea
    @PostMapping("/save")
    public Todo save(@RequestBody Todo todo){
        return todoService.save(todo);
    }

    // actualizar
    @PutMapping("/update")
    public Todo updateTodo(@RequestBody Todo todo){
        return todoService.updateTodo(todo);
    }

    // eliminar una tarea
    @DeleteMapping("/delete/{id}")
    public void deleteTaskById(Long id){
        todoService.deleteTaskById(id);
    }

    // obtener todo por id
    @GetMapping("/id={id}")
    public Todo get(@PathVariable("id") Long id){
        // si el id no existe nos muestra una exception
        return todoService.get(id);
    }
}
