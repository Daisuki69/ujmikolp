package com.squareup.wire;

import java.time.Instant;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class InstantKt {
    public static final Instant ofEpochSecond(long j, long j6) {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(j, j6);
        j.f(instantOfEpochSecond, "ofEpochSecond(...)");
        return instantOfEpochSecond;
    }
}
