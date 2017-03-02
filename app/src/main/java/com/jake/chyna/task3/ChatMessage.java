package com.jake.chyna.task3;

/**
 * Created by chyna on 3/3/17.
 */

public class ChatMessage {

    public String text;
    public boolean isMine;// Did I send the message.

    public ChatMessage(String messageString, boolean isMINE) {
        text = messageString;
        isMine = isMINE;
    }
}
