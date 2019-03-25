package com.vinamra.tasks.service;

import com.vinamra.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);

}
