package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevj implements zzeup {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgpd zzc;
    private final ScheduledExecutorService zzd;
    private final zzedx zze;
    private final zzfdc zzf;
    private final VersionInfoParcel zzg;

    public zzevj(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgpd zzgpdVar, ScheduledExecutorService scheduledExecutorService, zzedx zzedxVar, zzfdc zzfdcVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgpdVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzedxVar;
        this.zzf = zzfdcVar;
        this.zzg = versionInfoParcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    @Override // com.google.android.gms.internal.ads.zzeup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final S1.y zza() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzevj.zza():S1.y");
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 56;
    }

    public final /* synthetic */ S1.y zzc(final Throwable th2) {
        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlk)).booleanValue();
                Throwable th3 = th2;
                if (zBooleanValue) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzi(th3, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th3, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return zzgot.zza(th2 instanceof SecurityException ? new zzevk("", 2, null) : th2 instanceof IllegalStateException ? new zzevk("", 3, null) : th2 instanceof IllegalArgumentException ? new zzevk("", 4, null) : th2 instanceof TimeoutException ? new zzevk("", 5, null) : new zzevk("", 0, null));
    }
}
