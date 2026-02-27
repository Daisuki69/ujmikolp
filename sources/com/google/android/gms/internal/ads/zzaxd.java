package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxd extends zzaxl {
    private final StackTraceElement[] zzh;

    public zzaxd(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i4, StackTraceElement[] stackTraceElementArr) {
        super(zzavxVar, "ffEAQyBH71yR4B2obQT/Qgb3Fo0ajWwFYmmZt2nfIS2fjNh6ir76IWAmhSUkzxpD", "s+erUKEK0AKg0XrZCH85OEIt0v0u2CGPZAaj/S6Q0Yk=", zzarwVar, i, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzavo zzavoVar = new zzavo((String) this.zze.invoke(null, stackTraceElementArr));
            zzarw zzarwVar = this.zzd;
            synchronized (zzarwVar) {
                try {
                    zzarwVar.zzC(zzavoVar.zza.longValue());
                    if (zzavoVar.zzb.booleanValue()) {
                        zzarwVar.zzag(true != zzavoVar.zzc.booleanValue() ? 2 : 1);
                    } else {
                        zzarwVar.zzag(3);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
