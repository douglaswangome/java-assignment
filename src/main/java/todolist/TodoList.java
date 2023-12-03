/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;
import java.util.ArrayList;
/**
 *
 * @author Doug
 */
public class TodoList {
    private ArrayList<String> tasks = new ArrayList<>();
    private ArrayList<Boolean> status = new ArrayList<>();
    
    public void addTask (String task) {
        tasks.add(task);
        status.add(false);
    }
    
    public void completeTask (int taskNumber) {
        status.set(taskNumber-1, true);
    }
    
    public void printTodoList () {
        for (int i = 0; i < tasks.size(); i++) {
            String taskStatus = status.get(i) ? "Complete" : "Incomplete";
            System.out.println((i+1) + ". " + tasks.get(i) + " - " + taskStatus);
        }
    }
}
