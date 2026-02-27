package com.google.android.gms.internal.mlkit_vision_face;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzgj implements InterfaceC2295c {
    static final zzgj zza = new zzgj();
    private static final C2294b zzb;
    private static final C2294b zzc;
    private static final C2294b zzd;
    private static final C2294b zze;
    private static final C2294b zzf;
    private static final C2294b zzg;
    private static final C2294b zzh;
    private static final C2294b zzi;
    private static final C2294b zzj;
    private static final C2294b zzk;

    static {
        zzcu zzcuVarL = AbstractC1173g.l(1);
        HashMap map = new HashMap();
        map.put(zzcuVarL.annotationType(), zzcuVarL);
        zzb = new C2294b("durationMs", c.r(map));
        zzcu zzcuVarL2 = AbstractC1173g.l(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarL2.annotationType(), zzcuVarL2);
        zzc = new C2294b("errorCode", c.r(map2));
        zzcu zzcuVarL3 = AbstractC1173g.l(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarL3.annotationType(), zzcuVarL3);
        zzd = new C2294b("isColdCall", c.r(map3));
        zzcu zzcuVarL4 = AbstractC1173g.l(4);
        HashMap map4 = new HashMap();
        map4.put(zzcuVarL4.annotationType(), zzcuVarL4);
        zze = new C2294b("autoManageModelOnBackground", c.r(map4));
        zzcu zzcuVarL5 = AbstractC1173g.l(5);
        HashMap map5 = new HashMap();
        map5.put(zzcuVarL5.annotationType(), zzcuVarL5);
        zzf = new C2294b("autoManageModelOnLowMemory", c.r(map5));
        zzcu zzcuVarL6 = AbstractC1173g.l(6);
        HashMap map6 = new HashMap();
        map6.put(zzcuVarL6.annotationType(), zzcuVarL6);
        zzg = new C2294b("isNnApiEnabled", c.r(map6));
        zzcu zzcuVarL7 = AbstractC1173g.l(7);
        HashMap map7 = new HashMap();
        map7.put(zzcuVarL7.annotationType(), zzcuVarL7);
        zzh = new C2294b("eventsCount", c.r(map7));
        zzcu zzcuVarL8 = AbstractC1173g.l(8);
        HashMap map8 = new HashMap();
        map8.put(zzcuVarL8.annotationType(), zzcuVarL8);
        zzi = new C2294b("otherErrors", c.r(map8));
        zzcu zzcuVarL9 = AbstractC1173g.l(9);
        HashMap map9 = new HashMap();
        map9.put(zzcuVarL9.annotationType(), zzcuVarL9);
        zzj = new C2294b("remoteConfigValueForAcceleration", c.r(map9));
        zzcu zzcuVarL10 = AbstractC1173g.l(10);
        HashMap map10 = new HashMap();
        map10.put(zzcuVarL10.annotationType(), zzcuVarL10);
        zzk = new C2294b("isAccelerated", c.r(map10));
    }

    private zzgj() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzkl zzklVar = (zzkl) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(zzb, zzklVar.zze());
        interfaceC2296d.add(zzc, zzklVar.zza());
        interfaceC2296d.add(zzd, zzklVar.zzd());
        interfaceC2296d.add(zze, zzklVar.zzb());
        interfaceC2296d.add(zzf, zzklVar.zzc());
        interfaceC2296d.add(zzg, (Object) null);
        interfaceC2296d.add(zzh, (Object) null);
        interfaceC2296d.add(zzi, (Object) null);
        interfaceC2296d.add(zzj, (Object) null);
        interfaceC2296d.add(zzk, (Object) null);
    }
}
