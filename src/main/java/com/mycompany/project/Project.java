/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project;
import java.util.Scanner;
import todolist.TodoList;

/**
 *
 * @author Doug
 */
public class Project {

    public static void main(String[] args) {
        TodoList myTodoList = new TodoList();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter a task for your Todo list (type 'quit' to stop):");
            String task = scanner.nextLine();
            
            if (task.equalsIgnoreCase("quit")) {
                break;
            }
            
            myTodoList.addTask(task);
        }
        
        System.out.println("Enter the number of the task you want to mark as complete (type 'quit' to stop):");
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            
            int taskNumber = Integer.parseInt(input);
            myTodoList.completeTask(taskNumber);
        }
        
        System.out.println("Your Todo List:");
        myTodoList.printTodoList();
    }   
}
