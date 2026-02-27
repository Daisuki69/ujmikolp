package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfwc extends zzhih implements zzhjt {
    private static final zzfwc zzc;
    private static volatile zzhka zzd;
    private int zza;
    private zzara zzb;

    static {
        zzfwc zzfwcVar = new zzfwc();
        zzc = zzfwcVar;
        zzhih.zzbu(zzfwc.class, zzfwcVar);
    }

    private zzfwc() {
    }

    public static zzfwb zza() {
        return (zzfwb) zzc.zzbn();
    }

    public final /* synthetic */ void zzb(zzara zzaraVar) {
        zzaraVar.getClass();
        this.zzb = zzaraVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfwc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfwb(bArr);
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
        synchronized (zzfwc.class) {
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
