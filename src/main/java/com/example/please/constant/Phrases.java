package com.example.please.constant;

public interface Phrases {

    String START_NEW_USER = "Ну, привіт! Я бот, який буде фіксувати Вас та інших працівників, " +
            "знаходитесь Ви на робочому місці чи ні але спочатку треба ввести своє ПІБ.";

    String HELP = "/help - показує всі доступні команди\n" +
            "/list_of_sick - список працівників, яку на лікарняному\n" +
            "/list_of_vacation - список працівників, які у відпустці\n" +
            "Можно відправляти всім повідомлення при використанні команди /send (наприкрал: /send Всім бути в укриті!)\n" +
            "На місці – підтвердження того, що Ви на роботі \n" +
            "Список працівників – список робітників, які на роботі\n" +
            "Налаштування\n" +
            "Нагадування\n" +
            "Статус\n" +
            "І на останок можно конвертувати пароль з кирилиці на латиницю просто написавши її";
    String FULL_NAME = "Дякую! Це рання версія (version 2.0) боту, тому доступно поки що декілька дій. " +
            "Для того, щоб дізнатися, які дії є скористайтися командою /help";
    String FULL_NAME_NEW = "Тепер Ви ";

    String START_OLD_USER = "Дорогуша, Ви вже зареєстровані!";

    String ROOM = "На даний час Ви працюєте на вулиці. Якщо ні, то введить кабинеть у якому працюєте (наприклад 666)";
    String PHONE_NUMBER = "У базі не має Вашого телефому, тому введить свой робочий номер телефону (наприклад +380663332211)";

    String UNEXPECTED_MESSAGE = "WHAT ARE YOU DOING HERE!";

    String NOTIFICATION = "На даний час нанадування ";

    String STATUS = "Заряз Ви ";

    String CHOOSE = "Оберить одну зі списку:";
}
