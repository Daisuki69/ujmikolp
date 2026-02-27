package com.dynatrace.agent.userinteraction.model;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public class DTUserInteractionsModifier extends ModifierNodeElement<DynatraceUIANode> {
    private String customId;
    private String customName;

    public boolean equals(Object obj) {
        j.e(obj, "null cannot be cast to non-null type com.dynatrace.agent.userinteraction.model.DTUserInteractionsModifier");
        DTUserInteractionsModifier dTUserInteractionsModifier = (DTUserInteractionsModifier) obj;
        return j.b(this.customId, dTUserInteractionsModifier.customId) && j.b(this.customName, dTUserInteractionsModifier.customName);
    }

    public final String getCustomId() {
        return this.customId;
    }

    public final String getCustomName() {
        return this.customName;
    }

    public int hashCode() {
        String str = this.customId;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.customName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        j.g(inspectorInfo, "<this>");
        inspectorInfo.setName("DTUserInteractionsModifier");
    }

    public final void setCustomId(String str) {
        this.customId = str;
    }

    public final void setCustomName(String str) {
        this.customName = str;
    }

    public void update(DynatraceUIANode node) {
        j.g(node, "node");
    }

    public DynatraceUIANode create() {
        return new DynatraceUIANode();
    }
}
