package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.MfaTencentErrorResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbe {
    public static final zzbe zza = new zzbb();

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        int iZzj;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbe)) {
            return false;
        }
        zzbe zzbeVar = (zzbe) obj;
        if (zzbeVar.zza() == zza() && zzbeVar.zzc() == zzc()) {
            zzbd zzbdVar = new zzbd();
            zzbc zzbcVar = new zzbc();
            zzbd zzbdVar2 = new zzbd();
            zzbc zzbcVar2 = new zzbc();
            for (int i = 0; i < zza(); i++) {
                if (!zzb(i, zzbdVar, 0L).equals(zzbeVar.zzb(i, zzbdVar2, 0L))) {
                    return false;
                }
            }
            for (int i4 = 0; i4 < zzc(); i4++) {
                if (!zzd(i4, zzbcVar, true).equals(zzbeVar.zzd(i4, zzbcVar2, true))) {
                    return false;
                }
            }
            int iZzk = zzk(true);
            if (iZzk == zzbeVar.zzk(true) && (iZzj = zzj(true)) == zzbeVar.zzj(true)) {
                while (iZzk != iZzj) {
                    int iZzh = zzh(iZzk, 0, true);
                    if (iZzh != zzbeVar.zzh(iZzk, 0, true)) {
                        return false;
                    }
                    iZzk = iZzh;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        zzbd zzbdVar = new zzbd();
        zzbc zzbcVar = new zzbc();
        int iZza = zza() + MfaTencentErrorResult.TENCENT_ERROR_FACE_DETECTION_TIMED_OUT;
        int i4 = 0;
        while (true) {
            i = iZza * 31;
            if (i4 >= zza()) {
                break;
            }
            iZza = i + zzb(i4, zzbdVar, 0L).hashCode();
            i4++;
        }
        int iZzc = zzc() + i;
        for (int i6 = 0; i6 < zzc(); i6++) {
            iZzc = (iZzc * 31) + zzd(i6, zzbcVar, true).hashCode();
        }
        int iZzk = zzk(true);
        while (iZzk != -1) {
            iZzc = (iZzc * 31) + iZzk;
            iZzk = zzh(iZzk, 0, true);
        }
        return iZzc;
    }

    public abstract int zza();

    public abstract zzbd zzb(int i, zzbd zzbdVar, long j);

    public abstract int zzc();

    public abstract zzbc zzd(int i, zzbc zzbcVar, boolean z4);

    public abstract int zze(Object obj);

    public abstract Object zzf(int i);

    public final boolean zzg() {
        return zza() == 0;
    }

    public int zzh(int i, int i4, boolean z4) {
        if (i4 == 0) {
            if (i == zzj(z4)) {
                return -1;
            }
            return i + 1;
        }
        if (i4 == 1) {
            return i;
        }
        if (i4 == 2) {
            return i == zzj(z4) ? zzk(z4) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int zzi(int i, int i4, boolean z4) {
        if (i == zzk(false)) {
            return -1;
        }
        return i - 1;
    }

    public int zzj(boolean z4) {
        if (zzg()) {
            return -1;
        }
        return zza() - 1;
    }

    public int zzk(boolean z4) {
        return zzg() ? -1 : 0;
    }

    public final int zzl(int i, zzbc zzbcVar, zzbd zzbdVar, int i4, boolean z4) {
        int i6 = zzd(i, zzbcVar, false).zzc;
        if (zzb(i6, zzbdVar, 0L).zzo != i) {
            return i + 1;
        }
        int iZzh = zzh(i6, i4, z4);
        if (iZzh == -1) {
            return -1;
        }
        return zzb(iZzh, zzbdVar, 0L).zzn;
    }

    public final Pair zzm(zzbd zzbdVar, zzbc zzbcVar, int i, long j) {
        Pair pairZzn = zzn(zzbdVar, zzbcVar, i, j, 0L);
        pairZzn.getClass();
        return pairZzn;
    }

    @Nullable
    public final Pair zzn(zzbd zzbdVar, zzbc zzbcVar, int i, long j, long j6) {
        zzghc.zzm(i, zza(), "index");
        zzb(i, zzbdVar, j6);
        if (j == androidx.media3.common.C.TIME_UNSET) {
            long j7 = zzbdVar.zzl;
            j = 0;
        }
        int i4 = zzbdVar.zzn;
        zzd(i4, zzbcVar, false);
        while (i4 < zzbdVar.zzo) {
            long j9 = zzbcVar.zze;
            if (j == 0) {
                break;
            }
            int i6 = i4 + 1;
            long j10 = zzd(i6, zzbcVar, false).zze;
            if (j < 0) {
                break;
            }
            i4 = i6;
        }
        zzd(i4, zzbcVar, true);
        long j11 = zzbcVar.zze;
        long j12 = zzbcVar.zzd;
        if (j12 != androidx.media3.common.C.TIME_UNSET) {
            j = Math.min(j, j12 - 1);
        }
        long jMax = Math.max(0L, j);
        Object obj = zzbcVar.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public zzbc zzo(Object obj, zzbc zzbcVar) {
        return zzd(zze(obj), zzbcVar, true);
    }
}
