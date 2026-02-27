package com.dynatrace.android.compose.userinteraction.uitl;

import androidx.compose.ui.layout.LayoutInfo;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class UserInteractionsUtilKt {
    private static final boolean hasSize(LayoutInfo layoutInfo) {
        return layoutInfo.getWidth() > 0 && layoutInfo.getHeight() > 0;
    }

    public static final boolean isValid(LayoutInfo layoutInfo) {
        j.g(layoutInfo, "<this>");
        return layoutInfo.isAttached() && layoutInfo.isPlaced() && hasSize(layoutInfo) && layoutInfo.getCoordinates().isAttached();
    }
}
