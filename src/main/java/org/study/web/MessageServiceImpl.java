package org.study.web;

import org.study.service.MessageService;

public class MessageServiceImpl implements MessageService {
    @Override
    public String getMessage() {
        return "Hello world";
    }


}
