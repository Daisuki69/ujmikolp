package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzkg implements InterfaceC2295c {
    static final zzkg zza = new zzkg();
    private static final C2294b zzb;
    private static final C2294b zzc;
    private static final C2294b zzd;
    private static final C2294b zze;

    static {
        zzfe zzfeVarI = AbstractC1173g.i(1);
        HashMap map = new HashMap();
        map.put(zzfeVarI.annotationType(), zzfeVarI);
        zzb = new C2294b("imageFormat", c.r(map));
        zzfe zzfeVarI2 = AbstractC1173g.i(2);
        HashMap map2 = new HashMap();
        map2.put(zzfeVarI2.annotationType(), zzfeVarI2);
        zzc = new C2294b("originalImageSize", c.r(map2));
        zzfe zzfeVarI3 = AbstractC1173g.i(3);
        HashMap map3 = new HashMap();
        map3.put(zzfeVarI3.annotationType(), zzfeVarI3);
        zzd = new C2294b("compressedImageSize", c.r(map3));
        zzfe zzfeVarI4 = AbstractC1173g.i(4);
        HashMap map4 = new HashMap();
        map4.put(zzfeVarI4.annotationType(), zzfeVarI4);
        zze = new C2294b("isOdmlImage", c.r(map4));
    }

    private zzkg() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqk zzqkVar = (zzqk) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(zzb, zzqkVar.zza());
        interfaceC2296d.add(zzc, zzqkVar.zzb());
        interfaceC2296d.add(zzd, (Object) null);
        interfaceC2296d.add(zze, (Object) null);
    }
}
