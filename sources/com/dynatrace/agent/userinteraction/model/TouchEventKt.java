package com.dynatrace.agent.userinteraction.model;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class TouchEventKt {
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.dynatrace.agent.userinteraction.model.TouchEvent> filterDistantTouches(java.util.List<com.dynatrace.agent.userinteraction.model.TouchEvent> r9, int r10) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.userinteraction.model.TouchEventKt.filterDistantTouches(java.util.List, int):java.util.List");
    }

    public static /* synthetic */ List filterDistantTouches$default(List list, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = 100;
        }
        return filterDistantTouches(list, i);
    }

    public static final boolean isInArea(TouchEvent touchEvent, Rect area) {
        j.g(touchEvent, "<this>");
        j.g(area, "area");
        return area.contains-k-4lQ0M(OffsetKt.Offset(touchEvent.getX(), touchEvent.getY()));
    }
}
