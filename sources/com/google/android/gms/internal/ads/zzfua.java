package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzfua implements zzgob {
    final /* synthetic */ Context zza;
    final /* synthetic */ View zzb;
    final /* synthetic */ Activity zzc;
    final /* synthetic */ zzfuc zzd;

    public zzfua(zzfuc zzfucVar, Context context, String str, View view, Activity activity) {
        this.zza = context;
        this.zzb = view;
        this.zzc = activity;
        Objects.requireNonNull(zzfucVar);
        this.zzd = zzfucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* bridge */ /* synthetic */ S1.y zza(Object obj) throws Exception {
        return this.zzd.zzg().zzc(this.zza, null, this.zzb, this.zzc);
    }
}
