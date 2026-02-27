package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzghw implements zzght {
    private static final zzght zzb = zzghv.zza;
    private final zzgia zza = new zzgia();
    private volatile zzght zzc;
    private Object zzd;

    public zzghw(zzght zzghtVar) {
        this.zzc = zzghtVar;
    }

    public final String toString() {
        Object objQ = this.zzc;
        if (objQ == zzb) {
            String strValueOf = String.valueOf(this.zzd);
            objQ = We.s.q(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        }
        String strValueOf2 = String.valueOf(objQ);
        return We.s.q(new StringBuilder(strValueOf2.length() + 19), "Suppliers.memoize(", strValueOf2, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzght
    public final Object zza() {
        zzght zzghtVar = this.zzc;
        zzght zzghtVar2 = zzb;
        if (zzghtVar != zzghtVar2) {
            synchronized (this.zza) {
                try {
                    if (this.zzc != zzghtVar2) {
                        Object objZza = this.zzc.zza();
                        this.zzd = objZza;
                        this.zzc = zzghtVar2;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzd;
    }
}
