package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdkp {
    private final zzdpi zza;
    private final zzdnx zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdkp(zzdpi zzdpiVar, zzdnx zzdnxVar) {
        this.zza = zzdpiVar;
        this.zzb = zzdnxVar;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i);
    }

    public final View zza(@NonNull final View view, @NonNull final WindowManager windowManager) throws zzcez {
        zzcek zzcekVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zzcekVarZza.zzE().setVisibility(4);
        zzcekVarZza.zzE().setContentDescription("policy_validator");
        zzcekVarZza.zzab("/sendMessageToSdk", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdko
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzcek) obj, map);
            }
        });
        zzcekVarZza.zzab("/hideValidatorOverlay", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkj
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc(windowManager, view, (zzcek) obj, map);
            }
        });
        zzcekVarZza.zzab("/open", new zzbjy(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(zzcekVarZza);
        zzbjl zzbjlVar = new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkk
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzd(view, windowManager, (zzcek) obj, map);
            }
        };
        zzdnx zzdnxVar = this.zzb;
        zzdnxVar.zzh(weakReference, "/loadNativeAdPolicyViolations", zzbjlVar);
        zzdnxVar.zzh(new WeakReference(zzcekVarZza), "/showValidatorOverlay", zzdkl.zza);
        return zzcekVarZza.zzE();
    }

    public final /* synthetic */ void zzb(zzcek zzcekVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcek zzcekVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hide native ad policy validator overlay.");
        zzcekVar.zzE().setVisibility(8);
        if (zzcekVar.zzE().getWindowToken() != null) {
            windowManager.removeView(zzcekVar.zzE());
        }
        zzcekVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    public final /* synthetic */ void zzd(final View view, final WindowManager windowManager, zzcek zzcekVar, final Map map) {
        final zzcek zzcekVar2;
        zzcekVar.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdkn
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z4, int i, String str, String str2) {
                this.zza.zze(map, z4, i, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iZzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziP)).intValue());
        int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziQ)).intValue());
        int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcekVar.zzaf(zzcgt.zzc(iZzf, iZzf2));
        try {
            zzcekVar.zzD().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziR)).booleanValue());
            zzcekVar.zzD().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziS)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsZzk = com.google.android.gms.ads.internal.util.zzbs.zzk();
        layoutParamsZzk.x = iZzf3;
        layoutParamsZzk.y = iZzf4;
        windowManager.updateViewLayout(zzcekVar.zzE(), layoutParamsZzk);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = ((IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(str) || ExifInterface.GPS_MEASUREMENT_2D.equals(str)) ? rect.bottom : rect.top) - iZzf4;
            zzcekVar2 = zzcekVar;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdkm
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final /* synthetic */ void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzcek zzcekVar3 = zzcekVar2;
                        if (zzcekVar3.zzE().getWindowToken() == null) {
                            return;
                        }
                        int i4 = i;
                        WindowManager.LayoutParams layoutParams = layoutParamsZzk;
                        String str2 = str;
                        if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(str2) || ExifInterface.GPS_MEASUREMENT_2D.equals(str2)) {
                            layoutParams.y = rect2.bottom - i4;
                        } else {
                            layoutParams.y = rect2.top - i4;
                        }
                        windowManager.updateViewLayout(zzcekVar3.zzE(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        } else {
            zzcekVar2 = zzcekVar;
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcekVar2.loadUrl(str2);
    }

    public final /* synthetic */ void zze(Map map, boolean z4, int i, String str, String str2) {
        HashMap mapP = androidx.media3.datasource.cache.c.p("messageType", "validatorHtmlLoaded");
        mapP.put(TtmlNode.ATTR_ID, (String) map.get(TtmlNode.ATTR_ID));
        this.zzb.zzf("sendMessageToNativeJs", mapP);
    }
}
