package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfjv {
    private final Context zza;
    private final Executor zzb;
    private final zzgpe zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzfjn zze;
    private final zzfie zzf;

    public zzfjv(Context context, Executor executor, zzgpe zzgpeVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzfjn zzfjnVar, zzfie zzfieVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgpeVar;
        this.zzd = zzuVar;
        this.zze = zzfjnVar;
        this.zzf = zzfieVar;
    }

    public final void zza(List list, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), zzvVar, null, null);
        }
    }

    public final void zzb(final String str, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar, @Nullable zzfib zzfibVar, @Nullable zzcyh zzcyhVar) {
        S1.y yVarZzc;
        zzfhr zzfhrVarA = null;
        if (zzfie.zza() && ((Boolean) zzbeb.zzd.zze()).booleanValue()) {
            zzfhrVarA = s.a(this.zza, 14);
            zzfhrVarA.zza();
        }
        if (zzvVar != null) {
            yVarZzc = new zzfjm(zzvVar.zza(), this.zzd, this.zzc, this.zze).zza(str);
        } else {
            yVarZzc = this.zzc.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfju
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(str);
                }
            });
        }
        zzgot.zzq(yVarZzc, new zzfjt(this, zzfhrVarA, zzfibVar, zzcyhVar), this.zzb);
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzc(String str) {
        return this.zzd.zza(str);
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzu zzd() {
        return this.zzd;
    }

    public final /* synthetic */ zzfie zze() {
        return this.zzf;
    }
}
