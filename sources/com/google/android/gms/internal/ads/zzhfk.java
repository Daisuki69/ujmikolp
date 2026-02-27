package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzhfk implements zzhfn {
    private final zzhfw zza;

    @Override // com.google.android.gms.internal.ads.zzhfn
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzhfo.zza(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
