package ru.suf.testThread004;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int x = 10;
        List<Runnable> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            // ERROR: local variables referenced from a lambda expression must be final or effectively final !!!
            list.add(() -> System.out.println(x + i));
        }

        x = 20;
        list.forEach(Runnable::run);
    }
}
