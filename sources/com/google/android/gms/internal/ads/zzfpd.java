package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfpd extends zzhih implements zzhjt {
    private static final zzfpd zzf;
    private static volatile zzhka zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private zzfpa zze;

    static {
        zzfpd zzfpdVar = new zzfpd();
        zzf = zzfpdVar;
        zzhih.zzbu(zzfpd.class, zzfpdVar);
    }

    private zzfpd() {
    }

    public static zzfpb zza() {
        return (zzfpb) zzf.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzc(zzfpa zzfpaVar) {
        zzfpaVar.getClass();
        this.zze = zzfpaVar;
        this.zza |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", zzfpc.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzfpd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfpb(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzg;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzfpd.class) {
            try {
                zzhicVar = zzg;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzf);
                    zzg = zzhicVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhicVar;
    }

    public final /* synthetic */ void zze(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}
