package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzhgv extends zzhgz {
    private final int zzc;
    private final int zzd;

    public zzhgv(byte[] bArr, int i, int i4) {
        super(bArr);
        zzhhb.zzA(i, i + i4, bArr.length);
        this.zzc = i;
        this.zzd = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgz, com.google.android.gms.internal.ads.zzhhb
    public final byte zza(int i) {
        zzhhb.zzz(i, this.zzd);
        return ((zzhgz) this).zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzhgz, com.google.android.gms.internal.ads.zzhhb
    public final byte zzb(int i) {
        return ((zzhgz) this).zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzhgz, com.google.android.gms.internal.ads.zzhhb
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhgz
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhgz, com.google.android.gms.internal.ads.zzhhb
    public final void zze(byte[] bArr, int i, int i4, int i6) {
        System.arraycopy(((zzhgz) this).zza, this.zzc + i, bArr, i4, i6);
    }
}
