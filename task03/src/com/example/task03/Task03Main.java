package com.example.task03;

import java.io.IOException;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        Tests tests = new Tests();
        tests.testThrowCheckedException();


    }

    //todo напишите здесь свою корректную реализацию задания
    public static void throwCheckedException() throws IOException {
        throw new IOException();
    }
}