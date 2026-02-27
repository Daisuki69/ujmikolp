package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzcdp implements zzada {
    static final /* synthetic */ zzcdp zza = new zzcdp();

    private /* synthetic */ zzcdp() {
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final /* synthetic */ zzacu[] zza() {
        int i = zzcds.zza;
        return new zzacu[]{new zzaim(), new zzagz(), new zzaif(zzajt.zza, 32, null, null, zzgjz.zzi(), null)};
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final /* synthetic */ zzacu[] zzb(Uri uri, Map map) {
        return AbstractC1171e.a(this, uri, map);
    }
}
