package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgzt extends RuntimeException {
    public zzgzt(String str) {
        super(str);
    }

    public static Object zza(zzgzs zzgzsVar) {
        try {
            return zzgzsVar.zza();
        } catch (Exception e) {
            throw new zzgzt(e);
        }
    }

    public zzgzt(String str, Throwable th2) {
        super(str, th2);
    }

    public zzgzt(Throwable th2) {
        super(th2);
    }
}
