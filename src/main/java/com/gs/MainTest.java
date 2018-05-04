package com.gs;

public class MainTest {

    public static void main(String[] args) {
        Task task = new TaskBuilder().setDescription("Hello").setSummary("Test").build();
        System.out.println(task);
    }

}