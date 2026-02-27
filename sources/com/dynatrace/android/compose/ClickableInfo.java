package com.dynatrace.android.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class ClickableInfo {
    public static final int $stable = 0;
    private final Function0<Object> function;
    private final String interactionType;
    private final Role role;

    public /* synthetic */ ClickableInfo(String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, role, function0);
    }

    public final Function0<Object> getFunction() {
        return this.function;
    }

    public final String getInteractionType() {
        return this.interactionType;
    }

    /* JADX INFO: renamed from: getRole-RLKlGQI, reason: not valid java name */
    public final Role m172getRoleRLKlGQI() {
        return this.role;
    }

    public String toString() {
        return "ClickableInfo{interactionType='" + this.interactionType + "', role=" + this.role + ", function=" + this.function.getClass().getName() + '}';
    }

    private ClickableInfo(String interactionType, Role role, Function0<? extends Object> function) {
        j.g(interactionType, "interactionType");
        j.g(function, "function");
        this.interactionType = interactionType;
        this.role = role;
        this.function = function;
    }
}
