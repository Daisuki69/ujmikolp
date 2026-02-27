package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcmi {

    @VisibleForTesting
    zzbtv zza;

    @VisibleForTesting
    zzbtv zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzedv zze;
    private final zzdpn zzf;
    private final zzgpd zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    public zzcmi(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzedv zzedvVar, zzdpn zzdpnVar, zzgpd zzgpdVar, zzgpd zzgpdVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzedvVar;
        this.zzf = zzdpnVar;
        this.zzg = zzgpdVar;
        this.zzh = zzgpdVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkX));
    }

    private final S1.y zzk(final String str, @Nullable final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkX)) || this.zzd.zzx()) {
                return zzgot.zza(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkY), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return (zzgol) zzgot.zzh((zzgol) zzgot.zzj(zzgol.zzw(this.zze.zza()), new zzgob() { // from class: com.google.android.gms.internal.ads.zzcmc
                    @Override // com.google.android.gms.internal.ads.zzgob
                    public final /* synthetic */ S1.y zza(Object obj) {
                        return this.zza.zze(builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzcmd
                    @Override // com.google.android.gms.internal.ads.zzgob
                    public final /* synthetic */ S1.y zza(Object obj) {
                        return this.zza.zzf(builderBuildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkZ), "11");
            return zzgot.zza(builderBuildUpon.toString());
        } catch (Exception e) {
            return zzgot.zzc(e);
        }
    }

    public final void zza(String str, zzfjv zzfjvVar, Random random, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgot.zzq(zzgot.zzi(zzk(str, this.zzf.zzb(), random), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzld)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcmb(this, zzfjvVar, str, zzvVar), this.zzg);
    }

    public final S1.y zzb(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzgot.zza(str) : zzgot.zzh(zzk(str, this.zzf.zzb(), random), Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzcmh
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzd(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    public final /* synthetic */ S1.y zzd(String str, final Throwable th2) {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh(th2);
            }
        });
        return zzgot.zza(str);
    }

    public final /* synthetic */ S1.y zze(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkZ), "10");
            return zzgot.zza(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzla), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkZ), "12");
        if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlb))) {
            builderBuildUpon.authority((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlc));
        }
        return (zzgol) zzgot.zzj(zzgol.zzw(this.zze.zzb(builderBuildUpon.build(), inputEvent)), new zzgob() { // from class: com.google.android.gms.internal.ads.zzcme
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkZ);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzgot.zza(builder2.toString());
            }
        }, this.zzh);
    }

    public final /* synthetic */ S1.y zzf(Uri.Builder builder, final Throwable th2) {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(th2);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkZ), "9");
        return zzgot.zza(builder.toString());
    }

    public final /* synthetic */ void zzg(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzle)).booleanValue()) {
            zzbtv zzbtvVarZzc = zzbtt.zzc(this.zzc);
            this.zzb = zzbtvVarZzc;
            zzbtvVarZzc.zzh(th2, "AttributionReporting");
        } else {
            zzbtv zzbtvVarZza = zzbtt.zza(this.zzc);
            this.zza = zzbtvVarZza;
            zzbtvVarZza.zzh(th2, "AttributionReportingSampled");
        }
    }

    public final /* synthetic */ void zzh(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzle)).booleanValue()) {
            zzbtv zzbtvVarZzc = zzbtt.zzc(this.zzc);
            this.zzb = zzbtvVarZzc;
            zzbtvVarZzc.zzh(th2, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbtv zzbtvVarZza = zzbtt.zza(this.zzc);
            this.zza = zzbtvVarZza;
            zzbtvVarZza.zzh(th2, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    public final /* synthetic */ Context zzi() {
        return this.zzc;
    }

    public final /* synthetic */ zzgpd zzj() {
        return this.zzg;
    }
}
