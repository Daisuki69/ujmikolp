package com.dynatrace.agent.lifecycle.model;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class AppStartupPhaseWithTiming {
    private final AppStartupPhase phase;
    private final long start;

    public AppStartupPhaseWithTiming(AppStartupPhase phase, long j) {
        j.g(phase, "phase");
        this.phase = phase;
        this.start = j;
    }

    public static /* synthetic */ AppStartupPhaseWithTiming copy$default(AppStartupPhaseWithTiming appStartupPhaseWithTiming, AppStartupPhase appStartupPhase, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            appStartupPhase = appStartupPhaseWithTiming.phase;
        }
        if ((i & 2) != 0) {
            j = appStartupPhaseWithTiming.start;
        }
        return appStartupPhaseWithTiming.copy(appStartupPhase, j);
    }

    public final AppStartupPhase component1() {
        return this.phase;
    }

    public final long component2() {
        return this.start;
    }

    public final AppStartupPhaseWithTiming copy(AppStartupPhase phase, long j) {
        j.g(phase, "phase");
        return new AppStartupPhaseWithTiming(phase, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppStartupPhaseWithTiming)) {
            return false;
        }
        AppStartupPhaseWithTiming appStartupPhaseWithTiming = (AppStartupPhaseWithTiming) obj;
        return this.phase == appStartupPhaseWithTiming.phase && this.start == appStartupPhaseWithTiming.start;
    }

    public final AppStartupPhase getPhase() {
        return this.phase;
    }

    public final long getStart() {
        return this.start;
    }

    public int hashCode() {
        int iHashCode = this.phase.hashCode() * 31;
        long j = this.start;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "AppStartupPhaseWithTiming(phase=" + this.phase + ", start=" + this.start + ')';
    }
}
