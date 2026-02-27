package com.google.android.gms.internal.vision;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzky {
    private static final zzky zza = new zzky();
    private final ConcurrentMap<Class<?>, zzlc<?>> zzc = new ConcurrentHashMap();
    private final zzlf zzb = new zzkb();

    private zzky() {
    }

    public static zzky zza() {
        return zza;
    }

    public final <T> zzlc<T> zza(Class<T> cls) {
        zzjf.zza(cls, "messageType");
        zzlc<T> zzlcVarZza = (zzlc) this.zzc.get(cls);
        if (zzlcVarZza == null) {
            zzlcVarZza = this.zzb.zza(cls);
            zzjf.zza(cls, "messageType");
            zzjf.zza(zzlcVarZza, "schema");
            zzlc<T> zzlcVar = (zzlc) this.zzc.putIfAbsent(cls, zzlcVarZza);
            if (zzlcVar != null) {
                return zzlcVar;
            }
        }
        return zzlcVarZza;
    }

    public final <T> zzlc<T> zza(T t5) {
        return zza((Class) t5.getClass());
    }
}
