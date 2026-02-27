package com.google.android.gms.internal.auth;

import androidx.camera.core.impl.a;

/* JADX INFO: loaded from: classes3.dex */
final class zzdl implements zzdj {
    volatile zzdj zza;
    volatile boolean zzb;
    Object zzc;

    public zzdl(zzdj zzdjVar) {
        zzdjVar.getClass();
        this.zza = zzdjVar;
    }

    public final String toString() {
        Object objM = this.zza;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (objM == null) {
            objM = a.m(new StringBuilder("<supplier that returned "), this.zzc, ">");
        }
        return a.m(sb2, objM, ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        zzdj zzdjVar = this.zza;
                        zzdjVar.getClass();
                        Object objZza = zzdjVar.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        this.zza = null;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
