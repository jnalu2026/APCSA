/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tododriver;

/**
 *
 * @author JNalu2026
 */
import java.util.Arrays;

interface Priority {
    void setPriority(int priority);
    int getPriority();
}

// Complexity interface 
interface Complexity {
    void setComplexity(int complexity);
    int getComplexity();
}

class Task implements Priority, Complexity, Comparable<Task> {
    private String description;
    private int priority;
    private int complexity;

    public Task(String description, int priority, int complexity) {
        this.description = description;
        this.priority = priority;
        this.complexity = complexity;
    }

    // Priority
    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    // Complexity
    @Override
    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    @Override
    public int getComplexity() {
        return complexity;
    }

    // Comparable: priority first, then complexity
    // Here, higher numbers = "more important / more complex"
    @Override
    public int compareTo(Task other) {
        if (this.priority != other.priority) {
            return Integer.compare(other.priority, this.priority); // priority DESC
        }
        return Integer.compare(other.complexity, this.complexity); // complexity DESC
    }

    @Override
    public String toString() {
        return String.format("Task: %-20s priority=%d complexity=%d",
                description, priority, complexity);
    }
}

public class ToDoDriver {
    public static void main(String[] args) {
        Task[] tasks = {
            new Task("APUSH study", 5, 4),
            new Task("Fix Car", 4, 3),
            new Task("Walk the dog", 5, 2),
            new Task("Laundry", 2, 1),
            new Task("Help Papa with Yardwork", 4, 5)
        };

        Arrays.sort(tasks); // uses Task.compareTo()

        System.out.println("Ranked by priority, then complexity:");
        for (Task t : tasks) {
            System.out.println(t);
        }
    }
}

