package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhmr extends zzhih implements zzhjt {
    private static final zzhmr zzc;
    private static volatile zzhka zzd;
    private int zza;
    private String zzb = "";

    static {
        zzhmr zzhmrVar = new zzhmr();
        zzc = zzhmrVar;
        zzhih.zzbu(zzhmr.class, zzhmrVar);
    }

    private zzhmr() {
    }

    public static zzhmq zzc() {
        return (zzhmq) zzc.zzbn();
    }

    public final /* synthetic */ void zzd(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhmr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhmq(bArr);
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
        synchronized (zzhmr.class) {
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
}
