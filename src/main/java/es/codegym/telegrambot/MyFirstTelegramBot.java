package es.codegym.telegrambot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class MyFirstTelegramBot extends MultiSessionTelegramBot {

    public static final String NAME = "MagalyMaratonBot_bot";
    public static final String TOKEN = "6820445741:AAFI6K3OA1uzVKl3Si_RKJiopmXac1c_jJM";

    public MyFirstTelegramBot() {
        super(NAME, TOKEN);
    }

    @Override
    public void onUpdateEventReceived(Update update) {
        // TODO: escribiremos la funcionalidad principal del bot aquí

        if (getMessageText().equals("/start")) {
            sendTextMessageAsync("Hola _futuro_ programador");
        }

        if (getMessageText().contains("Hola")) {
            sendTextMessageAsync("Hola! Cual es tu nombre?");
        }

        if (getMessageText().contains("hola")) {
            sendTextMessageAsync("Hola! Cual es tu nombre?");
        }

        if (getMessageText().contains("me llamo")) {
            sendTextMessageAsync("Encantado de conocerte, soy *Gato*");
        }
        if (getMessageText().contains("mi nombre es")) {
            sendTextMessageAsync("Encantado de conocerte, soy *Gato*");
        }
    }
    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }
}