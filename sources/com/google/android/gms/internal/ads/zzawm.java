package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawm extends zzaxl {
    public zzawm(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i4) {
        super(zzavxVar, "0k0HoJtCvAtrnTz0UbiSqrs0BGKzSTMoo+ZxCfyJrLcMn8tbsvf/NG2/ui2bKbWP", "z6GzXqyR8kvBYJKVLhMc9mqmsbq6ZkNeWqgTkONnpqg=", zzarwVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzarw zzarwVar = this.zzd;
        zzarwVar.zzd(-1L);
        zzarwVar.zze(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (zzarwVar) {
            try {
                zzarwVar.zzd(iArr[0]);
                zzarwVar.zze(iArr[1]);
                int i = iArr[2];
                if (i != Integer.MIN_VALUE) {
                    zzarwVar.zzO(i);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
