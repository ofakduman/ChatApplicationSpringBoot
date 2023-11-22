package com.ofakduman.ChatApplication.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

//Eger bir kisi ciktiginda iletisimden digerlerinide bilgilendirmemiz gerekiyor
@Component
@RequiredArgsConstructor
@Slf4j

public class WebSocketEventListener {

    @EventListener
    public void handleWebSocketDisconnectListener(
            SessionDisconnectEvent event
    ){
        //TODO -- to be implemented
    }
}
