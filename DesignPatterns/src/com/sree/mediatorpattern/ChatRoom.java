package com.sree.mediatorpattern;

import java.util.Date;

/* Step 1
Create mediator class. */

public class ChatRoom {
public static void showMessage(User user, String message)
{
System .out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
}
}