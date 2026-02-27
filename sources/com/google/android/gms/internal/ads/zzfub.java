package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzfub implements zzgob {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ View zzc;
    final /* synthetic */ zzfuc zzd;

    public zzfub(zzfuc zzfucVar, Context context, String str, View view, Activity activity) {
        this.zza = context;
        this.zzb = str;
        this.zzc = view;
        Objects.requireNonNull(zzfucVar);
        this.zzd = zzfucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* bridge */ /* synthetic */ S1.y zza(Object obj) throws Exception {
        return this.zzd.zzg().zzd(this.zza, this.zzb, this.zzc, null);
    }
}
