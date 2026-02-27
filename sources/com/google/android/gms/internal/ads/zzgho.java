package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzgho extends zzggi {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = Integer.MAX_VALUE;

    public zzgho(zzghq zzghqVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzggi
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzd;
        int i = this.zzc;
        while (true) {
            int i4 = this.zzc;
            if (i4 == -1) {
                zzb();
                return null;
            }
            int iZzc = zzc(i4);
            if (iZzc == -1) {
                iZzc = this.zzb.length();
                this.zzc = -1;
                iZzd = -1;
            } else {
                iZzd = zzd(iZzc);
                this.zzc = iZzd;
            }
            if (iZzd != i) {
                if (i < iZzc) {
                    this.zzb.charAt(i);
                }
                if (i < iZzc) {
                    this.zzb.charAt(iZzc - 1);
                }
                int i6 = this.zzd;
                if (i6 == 1) {
                    CharSequence charSequence = this.zzb;
                    int length = charSequence.length();
                    this.zzc = -1;
                    if (length > i) {
                        charSequence.charAt(length - 1);
                    }
                    iZzc = length;
                } else {
                    this.zzd = i6 - 1;
                }
                return this.zzb.subSequence(i, iZzc).toString();
            }
            int i10 = iZzd + 1;
            this.zzc = i10;
            if (i10 > this.zzb.length()) {
                this.zzc = -1;
            }
        }
    }

    public abstract int zzc(int i);

    public abstract int zzd(int i);
}
