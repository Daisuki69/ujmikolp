package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzdhn implements zzbjl {
    private final WeakReference zza;
    private final zzfjv zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private final zzfib zzd;

    public /* synthetic */ zzdhn(zzdho zzdhoVar, zzfjv zzfjvVar, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfib zzfibVar, byte[] bArr) {
        this.zza = new WeakReference(zzdhoVar);
        this.zzb = zzfjvVar;
        this.zzc = zzvVar;
        this.zzd = zzfibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        zzdho zzdhoVar = (zzdho) this.zza.get();
        String str = (String) map.get("u");
        if (zzdhoVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.zzb(str, this.zzc, this.zzd, zzdhoVar.zzF());
    }
}
