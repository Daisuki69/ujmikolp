package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhec extends zzhih implements zzhjt {
    private static final zzhec zzc;
    private static volatile zzhka zzd;
    private int zza;
    private zzhit zzb = zzhih.zzbM();

    static {
        zzhec zzhecVar = new zzhec();
        zzc = zzhecVar;
        zzhih.zzbu(zzhec.class, zzhecVar);
    }

    private zzhec() {
    }

    public static zzhec zze(InputStream inputStream, zzhhr zzhhrVar) throws IOException {
        return (zzhec) zzhih.zzbX(zzc, inputStream, zzhhrVar);
    }

    public static zzhdz zzg() {
        return (zzhdz) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final zzheb zzd(int i) {
        return (zzheb) this.zzb.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzheb.class});
        }
        if (iOrdinal == 3) {
            return new zzhec();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhdz(bArr);
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
        synchronized (zzhec.class) {
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

    public final /* synthetic */ void zzh(int i) {
        this.zza = i;
    }

    public final /* synthetic */ void zzi(zzheb zzhebVar) {
        zzhebVar.getClass();
        zzhit zzhitVar = this.zzb;
        if (!zzhitVar.zza()) {
            this.zzb = zzhih.zzbN(zzhitVar);
        }
        this.zzb.add(zzhebVar);
    }
}
