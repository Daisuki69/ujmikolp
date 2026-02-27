package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.dynatrace.android.agent.Global;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzbja implements zzbjl {
    static final /* synthetic */ zzbja zza = new zzbja();

    private /* synthetic */ zzbja() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcfw zzcfwVar = (zzcfw) obj;
        zzbjl zzbjlVar = zzbjk.zza;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziX)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap map2 = new HashMap();
        Boolean boolValueOf = Boolean.valueOf(zzcfwVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        map2.put(str, boolValueOf);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 13 + boolValueOf.toString().length());
        sb2.append("/canOpenApp;");
        sb2.append(str);
        sb2.append(Global.SEMICOLON);
        sb2.append(boolValueOf);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        ((zzbmh) zzcfwVar).zze("openableApp", map2);
    }
}
