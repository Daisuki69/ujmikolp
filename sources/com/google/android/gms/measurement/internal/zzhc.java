package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhc {
    final /* synthetic */ zzhh zza;
    private final String zzb;
    private final boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzhc(zzhh zzhhVar, String str, boolean z4) {
        Objects.requireNonNull(zzhhVar);
        this.zza = zzhhVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = z4;
    }

    @WorkerThread
    public final boolean zza() {
        if (!this.zzd) {
            this.zzd = true;
            zzhh zzhhVar = this.zza;
            this.zze = zzhhVar.zzd().getBoolean(this.zzb, this.zzc);
        }
        return this.zze;
    }

    @WorkerThread
    public final void zzb(boolean z4) {
        SharedPreferences.Editor editorEdit = this.zza.zzd().edit();
        editorEdit.putBoolean(this.zzb, z4);
        editorEdit.apply();
        this.zze = z4;
    }
}
