package main;

public class StringBufferBuilder {
    public static void main(String[] args) {
        int N = 777777;
        long t;

        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            for (int i = N; i-- > 0; ) {
                sb.append("This is the string 1.");
            }
            System.out.println(System.currentTimeMillis() - t);
        }

        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            for (int i = N; i < N; i++) {
                sb.append("This is the string 2.");
            }
            System.out.println(System.currentTimeMillis() - t);
        }
    }
}
