package com.google.android.gms.internal.mlkit_vision_common;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzgu implements InterfaceC2295c {
    static final zzgu zza = new zzgu();
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
        zzai zzaiVarK = AbstractC1173g.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        zzb = new C2294b("appId", c.r(map));
        zzai zzaiVarK2 = AbstractC1173g.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        zzc = new C2294b("appVersion", c.r(map2));
        zzai zzaiVarK3 = AbstractC1173g.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        zzd = new C2294b("firebaseProjectId", c.r(map3));
        zzai zzaiVarK4 = AbstractC1173g.k(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        zze = new C2294b("mlSdkVersion", c.r(map4));
        zzai zzaiVarK5 = AbstractC1173g.k(5);
        HashMap map5 = new HashMap();
        map5.put(zzaiVarK5.annotationType(), zzaiVarK5);
        zzf = new C2294b("tfliteSchemaVersion", c.r(map5));
        zzai zzaiVarK6 = AbstractC1173g.k(6);
        HashMap map6 = new HashMap();
        map6.put(zzaiVarK6.annotationType(), zzaiVarK6);
        zzg = new C2294b("gcmSenderId", c.r(map6));
        zzai zzaiVarK7 = AbstractC1173g.k(7);
        HashMap map7 = new HashMap();
        map7.put(zzaiVarK7.annotationType(), zzaiVarK7);
        zzh = new C2294b("apiKey", c.r(map7));
        zzai zzaiVarK8 = AbstractC1173g.k(8);
        HashMap map8 = new HashMap();
        map8.put(zzaiVarK8.annotationType(), zzaiVarK8);
        zzi = new C2294b("languages", c.r(map8));
        zzai zzaiVarK9 = AbstractC1173g.k(9);
        HashMap map9 = new HashMap();
        map9.put(zzaiVarK9.annotationType(), zzaiVarK9);
        zzj = new C2294b("mlSdkInstanceId", c.r(map9));
        zzai zzaiVarK10 = AbstractC1173g.k(10);
        HashMap map10 = new HashMap();
        map10.put(zzaiVarK10.annotationType(), zzaiVarK10);
        zzk = new C2294b("isClearcutClient", c.r(map10));
        zzai zzaiVarK11 = AbstractC1173g.k(11);
        HashMap map11 = new HashMap();
        map11.put(zzaiVarK11.annotationType(), zzaiVarK11);
        zzl = new C2294b("isStandaloneMlkit", c.r(map11));
        zzai zzaiVarK12 = AbstractC1173g.k(12);
        HashMap map12 = new HashMap();
        map12.put(zzaiVarK12.annotationType(), zzaiVarK12);
        zzm = new C2294b("isJsonLogging", c.r(map12));
        zzai zzaiVarK13 = AbstractC1173g.k(13);
        HashMap map13 = new HashMap();
        map13.put(zzaiVarK13.annotationType(), zzaiVarK13);
        zzn = new C2294b("buildLevel", c.r(map13));
        zzai zzaiVarK14 = AbstractC1173g.k(14);
        HashMap map14 = new HashMap();
        map14.put(zzaiVarK14.annotationType(), zzaiVarK14);
        zzo = new C2294b("optionalModuleVersion", c.r(map14));
    }

    private zzgu() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzla zzlaVar = (zzla) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(zzb, zzlaVar.zzg());
        interfaceC2296d.add(zzc, zzlaVar.zzh());
        interfaceC2296d.add(zzd, (Object) null);
        interfaceC2296d.add(zze, zzlaVar.zzj());
        interfaceC2296d.add(zzf, zzlaVar.zzk());
        interfaceC2296d.add(zzg, (Object) null);
        interfaceC2296d.add(zzh, (Object) null);
        interfaceC2296d.add(zzi, zzlaVar.zza());
        interfaceC2296d.add(zzj, zzlaVar.zzi());
        interfaceC2296d.add(zzk, zzlaVar.zzb());
        interfaceC2296d.add(zzl, zzlaVar.zzd());
        interfaceC2296d.add(zzm, zzlaVar.zzc());
        interfaceC2296d.add(zzn, zzlaVar.zze());
        interfaceC2296d.add(zzo, zzlaVar.zzf());
    }
}
