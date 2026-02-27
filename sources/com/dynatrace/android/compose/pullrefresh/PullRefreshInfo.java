package com.dynatrace.android.compose.pullrefresh;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class PullRefreshInfo {
    public static final int $stable = 0;
    private final Function0<Unit> onRefresh;

    public PullRefreshInfo(Function0<Unit> onRefresh) {
        j.g(onRefresh, "onRefresh");
        this.onRefresh = onRefresh;
    }

    public final Function0<Unit> getOnRefresh() {
        return this.onRefresh;
    }

    public String toString() {
        return "PullRefreshInfo{, function=" + this.onRefresh.getClass().getName() + '}';
    }
}
