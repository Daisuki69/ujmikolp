package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzaps {
    public static final boolean zza = zzapt.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzapt.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzapr(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        this.zzc = true;
        List<zzapr> list = this.zzb;
        long j = list.size() == 0 ? 0L : ((zzapr) list.get(list.size() - 1)).zzc - ((zzapr) list.get(0)).zzc;
        if (j > 0) {
            long j6 = ((zzapr) list.get(0)).zzc;
            zzapt.zzb("(%-4d ms) %s", Long.valueOf(j), str);
            for (zzapr zzaprVar : list) {
                long j7 = zzaprVar.zzc;
                zzapt.zzb("(+%-4d) [%2d] %s", Long.valueOf(j7 - j6), Long.valueOf(zzaprVar.zzb), zzaprVar.zza);
                j6 = j7;
            }
        }
    }
}
