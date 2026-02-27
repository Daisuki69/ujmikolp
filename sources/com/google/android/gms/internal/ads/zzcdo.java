package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzcdo implements zzada {
    static final /* synthetic */ zzcdo zza = new zzcdo();

    private /* synthetic */ zzcdo() {
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final /* synthetic */ zzacu[] zza() {
        int i = zzcds.zza;
        return new zzacu[]{new zzaim(), new zzagz()};
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final /* synthetic */ zzacu[] zzb(Uri uri, Map map) {
        return AbstractC1171e.a(this, uri, map);
    }
}
