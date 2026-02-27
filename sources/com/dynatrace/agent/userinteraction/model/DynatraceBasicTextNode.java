package com.dynatrace.agent.userinteraction.model;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class DynatraceBasicTextNode extends Modifier.Node {
    private final String text;

    public DynatraceBasicTextNode(String text) {
        j.g(text, "text");
        this.text = text;
    }

    public final String getText() {
        return this.text;
    }
}
