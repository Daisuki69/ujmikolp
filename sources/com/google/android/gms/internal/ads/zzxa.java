package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzxa extends zzxv implements Comparable {
    private final int zze;
    private final boolean zzf;

    @Nullable
    private final String zzg;
    private final zzxo zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzxa(int r14, com.google.android.gms.internal.ads.zzbf r15, int r16, com.google.android.gms.internal.ads.zzxo r17, int r18, boolean r19, com.google.android.gms.internal.ads.zzghd r20, int r21) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxa.<init>(int, com.google.android.gms.internal.ads.zzbf, int, com.google.android.gms.internal.ads.zzxo, int, boolean, com.google.android.gms.internal.ads.zzghd, int):void");
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxa zzxaVar) {
        boolean z4 = this.zzf;
        zzglj zzgljVarZza = (z4 && this.zzi) ? zzyd.zzc : zzyd.zzc.zza();
        zzgjp zzgjpVarZza = zzgjp.zzg().zzd(this.zzi, zzxaVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzxaVar.zzk), zzglj.zzb().zza()).zzb(this.zzj, zzxaVar.zzj).zzb(this.zzl, zzxaVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzxaVar.zzm), zzglj.zzb().zza()).zzd(this.zzq, zzxaVar.zzq).zzd(this.zzn, zzxaVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzxaVar.zzo), zzglj.zzb().zza()).zzb(this.zzp, zzxaVar.zzp).zzd(z4, zzxaVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzxaVar.zzu), zzglj.zzb().zza());
        boolean z5 = this.zzh.zzF;
        zzgjp zzgjpVarZza2 = zzgjpVarZza.zzd(this.zzv, zzxaVar.zzv).zzd(this.zzw, zzxaVar.zzw).zzd(this.zzx, zzxaVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzxaVar.zzr), zzgljVarZza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzxaVar.zzs), zzgljVarZza);
        if (Objects.equals(this.zzg, zzxaVar.zzg)) {
            zzgjpVarZza2 = zzgjpVarZza2.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzxaVar.zzt), zzgljVarZza);
        }
        return zzgjpVarZza2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final /* bridge */ /* synthetic */ boolean zzc(zzxv zzxvVar) {
        String str;
        int i;
        zzxa zzxaVar = (zzxa) zzxvVar;
        boolean z4 = this.zzh.zzR;
        zzu zzuVar = this.zzd;
        int i4 = zzuVar.zzG;
        if (i4 == -1) {
            return false;
        }
        zzu zzuVar2 = zzxaVar.zzd;
        return i4 == zzuVar2.zzG && (str = zzuVar.zzo) != null && TextUtils.equals(str, zzuVar2.zzo) && (i = zzuVar.zzH) != -1 && i == zzuVar2.zzH && this.zzv == zzxaVar.zzv && this.zzw == zzxaVar.zzw;
    }
}
