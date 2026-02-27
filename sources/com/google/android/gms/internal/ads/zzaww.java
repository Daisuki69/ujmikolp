package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaww extends zzaxl {
    private final zzava zzh;
    private final long zzi;
    private final long zzj;

    public zzaww(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i4, zzava zzavaVar, long j, long j6) {
        super(zzavxVar, "1MiCMWad12oLn5alnMxHwTvbBZm7RpaUcGFZ/LjrpVbPksWcBk53Qc+euKdOo/dG", "/cnUVQvNHFqi3ggOmiA4o/IdQSFHoegJ/H9a2xERT14=", zzarwVar, i, 11);
        this.zzh = zzavaVar;
        this.zzi = j;
        this.zzj = j6;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzava zzavaVar = this.zzh;
        if (zzavaVar != null) {
            zzauy zzauyVar = new zzauy((String) this.zze.invoke(null, zzavaVar.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)));
            zzarw zzarwVar = this.zzd;
            synchronized (zzarwVar) {
                try {
                    zzarwVar.zzf(zzauyVar.zza.longValue());
                    if (zzauyVar.zzb.longValue() >= 0) {
                        zzarwVar.zzW(zzauyVar.zzb.longValue());
                    }
                    if (zzauyVar.zzc.longValue() >= 0) {
                        zzarwVar.zzX(zzauyVar.zzc.longValue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
