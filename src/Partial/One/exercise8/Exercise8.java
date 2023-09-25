

package coco77.exercise8;

/*"8. You have a list of 6 people with the following information: the name and the value in money they contribute for a bingo card. 
    These people won the jackpot of 1000000, the person who contributed the most money will receive 50% and is in the last 
     position on the list and the other people will share the other 50% equally."*/
public class Exercise8 {

    public static void main(String[] args) {
        
        People people[] = new People[6];
        
        people[0] = new People("Felipe",10000);
        people[1] = new People("Andrey",9000);
        people[2] = new People("Uribe",8000);
        people[3] = new People("Pinto",7000);
        people[4] = new People("Lionel",6000);
        people[5] = new People("Coco77",40000);
        
        People.calculateProfits(people, people.length);
        
    }
}
