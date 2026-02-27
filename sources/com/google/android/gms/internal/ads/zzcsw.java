package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcsw {
    private final Object zza = new Object();
    private final ConcurrentHashMap zzb = new ConcurrentHashMap();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();
    private final ConcurrentHashMap zzd = new ConcurrentHashMap();

    @VisibleForTesting
    public zzcsw() {
    }

    public final void zza(String str) {
        synchronized (this.zza) {
            try {
                ConcurrentHashMap concurrentHashMap = this.zzb;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int zzb(String str) {
        Integer num = (Integer) this.zzb.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long zzc(String str) {
        Long l6 = (Long) this.zzd.get(str);
        if (l6 == null) {
            return -1L;
        }
        return l6.longValue();
    }

    public final void zzd(String str, long j) {
        this.zzc.put(str, Long.valueOf(j));
    }

    public final void zze(String str, String str2, long j) {
        ConcurrentHashMap concurrentHashMap = this.zzc;
        Long l6 = (Long) concurrentHashMap.get(str2);
        if (l6 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        this.zzd.put(str, Long.valueOf(j - l6.longValue()));
    }
}
