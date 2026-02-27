package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfzq implements zzfzp {
    private final String zza;
    private final String zzb;
    private final zzfym zzc;
    private final zzarw zzd;
    private final zzgdy zze;

    public zzfzq(String str, String str2, zzarw zzarwVar, zzfym zzfymVar, zzgdy zzgdyVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = zzarwVar;
        this.zzc = zzfymVar;
        this.zze = zzgdyVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        try {
            this.zze.zza();
            Method methodZzc = this.zzc.zzc(this.zza, this.zzb);
            if (methodZzc != null) {
                zza(methodZzc, this.zzd);
            }
            this.zze.zzc();
            return null;
        } catch (Throwable th2) {
            try {
                this.zze.zzb(th2);
                throw th2;
            } catch (Throwable th3) {
                this.zze.zzc();
                throw th3;
            }
        }
    }

    public abstract void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException;
}
