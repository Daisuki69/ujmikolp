package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbwm;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbb {
    public static final /* synthetic */ int zza = 0;
    private static final zzbb zzb = new zzbb();
    private final com.google.android.gms.ads.internal.util.client.zzf zzc;
    private final zzaz zzd;
    private final String zze;
    private final VersionInfoParcel zzf;
    private final Random zzg;

    public zzbb() {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = new com.google.android.gms.ads.internal.util.client.zzf();
        zzaz zzazVar = new zzaz(new zzk(), new zzi(), new zzff(), new zzbhs(), new zzbwm(), new zzbst(), new zzbht(), new zzl());
        String strZzi = com.google.android.gms.ads.internal.util.client.zzf.zzi();
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
        this.zzc = zzfVar;
        this.zzd = zzazVar;
        this.zze = strZzi;
        this.zzf = versionInfoParcel;
        this.zzg = random;
    }

    public static com.google.android.gms.ads.internal.util.client.zzf zza() {
        return zzb.zzc;
    }

    public static zzaz zzb() {
        return zzb.zzd;
    }

    public static String zzc() {
        return zzb.zze;
    }

    public static VersionInfoParcel zzd() {
        return zzb.zzf;
    }

    public static Random zze() {
        return zzb.zzg;
    }
}
