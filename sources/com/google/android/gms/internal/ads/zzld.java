package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzld {
    private static final zzup zzu = new zzup(new Object(), -1);
    public final zzbe zza;
    public final zzup zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;

    @Nullable
    public final zzhz zzf;
    public final boolean zzg;
    public final zzwq zzh;
    public final zzyn zzi;
    public final List zzj;
    public final zzup zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzau zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzld(zzbe zzbeVar, zzup zzupVar, long j, long j6, int i, @Nullable zzhz zzhzVar, boolean z4, zzwq zzwqVar, zzyn zzynVar, List list, zzup zzupVar2, boolean z5, int i4, int i6, zzau zzauVar, long j7, long j9, long j10, long j11, boolean z8) {
        this.zza = zzbeVar;
        this.zzb = zzupVar;
        this.zzc = j;
        this.zzd = j6;
        this.zze = i;
        this.zzf = zzhzVar;
        this.zzg = z4;
        this.zzh = zzwqVar;
        this.zzi = zzynVar;
        this.zzj = list;
        this.zzk = zzupVar2;
        this.zzl = z5;
        this.zzm = i4;
        this.zzn = i6;
        this.zzo = zzauVar;
        this.zzq = j7;
        this.zzr = j9;
        this.zzs = j10;
        this.zzt = j11;
    }

    public static zzld zza(zzyn zzynVar) {
        zzbe zzbeVar = zzbe.zza;
        zzup zzupVar = zzu;
        return new zzld(zzbeVar, zzupVar, androidx.media3.common.C.TIME_UNSET, 0L, 1, null, false, zzwq.zza, zzynVar, zzgjz.zzi(), zzupVar, false, 1, 0, zzau.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzup zzb() {
        return zzu;
    }

    @CheckResult
    public final zzld zzc(zzup zzupVar, long j, long j6, long j7, long j9, zzwq zzwqVar, zzyn zzynVar, List list) {
        zzup zzupVar2 = this.zzk;
        boolean z4 = this.zzl;
        int i = this.zzm;
        int i4 = this.zzn;
        zzau zzauVar = this.zzo;
        long j10 = this.zzq;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzld(this.zza, zzupVar, j6, j7, this.zze, this.zzf, this.zzg, zzwqVar, zzynVar, list, zzupVar2, z4, i, i4, zzauVar, j10, j9, j, jElapsedRealtime, false);
    }

    @CheckResult
    public final zzld zzd(zzbe zzbeVar) {
        return new zzld(zzbeVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzld zze(int i) {
        return new zzld(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzld zzf(@Nullable zzhz zzhzVar) {
        return new zzld(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzhzVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzld zzg(boolean z4) {
        return new zzld(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z4, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzld zzh(zzup zzupVar) {
        return new zzld(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzupVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzld zzi(boolean z4, int i, int i4) {
        return new zzld(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z4, i, i4, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
