package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzt implements zzggr {
    static final /* synthetic */ zzt zza = new zzt();

    private /* synthetic */ zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    public final /* synthetic */ Object apply(Object obj) {
        zzw zzwVar = (zzw) obj;
        int i = zzu.zzO;
        String str = zzwVar.zza;
        String str2 = zzwVar.zzb;
        return We.s.q(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length()), str, ": ", str2);
    }
}
