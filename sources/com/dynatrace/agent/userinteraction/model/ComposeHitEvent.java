package com.dynatrace.agent.userinteraction.model;

import androidx.compose.ui.layout.LayoutInfo;
import defpackage.AbstractC1414e;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ComposeHitEvent {
    private final LayoutInfo hitArea;
    private final List<LayoutInfo> overlappedAreas;
    private final List<List<String>> sequentialList;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeHitEvent(LayoutInfo hitArea, List<? extends LayoutInfo> overlappedAreas, List<? extends List<String>> sequentialList) {
        j.g(hitArea, "hitArea");
        j.g(overlappedAreas, "overlappedAreas");
        j.g(sequentialList, "sequentialList");
        this.hitArea = hitArea;
        this.overlappedAreas = overlappedAreas;
        this.sequentialList = sequentialList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComposeHitEvent copy$default(ComposeHitEvent composeHitEvent, LayoutInfo layoutInfo, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutInfo = composeHitEvent.hitArea;
        }
        if ((i & 2) != 0) {
            list = composeHitEvent.overlappedAreas;
        }
        if ((i & 4) != 0) {
            list2 = composeHitEvent.sequentialList;
        }
        return composeHitEvent.copy(layoutInfo, list, list2);
    }

    public final LayoutInfo component1() {
        return this.hitArea;
    }

    public final List<LayoutInfo> component2() {
        return this.overlappedAreas;
    }

    public final List<List<String>> component3() {
        return this.sequentialList;
    }

    public final ComposeHitEvent copy(LayoutInfo hitArea, List<? extends LayoutInfo> overlappedAreas, List<? extends List<String>> sequentialList) {
        j.g(hitArea, "hitArea");
        j.g(overlappedAreas, "overlappedAreas");
        j.g(sequentialList, "sequentialList");
        return new ComposeHitEvent(hitArea, overlappedAreas, sequentialList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposeHitEvent)) {
            return false;
        }
        ComposeHitEvent composeHitEvent = (ComposeHitEvent) obj;
        return j.b(this.hitArea, composeHitEvent.hitArea) && j.b(this.overlappedAreas, composeHitEvent.overlappedAreas) && j.b(this.sequentialList, composeHitEvent.sequentialList);
    }

    public final LayoutInfo getHitArea() {
        return this.hitArea;
    }

    public final List<LayoutInfo> getOverlappedAreas() {
        return this.overlappedAreas;
    }

    public final List<List<String>> getSequentialList() {
        return this.sequentialList;
    }

    public int hashCode() {
        return this.sequentialList.hashCode() + AbstractC1414e.d(this.overlappedAreas, this.hitArea.hashCode() * 31, 31);
    }

    public String toString() {
        return "ComposeHitEvent(hitArea=" + this.hitArea + ", overlappedAreas=" + this.overlappedAreas + ", sequentialList=" + this.sequentialList + ')';
    }
}
