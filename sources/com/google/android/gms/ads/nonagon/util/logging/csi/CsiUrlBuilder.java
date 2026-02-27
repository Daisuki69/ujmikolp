package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzbec;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CsiUrlBuilder {
    private final String zza = (String) zzbec.zza.zze();

    @NonNull
    public String generateUrl(@NonNull Map<String, String> map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.zza).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
