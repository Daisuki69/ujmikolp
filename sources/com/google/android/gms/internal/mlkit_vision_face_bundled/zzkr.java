package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzkr implements InterfaceC2295c {
    static final zzkr zza = new zzkr();
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
        zzbm zzbmVarM = AbstractC1173g.m(1);
        HashMap map = new HashMap();
        map.put(zzbmVarM.annotationType(), zzbmVarM);
        zzb = new C2294b("appId", c.r(map));
        zzbm zzbmVarM2 = AbstractC1173g.m(2);
        HashMap map2 = new HashMap();
        map2.put(zzbmVarM2.annotationType(), zzbmVarM2);
        zzc = new C2294b("appVersion", c.r(map2));
        zzbm zzbmVarM3 = AbstractC1173g.m(3);
        HashMap map3 = new HashMap();
        map3.put(zzbmVarM3.annotationType(), zzbmVarM3);
        zzd = new C2294b("firebaseProjectId", c.r(map3));
        zzbm zzbmVarM4 = AbstractC1173g.m(4);
        HashMap map4 = new HashMap();
        map4.put(zzbmVarM4.annotationType(), zzbmVarM4);
        zze = new C2294b("mlSdkVersion", c.r(map4));
        zzbm zzbmVarM5 = AbstractC1173g.m(5);
        HashMap map5 = new HashMap();
        map5.put(zzbmVarM5.annotationType(), zzbmVarM5);
        zzf = new C2294b("tfliteSchemaVersion", c.r(map5));
        zzbm zzbmVarM6 = AbstractC1173g.m(6);
        HashMap map6 = new HashMap();
        map6.put(zzbmVarM6.annotationType(), zzbmVarM6);
        zzg = new C2294b("gcmSenderId", c.r(map6));
        zzbm zzbmVarM7 = AbstractC1173g.m(7);
        HashMap map7 = new HashMap();
        map7.put(zzbmVarM7.annotationType(), zzbmVarM7);
        zzh = new C2294b("apiKey", c.r(map7));
        zzbm zzbmVarM8 = AbstractC1173g.m(8);
        HashMap map8 = new HashMap();
        map8.put(zzbmVarM8.annotationType(), zzbmVarM8);
        zzi = new C2294b("languages", c.r(map8));
        zzbm zzbmVarM9 = AbstractC1173g.m(9);
        HashMap map9 = new HashMap();
        map9.put(zzbmVarM9.annotationType(), zzbmVarM9);
        zzj = new C2294b("mlSdkInstanceId", c.r(map9));
        zzbm zzbmVarM10 = AbstractC1173g.m(10);
        HashMap map10 = new HashMap();
        map10.put(zzbmVarM10.annotationType(), zzbmVarM10);
        zzk = new C2294b("isClearcutClient", c.r(map10));
        zzbm zzbmVarM11 = AbstractC1173g.m(11);
        HashMap map11 = new HashMap();
        map11.put(zzbmVarM11.annotationType(), zzbmVarM11);
        zzl = new C2294b("isStandaloneMlkit", c.r(map11));
        zzbm zzbmVarM12 = AbstractC1173g.m(12);
        HashMap map12 = new HashMap();
        map12.put(zzbmVarM12.annotationType(), zzbmVarM12);
        zzm = new C2294b("isJsonLogging", c.r(map12));
        zzbm zzbmVarM13 = AbstractC1173g.m(13);
        HashMap map13 = new HashMap();
        map13.put(zzbmVarM13.annotationType(), zzbmVarM13);
        zzn = new C2294b("buildLevel", c.r(map13));
        zzbm zzbmVarM14 = AbstractC1173g.m(14);
        HashMap map14 = new HashMap();
        map14.put(zzbmVarM14.annotationType(), zzbmVarM14);
        zzo = new C2294b("optionalModuleVersion", c.r(map14));
    }

    private zzkr() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqy zzqyVar = (zzqy) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(zzb, zzqyVar.zzg());
        interfaceC2296d.add(zzc, zzqyVar.zzh());
        interfaceC2296d.add(zzd, (Object) null);
        interfaceC2296d.add(zze, zzqyVar.zzj());
        interfaceC2296d.add(zzf, zzqyVar.zzk());
        interfaceC2296d.add(zzg, (Object) null);
        interfaceC2296d.add(zzh, (Object) null);
        interfaceC2296d.add(zzi, zzqyVar.zza());
        interfaceC2296d.add(zzj, zzqyVar.zzi());
        interfaceC2296d.add(zzk, zzqyVar.zzb());
        interfaceC2296d.add(zzl, zzqyVar.zzd());
        interfaceC2296d.add(zzm, zzqyVar.zzc());
        interfaceC2296d.add(zzn, zzqyVar.zze());
        interfaceC2296d.add(zzo, zzqyVar.zzf());
    }
}
