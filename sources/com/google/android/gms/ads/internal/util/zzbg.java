package com.google.android.gms.ads.internal.util;

import androidx.camera.core.impl.a;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzapq;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbg implements zzapl {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbi zzb;

    public zzbg(zzbl zzblVar, String str, zzbi zzbiVar) {
        this.zza = str;
        this.zzb = zzbiVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final void zza(zzapq zzapqVar) {
        String str = this.zza;
        String string = zzapqVar.toString();
        String strP = a.p(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length()), "Failed to load URL: ", str, Global.NEWLINE, string);
        int i = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strP);
        this.zzb.zza((Object) null);
    }
}
