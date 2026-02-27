package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgyl {
    private static final zzgyl zza = new zzgyl();
    private final AtomicReference zzb = new AtomicReference(new zzgzg(new zzgzd(null), null));

    public static zzgyl zza() {
        return zza;
    }

    public final synchronized void zzb(zzgzc zzgzcVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzgzd zzgzdVar = new zzgzd((zzgzg) atomicReference.get(), null);
        zzgzdVar.zza(zzgzcVar);
        atomicReference.set(new zzgzg(zzgzdVar, null));
    }

    public final synchronized void zzc(zzgzi zzgziVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzgzd zzgzdVar = new zzgzd((zzgzg) atomicReference.get(), null);
        zzgzdVar.zzb(zzgziVar);
        atomicReference.set(new zzgzg(zzgzdVar, null));
    }

    public final Object zzd(zzgqd zzgqdVar, Class cls) throws GeneralSecurityException {
        return ((zzgzg) this.zzb.get()).zzb(zzgqdVar, cls);
    }
}
