package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes3.dex */
final class zzw extends zzz {
    final /* synthetic */ zzr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzw(zzx zzxVar, zzaa zzaaVar, CharSequence charSequence, zzr zzrVar) {
        super(zzaaVar, charSequence);
        this.zza = zzrVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final int zzd(int i) {
        CharSequence charSequence = ((zzz) this).zzb;
        int length = charSequence.length();
        zzv.zzb(i, length, "index");
        while (i < length) {
            if (this.zza.zza(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
