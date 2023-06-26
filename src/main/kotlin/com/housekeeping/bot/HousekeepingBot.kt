package com.housekeeping.bot

import org.springframework.stereotype.Service
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.objects.Update

@Service
class HousekeepingBot : TelegramLongPollingBot("your-bot-token") {

    override fun getBotUsername(): String {
        return "your-bot-username"
    }

    override fun onUpdateReceived(update: Update) {
        val text = update.message.text
    }
}
