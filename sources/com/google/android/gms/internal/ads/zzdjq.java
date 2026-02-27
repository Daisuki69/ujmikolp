package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzdjq implements zzbfj {
    final /* synthetic */ zzdkr zza;
    final /* synthetic */ ViewGroup zzb;

    public zzdjq(zzdkr zzdkrVar, ViewGroup viewGroup) {
        this.zza = zzdkrVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zza() {
        zzgjz zzgjzVar = zzdjp.zza;
        zzdkr zzdkrVar = this.zza;
        Map mapZzk = zzdkrVar.zzk();
        if (mapZzk == null) {
            return;
        }
        int size = zzgjzVar.size();
        int i = 0;
        while (i < size) {
            Object obj = mapZzk.get((String) zzgjzVar.get(i));
            i++;
            if (obj != null) {
                zzdkrVar.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zzb(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final JSONObject zzc() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final JSONObject zzd() {
        return this.zza.zzq();
    }
}
