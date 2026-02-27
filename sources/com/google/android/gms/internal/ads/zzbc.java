package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.paymaya.domain.model.MfaTencentErrorResult;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbc {

    @Nullable
    public Object zza;

    @Nullable
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public zzb zzg = zzb.zza;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbc.class.equals(obj.getClass())) {
            zzbc zzbcVar = (zzbc) obj;
            if (Objects.equals(this.zza, zzbcVar.zza) && Objects.equals(this.zzb, zzbcVar.zzb) && this.zzc == zzbcVar.zzc && this.zzd == zzbcVar.zzd && this.zzf == zzbcVar.zzf && Objects.equals(this.zzg, zzbcVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zza;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        int iHashCode2 = ((((iHashCode + MfaTencentErrorResult.TENCENT_ERROR_FACE_DETECTION_TIMED_OUT) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzc;
        long j = this.zzd;
        return this.zzg.hashCode() + (((((iHashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31);
    }

    public final zzbc zza(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j6, zzb zzbVar, boolean z4) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i;
        this.zzd = j;
        this.zze = 0L;
        this.zzg = zzbVar;
        this.zzf = z4;
        return this;
    }

    public final int zzb() {
        int i = this.zzg.zzb;
        return 0;
    }

    public final long zzc(int i) {
        long j = this.zzg.zza(i).zza;
        return 0L;
    }

    public final int zzd(int i) {
        return this.zzg.zza(i).zza(-1);
    }

    public final int zze(long j) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zzf(long j) {
        return -1;
    }

    public final int zzg(int i) {
        return this.zzg.zza(i).zzb;
    }

    public final long zzh(int i, int i4) {
        zza zzaVarZza = this.zzg.zza(i);
        return zzaVarZza.zzb != -1 ? zzaVarZza.zzf[i4] : androidx.media3.common.C.TIME_UNSET;
    }

    public final boolean zzi(int i) {
        zzb();
        if (i != -1) {
            return false;
        }
        this.zzg.zzb(-1);
        return false;
    }

    public final long zzj() {
        long j = this.zzg.zzc;
        return 0L;
    }

    public final boolean zzk(int i) {
        boolean z4 = this.zzg.zza(i).zzi;
        return false;
    }
}
