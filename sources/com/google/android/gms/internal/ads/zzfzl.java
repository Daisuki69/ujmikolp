package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
final class zzfzl extends zzfzq {
    private final Context zza;
    private final Map zzb;

    public zzfzl(zzarw zzarwVar, zzfym zzfymVar, Map map, Context context, zzgea zzgeaVar) {
        super("x/ivla75gbIxCSMBtwVFWwE7jSlsNIYRehCnDl+Ns11wdt5XgfFS+Bzic10LR+be", "N9mlriyqiGYjveLiAIuV0+bKr3wcLcRtJx5Wr89lqng=", zzarwVar, zzfymVar, zzgeaVar.zza(120));
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    public final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l6 = (Long) method.invoke("", this.zza);
                if (l6 == null) {
                    throw null;
                }
                lValueOf = l6;
            } else {
                S1.y yVar = (S1.y) this.zzb.get("gs");
                if (yVar != null && yVar.isDone()) {
                    lValueOf = Long.valueOf(((zzast) yVar.get()).zzd());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (zzarwVar) {
            zzarwVar.zzR(lValueOf.longValue());
        }
    }
}
