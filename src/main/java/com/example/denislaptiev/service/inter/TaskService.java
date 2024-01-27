package com.example.denislaptiev.service.inter;

import com.example.denislaptiev.model.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService  extends CrudService<Task,Long>{
}
