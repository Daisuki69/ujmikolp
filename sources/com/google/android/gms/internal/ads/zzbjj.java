package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.dynatrace.android.agent.Global;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzbjj implements zzbjl {
    static final /* synthetic */ zzbjj zza = new zzbjj();

    private /* synthetic */ zzbjj() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcfw zzcfwVar = (zzcfw) obj;
        zzbjl zzbjlVar = zzbjk.zza;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] strArrSplit = str.split(",");
        HashMap map2 = new HashMap();
        PackageManager packageManager = zzcfwVar.getContext().getPackageManager();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(Global.SEMICOLON, 2);
            Boolean boolValueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) != null);
            map2.put(str2, boolValueOf);
            StringBuilder sb2 = new StringBuilder(str2.length() + 14 + boolValueOf.toString().length());
            sb2.append("/canOpenURLs;");
            sb2.append(str2);
            sb2.append(Global.SEMICOLON);
            sb2.append(boolValueOf);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        ((zzbmh) zzcfwVar).zze("openableURLs", map2);
    }
}
