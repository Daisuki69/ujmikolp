package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzkk implements InterfaceC2295c {
    static final zzkk zza = new zzkk();
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
        zzfe zzfeVarI = AbstractC1173g.i(1);
        HashMap map = new HashMap();
        map.put(zzfeVarI.annotationType(), zzfeVarI);
        zzb = new C2294b("durationMs", c.r(map));
        zzfe zzfeVarI2 = AbstractC1173g.i(2);
        HashMap map2 = new HashMap();
        map2.put(zzfeVarI2.annotationType(), zzfeVarI2);
        zzc = new C2294b("errorCode", c.r(map2));
        zzfe zzfeVarI3 = AbstractC1173g.i(3);
        HashMap map3 = new HashMap();
        map3.put(zzfeVarI3.annotationType(), zzfeVarI3);
        zzd = new C2294b("isColdCall", c.r(map3));
        zzfe zzfeVarI4 = AbstractC1173g.i(4);
        HashMap map4 = new HashMap();
        map4.put(zzfeVarI4.annotationType(), zzfeVarI4);
        zze = new C2294b("autoManageModelOnBackground", c.r(map4));
        zzfe zzfeVarI5 = AbstractC1173g.i(5);
        HashMap map5 = new HashMap();
        map5.put(zzfeVarI5.annotationType(), zzfeVarI5);
        zzf = new C2294b("autoManageModelOnLowMemory", c.r(map5));
        zzfe zzfeVarI6 = AbstractC1173g.i(6);
        HashMap map6 = new HashMap();
        map6.put(zzfeVarI6.annotationType(), zzfeVarI6);
        zzg = new C2294b("isNnApiEnabled", c.r(map6));
        zzfe zzfeVarI7 = AbstractC1173g.i(7);
        HashMap map7 = new HashMap();
        map7.put(zzfeVarI7.annotationType(), zzfeVarI7);
        zzh = new C2294b("eventsCount", c.r(map7));
        zzfe zzfeVarI8 = AbstractC1173g.i(8);
        HashMap map8 = new HashMap();
        map8.put(zzfeVarI8.annotationType(), zzfeVarI8);
        zzi = new C2294b("otherErrors", c.r(map8));
        zzfe zzfeVarI9 = AbstractC1173g.i(9);
        HashMap map9 = new HashMap();
        map9.put(zzfeVarI9.annotationType(), zzfeVarI9);
        zzj = new C2294b("remoteConfigValueForAcceleration", c.r(map9));
        zzfe zzfeVarI10 = AbstractC1173g.i(10);
        HashMap map10 = new HashMap();
        map10.put(zzfeVarI10.annotationType(), zzfeVarI10);
        zzk = new C2294b("isAccelerated", c.r(map10));
    }

    private zzkk() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqq zzqqVar = (zzqq) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(zzb, zzqqVar.zze());
        interfaceC2296d.add(zzc, zzqqVar.zza());
        interfaceC2296d.add(zzd, zzqqVar.zzd());
        interfaceC2296d.add(zze, zzqqVar.zzb());
        interfaceC2296d.add(zzf, zzqqVar.zzc());
        interfaceC2296d.add(zzg, (Object) null);
        interfaceC2296d.add(zzh, (Object) null);
        interfaceC2296d.add(zzi, (Object) null);
        interfaceC2296d.add(zzj, (Object) null);
        interfaceC2296d.add(zzk, (Object) null);
    }
}
