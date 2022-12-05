import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final static int MIN_LENGTH = 5;

    // Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
    // Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
    // в качестве кода ошибки, иначе - длину массива.
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        throwUncheckedException();
    }
    // 1. обработать
    // 2. кинуть дальше
    private static void throwCheckedException() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    private static void throwUncheckedException() {
        throw new RuntimeException();
    }
}
