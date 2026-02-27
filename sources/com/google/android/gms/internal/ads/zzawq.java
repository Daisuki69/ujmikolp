package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawq implements Callable {
    private final zzavx zza;
    private final zzarw zzb;

    public zzawq(zzavx zzavxVar, zzarw zzarwVar) {
        this.zza = zzavxVar;
        this.zzb = zzarwVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzavx zzavxVar = this.zza;
        if (zzavxVar.zzm() != null) {
            zzavxVar.zzm().get();
        }
        zzast zzastVarZzl = zzavxVar.zzl();
        if (zzastVarZzl == null) {
            return null;
        }
        try {
            zzarw zzarwVar = this.zzb;
            synchronized (zzarwVar) {
                zzarwVar.zzaY(zzastVarZzl.zzaN(), zzhhr.zza());
            }
            return null;
        } catch (zzhiw | NullPointerException unused) {
            return null;
        }
    }
}
