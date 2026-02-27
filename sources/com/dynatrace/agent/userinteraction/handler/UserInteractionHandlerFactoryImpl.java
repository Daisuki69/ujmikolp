package com.dynatrace.agent.userinteraction.handler;

import Bj.E;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.L;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSource;
import com.dynatrace.agent.userinteraction.handler.UserInteractionHandler;
import com.dynatrace.agent.userinteraction.handler.UserInteractionHandlerFactoryImpl;
import com.dynatrace.agent.userinteraction.model.TouchUserInteractionGenerator;
import com.dynatrace.agent.userinteraction.util.UserInteractionLogger;
import com.dynatrace.agent.userinteraction.util.UserInteractionTracker;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class UserInteractionHandlerFactoryImpl implements UserInteractionHandlerFactory {
    private final E coroutineScope;
    private final Map<UserInteractionHandler.Type, Function0<UserInteractionHandler>> handlerCreators;
    private final ServerConfigurationDataSource serverConfigurationDataSource;
    private final TouchUserInteractionGenerator touchUserInteractionGenerator;
    private final InterfaceC1033d touchUserInteractionHandler$delegate;
    private final UserInteractionLogger userInteractionLogger;
    private final UserInteractionTracker userInteractionTracker;

    public UserInteractionHandlerFactoryImpl(E coroutineScope, UserInteractionLogger userInteractionLogger, UserInteractionTracker userInteractionTracker, TouchUserInteractionGenerator touchUserInteractionGenerator, ServerConfigurationDataSource serverConfigurationDataSource) {
        j.g(coroutineScope, "coroutineScope");
        j.g(userInteractionLogger, "userInteractionLogger");
        j.g(userInteractionTracker, "userInteractionTracker");
        j.g(touchUserInteractionGenerator, "touchUserInteractionGenerator");
        j.g(serverConfigurationDataSource, "serverConfigurationDataSource");
        this.coroutineScope = coroutineScope;
        this.userInteractionLogger = userInteractionLogger;
        this.userInteractionTracker = userInteractionTracker;
        this.touchUserInteractionGenerator = touchUserInteractionGenerator;
        this.serverConfigurationDataSource = serverConfigurationDataSource;
        final int i = 0;
        this.touchUserInteractionHandler$delegate = C1034e.b(new Function0(this) { // from class: x0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserInteractionHandlerFactoryImpl f20854b;

            {
                this.f20854b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return UserInteractionHandlerFactoryImpl.touchUserInteractionHandler_delegate$lambda$0(this.f20854b);
                    default:
                        return this.f20854b.getTouchUserInteractionHandler();
                }
            }
        });
        final int i4 = 1;
        this.handlerCreators = L.c(new Pair(UserInteractionHandler.Type.TOUCH, new Function0(this) { // from class: x0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserInteractionHandlerFactoryImpl f20854b;

            {
                this.f20854b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return UserInteractionHandlerFactoryImpl.touchUserInteractionHandler_delegate$lambda$0(this.f20854b);
                    default:
                        return this.f20854b.getTouchUserInteractionHandler();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TouchUserInteractionHandler getTouchUserInteractionHandler() {
        return (TouchUserInteractionHandler) this.touchUserInteractionHandler$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TouchUserInteractionHandler touchUserInteractionHandler_delegate$lambda$0(UserInteractionHandlerFactoryImpl userInteractionHandlerFactoryImpl) {
        return new TouchUserInteractionHandler(userInteractionHandlerFactoryImpl.coroutineScope, userInteractionHandlerFactoryImpl.userInteractionLogger, userInteractionHandlerFactoryImpl.userInteractionTracker, userInteractionHandlerFactoryImpl.touchUserInteractionGenerator, userInteractionHandlerFactoryImpl.serverConfigurationDataSource);
    }

    @Override // com.dynatrace.agent.userinteraction.handler.UserInteractionHandlerFactory
    public UserInteractionHandler create(UserInteractionHandler.Type handlerType) {
        UserInteractionHandler userInteractionHandler;
        j.g(handlerType, "handlerType");
        Function0<UserInteractionHandler> function0 = this.handlerCreators.get(handlerType);
        if (function0 != null && (userInteractionHandler = (UserInteractionHandler) function0.invoke()) != null) {
            return userInteractionHandler;
        }
        throw new IllegalArgumentException("Unknown handler type: " + handlerType);
    }
}
