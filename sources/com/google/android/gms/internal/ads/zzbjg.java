package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzbjg implements zzbjl {
    static final /* synthetic */ zzbjg zza = new zzbjg();

    private /* synthetic */ zzbjg() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcfw zzcfwVar = (zzcfw) obj;
        zzbjl zzbjlVar = zzbjk.zza;
        String str = (String) map.get("u");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
        } else {
            zzceb zzcebVar = (zzceb) zzcfwVar;
            new com.google.android.gms.ads.internal.util.zzbt(zzcfwVar.getContext(), ((zzcge) zzcfwVar).zzs().afmaVersion, str, null, zzcebVar.zzC() != null ? zzcebVar.zzC().zzax : null).zzb();
        }
    }
}
