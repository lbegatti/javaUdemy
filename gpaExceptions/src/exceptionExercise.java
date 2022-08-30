import java.io.IOException;

public class exceptionExercise {

    public static void main(String[] args) {

        try {

            foo();

        } catch (IOException e) {}

        System.out.println("end of main ...");

    }

    private static void foo() throws IOException {

        System.out.println("In foo ...");

        try {

            bar();

            System.out.println("After invoking bar ...");

        } finally {

            System.out.println("finally: foo");

        }

        System.out.println("end of foo ...");

    }

    private static void bar() throws IOException {

        System.out.println("In bar ...");

        try {

            throw new IOException();

        } finally {

            System.out.println("finally: bar");

        }

    }

}
