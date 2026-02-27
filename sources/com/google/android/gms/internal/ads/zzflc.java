package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzflc {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ScheduledExecutorService zzc;
    private final ClientApi zzd = new ClientApi();
    private final zzfdy zze;
    private final Clock zzf;

    public zzflc(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, zzfdy zzfdyVar, Clock clock) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = scheduledExecutorService;
        this.zzf = clock;
        this.zze = zzfdyVar;
    }

    private static zzfkf zzc() {
        return new zzfkf(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzC)).longValue(), 2.0d, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzD)).longValue(), 0.2d);
    }

    @Nullable
    public final zzflb zza(com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzce zzceVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzb;
            return new zzfkh(clientApi, context, versionInfoParcel.clientJarVersion, this.zze, zzftVar, zzceVar, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zzd;
            Context context2 = this.zza;
            VersionInfoParcel versionInfoParcel2 = this.zzb;
            return new zzflf(clientApi2, context2, versionInfoParcel2.clientJarVersion, this.zze, zzftVar, zzceVar, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zzd;
        Context context3 = this.zza;
        VersionInfoParcel versionInfoParcel3 = this.zzb;
        return new zzfke(clientApi3, context3, versionInfoParcel3.clientJarVersion, this.zze, zzftVar, zzceVar, this.zzc, zzc(), this.zzf);
    }

    @Nullable
    public final zzflb zzb(String str, com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzch zzchVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzb;
            return new zzfkh(str, clientApi, context, versionInfoParcel.clientJarVersion, this.zze, zzftVar, zzchVar, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zzd;
            Context context2 = this.zza;
            VersionInfoParcel versionInfoParcel2 = this.zzb;
            return new zzflf(str, clientApi2, context2, versionInfoParcel2.clientJarVersion, this.zze, zzftVar, zzchVar, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zzd;
        Context context3 = this.zza;
        VersionInfoParcel versionInfoParcel3 = this.zzb;
        return new zzfke(str, clientApi3, context3, versionInfoParcel3.clientJarVersion, this.zze, zzftVar, zzchVar, this.zzc, zzc(), this.zzf);
    }
}
