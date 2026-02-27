package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
public final class zzfor {
    private final Context zza;
    private final Looper zzb;

    public zzfor(@NonNull Context context, @NonNull Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(@NonNull String str) {
        zzfpb zzfpbVarZza = zzfpd.zza();
        Context context = this.zza;
        zzfpbVarZza.zza(context.getPackageName());
        zzfpbVarZza.zzc(2);
        zzfoz zzfozVarZza = zzfpa.zza();
        zzfozVarZza.zza(str);
        zzfozVarZza.zzb(2);
        zzfpbVarZza.zzb(zzfozVarZza);
        new zzfos(context, this.zzb, (zzfpd) zzfpbVarZza.zzbu()).zza();
    }
}
