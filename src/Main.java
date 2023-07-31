
public class Main {

    public static void main(String[] args) {

        task1 ();

        task2 ();

        task3 ();

        task4 ();

        task5 ();

        task6 ();

        task7 ();

        task8 ();

    }

    public static void task1 () {

        var dog = 8.0;

        var cat = 3.6;

        var paper = 763789;

        System.out.println("task1\n");

        System.out.println(dog + " " + cat+ " " + paper + "\n");


    }

    public static void task2( ) {

        System.out.println("task2\n");

        var dog = 8.0;

        var cat = 3.6;

        var paper = 763789;

        dog = dog + 4;

        cat = cat + 4;

        paper = paper + 4;

        System.out.println(dog + " " + cat + " " + paper + "\n");

    }

    public static void task3 () {

        System.out.println("task3\n");

        var dog = 8.0;

        var cat = 3.6;

        var paper = 763789;

        dog = dog - 3.5;

        cat = cat - 1.6;

        paper = paper - 7639;

        System.out.println(dog + " " + cat + " " + paper + "\n");

    }

    public static void task4 () {

        System.out.println("task4\n");

        var friend = 19;

        System.out.println(friend + "\n");

        friend = friend + 2;

        System.out.println(friend + "\n");

        friend = friend/3;

        System.out.println(friend + "\n");

    }

    public static void task5 () {

        System.out.println("task5\n");

        var frog = 3.5;

        System.out.println(frog + "\n");

        frog = frog * 10;

        System.out.println(frog + "\n");

        frog = frog / 4;

        System.out.println(frog + "\n");

        frog = frog + 4;

        System.out.println(frog + "\n");


    }

    public static void task6 () {

        System.out.println("task5\n");

        var sportsmen1 = 78.2;

        var sportsmen2 = 82.7;

        System.out.println("Общий вес боксеров " + sportsmen1+sportsmen2 + " кг\n");

        var RaznicaSportsmen = sportsmen2 -sportsmen1;

        System.out.println("Разница в весе боксеров = " + RaznicaSportsmen +"кг\n");


    }

    public static void task7 () {

        System.out.println("task5\n");

        var sportsmen1 = 78.2;

        var sportsmen2 = 82.7;

        var firstWay = sportsmen2 - sportsmen1;

        var secondWay = sportsmen2 % sportsmen1;

        System.out.println(firstWay + " " + secondWay +"\n");

    }

    public static void task8 () {

        System.out.println("task5\n");

        var hourWeak = 640;

        var answer = hourWeak / 8;

        System.out.println("Ответ первой задачи " + answer + "\n");

        answer = hourWeak / (answer + 94);

        System.out.println("Ответ на вторую задачу " + answer);

    }

}
