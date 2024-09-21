package sept.task;

public class ex_18092024_task1 {

    public static void main(String[] args) {

        int a =10;
        System.out.println(  --a + a--  + a--);

        System.out.println(a);

        // A -> --a -> 9, a=9
        // + -> operator
        // B -> a-- -> 8, a=9
        // + -> operator
        //C -> a-- -> 7, a=9

        int b = 10;
        System.out.println(  --b + b++ + b--);
        System.out.println(b);

        // A ->--b -> 9, b=9
        // + operator
        // B -> b++ -> 9, b=10
        // +
        // C -> b-- -> 10, b=9

        int c = 10;
        System.out.println(  c-- + c --  + c --);
        System.out.println(c);

        // A -> c-- ->10, c=9
        // + operater
        //B -> c-- -> 9, c=8
        //+ operator
        //C -> c-- -> 8, c=7





    }
}
