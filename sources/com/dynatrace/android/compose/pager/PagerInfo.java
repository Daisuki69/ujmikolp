package com.dynatrace.android.compose.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class PagerInfo {
    public static final int $stable = 0;
    private final int currentPage;
    private final Orientation orientation;
    private final int previousPage;

    public PagerInfo(int i, int i4, Orientation orientation) {
        j.g(orientation, "orientation");
        this.currentPage = i;
        this.previousPage = i4;
        this.orientation = orientation;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final int getPreviousPage() {
        return this.previousPage;
    }

    public String toString() {
        return "PagerInfo{currentPage=" + this.currentPage + ", previousPage=" + this.previousPage + ", orientation=" + this.orientation + '}';
    }
}
