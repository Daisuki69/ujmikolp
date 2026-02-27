package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import dOYHB6.yFtIp6.svM7M6;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhg {
    final /* synthetic */ zzhh zza;
    private final String zzb;
    private boolean zzc;
    private String zzd;

    public zzhg(zzhh zzhhVar, String str, String str2) {
        Objects.requireNonNull(zzhhVar);
        this.zza = zzhhVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
    }

    @WorkerThread
    public final String zza() {
        if (!this.zzc) {
            this.zzc = true;
            zzhh zzhhVar = this.zza;
            this.zzd = svM7M6.getString(zzhhVar.zzd(), this.zzb, null);
        }
        return this.zzd;
    }

    @WorkerThread
    public final void zzb(String str) {
        SharedPreferences.Editor editorEdit = this.zza.zzd().edit();
        editorEdit.putString(this.zzb, str);
        editorEdit.apply();
        this.zzd = str;
    }
}
