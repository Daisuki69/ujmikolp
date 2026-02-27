package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwj extends zzbe {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;

    @Nullable
    private final zzaj zzf;

    @Nullable
    private final zzae zzg;

    static {
        zzy zzyVar = new zzy();
        zzyVar.zza("SinglePeriodTimeline");
        zzyVar.zzb(Uri.EMPTY);
        zzyVar.zzc();
    }

    public zzwj(long j, long j6, long j7, long j9, long j10, long j11, long j12, boolean z4, boolean z5, boolean z8, @Nullable Object obj, zzaj zzajVar, @Nullable zzae zzaeVar) {
        this.zzc = j9;
        this.zzd = j10;
        this.zze = z4;
        zzajVar.getClass();
        this.zzf = zzajVar;
        this.zzg = zzaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbd zzb(int i, zzbd zzbdVar, long j) {
        zzghc.zzm(i, 1, "index");
        boolean z4 = this.zze;
        zzbdVar.zza(zzbd.zza, this.zzf, null, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, z4, false, this.zzg, 0L, this.zzd, 0, 0, 0L);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbc zzd(int i, zzbc zzbcVar, boolean z4) {
        zzghc.zzm(i, 1, "index");
        zzbcVar.zza(null, z4 ? zzb : null, 0, this.zzc, 0L, zzb.zza, false);
        return zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zze(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final Object zzf(int i) {
        zzghc.zzm(i, 1, "index");
        return zzb;
    }
}
