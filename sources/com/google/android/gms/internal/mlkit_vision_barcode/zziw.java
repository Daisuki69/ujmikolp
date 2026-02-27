package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zziw implements InterfaceC2295c {
    static final zziw zza = new zziw();
    private static final C2294b zzb;

    static {
        zzfe zzfeVarI = AbstractC1173g.i(1);
        HashMap map = new HashMap();
        map.put(zzfeVarI.annotationType(), zzfeVarI);
        zzb = new C2294b("format", c.r(map));
    }

    private zziw() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ((InterfaceC2296d) obj2).add(zzb, ((zzvz) obj).zza());
    }
}
