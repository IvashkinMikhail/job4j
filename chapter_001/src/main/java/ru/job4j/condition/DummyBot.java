package ru.job4j.condition;

/**
 * @author Ivashkin MD (ivashkinmd@inbox.ru)
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     *
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String inquestion;
        if ("Привет, Бот.".equals(question)) {
            inquestion = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            inquestion = "До скорой встречи.";
        } else {
            inquestion = "Это ставит меня в тупик. Задайте другой вопрос.";
        }
        return inquestion;
    }
}


