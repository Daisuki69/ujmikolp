package com.dynatrace.android.compose;

import We.s;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class ToggleableInfo {
    public static final int $stable = 0;
    private final Role role;
    private final String sourceName;
    private final ToggleableState state;

    public /* synthetic */ ToggleableInfo(ToggleableState toggleableState, Role role, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(toggleableState, role, str);
    }

    /* JADX INFO: renamed from: getRole-RLKlGQI, reason: not valid java name */
    public final Role m173getRoleRLKlGQI() {
        return this.role;
    }

    public final String getSourceName() {
        return this.sourceName;
    }

    public final ToggleableState getState() {
        return this.state;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ToggleableInfo(state=");
        sb2.append(this.state);
        sb2.append(", role=");
        sb2.append(this.role);
        sb2.append(", sourceName='");
        return s.p(sb2, this.sourceName, "')");
    }

    private ToggleableInfo(ToggleableState state, Role role, String sourceName) {
        j.g(state, "state");
        j.g(sourceName, "sourceName");
        this.state = state;
        this.role = role;
        this.sourceName = sourceName;
    }
}
