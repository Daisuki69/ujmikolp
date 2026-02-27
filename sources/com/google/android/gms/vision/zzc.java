package com.google.android.gms.vision;

import android.util.SparseIntArray;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzc {
    private static final Object zza = new Object();
    private static int zzb;
    private final SparseIntArray zzc = new SparseIntArray();
    private final SparseIntArray zzd = new SparseIntArray();

    public final int zza(int i) {
        synchronized (zza) {
            try {
                int i4 = this.zzc.get(i, -1);
                if (i4 != -1) {
                    return i4;
                }
                int i6 = zzb;
                zzb = i6 + 1;
                this.zzc.append(i, i6);
                this.zzd.append(i6, i);
                return i6;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int zzb(int i) {
        int i4;
        synchronized (zza) {
            i4 = this.zzd.get(i);
        }
        return i4;
    }
}
