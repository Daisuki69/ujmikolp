package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfbw implements zzely {
    private final Context zza;
    private final Executor zzb;
    private final zzcgv zzc;
    private final zzfbn zzd;
    private final zzfab zze;
    private final zzfcv zzf;
    private final zzfie zzg;
    private final zzfdb zzh;
    private S1.y zzi;

    public zzfbw(Context context, Executor executor, zzcgv zzcgvVar, zzfab zzfabVar, zzfbn zzfbnVar, zzfdb zzfdbVar, zzfcv zzfcvVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgvVar;
        this.zze = zzfabVar;
        this.zzd = zzfbnVar;
        this.zzh = zzfdbVar;
        this.zzf = zzfcvVar;
        this.zzg = zzcgvVar.zzv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzdoq zze(zzezz zzezzVar) {
        zzdoq zzdoqVarZzn = this.zzc.zzn();
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.zza(this.zza);
        zzcvaVar.zzb(((zzfbv) zzezzVar).zza);
        zzcvaVar.zzf(this.zzf);
        zzdoqVarZzn.zzd(zzcvaVar.zze());
        zzdoqVarZzn.zze(new zzdbr().zzn());
        return zzdoqVarZzn;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzely
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm r12, java.lang.String r13, com.google.android.gms.internal.ads.zzelw r14, com.google.android.gms.internal.ads.zzelx r15) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbw.zza(com.google.android.gms.ads.internal.client.zzm, java.lang.String, com.google.android.gms.internal.ads.zzelw, com.google.android.gms.internal.ads.zzelx):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        throw null;
    }

    public final /* synthetic */ void zzc() {
        this.zzd.zzdN(zzfee.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zzf() {
        return this.zzb;
    }

    public final /* synthetic */ zzfbn zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzfab zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzfie zzi() {
        return this.zzg;
    }

    public final void zzj(int i) {
        this.zzh.zzj().zza(i);
    }
}
