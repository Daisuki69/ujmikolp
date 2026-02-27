package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class zzfzd extends zzfzq {
    private final zzfui zza;

    public zzfzd(zzarw zzarwVar, zzfym zzfymVar, zzfui zzfuiVar, zzgea zzgeaVar) {
        super("fYZiBk9qczTYZ4XbuTZP+yPWbtV6tDQSSdiXJtgkPteU+uECNiQz27SdXVm0ZoDV", "cWReJy6PGA8DXT8v/LLJX4GdS/i6yfZY3MOkA1+Ehd0=", zzarwVar, zzfymVar, zzgeaVar.zza(116));
        this.zza = zzfuiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    public final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza.zzb());
        objArr.getClass();
        synchronized (zzarwVar) {
            zzarwVar.zzb((String) objArr[0]);
            zzarwVar.zzaa((String) objArr[1]);
        }
    }
}
