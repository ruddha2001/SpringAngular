package com.vinamra.tasks.repository;

import com.vinamra.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,Long> {
}
