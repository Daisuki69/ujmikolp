package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.dynatrace.android.agent.Global;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbkc implements zzbjl {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(TtmlNode.ATTR_ID);
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : Global.NEWLINE.concat(String.valueOf(str4));
        synchronized (this.zza) {
            try {
                zzbkb zzbkbVar = (zzbkb) this.zzb.remove(str);
                if (zzbkbVar == null) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
                    sb2.append("Received result for unexpected method invocation: ");
                    sb2.append(str);
                    String string = sb2.toString();
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + strConcat.length());
                    sb3.append(str3);
                    sb3.append(strConcat);
                    zzbkbVar.zzb(sb3.toString());
                    return;
                }
                if (str5 == null) {
                    zzbkbVar.zza(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        String string2 = jSONObject.toString(2);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(string2).length() + 13);
                        sb4.append("Result GMSG: ");
                        sb4.append(string2);
                        com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
                    }
                    zzbkbVar.zza(jSONObject);
                } catch (JSONException e) {
                    zzbkbVar.zzb(e.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(String str, zzbkb zzbkbVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbkbVar);
        }
    }

    public final S1.y zzc(zzbmt zzbmtVar, String str, JSONObject jSONObject) {
        zzbzm zzbzmVar = new zzbzm();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzb(string, new zzbka(this, zzbzmVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(TtmlNode.ATTR_ID, string);
            jSONObject2.put("args", jSONObject);
            zzbmtVar.zzb(str, jSONObject2);
            return zzbzmVar;
        } catch (Exception e) {
            zzbzmVar.zzd(e);
            return zzbzmVar;
        }
    }
}
