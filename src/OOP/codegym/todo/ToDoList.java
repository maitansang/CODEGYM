package OOP.codegym.todo;

public class ToDoList {
    Entry []list = new Entry[20];
    int length=0;
    public void showTodoList(){
        for(int i=0;i<length;i++){
            System.out.println("muc uu tien"+list[i].priority+" cong viec "+list[i].notes);
        }
    }
    public void sortList(){
        for (int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                if (list[i].priority<list[j].priority){
                     int temp= i;
                     i=j;
                     j=temp;
                }
            }
        }
    }
//    public boolean removeEntry(int id){
//
//    }
    public void addEntry(Entry entry){
        list[length]=entry;
        length++;
    }
    public void getEntryByID(int id){

    }
}
