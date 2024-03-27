package com.example.please.handler;

import com.example.please.constant.Callback;
import com.example.please.constant.Commands;
import com.example.please.notification.Notification;
import com.example.please.user.Status;
import com.example.please.user.User;

public class MessageChecker {

    private MessageChecker(){}

    public static boolean isFullName(String [] stringBuilder, String messageText){
        return stringBuilder.length > 1 && stringBuilder.length < 4 && !(isACommand(messageText)) && !isUnexpectedMessage(messageText);
    }

    public static boolean isPassword(String [] stringBuilder, String messageText){
        return !(isACommand(messageText)) && stringBuilder.length < 2 && isCyrillic(messageText) && messageText.toCharArray().length > 3;
    }

    public static boolean isUnexpectedMessage(String messageText){
        return !(isCyrillic(messageText.replaceAll("\\s",""))) && !isACommand(messageText) && !isPhoneNumber(messageText);
    }

    public static boolean isCyrillic(String iStringToCheck) {
        return iStringToCheck.matches("^[а-яґєіїА-ЯҐЄІЇ0-9.]+$");
    }

    public static boolean isACommand(String message){

        return message.equals(Commands.AT_WORK) || message.equals(Commands.START)
                || message.equals(Commands.HELP) || message.equals(Commands.LIST_OF_EMPLOYEES)
              || message.contains(Commands.SEND) || message.equals(Commands.SETTINGS)
                || message.equals(Callback.LIST_OF_SICK) || message.equals(Callback.LIST_OF_VACATION)
                || message.equals(Commands.START_PRIVATE);
    }

    public static boolean isARoom(String message){
        return message.toCharArray().length == 3;
    }

    public static boolean isPhoneNumber(String message){
        return message.startsWith("+380");
    }

    public static boolean isNotificationAt(User user, Notification notification, String time){
        return (user.getAtWork() == 0 && notification.getTurnOn()
                && notification.getTimeOfNotification().contains(time)
                && user.getStatus().equals(Status.WORK));
    }

}
