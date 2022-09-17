package org.orion.bot;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvBuilder;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.security.Key;

public class Bot extends TelegramLongPollingBot {

    SendMessage message = new SendMessage();
    @Override
    public String getBotUsername() {
        return "https://t.me/orion51_bot";
    }

    @Override
    public String getBotToken() {
        Dotenv dotenv = new DotenvBuilder().load();
        return dotenv.get("token");
    }

    @Override
    public void onUpdateReceived(Update update) {

        String command = update.getMessage().getText();

        /**if (command.equals("/run")){
            String text = "Welcome "+ update.getMessage().getFrom().getFirstName();
            SendMessage message = new SendMessage(update.getMessage().getChatId().toString(),text);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
        */

        //I want to apply for join - command

        if (command.equals("/apply")){
            String text = "If you want to be part of orion51,\nPlease read our policy of your privacy.\nLink: https://example.com";
            message.setChatId(update.getMessage().getChatId());
            message.setText(text);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        }

        //I want to know about 051 - command

        if (command.equals("/about")){
            String text = "If you want to know about us,\nYou should read this page.\nLink: https://example.com";
            message.setChatId(update.getMessage().getChatId());
            message.setText(text);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        }


        //I want to learn from 051


        if (command.equals("/learn")){
            String text = "Dear "+update.getMessage().getFrom().getFirstName() +"\nWe don't have much time to teach you something." +
                    "\nBut we will try to build a bot for you.\nYou can join our group for updates about bot."+
                    "\nGroup Link: https://example.com";
            message.setChatId(update.getMessage().getChatId());
            message.setText(text);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        }

        //Requirements for apply

        if (command.equals("/requirements for apply")){
            String text = "Our Requirements are,"+
                    "\n\nName     : Jhon"+
                    "\nUsername   : jhon123"+
                    "\nNumber     : +8801xxxxxx"+
                    "\nMail       : examle@gmail.com"+
                    "\nSkills     : skill1, skill2";
            message.setChatId(update.getMessage().getChatId());
            message.setText(text);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        }

        //i want to report
        if (command.equals("/report")){
            String text = "Thanks dear,"+
                    "\nWe just want to upgrade our services and want to provide you a best experience of @orion51_bot"+
                    " Describe your report in one sms, if you want to include pictures, please upload it anywhere you want and send link in that sms"+
                    "\n\nThanks a lot.";
            message.setChatId(update.getMessage().getChatId());
            message.setText(text);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
