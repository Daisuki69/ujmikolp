package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzgfi extends zzgeg {
    final /* synthetic */ zzgfk zza;
    private final zzgfp zzb;

    public zzgfi(zzgfk zzgfkVar, zzgfp zzgfpVar) {
        Objects.requireNonNull(zzgfkVar);
        this.zza = zzgfkVar;
        this.zzb = zzgfpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i4 = bundle.getInt("uiMode", 0);
        zzgfn zzgfnVarZzd = zzgfo.zzd();
        zzgfnVarZzd.zza(i);
        if (string != null) {
            zzgfnVarZzd.zzb(string);
        }
        zzgfnVarZzd.zzc(i4);
        this.zzb.zza(zzgfnVarZzd.zzd());
        if (i == 8157) {
            this.zza.zzd();
        }
    }
}
