package com.google.android.gms.internal.mlkit_vision_face;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzhf implements InterfaceC2295c {
    static final zzhf zza = new zzhf();
    private static final C2294b zzb;
    private static final C2294b zzc;
    private static final C2294b zzd;
    private static final C2294b zze;
    private static final C2294b zzf;
    private static final C2294b zzg;

    static {
        zzcu zzcuVarL = AbstractC1173g.l(1);
        HashMap map = new HashMap();
        map.put(zzcuVarL.annotationType(), zzcuVarL);
        zzb = new C2294b("inferenceCommonLogEvent", c.r(map));
        zzcu zzcuVarL2 = AbstractC1173g.l(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarL2.annotationType(), zzcuVarL2);
        zzc = new C2294b("options", c.r(map2));
        zzcu zzcuVarL3 = AbstractC1173g.l(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarL3.annotationType(), zzcuVarL3);
        zzd = new C2294b("imageInfo", c.r(map3));
        zzcu zzcuVarL4 = AbstractC1173g.l(4);
        HashMap map4 = new HashMap();
        map4.put(zzcuVarL4.annotationType(), zzcuVarL4);
        zze = new C2294b("detectorOptions", c.r(map4));
        zzcu zzcuVarL5 = AbstractC1173g.l(5);
        HashMap map5 = new HashMap();
        map5.put(zzcuVarL5.annotationType(), zzcuVarL5);
        zzf = new C2294b("contourDetectedFaces", c.r(map5));
        zzcu zzcuVarL6 = AbstractC1173g.l(6);
        HashMap map6 = new HashMap();
        map6.put(zzcuVarL6.annotationType(), zzcuVarL6);
        zzg = new C2294b("nonContourDetectedFaces", c.r(map6));
    }

    private zzhf() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzll zzllVar = (zzll) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(zzb, zzllVar.zzc());
        interfaceC2296d.add(zzc, (Object) null);
        interfaceC2296d.add(zzd, zzllVar.zzb());
        interfaceC2296d.add(zze, zzllVar.zza());
        interfaceC2296d.add(zzf, zzllVar.zzd());
        interfaceC2296d.add(zzg, zzllVar.zze());
    }
}
