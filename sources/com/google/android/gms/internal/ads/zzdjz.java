package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdjz implements View.OnClickListener {

    @Nullable
    @VisibleForTesting
    String zza;

    @Nullable
    @VisibleForTesting
    Long zzb;

    @Nullable
    @VisibleForTesting
    WeakReference zzc;
    private final zzdnx zzd;
    private final Clock zze;

    @Nullable
    private zzbhn zzf;

    @Nullable
    private zzbjl zzg;

    public zzdjz(zzdnx zzdnxVar, Clock clock) {
        this.zzd = zzdnxVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.onClick_enter(view);
        try {
            WeakReference weakReference = this.zzc;
            if (weakReference != null && weakReference.get() == view) {
                if (this.zza != null && this.zzb != null) {
                    HashMap map = new HashMap();
                    map.put(TtmlNode.ATTR_ID, this.zza);
                    map.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
                    map.put("messageType", "onePointFiveClick");
                    this.zzd.zzf("sendMessageToNativeJs", map);
                }
                zzd();
                Callback.onClick_exit();
            }
        } finally {
            Callback.onClick_exit();
        }
    }

    public final void zza(final zzbhn zzbhnVar) {
        this.zzf = zzbhnVar;
        zzbjl zzbjlVar = this.zzg;
        if (zzbjlVar != null) {
            this.zzd.zze("/unconfirmedClick", zzbjlVar);
        }
        zzbjl zzbjlVar2 = new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdjy
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdjz zzdjzVar = this.zza;
                try {
                    zzdjzVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbhn zzbhnVar2 = zzbhnVar;
                zzdjzVar.zza = (String) map.get(TtmlNode.ATTR_ID);
                String str = (String) map.get("asset_id");
                if (zzbhnVar2 == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Received unconfirmed click but UnconfirmedClickListener is null.");
                } else {
                    try {
                        zzbhnVar2.zze(str);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        };
        this.zzg = zzbjlVar2;
        this.zzd.zzd("/unconfirmedClick", zzbjlVar2);
    }

    @Nullable
    public final zzbhn zzb() {
        return this.zzf;
    }

    public final void zzc() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zzf();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
