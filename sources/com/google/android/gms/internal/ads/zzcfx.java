package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class zzcfx extends zzcev {
    public zzcfx(zzcek zzcekVar, zzbbh zzbbhVar, boolean z4, @Nullable zzecy zzecyVar) {
        super(zzcekVar, zzbbhVar, z4, new zzbsa(zzcekVar, zzcekVar.zzK(), new zzbbp(zzcekVar.getContext())), null, zzecyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final WebResourceResponse zzaa(WebView webView, String str, @Nullable Map map) {
        String str2;
        if (!(webView instanceof zzcek)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcek zzcekVar = (zzcek) webView;
        zzbxf zzbxfVar = this.zzb;
        if (zzbxfVar != null) {
            zzbxfVar.zze(str, map, 1);
        }
        zzfqm.zza();
        zzfqr zzfqrVar = zzfqr.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return zzJ(str, map);
        }
        if (zzcekVar.zzP() != null) {
            zzcekVar.zzP().zzL();
        }
        if (zzcekVar.zzN().zzg()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzag);
        } else if (zzcekVar.zzW()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaf);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzae);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzB(zzcekVar.getContext(), zzcekVar.zzs().afmaVersion, str2);
    }
}
