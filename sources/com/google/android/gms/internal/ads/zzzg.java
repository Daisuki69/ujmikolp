package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzg extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzzg(Throwable th2) {
        String simpleName = th2.getClass().getSimpleName();
        String strConcat = th2.getMessage() != null ? ": ".concat(String.valueOf(th2.getMessage())) : "";
        super(We.s.q(new StringBuilder(strConcat.length() + simpleName.length() + 11), "Unexpected ", simpleName, strConcat), th2);
    }
}
