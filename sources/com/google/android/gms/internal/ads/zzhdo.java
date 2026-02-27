package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhdo extends zzhih implements zzhjt {
    private static final zzhdo zze;
    private static volatile zzhka zzf;
    private int zza;
    private zzhdq zzb;
    private int zzc;
    private int zzd;

    static {
        zzhdo zzhdoVar = new zzhdo();
        zze = zzhdoVar;
        zzhih.zzbu(zzhdo.class, zzhdoVar);
    }

    private zzhdo() {
    }

    public static zzhdo zzd(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhdo) zzhih.zzbT(zze, zzhhbVar, zzhhrVar);
    }

    public static zzhdn zze() {
        return (zzhdn) zze.zzbn();
    }

    public static zzhdo zzg() {
        return zze;
    }

    public final zzhdq zza() {
        zzhdq zzhdqVar = this.zzb;
        return zzhdqVar == null ? zzhdq.zzd() : zzhdqVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhdo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhdn(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzf;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzhdo.class) {
            try {
                zzhicVar = zzf;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zze);
                    zzf = zzhicVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhicVar;
    }

    public final /* synthetic */ void zzh(zzhdq zzhdqVar) {
        zzhdqVar.getClass();
        this.zzb = zzhdqVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzi(int i) {
        this.zzc = i;
    }
}
