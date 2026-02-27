package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzace {
    public static final zzace zza = new zzace(-3, androidx.media3.common.C.TIME_UNSET, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzace(int i, long j, long j6) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j6;
    }

    public static zzace zza(long j, long j6) {
        return new zzace(-1, j, j6);
    }

    public static zzace zzb(long j, long j6) {
        return new zzace(-2, j, j6);
    }

    public static zzace zzc(long j) {
        return new zzace(0, androidx.media3.common.C.TIME_UNSET, j);
    }

    public final /* synthetic */ int zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }
}
