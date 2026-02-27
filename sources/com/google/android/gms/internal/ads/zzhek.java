package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhek extends zzhih implements zzhjt {
    private static final zzhek zzb;
    private static volatile zzhka zzc;
    private String zza = "";

    static {
        zzhek zzhekVar = new zzhek();
        zzb = zzhekVar;
        zzhih.zzbu(zzhek.class, zzhekVar);
    }

    private zzhek() {
    }

    public static zzhek zzb(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhek) zzhih.zzbT(zzb, zzhhbVar, zzhhrVar);
    }

    public static zzhej zzc() {
        return (zzhej) zzb.zzbn();
    }

    public static zzhek zzd() {
        return zzb;
    }

    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhek();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhej(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzc;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzhek.class) {
            try {
                zzhicVar = zzc;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzb);
                    zzc = zzhicVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhicVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza = str;
    }
}
