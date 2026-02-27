package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class zzghu implements Serializable, zzght {
    final zzght zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzgia zzd = new zzgia();

    public zzghu(zzght zzghtVar) {
        this.zza = zzghtVar;
    }

    public final String toString() {
        Object objQ;
        if (this.zzb) {
            String strValueOf = String.valueOf(this.zzc);
            objQ = We.s.q(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        } else {
            objQ = this.zza;
        }
        String string = objQ.toString();
        return We.s.q(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzght
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
