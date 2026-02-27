package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(26)
public final class zzcfz extends zzcfy {
    public zzcfz(zzcek zzcekVar, zzbbh zzbbhVar, boolean z4, @Nullable zzecy zzecyVar) {
        super(zzcekVar, zzbbhVar, z4, zzecyVar);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zza.zzaA(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
