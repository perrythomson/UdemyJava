package main.chapter4.chapter4;

public class Mix4 {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;
        Mix4[] m4a = new Mix4[20];
        int x = 0;

        while (x < 9) {
            m4a[x] = new Mix4();
            m4a[x].counter = m4a[x].counter + 1;
            count = count + 1;
            System.out.println("Before maybeNew() " + count);

            count = count + m4a[x].maybeNew(x);
            x = x + 1;
            System.out.println("This is the count now " + count);
        }
        System.out.println(count + " " + m4a[1].counter);
    }

    public int maybeNew(int index) {
        if (index < 5) {
            Mix4 mix4 = new Mix4();
            mix4.counter = mix4.counter + 1;
            return 1;
        }
        return 0;
    }
}
