package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.webkit.WebViewFeature;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdrs implements zzcyy, zzcxg, zzcvv, zzdel {
    private final zzdsg zza;
    private final zzdsr zzb;
    private final int zzc;

    public zzdrs(zzdsg zzdsgVar, zzdsr zzdsrVar, int i) {
        this.zza = zzdsgVar;
        this.zzb = zzdsrVar;
        this.zzc = i;
    }

    private final void zzc(Bundle bundle, zzgjz zzgjzVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue() || bundle == null) {
            return;
        }
        androidx.media3.datasource.cache.c.v(bundle, zzdru.PUBLIC_API_CALLBACK.zza());
        zzdsg zzdsgVar = this.zza;
        zzdsgVar.zzf();
        boolean zContainsKey = bundle.containsKey("ls");
        String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        if (zContainsKey) {
            zzdsgVar.zzd("ls", true != bundle.getBoolean("ls") ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        int size = zzgjzVar.size();
        for (int i = 0; i < size; i++) {
            zzdrv zzdrvVar = (zzdrv) zzgjzVar.get(i);
            long j = bundle.getLong(zzdrvVar.zzb().zza(), -1L);
            long j6 = bundle.getLong(zzdrvVar.zzc().zza(), -1L);
            if (j > 0 && j6 > 0) {
                zzdsgVar.zzd(zzdrvVar.zza(), String.valueOf(j6 - j));
            }
        }
        zzf(bundle.getBundle("client_sig_latency_key"));
        zzf(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhX)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                if (true != bundle.getBoolean("sod_h")) {
                    str = "0";
                }
                zzdsgVar.zzd("sod_h", str);
            }
            if (bundle.containsKey("cmr")) {
                zzdsgVar.zzd("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    private final void zzf(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.zza.zzd(str, String.valueOf(j));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzd(@Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhq)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhX)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            if (zzbjVar == null) {
                zzdsg zzdsgVar = this.zza;
                zzdsgVar.zzc().put("action", "sgs");
                zzdsgVar.zzc().put("request_id", "-1");
                this.zzb.zzb(zzdsgVar.zzc());
                return;
            }
            zzbuv zzbuvVar = zzbjVar.zzd;
            Bundle bundle = zzbjVar.zze;
            if (zzbuvVar != null) {
                zzc(zzbuvVar.zzm, zzdrv.zza);
            } else if (bundle != null && !bundle.isEmpty()) {
                zzc(bundle, zzdrv.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(zzbjVar.zzc) ? zzbjVar.zzb : zzbjVar.zzc);
                zzdsg zzdsgVar2 = this.zza;
                zzdsgVar2.zzc().put("action", "sgs");
                Map mapZzc = zzdsgVar2.zzc();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkw)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0";
                    } catch (JSONException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving JSONObject from the requestJson, ", e);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                mapZzc.put("tpc", str);
                zzbuv zzbuvVar2 = zzbjVar.zzd;
                if (zzbuvVar2 != null) {
                    this.zza.zzb(zzbuvVar2.zza);
                }
                this.zzb.zzb(this.zza.zzc());
            } catch (JSONException unused) {
                zzdsg zzdsgVar3 = this.zza;
                zzdsgVar3.zzc().put("action", "sgf");
                zzdsgVar3.zzc().put("sgf_reason", "request_invalid");
                this.zzb.zzb(zzdsgVar3.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzdN(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdsg zzdsgVar = this.zza;
        zzdsgVar.zzc().put("action", "ftl");
        zzdsgVar.zzd("ftl", String.valueOf(zzeVar.zza));
        zzdsgVar.zzd("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhF)).booleanValue()) {
            zzdsgVar.zzd("emsg", zzeVar.zzb);
        }
        this.zzb.zzb(zzdsgVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
        this.zza.zzb(zzbuvVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
        this.zza.zza(zzfcuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zze(@Nullable String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhq)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhX)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            zzdsg zzdsgVar = this.zza;
            zzdsgVar.zzc().put("action", "sgf");
            zzdsgVar.zzd("sgf_reason", str);
            this.zzb.zzb(zzdsgVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        zzdsg zzdsgVar = this.zza;
        zzdsgVar.zzc().put("action", "loaded");
        zzc(zzdsgVar.zze(), zzdrv.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznu)).booleanValue()) {
            zzdsgVar.zzc().put("mafe", true != WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO) ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        this.zzb.zzb(zzdsgVar.zzc());
    }
}
