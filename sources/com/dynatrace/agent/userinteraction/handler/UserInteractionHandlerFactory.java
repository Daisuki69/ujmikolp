package com.dynatrace.agent.userinteraction.handler;

import com.dynatrace.agent.userinteraction.handler.UserInteractionHandler;

/* JADX INFO: loaded from: classes2.dex */
public interface UserInteractionHandlerFactory {
    UserInteractionHandler create(UserInteractionHandler.Type type);
}
