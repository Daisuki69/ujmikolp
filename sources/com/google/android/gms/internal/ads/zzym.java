package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzym {

    @Nullable
    private zzyl zza;

    @Nullable
    private zzyu zzb;

    @CallSuper
    public void zzb() {
        this.zza = null;
        this.zzb = null;
    }

    public boolean zzd() {
        throw null;
    }

    public void zze(zzc zzcVar) {
        throw null;
    }

    @Nullable
    public zzlm zzg() {
        throw null;
    }

    public abstract void zzp(@Nullable Object obj);

    public abstract zzyn zzq(zzln[] zzlnVarArr, zzwq zzwqVar, zzup zzupVar, zzbe zzbeVar) throws zzhz;

    @CallSuper
    public final void zzr(zzyl zzylVar, zzyu zzyuVar) {
        zzghc.zzh(this.zza == null);
        this.zza = zzylVar;
        this.zzb = zzyuVar;
    }

    public final void zzs() {
        zzyl zzylVar = this.zza;
        if (zzylVar != null) {
            zzylVar.zzq();
        }
    }

    public final zzyu zzt() {
        zzyu zzyuVar = this.zzb;
        zzyuVar.getClass();
        return zzyuVar;
    }
}
