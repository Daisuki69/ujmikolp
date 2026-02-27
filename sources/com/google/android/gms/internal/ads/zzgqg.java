package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgqg {
    public static final zzhdw zza(zzgqs zzgqsVar) {
        try {
            return ((zzgzk) zzgyo.zza().zzk(null, zzgzk.class)).zzc();
        } catch (GeneralSecurityException e) {
            throw new zzgzt("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e);
        }
    }

    public static final zzgqs zzb(zzgqs zzgqsVar) throws GeneralSecurityException {
        return zzgqsVar != null ? zzgqsVar : zzgqu.zzb(zza(null).zzaN());
    }
}
