package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhdq extends zzhih implements zzhjt {
    private static final zzhdq zzc;
    private static volatile zzhka zzd;
    private int zza;
    private int zzb;

    static {
        zzhdq zzhdqVar = new zzhdq();
        zzc = zzhdqVar;
        zzhih.zzbu(zzhdq.class, zzhdqVar);
    }

    private zzhdq() {
    }

    public static zzhdp zzc() {
        return (zzhdp) zzc.zzbn();
    }

    public static zzhdq zzd() {
        return zzc;
    }

    public final zzhdk zza() {
        int i = this.zza;
        zzhdk zzhdkVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : zzhdk.SHA224 : zzhdk.SHA512 : zzhdk.SHA256 : zzhdk.SHA384 : zzhdk.SHA1 : zzhdk.UNKNOWN_HASH;
        return zzhdkVar == null ? zzhdk.UNRECOGNIZED : zzhdkVar;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhdq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhdp(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzd;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzhdq.class) {
            try {
                zzhicVar = zzd;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzc);
                    zzd = zzhicVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhicVar;
    }

    public final /* synthetic */ void zze(zzhdk zzhdkVar) {
        this.zza = zzhdkVar.zza();
    }

    public final /* synthetic */ void zzg(int i) {
        this.zzb = i;
    }
}
