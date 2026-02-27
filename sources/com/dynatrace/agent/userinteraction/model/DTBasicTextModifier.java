package com.dynatrace.agent.userinteraction.model;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class DTBasicTextModifier extends ModifierNodeElement<DynatraceBasicTextNode> {
    private String text;

    public DTBasicTextModifier(String text) {
        j.g(text, "text");
        this.text = text;
    }

    public boolean equals(Object obj) {
        j.e(obj, "null cannot be cast to non-null type com.dynatrace.agent.userinteraction.model.DTBasicTextModifier");
        return j.b(this.text, ((DTBasicTextModifier) obj).text);
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + 527;
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        j.g(inspectorInfo, "<this>");
        inspectorInfo.setName("DTBasicTextModifier");
    }

    public final void setText(String str) {
        j.g(str, "<set-?>");
        this.text = str;
    }

    public void update(DynatraceBasicTextNode node) {
        j.g(node, "node");
    }

    public DynatraceBasicTextNode create() {
        return new DynatraceBasicTextNode(this.text);
    }

    public DTBasicTextModifier(AnnotatedString annotatedString) {
        j.g(annotatedString, "annotatedString");
        this.text = annotatedString.getText();
    }
}
