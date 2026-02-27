package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcek;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class zzi {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzi(zzcek zzcekVar) throws zzg {
        this.zzb = zzcekVar.getLayoutParams();
        ViewParent parent = zzcekVar.getParent();
        this.zzd = zzcekVar.zzK();
        if (!(parent instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(zzcekVar.zzE());
        viewGroup.removeView(zzcekVar.zzE());
        zzcekVar.zzag(true);
    }
}
