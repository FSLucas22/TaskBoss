package com.taskproject.taskboss.domain.service;
import com.taskproject.taskboss.domain.model.TaskEntity;
import com.taskproject.taskboss.domain.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class TaskService implements ITaskService {

    private final TaskRepository taskRepository;

    @Override
    public void createTask(TaskEntity task) {
        taskRepository.save(task);
    }

    @Override
    public TaskEntity loadTask(Long taskId) {
        return taskRepository.getById(taskId);
    }

    @Override
    public List<TaskEntity> findByName(String name){
        return taskRepository.findByName(name);
    }

    @Override
    public void deleteTask(Long taskId) {
        taskRepository.deleteById(taskId);
    }

    @Override
    public void deleteTasks(List<Long> taskIds) {
        taskRepository.deleteAllById(taskIds);
    }
}
