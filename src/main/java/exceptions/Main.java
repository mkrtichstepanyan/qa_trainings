package exceptions;

import java.io.IOException;

public class Main {


    public static void main(String[] args) {


        throw new IdNotFoundException();
    }


    public static void uncheckedException() {
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void checkedException() throws IOException {
        throw new IOException();
    }

    public static void error() {
        throw new StackOverflowError();
    }
}
