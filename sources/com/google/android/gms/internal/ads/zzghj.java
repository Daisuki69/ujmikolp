package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzghj extends zzgho {
    public zzghj(zzghq zzghqVar, CharSequence charSequence, int i) {
        super(zzghqVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgho
    public final int zzc(int i) {
        int i4 = i + 4000;
        if (i4 < ((zzgho) this).zzb.length()) {
            return i4;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgho
    public final int zzd(int i) {
        return i;
    }
}
