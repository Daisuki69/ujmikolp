package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzavb extends Exception {
    public zzavb(zzavc zzavcVar) {
        Objects.requireNonNull(zzavcVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzavb(zzavc zzavcVar, Throwable th2) {
        super(th2);
        Objects.requireNonNull(zzavcVar);
    }
}
