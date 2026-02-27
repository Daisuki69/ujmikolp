package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzz extends zzm {
    final CharSequence zzb;
    final zzr zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Integer.MAX_VALUE;

    public zzz(zzaa zzaaVar, CharSequence charSequence) {
        this.zzc = zzaaVar.zza;
        this.zzd = zzaaVar.zzb;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzm
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzd;
        int iZzc;
        int i = this.zze;
        while (true) {
            int i4 = this.zze;
            if (i4 == -1) {
                zzb();
                return null;
            }
            iZzd = zzd(i4);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zze = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zze = iZzc;
            }
            if (iZzc == i) {
                int i6 = iZzc + 1;
                this.zze = i6;
                if (i6 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i < iZzd) {
                    this.zzb.charAt(i);
                }
                if (i < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                if (!this.zzd || i != iZzd) {
                    break;
                }
                i = this.zze;
            }
        }
        int i10 = this.zzf;
        if (i10 == 1) {
            iZzd = this.zzb.length();
            this.zze = -1;
            if (iZzd > i) {
                this.zzb.charAt(iZzd - 1);
            }
        } else {
            this.zzf = i10 - 1;
        }
        return this.zzb.subSequence(i, iZzd).toString();
    }

    public abstract int zzc(int i);

    public abstract int zzd(int i);
}
