package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbin implements zzbjl {
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        try {
            zzftm.zzh(zzcekVar.getContext()).zzk();
            zzftn.zzh(zzcekVar.getContext()).zzj();
            zzfto.zza(zzcekVar.getContext()).zzb(null);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
