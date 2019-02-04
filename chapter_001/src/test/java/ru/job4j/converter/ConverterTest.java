package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when65RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(65);
        assertThat(result, is(1));
    }
    @Test
    public void when75RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(75);
        assertThat(result, is(1));
    }
    @Test
    public void when1EuroToRubleThen75() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(75));
    }
    @Test
    public void when1DollarToRubleThen65() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1);
        assertThat(result, is(65));
    }
}