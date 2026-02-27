package com.google.common.util.concurrent;

import O1.AbstractC0505d0;
import S1.r;
import S1.s;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CycleDetectingLockFactory$PotentialDeadlockException extends IllegalStateException {
    static {
        AbstractC0505d0.j(3, s.class.getName(), "com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException", r.class.getName());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        StringBuilder sb2 = new StringBuilder(message);
        for (Throwable cause = null; cause != null; cause = cause.getCause()) {
            sb2.append(", ");
            sb2.append(cause.getMessage());
        }
        return sb2.toString();
    }
}
