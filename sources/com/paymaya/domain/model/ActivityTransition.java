package com.paymaya.domain.model;

import We.s;
import androidx.annotation.AnimRes;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivityTransition {
    private final int backStackExitAnim;
    private final int backStackReEntryAnim;
    private final int entranceAnim;
    private final int exitAnim;

    public ActivityTransition() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ ActivityTransition copy$default(ActivityTransition activityTransition, int i, int i4, int i6, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = activityTransition.entranceAnim;
        }
        if ((i11 & 2) != 0) {
            i4 = activityTransition.exitAnim;
        }
        if ((i11 & 4) != 0) {
            i6 = activityTransition.backStackExitAnim;
        }
        if ((i11 & 8) != 0) {
            i10 = activityTransition.backStackReEntryAnim;
        }
        return activityTransition.copy(i, i4, i6, i10);
    }

    public final int component1() {
        return this.entranceAnim;
    }

    public final int component2() {
        return this.exitAnim;
    }

    public final int component3() {
        return this.backStackExitAnim;
    }

    public final int component4() {
        return this.backStackReEntryAnim;
    }

    public final ActivityTransition copy(@AnimRes int i, @AnimRes int i4, @AnimRes int i6, @AnimRes int i10) {
        return new ActivityTransition(i, i4, i6, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.entranceAnim == activityTransition.entranceAnim && this.exitAnim == activityTransition.exitAnim && this.backStackExitAnim == activityTransition.backStackExitAnim && this.backStackReEntryAnim == activityTransition.backStackReEntryAnim;
    }

    public final int getBackStackExitAnim() {
        return this.backStackExitAnim;
    }

    public final int getBackStackReEntryAnim() {
        return this.backStackReEntryAnim;
    }

    public final int getEntranceAnim() {
        return this.entranceAnim;
    }

    public final int getExitAnim() {
        return this.exitAnim;
    }

    public int hashCode() {
        return (((((this.entranceAnim * 31) + this.exitAnim) * 31) + this.backStackExitAnim) * 31) + this.backStackReEntryAnim;
    }

    public final boolean isSystemEntrance() {
        return this.entranceAnim == 0;
    }

    public final boolean isSystemExit() {
        return this.exitAnim == 0;
    }

    public String toString() {
        int i = this.entranceAnim;
        int i4 = this.exitAnim;
        int i6 = this.backStackExitAnim;
        int i10 = this.backStackReEntryAnim;
        StringBuilder sbU = s.u("ActivityTransition(entranceAnim=", i, ", exitAnim=", i4, ", backStackExitAnim=");
        sbU.append(i6);
        sbU.append(", backStackReEntryAnim=");
        sbU.append(i10);
        sbU.append(")");
        return sbU.toString();
    }

    public ActivityTransition(@AnimRes int i, @AnimRes int i4, @AnimRes int i6, @AnimRes int i10) {
        this.entranceAnim = i;
        this.exitAnim = i4;
        this.backStackExitAnim = i6;
        this.backStackReEntryAnim = i10;
    }

    public /* synthetic */ ActivityTransition(int i, int i4, int i6, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i, (i11 & 2) != 0 ? 0 : i4, (i11 & 4) != 0 ? 0 : i6, (i11 & 8) != 0 ? 0 : i10);
    }
}
