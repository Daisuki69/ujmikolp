package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeoc implements zzeup {

    @VisibleForTesting
    final zzbyv zza;

    @VisibleForTesting
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgpd zzd;
    private final Context zze;

    public zzeoc(Context context, zzbyv zzbyvVar, ScheduledExecutorService scheduledExecutorService, zzgpd zzgpdVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzds)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzbyvVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdo)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdt)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdp)).booleanValue()) {
                    return zzgot.zzk(zzftu.zza(this.zzb.getAppSetIdInfo(), null), zzeob.zza, zzbzh.zzg);
                }
                Task<AppSetIdInfo> taskZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzds)).booleanValue() ? zzfeh.zzb(this.zze) : this.zzb.getAppSetIdInfo();
                if (taskZzb == null) {
                    return zzgot.zza(new zzeod(null, -1));
                }
                S1.y yVarZzj = zzgot.zzj(zzftu.zza(taskZzb, null), zzenz.zza, zzbzh.zzg);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdq)).booleanValue()) {
                    yVarZzj = zzgot.zzi(yVarZzj, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdr)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgot.zzg(yVarZzj, Exception.class, new zzggr() { // from class: com.google.android.gms.internal.ads.zzeoa
                    @Override // com.google.android.gms.internal.ads.zzggr
                    public final /* synthetic */ Object apply(Object obj) {
                        this.zza.zza.zzg((Exception) obj, "AppSetIdInfoSignal");
                        return new zzeod(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgot.zza(new zzeod(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 11;
    }
}
