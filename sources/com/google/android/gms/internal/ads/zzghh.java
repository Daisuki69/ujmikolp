package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzghh extends zzgho {
    final /* synthetic */ zzggo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzghh(zzghq zzghqVar, CharSequence charSequence, zzggo zzggoVar) {
        super(zzghqVar, charSequence);
        this.zza = zzggoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgho
    public final int zzc(int i) {
        CharSequence charSequence = ((zzgho) this).zzb;
        int length = charSequence.length();
        zzghc.zzn(i, length, "index");
        while (i < length) {
            if (this.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgho
    public final int zzd(int i) {
        return i + 1;
    }
}
