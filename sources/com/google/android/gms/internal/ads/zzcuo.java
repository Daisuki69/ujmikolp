package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class zzcuo implements zzcxg, zzcwn {
    private final zzfcj zza;

    public zzcuo(Context context, zzfcj zzfcjVar, zzbtb zzbtbVar) {
        this.zza = zzfcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zza(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzb(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzc(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        zzbtc zzbtcVar = this.zza.zzad;
        if (zzbtcVar == null || !zzbtcVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = zzbtcVar.zzb;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }
}
