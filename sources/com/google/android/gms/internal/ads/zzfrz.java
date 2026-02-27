package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfrz extends zzhih implements zzhjt {
    private static final zzfrz zzb;
    private static volatile zzhka zzc;
    private zzhjm zza = zzhjm.zza();

    static {
        zzfrz zzfrzVar = new zzfrz();
        zzb = zzfrzVar;
        zzhih.zzbu(zzfrz.class, zzfrzVar);
    }

    private zzfrz() {
    }

    public static zzfrz zzc(InputStream inputStream) throws IOException {
        return (zzfrz) zzhih.zzbW(zzb, inputStream);
    }

    public static zzfrz zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", zzfry.zza});
        }
        if (iOrdinal == 3) {
            return new zzfrz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfrx(bArr);
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
        synchronized (zzfrz.class) {
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

    public final /* synthetic */ Map zze() {
        if (!this.zza.zze()) {
            this.zza = this.zza.zzc();
        }
        return this.zza;
    }
}
