package com.dynatrace.agent.userinteraction.model;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class DTUserInteractionsModifierKt {
    public static final Modifier dynatraceUserInteractionsId(Modifier modifier, String customId) {
        j.g(modifier, "<this>");
        j.g(customId, "customId");
        Modifier dTUserInteractionsModifier = new DTUserInteractionsModifier();
        dTUserInteractionsModifier.setCustomId(customId);
        return modifier.then(dTUserInteractionsModifier);
    }

    public static final Modifier dynatraceUserInteractionsName(Modifier modifier, String customName) {
        j.g(modifier, "<this>");
        j.g(customName, "customName");
        Modifier dTUserInteractionsModifier = new DTUserInteractionsModifier();
        dTUserInteractionsModifier.setCustomName(customName);
        return modifier.then(dTUserInteractionsModifier);
    }
}
