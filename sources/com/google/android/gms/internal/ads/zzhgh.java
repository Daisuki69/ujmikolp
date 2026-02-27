package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhgh {
    private final zzhgg zza;

    private zzhgh(zzhgg zzhggVar) {
        this.zza = zzhggVar;
    }

    public static zzhgh zza(byte[] bArr, zzgqt zzgqtVar) {
        return new zzhgh(zzhgg.zza(bArr));
    }

    public static zzhgh zzb(int i) {
        return new zzhgh(zzhgg.zza(zzgzm.zza(i)));
    }

    public final byte[] zzc(zzgqt zzgqtVar) {
        return this.zza.zzc();
    }

    public final int zzd() {
        return this.zza.zzd();
    }
}
