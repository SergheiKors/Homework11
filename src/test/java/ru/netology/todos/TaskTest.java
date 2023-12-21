package ru.netology.todos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void shouldShowId() {
        Task id = new Task(0);


        int expected = 0;
        int actual = id.getId();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void TestSimpleTaskMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSimpleTaskNoMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Написать");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestEpicMatches() {
        Epic epic = new Epic(55, new String[]{"Молоко", "Яйца", "Хлеб"});

        boolean actual = epic.matches("Хлеб");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestEpicNoMatches() {
        Epic epic = new Epic(55, new String[]{"Молоко", "Яйца", "Хлеб"});

        boolean actual = epic.matches("Манго");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMeetingTopicMatches() {
        Meeting meeting = new Meeting( 555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");


        boolean actual = meeting.matches("Выкатка 3й версии приложения");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMeetingTopicNoMatches() {
        Meeting meeting = new Meeting( 555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");


        boolean actual = meeting.matches("10я версия приложения");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMeetingProjectMatches() {
        Meeting meeting = new Meeting( 555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");


        boolean actual = meeting.matches("Приложение НетоБанка");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMeetingProjectNoMatches() {
        Meeting meeting = new Meeting( 555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");


        boolean actual = meeting.matches("Не работает");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMeetingNoOneMatches() {
        Meeting meeting = new Meeting( 555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");


        boolean actual = meeting.matches("Во вторник после обеда");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

}
