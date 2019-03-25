package com.vinamra.tasks.controller;

import com.vinamra.tasks.domain.Task;
import com.vinamra.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"","/"})
    public Iterable<Task> list(){
        return this.taskService.list();
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task){
        return this.taskService.save(task);
    }

}
