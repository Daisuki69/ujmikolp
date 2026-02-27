package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzaiy implements zzajf {
    private final zzaje zza;
    private final long zzb;
    private final long zzc;
    private final zzajj zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaiy(zzajj zzajjVar, long j, long j6, long j7, long j9, boolean z4) {
        zzghc.zza(j >= 0 && j6 > j);
        this.zzd = zzajjVar;
        this.zzb = j;
        this.zzc = j6;
        if (j7 == j6 - j || z4) {
            this.zzf = j9;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzaje();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzajf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zza(com.google.android.gms.internal.ads.zzacv r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiy.zza(com.google.android.gms.internal.ads.zzacv):long");
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final void zzb(long j) {
        long j6 = this.zzf - 1;
        String str = zzeo.zza;
        this.zzh = Math.max(0L, Math.min(j, j6));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    @Nullable
    public final /* bridge */ /* synthetic */ zzadv zzc() {
        byte[] bArr = null;
        if (this.zzf != 0) {
            return new zzaix(this, bArr);
        }
        return null;
    }

    public final /* synthetic */ long zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ zzajj zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zzf;
    }
}
