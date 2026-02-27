package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzhn implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzht zza;

    public zzhn(zzht zzhtVar) {
        Objects.requireNonNull(zzhtVar);
        this.zza = zzhtVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List list, boolean z4, boolean z5) {
        int i4 = i - 1;
        zzgs zzgsVarZzi = i4 != 0 ? i4 != 1 ? i4 != 3 ? i4 != 4 ? this.zza.zzu.zzaV().zzi() : z4 ? this.zza.zzu.zzaV().zzf() : !z5 ? this.zza.zzu.zzaV().zzh() : this.zza.zzu.zzaV().zze() : this.zza.zzu.zzaV().zzk() : z4 ? this.zza.zzu.zzaV().zzc() : !z5 ? this.zza.zzu.zzaV().zzd() : this.zza.zzu.zzaV().zzb() : this.zza.zzu.zzaV().zzj();
        int size = list.size();
        if (size == 1) {
            zzgsVarZzi.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzgsVarZzi.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzgsVarZzi.zza(str);
        } else {
            zzgsVarZzi.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
