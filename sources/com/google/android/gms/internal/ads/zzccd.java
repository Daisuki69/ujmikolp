package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzccd extends zzaqo {
    static final zzccd zzb = new zzccd();

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final zzaqs zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzaqu() : "mvhd".equals(str) ? new zzaqv() : new zzaqw(str);
    }
}
