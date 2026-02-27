package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbis implements zzbjl {
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        if (zzcekVar.zzaz() != null) {
            zzcekVar.zzaz().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = zzcekVar.zzL();
        if (zzlVarZzL != null) {
            zzlVarZzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzM = zzcekVar.zzM();
        if (zzlVarZzM != null) {
            zzlVarZzM.zzb();
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
