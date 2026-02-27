package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcvn {
    @Nullable
    public static final zzbxf zza(Context context, VersionInfoParcel versionInfoParcel, zzfcj zzfcjVar, zzbxb zzbxbVar) {
        zzbxc zzbxcVar = zzfcjVar.zzA;
        if (zzbxcVar == null) {
            return null;
        }
        zzfco zzfcoVar = zzfcjVar.zzs;
        return new zzbxa(context, versionInfoParcel, zzbxcVar, zzfcoVar != null ? zzfcoVar.zzb : null, zzbxbVar);
    }
}
