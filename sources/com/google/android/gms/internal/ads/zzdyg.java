package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdyg implements zzdzj {
    private static final Pattern zzh = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdxh zza;
    private final zzgpd zzb;
    private final zzfdc zzc;
    private final ScheduledExecutorService zzd;
    private final zzebk zze;
    private final zzfib zzf;
    private final Context zzg;

    public zzdyg(Context context, zzfdc zzfdcVar, zzdxh zzdxhVar, zzgpd zzgpdVar, ScheduledExecutorService scheduledExecutorService, zzebk zzebkVar, zzfib zzfibVar) {
        this.zzg = context;
        this.zzc = zzfdcVar;
        this.zza = zzdxhVar;
        this.zzb = zzgpdVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzebkVar;
        this.zzf = zzfibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdzj
    public final S1.y zza(zzbuv zzbuvVar) {
        Context context = this.zzg;
        S1.y yVarZza = this.zza.zza(zzbuvVar);
        zzfhr zzfhrVarA = s.a(context, 11);
        zzfia.zzb(yVarZza, zzfhrVarA);
        S1.y yVarZzj = zzgot.zzj(yVarZza, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdyf
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzb((zzdzl) obj);
            }
        }, this.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgb)).booleanValue()) {
            yVarZzj = zzgot.zzh(zzgot.zzi(yVarZzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgc)).intValue(), TimeUnit.SECONDS, this.zzd), TimeoutException.class, zzdye.zza, zzbzh.zzg);
        }
        zzfia.zzd(yVarZzj, this.zzf, zzfhrVarA);
        zzgot.zzq(yVarZzj, new zzdyd(this), zzbzh.zzg);
        return yVarZzj;
    }

    public final /* synthetic */ S1.y zzb(zzdzl zzdzlVar) {
        return zzgot.zza(new zzfcu(new zzfcr(this.zzc), zzfct.zza(new InputStreamReader(zzdzlVar.zza()), zzdzlVar.zzb().zzm)));
    }

    public final /* synthetic */ zzebk zzc() {
        return this.zze;
    }
}
