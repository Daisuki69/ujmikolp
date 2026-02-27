package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzafn extends zzadi {
    private final long zza;

    public zzafn(zzacv zzacvVar, long j) {
        super(zzacvVar);
        zzghc.zza(zzacvVar.zzn() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadi, com.google.android.gms.internal.ads.zzacv
    public final long zzm() {
        return super.zzm() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadi, com.google.android.gms.internal.ads.zzacv
    public final long zzn() {
        return super.zzn() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadi, com.google.android.gms.internal.ads.zzacv
    public final long zzo() {
        return super.zzo() - this.zza;
    }
}
