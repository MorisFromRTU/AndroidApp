package ru.mirea.martirosyan.room3;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {MainActivity.Employee.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MainActivity.EmployeeDao employeeDao();
}