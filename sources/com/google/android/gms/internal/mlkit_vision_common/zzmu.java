package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmu {
    @WorkerThread
    public static void zza(zzmj zzmjVar, int i, int i4, long j, int i6, int i10, int i11, int i12) {
        zzmjVar.zzc(zzc(i, i4, j, i6, i10, i11, i12), zziv.INPUT_IMAGE_CONSTRUCTION);
    }

    @WorkerThread
    public static void zzb(zzmj zzmjVar, int i, int i4, long j, int i6, int i10, int i11, int i12) {
        zzmjVar.zzc(zzc(i, i4, j, i6, i10, i11, i12), zziv.ODML_IMAGE);
    }

    private static zzmt zzc(int i, int i4, long j, int i6, int i10, int i11, int i12) {
        return new zzmt(i, i4, i11, i6, i10, SystemClock.elapsedRealtime() - j, i12);
    }
}
