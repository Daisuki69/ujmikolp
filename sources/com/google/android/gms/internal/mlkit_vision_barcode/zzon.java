package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzon implements InterfaceC2295c {
    static final zzon zza = new zzon();
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
    private static final C2294b zzl;
    private static final C2294b zzm;
    private static final C2294b zzn;
    private static final C2294b zzo;

    static {
        zzfe zzfeVarI = AbstractC1173g.i(1);
        HashMap map = new HashMap();
        map.put(zzfeVarI.annotationType(), zzfeVarI);
        zzb = new C2294b("appId", c.r(map));
        zzfe zzfeVarI2 = AbstractC1173g.i(2);
        HashMap map2 = new HashMap();
        map2.put(zzfeVarI2.annotationType(), zzfeVarI2);
        zzc = new C2294b("appVersion", c.r(map2));
        zzfe zzfeVarI3 = AbstractC1173g.i(3);
        HashMap map3 = new HashMap();
        map3.put(zzfeVarI3.annotationType(), zzfeVarI3);
        zzd = new C2294b("firebaseProjectId", c.r(map3));
        zzfe zzfeVarI4 = AbstractC1173g.i(4);
        HashMap map4 = new HashMap();
        map4.put(zzfeVarI4.annotationType(), zzfeVarI4);
        zze = new C2294b("mlSdkVersion", c.r(map4));
        zzfe zzfeVarI5 = AbstractC1173g.i(5);
        HashMap map5 = new HashMap();
        map5.put(zzfeVarI5.annotationType(), zzfeVarI5);
        zzf = new C2294b("tfliteSchemaVersion", c.r(map5));
        zzfe zzfeVarI6 = AbstractC1173g.i(6);
        HashMap map6 = new HashMap();
        map6.put(zzfeVarI6.annotationType(), zzfeVarI6);
        zzg = new C2294b("gcmSenderId", c.r(map6));
        zzfe zzfeVarI7 = AbstractC1173g.i(7);
        HashMap map7 = new HashMap();
        map7.put(zzfeVarI7.annotationType(), zzfeVarI7);
        zzh = new C2294b("apiKey", c.r(map7));
        zzfe zzfeVarI8 = AbstractC1173g.i(8);
        HashMap map8 = new HashMap();
        map8.put(zzfeVarI8.annotationType(), zzfeVarI8);
        zzi = new C2294b("languages", c.r(map8));
        zzfe zzfeVarI9 = AbstractC1173g.i(9);
        HashMap map9 = new HashMap();
        map9.put(zzfeVarI9.annotationType(), zzfeVarI9);
        zzj = new C2294b("mlSdkInstanceId", c.r(map9));
        zzfe zzfeVarI10 = AbstractC1173g.i(10);
        HashMap map10 = new HashMap();
        map10.put(zzfeVarI10.annotationType(), zzfeVarI10);
        zzk = new C2294b("isClearcutClient", c.r(map10));
        zzfe zzfeVarI11 = AbstractC1173g.i(11);
        HashMap map11 = new HashMap();
        map11.put(zzfeVarI11.annotationType(), zzfeVarI11);
        zzl = new C2294b("isStandaloneMlkit", c.r(map11));
        zzfe zzfeVarI12 = AbstractC1173g.i(12);
        HashMap map12 = new HashMap();
        map12.put(zzfeVarI12.annotationType(), zzfeVarI12);
        zzm = new C2294b("isJsonLogging", c.r(map12));
        zzfe zzfeVarI13 = AbstractC1173g.i(13);
        HashMap map13 = new HashMap();
        map13.put(zzfeVarI13.annotationType(), zzfeVarI13);
        zzn = new C2294b("buildLevel", c.r(map13));
        zzfe zzfeVarI14 = AbstractC1173g.i(14);
        HashMap map14 = new HashMap();
        map14.put(zzfeVarI14.annotationType(), zzfeVarI14);
        zzo = new C2294b("optionalModuleVersion", c.r(map14));
    }

    private zzon() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzvd zzvdVar = (zzvd) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(zzb, zzvdVar.zzg());
        interfaceC2296d.add(zzc, zzvdVar.zzh());
        interfaceC2296d.add(zzd, (Object) null);
        interfaceC2296d.add(zze, zzvdVar.zzj());
        interfaceC2296d.add(zzf, zzvdVar.zzk());
        interfaceC2296d.add(zzg, (Object) null);
        interfaceC2296d.add(zzh, (Object) null);
        interfaceC2296d.add(zzi, zzvdVar.zza());
        interfaceC2296d.add(zzj, zzvdVar.zzi());
        interfaceC2296d.add(zzk, zzvdVar.zzb());
        interfaceC2296d.add(zzl, zzvdVar.zzd());
        interfaceC2296d.add(zzm, zzvdVar.zzc());
        interfaceC2296d.add(zzn, zzvdVar.zze());
        interfaceC2296d.add(zzo, zzvdVar.zzf());
    }
}
