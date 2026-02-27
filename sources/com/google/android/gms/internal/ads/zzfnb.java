package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import androidx.media3.exoplayer.ExoPlayer;
import dOYHB6.lN8Dz0.wGEE15;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfnb extends zzfmx {
    private WebView zza;
    private Long zzb;
    private final Map zzc;

    public zzfnb(String str, Map map, String str2) {
        super(str);
        this.zzb = null;
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfmx
    public final void zza() {
        wGEE15 wgee15 = new wGEE15(zzfmm.zza().zzb());
        this.zza = wgee15;
        wgee15.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzfmz(this));
        zzc(this.zza);
        zzfmo.zzk(this.zza, null);
        Map map = this.zzc;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.zzb = Long.valueOf(System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.zzfmx
    public final void zzb() {
        super.zzb();
        new Handler().postDelayed(new zzfna(this), Math.max(4000 - (this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS)), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfmx
    public final void zzk(zzfln zzflnVar, zzfll zzfllVar) {
        JSONObject jSONObject = new JSONObject();
        Map mapZze = zzfllVar.zze();
        Iterator it = mapZze.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzl(zzflnVar, zzfllVar, jSONObject);
    }

    public final /* synthetic */ WebView zzq() {
        return this.zza;
    }
}
