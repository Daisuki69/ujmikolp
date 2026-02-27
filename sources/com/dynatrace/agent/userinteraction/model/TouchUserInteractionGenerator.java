package com.dynatrace.agent.userinteraction.model;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface TouchUserInteractionGenerator {
    TouchUserInteraction generateCompose(List<TouchEvent> list, ComposeHitEvent composeHitEvent);

    TouchUserInteraction generateNative(List<TouchEvent> list, ViewGroup viewGroup, View view);
}
