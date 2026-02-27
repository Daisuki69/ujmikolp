package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzka implements InterfaceC2295c {
    static final zzka zza = new zzka();
    private static final C2294b zzb;
    private static final C2294b zzc;
    private static final C2294b zzd;
    private static final C2294b zze;
    private static final C2294b zzf;
    private static final C2294b zzg;

    static {
        zzfe zzfeVarI = AbstractC1173g.i(1);
        HashMap map = new HashMap();
        map.put(zzfeVarI.annotationType(), zzfeVarI);
        zzb = new C2294b("maxMs", c.r(map));
        zzfe zzfeVarI2 = AbstractC1173g.i(2);
        HashMap map2 = new HashMap();
        map2.put(zzfeVarI2.annotationType(), zzfeVarI2);
        zzc = new C2294b("minMs", c.r(map2));
        zzfe zzfeVarI3 = AbstractC1173g.i(3);
        HashMap map3 = new HashMap();
        map3.put(zzfeVarI3.annotationType(), zzfeVarI3);
        zzd = new C2294b("avgMs", c.r(map3));
        zzfe zzfeVarI4 = AbstractC1173g.i(4);
        HashMap map4 = new HashMap();
        map4.put(zzfeVarI4.annotationType(), zzfeVarI4);
        zze = new C2294b("firstQuartileMs", c.r(map4));
        zzfe zzfeVarI5 = AbstractC1173g.i(5);
        HashMap map5 = new HashMap();
        map5.put(zzfeVarI5.annotationType(), zzfeVarI5);
        zzf = new C2294b("medianMs", c.r(map5));
        zzfe zzfeVarI6 = AbstractC1173g.i(6);
        HashMap map6 = new HashMap();
        map6.put(zzfeVarI6.annotationType(), zzfeVarI6);
        zzg = new C2294b("thirdQuartileMs", c.r(map6));
    }

    private zzka() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqd zzqdVar = (zzqd) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(zzb, zzqdVar.zzc());
        interfaceC2296d.add(zzc, zzqdVar.zze());
        interfaceC2296d.add(zzd, zzqdVar.zza());
        interfaceC2296d.add(zze, zzqdVar.zzb());
        interfaceC2296d.add(zzf, zzqdVar.zzd());
        interfaceC2296d.add(zzg, zzqdVar.zzf());
    }
}
