package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenHiBottThenHiSmartAss() {
        String expected = "Hi, SmartAss.";
        String result = DummyBot.answer("Hi, Bot.");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenByeThenSeeYouLater() {
        String expected = "See you later.";
        String result = DummyBot.answer("Bye.");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Can you add two plus two?";
        String result = DummyBot.answer(in);
        String expected = "I don't know. Please, ask another question.";
        assertThat(result).isEqualTo(expected);
    }
}