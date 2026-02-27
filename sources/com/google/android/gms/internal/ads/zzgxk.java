package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgxk {
    private static final Logger zza = Logger.getLogger(zzgxk.class.getName());
    private static final zzgxk zzd = new zzgxk();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public static zzgxk zza() {
        return zzd;
    }

    private final synchronized zzgqe zzg(String str) throws GeneralSecurityException {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzb;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 98);
            sb2.append("No key manager found for key type ");
            sb2.append(str);
            sb2.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb2.toString());
        }
        return (zzgqe) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzgqe zzgqeVar, boolean z4, boolean z5) throws GeneralSecurityException {
        try {
            String str = ((zzgxs) zzgqeVar).zza;
            ConcurrentMap concurrentMap = this.zzc;
            if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            ConcurrentMap concurrentMap2 = this.zzb;
            zzgqe zzgqeVar2 = (zzgqe) concurrentMap2.get(str);
            if (zzgqeVar2 != null && !zzgqeVar2.getClass().equals(zzgqeVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + zzgqeVar2.getClass().getName() + ", cannot be re-registered with " + zzgqeVar.getClass().getName());
            }
            concurrentMap2.putIfAbsent(str, zzgqeVar);
            concurrentMap.put(str, Boolean.TRUE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzb(zzgqe zzgqeVar, boolean z4) throws GeneralSecurityException {
        zzf(zzgqeVar, 1, true);
    }

    public final zzgqe zzc(String str, Class cls) throws GeneralSecurityException {
        zzgqe zzgqeVarZzg = zzg(str);
        if (zzgqeVarZzg.zzb().equals(cls)) {
            return zzgqeVarZzg;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzgqeVarZzg.getClass());
        String string = zzgqeVarZzg.zzb().toString();
        StringBuilder sb2 = new StringBuilder(androidx.media3.datasource.cache.c.b(name.length() + 53, 23, strValueOf) + string.length());
        androidx.media3.datasource.cache.c.A(sb2, "Primitive type ", name, " not supported by key manager of type ", strValueOf);
        throw new GeneralSecurityException(We.s.p(sb2, ", which only supports: ", string));
    }

    public final zzgqe zzd(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzgqe zzgqeVar, int i, boolean z4) throws GeneralSecurityException {
        if (!zzgxd.zza(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzgqeVar, false, true);
    }
}
