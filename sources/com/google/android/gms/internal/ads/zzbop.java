package com.google.android.gms.internal.ads;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbop implements zzgob {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final S1.y zzb;

    public zzbop(S1.y yVar, String str, zzbnw zzbnwVar, zzbnv zzbnvVar) {
        this.zzb = yVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final S1.y zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final S1.y zzb(final Object obj) {
        return zzgot.zzj(this.zzb, new zzgob() { // from class: com.google.android.gms.internal.ads.zzboo
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj2) {
                return this.zza.zzc(obj, (zzbnq) obj2);
            }
        }, zzbzh.zzg);
    }

    public final /* synthetic */ S1.y zzc(Object obj, zzbnq zzbnqVar) throws JSONException {
        zzbzm zzbzmVar = new zzbzm();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzbjk.zzo.zzb(string, new zzbon(this, zzbzmVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TtmlNode.ATTR_ID, string);
        jSONObject.put("args", (JSONObject) obj);
        zzbnqVar.zzb(this.zza, jSONObject);
        return zzbzmVar;
    }
}
