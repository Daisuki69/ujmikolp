package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhct extends zzhih implements zzhjt {
    private static final zzhct zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb;
    private zzhcx zzc;
    private zzhhb zzd = zzhhb.zzb;

    static {
        zzhct zzhctVar = new zzhct();
        zze = zzhctVar;
        zzhih.zzbu(zzhct.class, zzhctVar);
    }

    private zzhct() {
    }

    public static zzhct zzd(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhct) zzhih.zzbT(zze, zzhhbVar, zzhhrVar);
    }

    public static zzhcs zze() {
        return (zzhcs) zze.zzbn();
    }

    public static zzhka zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhcx zzb() {
        zzhcx zzhcxVar = this.zzc;
        return zzhcxVar == null ? zzhcx.zzc() : zzhcxVar;
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
            return new zzhct();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhcs(bArr);
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
        synchronized (zzhct.class) {
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

    public final /* synthetic */ void zzh(zzhcx zzhcxVar) {
        zzhcxVar.getClass();
        this.zzc = zzhcxVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzi(zzhhb zzhhbVar) {
        this.zzd = zzhhbVar;
    }
}
