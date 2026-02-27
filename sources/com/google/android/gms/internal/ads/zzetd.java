package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetd implements zzeun {

    @Nullable
    private final String zza;

    @Nullable
    private final Integer zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final String zzd;

    @Nullable
    private final String zze;

    @Nullable
    private final String zzf;

    public zzetd(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        zzfdr.zze(bundle, "pn", this.zza);
        zzfdr.zzh(bundle, "vc", this.zzb);
        zzfdr.zze(bundle, "vnm", this.zzc);
        zzfdr.zze(bundle, CmcdConfiguration.KEY_DEADLINE, this.zzd);
        zzfdr.zze(bundle, "ins_pn", this.zze);
        zzfdr.zze(bundle, "ini_pn", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuu) obj).zzb;
        zzfdr.zze(bundle, "pn", this.zza);
        zzfdr.zze(bundle, CmcdConfiguration.KEY_DEADLINE, this.zzd);
    }
}
