package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhet extends zzhih implements zzhjt {
    private static final zzhet zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb;
    private zzhex zzc;
    private zzhhb zzd = zzhhb.zzb;

    static {
        zzhet zzhetVar = new zzhet();
        zze = zzhetVar;
        zzhih.zzbu(zzhet.class, zzhetVar);
    }

    private zzhet() {
    }

    public static zzhet zzd(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhet) zzhih.zzbT(zze, zzhhbVar, zzhhrVar);
    }

    public static zzhes zze() {
        return (zzhes) zze.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhex zzb() {
        zzhex zzhexVar = this.zzc;
        return zzhexVar == null ? zzhex.zzc() : zzhexVar;
    }

    public final zzhhb zzc() {
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
            return zzhih.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhet();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhes(bArr);
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
        synchronized (zzhet.class) {
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

    public final /* synthetic */ void zzg(zzhex zzhexVar) {
        zzhexVar.getClass();
        this.zzc = zzhexVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzh(zzhhb zzhhbVar) {
        this.zzd = zzhhbVar;
    }
}
