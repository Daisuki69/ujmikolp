package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgyf {
    public static final /* synthetic */ int zza = 0;
    private static final zzgyd zzc = zzgye.zza;
    private static final zzgyf zzd = zzd();
    private final Map zzb = new HashMap();

    public static zzgyf zza() {
        return zzd;
    }

    private static zzgyf zzd() {
        zzgyf zzgyfVar = new zzgyf();
        try {
            zzgyfVar.zzb(zzc, zzgxw.class);
            return zzgyfVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    private final synchronized zzgqd zze(zzgqs zzgqsVar, Integer num) throws GeneralSecurityException {
        zzgyd zzgydVar;
        zzgydVar = (zzgyd) this.zzb.get(zzgqsVar.getClass());
        if (zzgydVar == null) {
            String string = zzgqsVar.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 86);
            sb2.append("Cannot create a new key for parameters ");
            sb2.append(string);
            sb2.append(": no key creator for this class was registered.");
            throw new GeneralSecurityException(sb2.toString());
        }
        return zzgydVar.zza(zzgqsVar, num);
    }

    public final synchronized void zzb(zzgyd zzgydVar, Class cls) throws GeneralSecurityException {
        try {
            Map map = this.zzb;
            zzgyd zzgydVar2 = (zzgyd) map.get(cls);
            if (zzgydVar2 != null && !zzgydVar2.equals(zzgydVar)) {
                String string = cls.toString();
                StringBuilder sb2 = new StringBuilder(string.length() + 60);
                sb2.append("Different key creator for parameters class ");
                sb2.append(string);
                sb2.append(" already inserted");
                throw new GeneralSecurityException(sb2.toString());
            }
            map.put(cls, zzgydVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final zzgqd zzc(zzgqs zzgqsVar, Integer num) throws GeneralSecurityException {
        return zze(zzgqsVar, num);
    }
}
