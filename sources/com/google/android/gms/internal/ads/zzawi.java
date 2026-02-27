package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawi extends zzaxl {
    public zzawi(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i4) {
        super(zzavxVar, "zPJzhz1QtGvdwoq8b/etTeYWv9LDeLRPadnOSNl7lohby1/0Z3YfZB4nvs0ev2QM", "fVJK5Q/FtQnQT4sQUZztmOn3k4N5bqyd4pz/QTy2bEo=", zzarwVar, i, 89);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        String str = (String) this.zze.invoke(null, null);
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            zzarwVar.zzaa(str);
        }
    }
}
