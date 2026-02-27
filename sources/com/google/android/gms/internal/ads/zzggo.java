package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzggo implements zzghd {
    public static zzggo zzc(char c) {
        return new zzggl(c);
    }

    @Override // com.google.android.gms.internal.ads.zzghd
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
