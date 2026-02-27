package com.google.android.gms.ads.internal.util;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.internal.ads.zzapd;
import com.google.android.gms.internal.ads.zzaph;
import com.google.android.gms.internal.ads.zzapn;
import com.google.android.gms.internal.ads.zzaqe;
import com.google.android.gms.internal.ads.zzbzm;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbk extends zzaph {
    private final zzbzm zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbk(String str, Map map, zzbzm zzbzmVar) {
        super(0, str, new zzbj(zzbzmVar));
        this.zza = zzbzmVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzb(str, ShareTarget.METHOD_GET, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    public final zzapn zzr(zzapd zzapdVar) {
        return zzapn.zza(zzapdVar, zzaqe.zza(zzapdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    public final /* bridge */ /* synthetic */ void zzs(Object obj) {
        zzapd zzapdVar = (zzapd) obj;
        Map map = zzapdVar.zzc;
        int i = zzapdVar.zza;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.zzb;
        zzlVar.zzd(map, i);
        byte[] bArr = zzapdVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj() && bArr != null) {
            zzlVar.zzf(bArr);
        }
        this.zza.zzc(zzapdVar);
    }
}
