package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzlg implements InterfaceC2295c {
    static final zzlg zza = new zzlg();
    private static final C2294b zzb;

    static {
        zzfe zzfeVarI = AbstractC1173g.i(1);
        HashMap map = new HashMap();
        map.put(zzfeVarI.annotationType(), zzfeVarI);
        zzb = new C2294b("errorCode", c.r(map));
    }

    private zzlg() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ((InterfaceC2296d) obj2).add(zzb, ((zzru) obj).zza());
    }
}
