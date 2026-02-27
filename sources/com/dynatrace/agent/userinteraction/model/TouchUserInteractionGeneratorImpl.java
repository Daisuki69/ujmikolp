package com.dynatrace.agent.userinteraction.model;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class TouchUserInteractionGeneratorImpl implements TouchUserInteractionGenerator {
    private final TouchUserInteractionComposeGenerator composeGenerator;
    private final TouchUserInteractionNativeGenerator nativeGenerator;

    public TouchUserInteractionGeneratorImpl(TouchUserInteractionNativeGenerator nativeGenerator, TouchUserInteractionComposeGenerator composeGenerator) {
        j.g(nativeGenerator, "nativeGenerator");
        j.g(composeGenerator, "composeGenerator");
        this.nativeGenerator = nativeGenerator;
        this.composeGenerator = composeGenerator;
    }

    @Override // com.dynatrace.agent.userinteraction.model.TouchUserInteractionGenerator
    public TouchUserInteraction generateCompose(List<TouchEvent> touchList, ComposeHitEvent composeHitEvent) {
        j.g(touchList, "touchList");
        return this.composeGenerator.generate$com_dynatrace_agent_release(touchList, composeHitEvent);
    }

    @Override // com.dynatrace.agent.userinteraction.model.TouchUserInteractionGenerator
    public TouchUserInteraction generateNative(List<TouchEvent> touchList, ViewGroup rootView, View view) {
        j.g(touchList, "touchList");
        j.g(rootView, "rootView");
        return this.nativeGenerator.generate$com_dynatrace_agent_release(touchList, rootView, view);
    }
}
