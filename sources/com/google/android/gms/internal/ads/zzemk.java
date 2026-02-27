package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemk implements zzeup {
    private final zzgpd zza;
    private final Context zzb;
    private final zzfdc zzc;

    @Nullable
    private final View zzd;

    public zzemk(zzgpd zzgpdVar, Context context, zzfdc zzfdcVar, @Nullable ViewGroup viewGroup) {
        this.zza = zzgpdVar;
        this.zzb = context;
        this.zzc = zzfdcVar;
        this.zzd = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        zzbci.zza(this.zzb);
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzemj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 3;
    }

    public final /* synthetic */ zzeml zzc() {
        ArrayList arrayList = new ArrayList();
        View view = this.zzd;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString(SessionDescription.ATTR_TYPE, parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzeml(this.zzb, this.zzc.zzf, arrayList);
    }
}
