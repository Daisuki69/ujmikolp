package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.dynatrace.android.agent.Global;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzehr implements zzgob {
    private final zzfhh zza;
    private final zzcvu zzb;
    private final zzfjr zzc;
    private final zzfjv zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcqv zzg;
    private final zzehk zzh;
    private final zzeee zzi;
    private final Context zzj;
    private final zzfib zzk;
    private final zzegu zzl;
    private final zzdsg zzm;

    public zzehr(Context context, zzfhh zzfhhVar, zzehk zzehkVar, zzcvu zzcvuVar, zzfjr zzfjrVar, zzfjv zzfjvVar, zzcqv zzcqvVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzeee zzeeeVar, zzfib zzfibVar, zzegu zzeguVar, zzdsg zzdsgVar) {
        this.zzj = context;
        this.zza = zzfhhVar;
        this.zzh = zzehkVar;
        this.zzb = zzcvuVar;
        this.zzc = zzfjrVar;
        this.zzd = zzfjvVar;
        this.zzg = zzcqvVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeeeVar;
        this.zzk = zzfibVar;
        this.zzl = zzeguVar;
        this.zzm = zzdsgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String zzb(com.google.android.gms.internal.ads.zzfcu r5) {
        /*
            com.google.android.gms.internal.ads.zzbbz r0 = com.google.android.gms.internal.ads.zzbci.zzga
            com.google.android.gms.internal.ads.zzbcg r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.zzfct r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfcm r5 = r5.zzb
            int r2 = r5.zzf
            if (r2 == 0) goto L5b
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.zzbbz r2 = com.google.android.gms.internal.ads.zzbci.zzfZ
            com.google.android.gms.internal.ads.zzbcg r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L5b
            goto L5c
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L5c
        L45:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 35
            r1.<init>(r0)
            java.lang.String r0 = "Received error HTTP response code: "
            java.lang.String r1 = androidx.camera.core.impl.a.o(r1, r0, r2)
            goto L5c
        L5b:
            r1 = r0
        L5c:
            com.google.android.gms.internal.ads.zzfcl r5 = r5.zzj
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.zza()
            return r5
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehr.zzb(com.google.android.gms.internal.ads.zzfcu):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ S1.y zza(Object obj) throws Exception {
        int i;
        Bundle bundle;
        final zzfcu zzfcuVar = (zzfcu) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue() && (bundle = zzfcuVar.zzb.zzd) != null) {
            this.zzm.zze().putAll(bundle);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcs)).booleanValue()) {
            androidx.media3.datasource.cache.c.v(this.zzm.zze(), zzdru.RENDERING_START.zza());
        }
        String strZzb = zzb(zzfcuVar);
        zzeee zzeeeVar = this.zzi;
        zzfct zzfctVar = zzfcuVar.zzb;
        zzfcm zzfcmVar = zzfctVar.zzb;
        zzeeeVar.zza(zzfcmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjb)).booleanValue() && (i = zzfcmVar.zzf) != 0 && (i < 200 || i >= 300)) {
            return zzgot.zzc(new zzeho(3, strZzb));
        }
        String str = zzfcmVar.zzq;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdZ)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfcj zzfcjVar : zzfctVar.zza) {
                zzeeeVar.zzb(zzfcjVar);
                Iterator it = zzfcjVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzeeeVar.zze(zzfcjVar, 0L, zzfee.zzd(1, null, null));
                        break;
                    }
                    zzedz zzedzVarZza = this.zzg.zza(zzfcjVar.zzb, (String) it.next());
                    if (zzedzVarZza == null || !zzedzVarZza.zza(zzfcuVar, zzfcjVar)) {
                    }
                }
            }
        } else {
            zzeeeVar.zzc(str, zzfctVar.zza);
        }
        zzcvu zzcvuVar = this.zzb;
        zzcmm zzcmmVar = new zzcmm(zzfcuVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzcvuVar.zzq(zzcmmVar, executor);
        if (zzfcmVar.zzr > 1) {
            return this.zzl.zza(zzfcuVar);
        }
        String strZzb2 = zzb(zzfcuVar);
        zzfhh zzfhhVar = this.zza;
        zzfhb zzfhbVar = zzfhb.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfhhVar);
        zzfgo zzfgoVarZzi = zzfgs.zza(zzgot.zzc(new zzeho(3, strZzb2)), zzfhbVar, zzfhhVar).zzi();
        final zzehk zzehkVar = this.zzh;
        zzehkVar.zza();
        int i4 = 0;
        for (final zzfcj zzfcjVar2 : zzfctVar.zza) {
            Iterator it2 = zzfcjVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                final zzedz zzedzVarZza2 = this.zzg.zza(zzfcjVar2.zzb, str2);
                if (zzedzVarZza2 != null && zzedzVarZza2.zza(zzfcuVar, zzfcjVar2)) {
                    zzfgy zzfgyVarZza = zzfhhVar.zza(zzfhb.RENDER_CONFIG_WATERFALL, zzfgoVarZzi);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 15 + String.valueOf(str2).length());
                    sb2.append("render-config-");
                    sb2.append(i4);
                    sb2.append(Global.HYPHEN);
                    sb2.append(str2);
                    zzfgoVarZzi = zzfgyVarZza.zza(sb2.toString()).zzg(Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzehq
                        @Override // com.google.android.gms.internal.ads.zzgob
                        public final /* synthetic */ S1.y zza(Object obj2) {
                            return this.zza.zzc(zzfcjVar2, zzfcuVar, zzedzVarZza2, (Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i4++;
        }
        zzfgoVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzehkVar.zzb();
            }
        }, executor);
        return zzfgoVarZzi;
    }

    public final /* synthetic */ S1.y zzc(zzfcj zzfcjVar, zzfcu zzfcuVar, zzedz zzedzVar, Throwable th2) {
        zzfhr zzfhrVarA = s.a(this.zzj, 12);
        zzfhrVarA.zzi(zzfcjVar.zzE);
        zzfhrVarA.zza();
        S1.y yVarZzi = zzgot.zzi(zzedzVar.zzb(zzfcuVar, zzfcjVar), zzfcjVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfcuVar, zzfcjVar, yVarZzi, this.zzc);
        zzfia.zzd(yVarZzi, this.zzk, zzfhrVarA);
        return yVarZzi;
    }
}
