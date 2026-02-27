package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdkh {
    private final zzdpi zza;
    private final zzdnx zzb;
    private final zzcnp zzc;
    private final zzdjc zzd;

    public zzdkh(zzdpi zzdpiVar, zzdnx zzdnxVar, zzcnp zzcnpVar, zzdjc zzdjcVar) {
        this.zza = zzdpiVar;
        this.zzb = zzdnxVar;
        this.zzc = zzcnpVar;
        this.zzd = zzdjcVar;
    }

    public final View zza() throws zzcez {
        zzcek zzcekVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zzcekVarZza.zzE().setVisibility(8);
        zzcekVarZza.zzab("/sendMessageToSdk", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkg
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzcek) obj, map);
            }
        });
        zzcekVarZza.zzab("/adMuted", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkb
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc((zzcek) obj, map);
            }
        });
        WeakReference weakReference = new WeakReference(zzcekVarZza);
        zzbjl zzbjlVar = new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkc
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, final Map map) {
                zzcek zzcekVar = (zzcek) obj;
                zzcgi zzcgiVarZzP = zzcekVar.zzP();
                final zzdkh zzdkhVar = this.zza;
                zzcgiVarZzP.zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdkf
                    @Override // com.google.android.gms.internal.ads.zzcgg
                    public final /* synthetic */ void zza(boolean z4, int i, String str, String str2) {
                        zzdkhVar.zzf(map, z4, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcekVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcekVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        };
        zzdnx zzdnxVar = this.zzb;
        zzdnxVar.zzh(weakReference, "/loadHtml", zzbjlVar);
        zzdnxVar.zzh(new WeakReference(zzcekVarZza), "/showOverlay", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkd
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzd((zzcek) obj, map);
            }
        });
        zzdnxVar.zzh(new WeakReference(zzcekVarZza), "/hideOverlay", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdke
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zze((zzcek) obj, map);
            }
        });
        return zzcekVarZza.zzE();
    }

    public final /* synthetic */ void zzb(zzcek zzcekVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(zzcek zzcekVar, Map map) {
        this.zzd.zzt();
    }

    public final /* synthetic */ void zzd(zzcek zzcekVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Showing native ads overlay.");
        zzcekVar.zzE().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zze(zzcek zzcekVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Hiding native ads overlay.");
        zzcekVar.zzE().setVisibility(8);
        this.zzc.zze(false);
    }

    public final /* synthetic */ void zzf(Map map, boolean z4, int i, String str, String str2) {
        HashMap mapP = androidx.media3.datasource.cache.c.p("messageType", "htmlLoaded");
        mapP.put(TtmlNode.ATTR_ID, (String) map.get(TtmlNode.ATTR_ID));
        this.zzb.zzf("sendMessageToNativeJs", mapP);
    }
}
