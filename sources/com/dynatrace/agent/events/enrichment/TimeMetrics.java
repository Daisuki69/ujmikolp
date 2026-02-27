package com.dynatrace.agent.events.enrichment;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.a;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeMetrics {
    private final long duration;
    private final long startTime;

    public /* synthetic */ TimeMetrics(long j, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j6);
    }

    /* JADX INFO: renamed from: copy-HG0u8IE$default, reason: not valid java name */
    public static /* synthetic */ TimeMetrics m165copyHG0u8IE$default(TimeMetrics timeMetrics, long j, long j6, int i, Object obj) {
        if ((i & 1) != 0) {
            j = timeMetrics.startTime;
        }
        if ((i & 2) != 0) {
            j6 = timeMetrics.duration;
        }
        return timeMetrics.m167copyHG0u8IE(j, j6);
    }

    public final long component1() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2-UwyO8pc, reason: not valid java name */
    public final long m166component2UwyO8pc() {
        return this.duration;
    }

    /* JADX INFO: renamed from: copy-HG0u8IE, reason: not valid java name */
    public final TimeMetrics m167copyHG0u8IE(long j, long j6) {
        return new TimeMetrics(j, j6, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimeMetrics) {
            TimeMetrics timeMetrics = (TimeMetrics) obj;
            if (this.startTime == timeMetrics.startTime) {
                long j = this.duration;
                long j6 = timeMetrics.duration;
                a.C0097a c0097a = a.f18208b;
                return j == j6;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: getDuration-UwyO8pc, reason: not valid java name */
    public final long m168getDurationUwyO8pc() {
        return this.duration;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        long j = this.startTime;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j6 = this.duration;
        a.C0097a c0097a = a.f18208b;
        return ((int) ((j6 >>> 32) ^ j6)) + i;
    }

    public String toString() {
        return "TimeMetrics(startTime=" + this.startTime + ", duration=" + ((Object) a.h(this.duration)) + ')';
    }

    private TimeMetrics(long j, long j6) {
        this.startTime = j;
        this.duration = j6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TimeMetrics(long j, long j6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            a.f18208b.getClass();
            j6 = 0;
        }
        this(j, j6, null);
    }
}
