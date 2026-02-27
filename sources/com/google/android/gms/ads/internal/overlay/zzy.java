package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.datasource.cache.c;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzcek;
import com.google.android.gms.internal.ads.zzgeq;
import com.google.android.gms.internal.ads.zzger;
import com.google.android.gms.internal.ads.zzges;
import com.google.android.gms.internal.ads.zzget;
import com.google.android.gms.internal.ads.zzgfm;
import com.google.android.gms.internal.ads.zzgfo;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgfq;
import com.google.android.gms.internal.ads.zzgfr;
import com.google.android.gms.internal.ads.zzgge;
import java.util.HashMap;
import java.util.Map;
import mx_android.support.v7.media.MediaRouteProviderProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class zzy {
    private zzgfp zzf;

    @Nullable
    private zzcek zzc = null;
    private boolean zze = false;

    @Nullable
    private String zza = null;

    @Nullable
    private zzges zzd = null;

    @Nullable
    private String zzb = null;

    private final void zzl() {
        if (this.zzf == null) {
            this.zzf = new zzw(this);
        }
    }

    private final zzgfr zzm() {
        zzgfq zzgfqVarZzc = zzgfr.zzc();
        if (!((Boolean) zzbd.zzc().zzd(zzbci.zzmn)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzgfqVarZzc.zza(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzgfqVarZzc.zzb(this.zzb);
        }
        return zzgfqVarZzc.zzc();
    }

    public final synchronized void zza(@Nullable zzcek zzcekVar, Context context) {
        this.zzc = zzcekVar;
        if (!zzb(context)) {
            zzg("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        zzi("on_play_store_bind", map);
    }

    public final synchronized boolean zzb(Context context) {
        if (!zzgge.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzget.zza(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzl();
        this.zze = true;
        return true;
    }

    public final void zzc(@Nullable zzcek zzcekVar, @Nullable zzgfm zzgfmVar) {
        if (zzcekVar == null) {
            zzg("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcekVar;
        if (!this.zze && !zzb(zzcekVar.getContext())) {
            zzg("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzmn)).booleanValue()) {
            this.zzb = zzgfmVar.zzb();
        }
        zzl();
        zzges zzgesVar = this.zzd;
        if (zzgesVar != null) {
            zzgesVar.zza(zzgfmVar, this.zzf);
        }
    }

    public final void zzd() {
        zzges zzgesVar;
        if (!this.zze || (zzgesVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzgesVar.zzd(zzm(), this.zzf);
            zzh("onLMDOverlayExpand");
        }
    }

    public final void zze() {
        zzges zzgesVar;
        if (!this.zze || (zzgesVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzgesVar.zzc(zzm(), this.zzf);
            zzh("onLMDOverlayCollapse");
        }
    }

    public final void zzf() {
        zzges zzgesVar;
        if (!this.zze || (zzgesVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzgeq zzgeqVarZzc = zzger.zzc();
        if (!((Boolean) zzbd.zzc().zzd(zzbci.zzmn)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzgeqVarZzc.zza(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzgeqVarZzc.zzb(this.zzb);
        }
        zzgesVar.zzb(zzgeqVarZzc.zzc(), this.zzf);
    }

    @VisibleForTesting
    public final void zzg(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            zzi("onError", c.q("message", str, "action", str2));
        }
    }

    @VisibleForTesting
    public final void zzh(String str) {
        zzi(str, new HashMap());
    }

    @VisibleForTesting
    public final void zzi(final String str, final Map map) {
        zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk(str, map);
            }
        });
    }

    @VisibleForTesting
    public final void zzj(zzgfo zzgfoVar) {
        if (!TextUtils.isEmpty(zzgfoVar.zzb())) {
            if (!((Boolean) zzbd.zzc().zzd(zzbci.zzmn)).booleanValue()) {
                this.zza = zzgfoVar.zzb();
            }
        }
        switch (zzgfoVar.zza()) {
            case 8152:
                zzh("onLMDOverlayOpened");
                break;
            case 8153:
                zzh("onLMDOverlayClicked");
                break;
            case 8155:
                zzh("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, String.valueOf(zzgfoVar.zza()));
                zzi("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    public final /* synthetic */ void zzk(String str, Map map) {
        zzcek zzcekVar = this.zzc;
        if (zzcekVar != null) {
            zzcekVar.zze(str, map);
        }
    }
}
