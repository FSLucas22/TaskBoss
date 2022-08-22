package com.taskproject.taskboss;
import com.taskproject.taskboss.domain.model.TaskEntity;
import com.taskproject.taskboss.domain.repository.TaskRepository;
import com.taskproject.taskboss.domain.service.TaskService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;


@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness= Strictness.LENIENT)
public class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;
    @InjectMocks
    private TaskService taskService;

    @Test
    @DisplayName("Testa se Task name retorna Success")
    public void findByNameTaskSuccess() {
        TaskEntity task = TaskEntity.builder().name("Primeira tarefa").build();

        Mockito.when(taskService.findByName(any()))
                .thenReturn(List.of(task));

       Assertions.assertEquals("Primeira tarefa", task.getName());
    }
}
