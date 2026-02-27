package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzqx {

    @Nullable
    private Exception zza;
    private long zzb = androidx.media3.common.C.TIME_UNSET;
    private long zzc = androidx.media3.common.C.TIME_UNSET;

    public final void zza(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zza == null) {
            this.zza = exc;
        }
        if (this.zzb == androidx.media3.common.C.TIME_UNSET && !zzrc.zzH()) {
            this.zzb = 200 + jElapsedRealtime;
        }
        long j = this.zzb;
        if (j == androidx.media3.common.C.TIME_UNSET || jElapsedRealtime < j) {
            this.zzc = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.zza;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.zza;
        zzc();
        throw exc3;
    }

    public final boolean zzb() {
        if (this.zza == null) {
            return false;
        }
        return zzrc.zzH() || SystemClock.elapsedRealtime() < this.zzc;
    }

    public final void zzc() {
        this.zza = null;
        this.zzb = androidx.media3.common.C.TIME_UNSET;
        this.zzc = androidx.media3.common.C.TIME_UNSET;
    }
}
