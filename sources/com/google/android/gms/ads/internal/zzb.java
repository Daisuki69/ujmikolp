package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbud;
import com.google.android.gms.internal.ads.zzbxf;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;

    @Nullable
    private final zzbxf zzc;
    private final zzbud zzd = new zzbud(false, Collections.EMPTY_LIST);

    public zzb(Context context, @Nullable zzbxf zzbxfVar, @Nullable zzbud zzbudVar) {
        this.zza = context;
        this.zzc = zzbxfVar;
    }

    private final boolean zzd() {
        zzbxf zzbxfVar = this.zzc;
        return (zzbxfVar != null && zzbxfVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final boolean zzb() {
        return !zzd() || this.zzb;
    }

    public final void zzc(@Nullable String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzbxf zzbxfVar = this.zzc;
            if (zzbxfVar != null) {
                zzbxfVar.zze(str, null, 3);
                return;
            }
            zzbud zzbudVar = this.zzd;
            if (!zzbudVar.zza || (list = zzbudVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.zza;
                    zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzP(context, "", strReplace);
                }
            }
        }
    }
}
