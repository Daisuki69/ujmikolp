package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.media3.common.util.TimestampAdjuster;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
public final class zzel {

    @GuardedBy("this")
    private long zza;

    @GuardedBy("this")
    private long zzb;

    @GuardedBy("this")
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzel(long j) {
        zzd(0L);
    }

    public static long zzi(long j) {
        return zzeo.zzt(j, 1000000L, 90000L, RoundingMode.DOWN);
    }

    public static long zzj(long j) {
        return zzeo.zzt(j, 90000L, 1000000L, RoundingMode.DOWN);
    }

    public final synchronized long zza() {
        long j = this.zza;
        return (j == Long.MAX_VALUE || j == TimestampAdjuster.MODE_SHARED) ? androidx.media3.common.C.TIME_UNSET : j;
    }

    public final synchronized long zzb() {
        long j;
        try {
            j = this.zzc;
        } catch (Throwable th2) {
            throw th2;
        }
        return j != androidx.media3.common.C.TIME_UNSET ? j + this.zzb : zza();
    }

    public final synchronized long zzc() {
        return this.zzb;
    }

    public final synchronized void zzd(long j) {
        this.zza = j;
        this.zzb = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = androidx.media3.common.C.TIME_UNSET;
    }

    public final synchronized long zze(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        try {
            long j6 = this.zzc;
            if (j6 != androidx.media3.common.C.TIME_UNSET) {
                long jZzj = zzj(j6);
                long j7 = (4294967296L + jZzj) / 8589934592L;
                long j9 = (((-1) + j7) * 8589934592L) + j;
                long j10 = (j7 * 8589934592L) + j;
                j = Math.abs(j9 - jZzj) < Math.abs(j10 - jZzj) ? j9 : j10;
            }
            return zzg(zzi(j));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long zzf(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        long j6 = this.zzc;
        if (j6 != androidx.media3.common.C.TIME_UNSET) {
            long jZzj = zzj(j6);
            long j7 = jZzj / 8589934592L;
            Long.signum(j7);
            long j9 = (j7 * 8589934592L) + j;
            j = j9 >= jZzj ? j9 : ((j7 + 1) * 8589934592L) + j;
        }
        return zzg(zzi(j));
    }

    public final synchronized long zzg(long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        try {
            if (!zzh()) {
                long jLongValue = this.zza;
                if (jLongValue == TimestampAdjuster.MODE_SHARED) {
                    Long l6 = (Long) this.zzd.get();
                    if (l6 == null) {
                        throw null;
                    }
                    jLongValue = l6.longValue();
                }
                this.zzb = jLongValue - j;
                notifyAll();
            }
            this.zzc = j;
            return j + this.zzb;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean zzh() {
        return this.zzb != androidx.media3.common.C.TIME_UNSET;
    }
}
