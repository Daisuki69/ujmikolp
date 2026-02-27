package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqg;

/* JADX INFO: loaded from: classes2.dex */
public final class CsiParamDefaults_Factory implements zzhpx<CsiParamDefaults> {
    private final zzhqg zza;
    private final zzhqg zzb;

    private CsiParamDefaults_Factory(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static CsiParamDefaults_Factory create(zzhqg<Context> zzhqgVar, zzhqg<VersionInfoParcel> zzhqgVar2) {
        return new CsiParamDefaults_Factory(zzhqgVar, zzhqgVar2);
    }

    @NonNull
    public static CsiParamDefaults newInstance(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel) {
        return new CsiParamDefaults(context, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    @NonNull
    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.zza.zzb(), (VersionInfoParcel) this.zzb.zzb());
    }
}
