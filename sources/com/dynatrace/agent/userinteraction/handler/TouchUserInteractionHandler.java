package com.dynatrace.agent.userinteraction.handler;

import Ag.l;
import Bj.E;
import Bj.InterfaceC0156n0;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.layout.LayoutInfo;
import cj.r;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSource;
import com.dynatrace.agent.userinteraction.model.ComposeHitEvent;
import com.dynatrace.agent.userinteraction.model.TouchEvent;
import com.dynatrace.agent.userinteraction.model.TouchUserInteraction;
import com.dynatrace.agent.userinteraction.model.TouchUserInteractionGenerator;
import com.dynatrace.agent.userinteraction.model.TouchUserInteractionKt;
import com.dynatrace.agent.userinteraction.util.UserInteractionLogger;
import com.dynatrace.agent.userinteraction.util.UserInteractionTracker;
import com.dynatrace.agent.userinteraction.util.UserInteractionUtilKt;
import com.dynatrace.agent.util.CoroutineHandler;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class TouchUserInteractionHandler extends CoroutineHandler implements UserInteractionHandler {
    public static final Companion Companion = new Companion(null);
    private static final long NO_INTERACTION_DELAY = 500;
    private ComposeHitEvent composeHitEvent;
    private final ServerConfigurationDataSource serverConfigurationDataSource;
    private InterfaceC0156n0 touchEventJob;
    private final TouchUserInteractionGenerator touchUserInteractionGenerator;
    private TouchEvent upTouchEvent;
    private final UserInteractionLogger userInteractionLogger;
    private final UserInteractionTracker userInteractionTracker;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchUserInteractionHandler(E coroutineScope, UserInteractionLogger userInteractionLogger, UserInteractionTracker userInteractionTracker, TouchUserInteractionGenerator touchUserInteractionGenerator, ServerConfigurationDataSource serverConfigurationDataSource) {
        super(coroutineScope);
        j.g(coroutineScope, "coroutineScope");
        j.g(userInteractionLogger, "userInteractionLogger");
        j.g(userInteractionTracker, "userInteractionTracker");
        j.g(touchUserInteractionGenerator, "touchUserInteractionGenerator");
        j.g(serverConfigurationDataSource, "serverConfigurationDataSource");
        this.userInteractionLogger = userInteractionLogger;
        this.userInteractionTracker = userInteractionTracker;
        this.touchUserInteractionGenerator = touchUserInteractionGenerator;
        this.serverConfigurationDataSource = serverConfigurationDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMotionEvent$lambda$0(TouchUserInteractionHandler touchUserInteractionHandler, View view) {
        touchUserInteractionHandler.processTouchEvents((ViewGroup) view, null);
        return Unit.f18162a;
    }

    private final void processTouchEvents(ViewGroup viewGroup, View view) {
        if (!this.serverConfigurationDataSource.getServerConfiguration().isTouchUserInteractionEnabled()) {
            Utility.devLog(OneAgentLoggingKt.TAG_USER_INTERACTION, "Touch User Interaction cannot be tracked, userInteractions config disabled for touches");
            return;
        }
        InterfaceC0156n0 interfaceC0156n0 = this.touchEventJob;
        if (interfaceC0156n0 != null) {
            interfaceC0156n0.b(null);
        }
        if (viewGroup != null) {
            TouchEvent touchEvent = this.upTouchEvent;
            if (touchEvent == null) {
                return;
            }
            TouchUserInteraction touchUserInteractionGenerateCompose = this.touchUserInteractionGenerator.generateCompose(r.c(touchEvent), this.composeHitEvent);
            if (touchUserInteractionGenerateCompose == null) {
                touchUserInteractionGenerateCompose = this.touchUserInteractionGenerator.generateNative(r.c(touchEvent), viewGroup, view);
            }
            if (touchUserInteractionGenerateCompose != null) {
                this.userInteractionLogger.logTouchUserInteraction$com_dynatrace_agent_release(touchUserInteractionGenerateCompose);
                this.userInteractionTracker.track$com_dynatrace_agent_release(TouchUserInteractionKt.toJSONObject(touchUserInteractionGenerateCompose));
            }
        }
        this.upTouchEvent = null;
        this.composeHitEvent = null;
    }

    public final void onComposeHit$com_dynatrace_agent_release(LayoutInfo hitArea, List<? extends LayoutInfo> overlappedAreas, List<? extends List<String>> sequentialList) {
        j.g(hitArea, "hitArea");
        j.g(overlappedAreas, "overlappedAreas");
        j.g(sequentialList, "sequentialList");
        this.composeHitEvent = new ComposeHitEvent(hitArea, overlappedAreas, sequentialList);
    }

    public final void onMotionEvent$com_dynatrace_agent_release(View rootView, MotionEvent event) {
        j.g(rootView, "rootView");
        j.g(event, "event");
        if (rootView instanceof ViewGroup) {
            InterfaceC0156n0 interfaceC0156n0 = this.touchEventJob;
            if (interfaceC0156n0 != null && interfaceC0156n0.isActive()) {
                processTouchEvents((ViewGroup) rootView, null);
            }
            TouchEvent touchEvent = new TouchEvent(UserInteractionUtilKt.getActionName(event), event.getX(0), event.getY(0));
            this.userInteractionLogger.logTouchEvent$com_dynatrace_agent_release(touchEvent);
            if (event.getAction() == 1) {
                this.upTouchEvent = touchEvent;
                this.touchEventJob = launchWithDelay(500L, new l(24, this, rootView));
            }
        }
    }

    public final void onViewClick$com_dynatrace_agent_release(View view) {
        j.g(view, "view");
        View rootView = view.getRootView();
        ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        if (viewGroup == null) {
            return;
        }
        processTouchEvents(viewGroup, view);
    }
}
