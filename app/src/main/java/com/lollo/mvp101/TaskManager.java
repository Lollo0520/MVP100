package com.lollo.mvp101;

/**
 * Created by Jet Wang on 2016/10/25.
 */
public class TaskManager {
    TaskDataSource dataSource;

    public TaskManager(TaskDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getStringContent() {
        return dataSource.getString();
    }
}
