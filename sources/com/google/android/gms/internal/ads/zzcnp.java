package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcnp implements zzayi {
    private zzcek zza;
    private final Executor zzb;
    private final zzcnb zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcne zzg = new zzcne();

    public zzcnp(Executor executor, zzcnb zzcnbVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcnbVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject jSONObjectZzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcno
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzf(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza(zzcek zzcekVar) {
        this.zza = zzcekVar;
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzdo(zzayh zzayhVar) {
        boolean z4 = this.zzf ? false : zzayhVar.zzj;
        zzcne zzcneVar = this.zzg;
        zzcneVar.zza = z4;
        zzcneVar.zzd = this.zzd.elapsedRealtime();
        zzcneVar.zzf = zzayhVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z4) {
        this.zzf = z4;
    }

    public final /* synthetic */ void zzf(JSONObject jSONObject) {
        String string = jSONObject.toString();
        String strQ = We.s.q(new StringBuilder(string.length() + 31), "Calling AFMA_updateActiveView(", string, ")");
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(strQ);
        this.zza.zzb("AFMA_updateActiveView", jSONObject);
    }
}
