package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzheb extends zzhih implements zzhjt {
    private static final zzheb zzf;
    private static volatile zzhka zzg;
    private int zza;
    private zzhdt zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        zzheb zzhebVar = new zzheb();
        zzf = zzhebVar;
        zzhih.zzbu(zzheb.class, zzhebVar);
    }

    private zzheb() {
    }

    public static zzhea zze() {
        return (zzhea) zzf.zzbn();
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzhdt zzb() {
        zzhdt zzhdtVar = this.zzb;
        return zzhdtVar == null ? zzhdt.zze() : zzhdtVar;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzhep zzd() {
        zzhep zzhepVarZzb = zzhep.zzb(this.zze);
        return zzhepVarZzb == null ? zzhep.UNRECOGNIZED : zzhepVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzheb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhea(bArr);
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
        synchronized (zzheb.class) {
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

    public final /* synthetic */ void zzg(zzhdt zzhdtVar) {
        zzhdtVar.getClass();
        this.zzb = zzhdtVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzh(int i) {
        this.zzd = i;
    }

    public final /* synthetic */ void zzi(zzhep zzhepVar) {
        this.zze = zzhepVar.zza();
    }

    public final int zzk() {
        int i = this.zzc;
        int i4 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public final /* synthetic */ void zzl(int i) {
        this.zzc = zzhdu.zza(i);
    }
}
