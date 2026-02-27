package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbry extends zzbsb {
    private final Map zza;
    private final Context zzb;

    public zzbry(zzcek zzcekVar, Map map) {
        super(zzcekVar, "storePicture");
        this.zza = map;
        this.zzb = zzcekVar.zzj();
    }

    public final void zza() {
        Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!new zzbbp(context).zza()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzt.zzc();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzO = com.google.android.gms.ads.internal.util.zzs.zzO(context);
        builderZzO.setTitle(resourcesZzf != null ? resourcesZzf.getString(R.string.f9701s1) : "Save image");
        builderZzO.setMessage(resourcesZzf != null ? resourcesZzf.getString(R.string.f9702s2) : "Allow Ad to store image in Picture gallery?");
        builderZzO.setPositiveButton(resourcesZzf != null ? resourcesZzf.getString(R.string.f9703s3) : RtspHeaders.ACCEPT, new zzbrw(this, str, lastPathSegment));
        builderZzO.setNegativeButton(resourcesZzf != null ? resourcesZzf.getString(R.string.f9704s4) : "Decline", new zzbrx(this));
        builderZzO.create().show();
    }

    public final /* synthetic */ Context zzb() {
        return this.zzb;
    }
}
