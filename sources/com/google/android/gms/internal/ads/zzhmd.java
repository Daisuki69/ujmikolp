package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhmd extends zzhih implements zzhjt {
    private static final zzhmd zzd;
    private static volatile zzhka zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        zzhmd zzhmdVar = new zzhmd();
        zzd = zzhmdVar;
        zzhih.zzbu(zzhmd.class, zzhmdVar);
    }

    private zzhmd() {
    }

    public static zzhmc zzc() {
        return (zzhmc) zzd.zzbn();
    }

    public final /* synthetic */ void zzd(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhmd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhmc(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zze;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzhmd.class) {
            try {
                zzhicVar = zze;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzd);
                    zze = zzhicVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhicVar;
    }

    public final /* synthetic */ void zze(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void zzg(long j) {
        this.zzc = j;
    }
}
