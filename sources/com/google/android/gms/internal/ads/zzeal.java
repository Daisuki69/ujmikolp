package com.google.android.gms.internal.ads;

import androidx.media3.extractor.text.ttml.TtmlNode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzeal implements zzbnw {
    @Override // com.google.android.gms.internal.ads.zzbnw
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzeam zzeamVar = (zzeam) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkb)).booleanValue()) {
            zzbux zzbuxVar = zzeamVar.zzc;
            jSONObject2.put("ad_request_url", zzbuxVar.zze());
            jSONObject2.put("ad_request_post_body", zzbuxVar.zzd());
        }
        zzbux zzbuxVar2 = zzeamVar.zzc;
        jSONObject2.put("base_url", zzbuxVar2.zzc());
        jSONObject2.put("signals", zzeamVar.zzb);
        zzeas zzeasVar = zzeamVar.zza;
        jSONObject3.put(TtmlNode.TAG_BODY, zzeasVar.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzbb.zza().zzk(zzeasVar.zzb));
        jSONObject3.put("response_code", zzeasVar.zza);
        jSONObject3.put("latency", zzeasVar.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzbuxVar2.zzh());
        return jSONObject;
    }
}
