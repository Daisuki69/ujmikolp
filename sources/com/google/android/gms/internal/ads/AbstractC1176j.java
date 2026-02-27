package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1176j {
    public static void a(zzbmi zzbmiVar, String str, JSONObject jSONObject) {
        zzbmiVar.zzc(str, jSONObject.toString());
    }

    public static void b(zzbmi zzbmiVar, String str, String str2) {
        zzbmiVar.zza(androidx.camera.core.impl.a.p(new StringBuilder(androidx.media3.datasource.cache.c.b(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    public static void c(zzbmi zzbmiVar, String str, JSONObject jSONObject) {
        StringBuilder sbX = We.s.x("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String string = sbX.toString();
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(string));
        zzbmiVar.zza(sbX.toString());
    }

    public static void d(zzbmi zzbmiVar, String str, Map map) {
        try {
            zzbmiVar.zzd(str, com.google.android.gms.ads.internal.client.zzbb.zza().zzk(map));
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
    }
}
