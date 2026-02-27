package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzyc extends zzxv {
    private final boolean zze;
    private final zzxo zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzyc(int r5, com.google.android.gms.internal.ads.zzbf r6, int r7, com.google.android.gms.internal.ads.zzxo r8, int r9, @androidx.annotation.Nullable java.lang.String r10, int r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyc.<init>(int, com.google.android.gms.internal.ads.zzbf, int, com.google.android.gms.internal.ads.zzxo, int, java.lang.String, int, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzyc zzycVar, zzyc zzycVar2) {
        zzgjp zzgjpVarZza = zzgjp.zzg().zzd(zzycVar.zzh, zzycVar2.zzh).zza(Integer.valueOf(zzycVar.zzm), Integer.valueOf(zzycVar2.zzm), zzglj.zzb().zza()).zzb(zzycVar.zzn, zzycVar2.zzn).zzb(zzycVar.zzo, zzycVar2.zzo).zza(Integer.valueOf(zzycVar.zzp), Integer.valueOf(zzycVar2.zzp), zzglj.zzb().zza()).zzd(zzycVar.zzq, zzycVar2.zzq).zzb(zzycVar.zzr, zzycVar2.zzr).zzd(zzycVar.zzi, zzycVar2.zzi).zzd(zzycVar.zze, zzycVar2.zze).zzd(zzycVar.zzg, zzycVar2.zzg).zza(Integer.valueOf(zzycVar.zzl), Integer.valueOf(zzycVar2.zzl), zzglj.zzb().zza());
        boolean z4 = zzycVar.zzt;
        zzgjp zzgjpVarZzd = zzgjpVarZza.zzd(z4, zzycVar2.zzt);
        boolean z5 = zzycVar.zzu;
        zzgjp zzgjpVarZzd2 = zzgjpVarZzd.zzd(z5, zzycVar2.zzu);
        if (z4 && z5) {
            zzgjpVarZzd2 = zzgjpVarZzd2.zzb(zzycVar.zzv, zzycVar2.zzv);
        }
        return zzgjpVarZzd2.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzyc zzycVar, zzyc zzycVar2) {
        zzglj zzgljVarZza = (zzycVar.zze && zzycVar.zzh) ? zzyd.zzc : zzyd.zzc.zza();
        zzgjp zzgjpVarZzg = zzgjp.zzg();
        boolean z4 = zzycVar.zzf.zzF;
        return zzgjpVarZzg.zza(Integer.valueOf(zzycVar.zzk), Integer.valueOf(zzycVar2.zzk), zzgljVarZza).zza(Integer.valueOf(zzycVar.zzj), Integer.valueOf(zzycVar2.zzj), zzgljVarZza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final /* bridge */ /* synthetic */ boolean zzc(zzxv zzxvVar) {
        zzyc zzycVar = (zzyc) zzxvVar;
        if (!Objects.equals(this.zzd.zzo, zzycVar.zzd.zzo)) {
            return false;
        }
        boolean z4 = this.zzf.zzN;
        return this.zzt == zzycVar.zzt && this.zzu == zzycVar.zzu;
    }
}
