package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawo extends zzaxl {
    private final long zzh;

    public zzawo(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, long j, int i, int i4) {
        super(zzavxVar, "6Tbgi6IQESKZikJOpZcClcVJxza1rhAf3nfasZu/vDcTd3loITpTNbH23xjyLA5L", "g107GCb4k6+PXON8scRHoxvRnyAK9ZOpFHjKTWKkbXc=", zzarwVar, i, 25);
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, null)).longValue();
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            try {
                zzarwVar.zzac(jLongValue);
                long j = this.zzh;
                if (j != 0) {
                    zzarwVar.zzk(jLongValue - j);
                    zzarwVar.zzn(j);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
