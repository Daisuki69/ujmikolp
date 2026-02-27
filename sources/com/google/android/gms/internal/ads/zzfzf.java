package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfzf extends zzfzq {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    public zzfzf(zzarw zzarwVar, zzfym zzfymVar, zzgea zzgeaVar) {
        super("4EuCewMNo7oy5HJGjIHWZVxouDpcyFQvVYKjdCC+HW0E6LLnkuCZqI8dzQVnGx8e", "LgWy0irzLAc0ySGOZyKJEvwv+9ISzhvaYv1Kh0MSt9M=", zzarwVar, zzfymVar, zzgeaVar.zza(117));
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    public final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        Long l6 = (Long) method.invoke("", null);
                        if (l6 == null) {
                            throw null;
                        }
                        zza = l6;
                    }
                } finally {
                }
            }
        }
        synchronized (zzarwVar) {
            try {
                if (zza != null) {
                    zzarwVar.zzm(zza.longValue());
                }
            } finally {
            }
        }
    }
}
