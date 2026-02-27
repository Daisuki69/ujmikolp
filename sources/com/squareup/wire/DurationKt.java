package com.squareup.wire;

import java.time.Duration;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class DurationKt {
    public static final Duration durationOfSeconds(long j, long j6) {
        Duration durationOfSeconds = Duration.ofSeconds(j, j6);
        j.f(durationOfSeconds, "ofSeconds(...)");
        return durationOfSeconds;
    }
}
