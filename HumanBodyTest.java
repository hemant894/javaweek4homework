package javaweek4Homework;

public class HumanBodyTest {
    public static void main(String[] args) {
        System.out.println("  HumanBody");
        System.out.println("============");
        HumanBody h = new HumanBody();
        h.eat();
        h.run();
        h.earn();
        h.sleep();

        System.out.println("===================================");
        System.out.println(" Human Adult");
        System.out.println("==============");
        HumanAdult a= new HumanAdult();
        a.earn();
        a.eat();
        a.run();
        a.sleep();

        System.out.println("========================================================");
        System.out.println(" HumanChild");
        HumanChild c = new HumanChild();
        c.study();
        c.play();
        c.eat();
        c.run();
        c.sleep();

        System.out.println("=====================================================");
        System.out.println(" HumanBaby");
        HumanBaby b= new HumanBaby();
        b.Hungry();
        b.move();
        b.earn();
        b.run();
        b.sleep();

        System.out.println("=====================================================");





    }
}