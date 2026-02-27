package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhcn extends zzhih implements zzhjt {
    private static final zzhcn zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb;
    private zzhcr zzc;
    private zzhhb zzd = zzhhb.zzb;

    static {
        zzhcn zzhcnVar = new zzhcn();
        zze = zzhcnVar;
        zzhih.zzbu(zzhcn.class, zzhcnVar);
    }

    private zzhcn() {
    }

    public static zzhcm zzd() {
        return (zzhcm) zze.zzbn();
    }

    public static zzhcn zze() {
        return zze;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhcr zzb() {
        zzhcr zzhcrVar = this.zzc;
        return zzhcrVar == null ? zzhcr.zzc() : zzhcrVar;
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
            return new zzhcn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhcm(bArr);
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
        synchronized (zzhcn.class) {
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

    public final /* synthetic */ void zzg(zzhcr zzhcrVar) {
        zzhcrVar.getClass();
        this.zzc = zzhcrVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzh(zzhhb zzhhbVar) {
        this.zzd = zzhhbVar;
    }
}
