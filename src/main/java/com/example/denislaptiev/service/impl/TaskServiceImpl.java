package com.example.denislaptiev.service.impl;

import com.example.denislaptiev.model.Task;
import com.example.denislaptiev.service.inter.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl  implements TaskService {
    @Override
    public void create(Task entity) {

    }

    @Override
    public Task findById(Long id) {
        return null;
    }

    @Override
    public List<Task> findAll() {
        return null;
    }

    @Override
    public Task update(Task entity) {
        return null;
    }

    @Override
    public void delete(Task entity) {

    }
}
