package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfgz {
    private static final S1.y zza = zzgot.zza(null);
    private final zzgpd zzb;
    private final ScheduledExecutorService zzc;
    private final zzfha zzd;

    public zzfgz(zzgpd zzgpdVar, ScheduledExecutorService scheduledExecutorService, zzfha zzfhaVar) {
        this.zzb = zzgpdVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfhaVar;
    }

    public final zzfgy zza(Object obj, S1.y yVar) {
        return new zzfgy(this, obj, null, yVar, Collections.singletonList(yVar), yVar, null);
    }

    public final zzfgq zzb(Object obj, S1.y... yVarArr) {
        return new zzfgq(this, obj, Arrays.asList(yVarArr), null);
    }

    public abstract String zzc(Object obj);

    public final /* synthetic */ zzgpd zze() {
        return this.zzb;
    }

    public final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzfha zzg() {
        return this.zzd;
    }
}
