package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzgf implements InterfaceC2295c {
    static final zzgf zza = new zzgf();
    private static final C2294b zzb;
    private static final C2294b zzc;
    private static final C2294b zzd;

    static {
        zzbm zzbmVarM = AbstractC1173g.m(1);
        HashMap map = new HashMap();
        map.put(zzbmVarM.annotationType(), zzbmVarM);
        zzb = new C2294b("options", c.r(map));
        zzbm zzbmVarM2 = AbstractC1173g.m(2);
        HashMap map2 = new HashMap();
        map2.put(zzbmVarM2.annotationType(), zzbmVarM2);
        zzc = new C2294b("eventType", c.r(map2));
        zzbm zzbmVarM3 = AbstractC1173g.m(3);
        HashMap map3 = new HashMap();
        map3.put(zzbmVarM3.annotationType(), zzbmVarM3);
        zzd = new C2294b("errorCode", c.r(map3));
    }

    private zzgf() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzmi zzmiVar = (zzmi) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(zzb, zzmiVar.zza());
        interfaceC2296d.add(zzc, (Object) null);
        interfaceC2296d.add(zzd, zzmiVar.zzb());
    }
}
