package com.google.android.gms.internal.mlkit_common;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzgk implements InterfaceC2295c {
    static final zzgk zza = new zzgk();
    private static final C2294b zzb;

    static {
        zzbc zzbcVarG = AbstractC1173g.g(1);
        HashMap map = new HashMap();
        map.put(zzbcVarG.annotationType(), zzbcVarG);
        zzb = new C2294b("api", c.r(map));
    }

    private zzgk() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ((InterfaceC2296d) obj2).add(zzb, ((zzmp) obj).zza());
    }
}
