package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class zzug {
    private static final AtomicLong zza = new AtomicLong();

    public zzug(long j, zzge zzgeVar, Uri uri, Map map, long j6, long j7, long j9) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }

    public zzug(long j, zzge zzgeVar, long j6) {
        Uri uri = zzgeVar.zza;
    }
}
