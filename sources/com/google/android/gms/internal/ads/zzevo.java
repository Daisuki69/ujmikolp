package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevo implements zzeup {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbyn zzg;

    public zzevo(zzbyn zzbynVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z4, boolean z5) {
        this.zzg = zzbynVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z4;
        this.zzf = z5;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final S1.y zza() {
        zzgol zzgolVarZzw = zzgol.zzw(this.zzg.zza(this.zza, this.zzd));
        zzggr zzggrVar = new zzggr() { // from class: com.google.android.gms.internal.ads.zzevn
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((AdvertisingIdClient.Info) obj);
            }
        };
        Executor executor = this.zzc;
        return (zzgol) zzgot.zzg((zzgol) zzgot.zzi((zzgol) zzgot.zzk(zzgolVarZzw, zzggrVar, executor), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbj)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzggr() { // from class: com.google.android.gms.internal.ads.zzevm
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 40;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzevp zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzfti r0 = new com.google.android.gms.internal.ads.zzfti
            r0.<init>()
            boolean r1 = r7.zze
            if (r1 != 0) goto L1c
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zzdA
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2f
            goto L6b
        L1c:
            com.google.android.gms.internal.ads.zzbbz r1 = com.google.android.gms.internal.ads.zzbci.zzdB
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2f
            goto L6b
        L2f:
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            com.google.android.gms.internal.ads.zzftm r1 = com.google.android.gms.internal.ads.zzftm.zzh(r0)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.lang.String r2 = r8.getId()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            com.google.android.gms.internal.ads.zzbbz r0 = com.google.android.gms.internal.ads.zzbci.zzdG     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.lang.Object r0 = r4.zzd(r0)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            boolean r6 = r7.zzf     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            com.google.android.gms.internal.ads.zzfti r0 = r1.zzj(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            goto L6b
        L5a:
            r0 = move-exception
            goto L5d
        L5c:
            r0 = move-exception
        L5d:
            java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
            com.google.android.gms.internal.ads.zzbyv r2 = com.google.android.gms.ads.internal.zzt.zzh()
            r2.zzg(r0, r1)
            com.google.android.gms.internal.ads.zzfti r0 = new com.google.android.gms.internal.ads.zzfti
            r0.<init>()
        L6b:
            com.google.android.gms.internal.ads.zzevp r1 = new com.google.android.gms.internal.ads.zzevp
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzevo.zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):com.google.android.gms.internal.ads.zzevp");
    }

    public final /* synthetic */ zzevp zzd(Throwable th2) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzevp(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfti());
    }
}
