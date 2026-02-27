package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaxl implements Callable {
    protected final zzavx zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzarw zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzaxl(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i4) {
        this.zza = zzavxVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzarwVar;
        this.zzf = i;
        this.zzg = i4;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            zzavx zzavxVar = this.zza;
            Method methodZzo = zzavxVar.zzo(this.zzb, this.zzc);
            this.zze = methodZzo;
            if (methodZzo == null) {
                return null;
            }
            zza();
            zzauo zzauoVarZzh = zzavxVar.zzh();
            if (zzauoVarZzh == null || (i = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzauoVarZzh.zza(this.zzg, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;
}
