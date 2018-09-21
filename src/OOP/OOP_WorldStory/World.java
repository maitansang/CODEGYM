package OOP.OOP_WorldStory;

public class World {
    public static void main(String[] args) {
        System.out.println("======Vườn địa đàng======");
        Human adam = new Human( "Adam",true );
        Human eva = new Human("Eva",false);
         adam.say("Adam được sinh ra");
         eva.say("Eva được sinh ra");
         God.say("Không được ăn táo, nếu ăn sẽ chết");
         Snake.say("Ăn táo đi ngon lắm");
         Apple apple = new Apple();
         apple.weight= 10;
         while(apple.weight>0) {
             eva.eat("Eva Ăn Táo");
             apple.weight--;
             adam.eat("Adam Ăn Táo");
             apple.weight--;
         } if(apple.weight<=0){
             adam.sleep();
             eva.sleep();
        }
        God.say("Eva! bà sẽ phải vâng lời chồng và đau đớn khi sinh con");
         God.say("Adam! ngươi sẽ phải cuốc đất trồng cấy mà ăn");
        System.out.println("-----Hết----");

    }
}
