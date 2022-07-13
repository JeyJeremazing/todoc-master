package com.cleanup.todoc.database.dao;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.cleanup.todoc.model.Project;
import com.cleanup.todoc.model.Task;

import java.util.List;

@Dao
public interface TaskDao {

    @Query("SELECT * FROM Task WHERE id = :projectId")
    LiveData<List<Task>> getTask(long projectId);

    @Insert
    long insertTask(Project project);

    @Update
    int updateTask(Project project);

    @Query("DELETE FROM Task WHERE id = :projectId")
    int deleteTask(long projectId);
}
