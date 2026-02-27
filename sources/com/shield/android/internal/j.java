package com.shield.android.internal;

import android.view.autofill.AutofillId;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAccessor;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class j {
    public static /* bridge */ /* synthetic */ boolean B(Object obj) {
        return obj instanceof Duration;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return Duration.class;
    }

    public static /* bridge */ /* synthetic */ AutofillId g(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return BasicFileAttributes.class;
    }

    public static /* bridge */ /* synthetic */ Duration p(Object obj) {
        return (Duration) obj;
    }

    public static /* bridge */ /* synthetic */ Instant r(Object obj) {
        return (Instant) obj;
    }

    public static /* bridge */ /* synthetic */ TemporalAccessor u(Object obj) {
        return (TemporalAccessor) obj;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof Instant;
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return Instant.class;
    }
}
