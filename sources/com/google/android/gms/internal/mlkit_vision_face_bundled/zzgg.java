package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzgg implements InterfaceC2295c {
    static final zzgg zza = new zzgg();
    private static final C2294b zzb;
    private static final C2294b zzc;
    private static final C2294b zzd;
    private static final C2294b zze;
    private static final C2294b zzf;
    private static final C2294b zzg;

    static {
        zzbm zzbmVarM = AbstractC1173g.m(1);
        HashMap map = new HashMap();
        map.put(zzbmVarM.annotationType(), zzbmVarM);
        zzb = new C2294b("landmarkMode", c.r(map));
        zzbm zzbmVarM2 = AbstractC1173g.m(2);
        HashMap map2 = new HashMap();
        map2.put(zzbmVarM2.annotationType(), zzbmVarM2);
        zzc = new C2294b("classificationMode", c.r(map2));
        zzbm zzbmVarM3 = AbstractC1173g.m(3);
        HashMap map3 = new HashMap();
        map3.put(zzbmVarM3.annotationType(), zzbmVarM3);
        zzd = new C2294b("performanceMode", c.r(map3));
        zzbm zzbmVarM4 = AbstractC1173g.m(4);
        HashMap map4 = new HashMap();
        map4.put(zzbmVarM4.annotationType(), zzbmVarM4);
        zze = new C2294b("contourMode", c.r(map4));
        zzbm zzbmVarM5 = AbstractC1173g.m(5);
        HashMap map5 = new HashMap();
        map5.put(zzbmVarM5.annotationType(), zzbmVarM5);
        zzf = new C2294b("isTrackingEnabled", c.r(map5));
        zzbm zzbmVarM6 = AbstractC1173g.m(6);
        HashMap map6 = new HashMap();
        map6.put(zzbmVarM6.annotationType(), zzbmVarM6);
        zzg = new C2294b("minFaceSize", c.r(map6));
    }

    private zzgg() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzmp zzmpVar = (zzmp) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(zzb, zzmpVar.zzc());
        interfaceC2296d.add(zzc, zzmpVar.zza());
        interfaceC2296d.add(zzd, zzmpVar.zzd());
        interfaceC2296d.add(zze, zzmpVar.zzb());
        interfaceC2296d.add(zzf, zzmpVar.zze());
        interfaceC2296d.add(zzg, zzmpVar.zzf());
    }
}
