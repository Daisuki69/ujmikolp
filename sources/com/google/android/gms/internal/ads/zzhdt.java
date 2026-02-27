package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhdt extends zzhih implements zzhjt {
    private static final zzhdt zzd;
    private static volatile zzhka zze;
    private String zza = "";
    private zzhhb zzb = zzhhb.zzb;
    private int zzc;

    static {
        zzhdt zzhdtVar = new zzhdt();
        zzd = zzhdtVar;
        zzhih.zzbu(zzhdt.class, zzhdtVar);
    }

    private zzhdt() {
    }

    public static zzhdr zzd() {
        return (zzhdr) zzd.zzbn();
    }

    public static zzhdt zze() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzhhb zzb() {
        return this.zzb;
    }

    public final zzhds zzc() {
        int i = this.zzc;
        zzhds zzhdsVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : zzhds.REMOTE : zzhds.ASYMMETRIC_PUBLIC : zzhds.ASYMMETRIC_PRIVATE : zzhds.SYMMETRIC : zzhds.UNKNOWN_KEYMATERIAL;
        return zzhdsVar == null ? zzhds.UNRECOGNIZED : zzhdsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhdt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhdr(bArr);
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
        synchronized (zzhdt.class) {
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

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzh(zzhhb zzhhbVar) {
        zzhhbVar.getClass();
        this.zzb = zzhhbVar;
    }

    public final /* synthetic */ void zzi(zzhds zzhdsVar) {
        this.zzc = zzhdsVar.zza();
    }
}
