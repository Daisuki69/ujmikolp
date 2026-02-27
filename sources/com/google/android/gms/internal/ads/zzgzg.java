package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgzg {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgzg(zzgzd zzgzdVar, byte[] bArr) {
        this.zza = new HashMap(zzgzdVar.zzd());
        this.zzb = new HashMap(zzgzdVar.zze());
    }

    public static zzgzd zza() {
        return new zzgzd(null);
    }

    public final Object zzb(zzgqd zzgqdVar, Class cls) throws GeneralSecurityException {
        zzgze zzgzeVar = new zzgze(zzgqdVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzgzeVar)) {
            return ((zzgzc) map.get(zzgzeVar)).zza(zzgqdVar);
        }
        String string = zzgzeVar.toString();
        throw new GeneralSecurityException(We.s.q(new StringBuilder(string.length() + 102), "No PrimitiveConstructor for ", string, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public final Object zzc(zzgxr zzgxrVar, zzgxy zzgxyVar, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        final zzgzi zzgziVar = (zzgzi) map.get(cls);
        return zzgziVar.zze(zzgxrVar, zzgxyVar, new zzgzh() { // from class: com.google.android.gms.internal.ads.zzgzf
            @Override // com.google.android.gms.internal.ads.zzgzh
            public final /* synthetic */ Object zza(zzgqm zzgqmVar) {
                return this.zza.zzb(zzgqmVar.zza(), zzgziVar.zzb());
            }
        });
    }

    public final /* synthetic */ Map zzd() {
        return this.zza;
    }

    public final /* synthetic */ Map zze() {
        return this.zzb;
    }
}
