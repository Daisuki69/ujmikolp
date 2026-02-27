package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbij implements zzbjl {
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzgfl zzgflVarZzl = zzgfm.zzl();
        zzgflVarZzl.zzb((String) map.get("appId"));
        zzgflVarZzl.zzg(zzcekVar.getWidth());
        zzgflVarZzl.zza(zzcekVar.zzE().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzgflVarZzl.zzc(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzgflVarZzl.zzc(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzgflVarZzl.zzd(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzgflVarZzl.zzd(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzgflVarZzl.zzh((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzt().zzc(zzcekVar, zzgflVarZzl.zzi());
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
