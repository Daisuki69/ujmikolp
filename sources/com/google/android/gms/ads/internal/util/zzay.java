package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzapd;
import com.google.android.gms.internal.ads.zzaph;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzapv;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzaqd;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzblj;
import com.google.android.gms.internal.ads.zzfqm;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzay extends zzapw {
    private final Context zzb;

    private zzay(Context context, zzapv zzapvVar) {
        super(zzapvVar);
        this.zzb = context;
    }

    public static zzapk zzb(Context context) {
        zzapk zzapkVar = new zzapk(new zzaqd(new File(zzfqm.zza().zza(context.getCacheDir(), "admob_volley")), 20971520), new zzay(context, new zzaqi(null, null)), 4);
        zzapkVar.zza();
        return zzapkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapw, com.google.android.gms.internal.ads.zzapa
    public final zzapd zza(zzaph zzaphVar) throws zzapq {
        if (zzaphVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeU), zzaphVar.zzh())) {
                Context context = this.zzb;
                com.google.android.gms.ads.internal.client.zzbb.zza();
                if (com.google.android.gms.ads.internal.util.client.zzf.zzx(context, 13400000)) {
                    zzapd zzapdVarZza = new zzblj(context).zza(zzaphVar);
                    if (zzapdVarZza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzaphVar.zzh())));
                        return zzapdVarZza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzaphVar.zzh())));
                }
            }
        }
        return super.zza(zzaphVar);
    }
}
