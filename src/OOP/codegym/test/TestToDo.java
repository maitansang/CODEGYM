package OOP.codegym.test;

import OOP.codegym.todo.Entry;
import OOP.codegym.todo.ToDoList;

public class TestToDo {
    public static void main(String[] args) {
        Entry entry1 = new  Entry(4, "di ngu");
        Entry entry2 = new  Entry(2, "an sang");
        Entry entry3 = new  Entry(1, "danh rang");
        Entry entry4 = new  Entry(3, "ngu trua");
        ToDoList toDoList = new ToDoList();
        toDoList.addEntry(entry1);
        toDoList.addEntry(entry2);
        toDoList.addEntry(entry3);
        toDoList.addEntry(entry4);
        toDoList.sortList();
        toDoList.showTodoList();
    }
}
