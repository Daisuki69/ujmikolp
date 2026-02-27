package com.google.android.gms.internal.ads;

import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes3.dex */
public final class zzce extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzce(String str, zzcc zzccVar) {
        String strValueOf = String.valueOf(zzccVar);
        super(We.s.q(new StringBuilder(str.length() + 1 + strValueOf.length()), str, Global.BLANK, strValueOf));
    }
}
