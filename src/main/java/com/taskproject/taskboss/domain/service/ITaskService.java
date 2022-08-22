package com.taskproject.taskboss.domain.service;

import com.taskproject.taskboss.domain.model.TaskEntity;

import java.util.List;

public interface ITaskService {
    void createTask(TaskEntity task);
    TaskEntity loadTask(Long taskId);
    void deleteTask (Long taskId);
    void deleteTasks(List<Long> taskIds);
    List<TaskEntity> findByName(String name);
}
