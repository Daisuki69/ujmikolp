package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzlf implements InterfaceC2295c {
    static final zzlf zza = new zzlf();
    private static final C2294b zzb;
    private static final C2294b zzc;
    private static final C2294b zzd;
    private static final C2294b zze;
    private static final C2294b zzf;

    static {
        zzfe zzfeVarI = AbstractC1173g.i(1);
        HashMap map = new HashMap();
        map.put(zzfeVarI.annotationType(), zzfeVarI);
        zzb = new C2294b("inferenceCommonLogEvent", c.r(map));
        zzfe zzfeVarI2 = AbstractC1173g.i(2);
        HashMap map2 = new HashMap();
        map2.put(zzfeVarI2.annotationType(), zzfeVarI2);
        zzc = new C2294b("options", c.r(map2));
        zzfe zzfeVarI3 = AbstractC1173g.i(3);
        HashMap map3 = new HashMap();
        map3.put(zzfeVarI3.annotationType(), zzfeVarI3);
        zzd = new C2294b("detectedBarcodeFormats", c.r(map3));
        zzfe zzfeVarI4 = AbstractC1173g.i(4);
        HashMap map4 = new HashMap();
        map4.put(zzfeVarI4.annotationType(), zzfeVarI4);
        zze = new C2294b("detectedBarcodeValueTypes", c.r(map4));
        zzfe zzfeVarI5 = AbstractC1173g.i(5);
        HashMap map5 = new HashMap();
        map5.put(zzfeVarI5.annotationType(), zzfeVarI5);
        zzf = new C2294b("imageInfo", c.r(map5));
    }

    private zzlf() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzrr zzrrVar = (zzrr) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(zzb, zzrrVar.zzd());
        interfaceC2296d.add(zzc, zzrrVar.zze());
        interfaceC2296d.add(zzd, zzrrVar.zza());
        interfaceC2296d.add(zze, zzrrVar.zzb());
        interfaceC2296d.add(zzf, zzrrVar.zzc());
    }
}
