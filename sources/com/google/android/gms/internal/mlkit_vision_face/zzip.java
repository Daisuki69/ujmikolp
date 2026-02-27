package com.google.android.gms.internal.mlkit_vision_face;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzip implements InterfaceC2295c {
    static final zzip zza = new zzip();
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
        zzcu zzcuVarL = AbstractC1173g.l(1);
        HashMap map = new HashMap();
        map.put(zzcuVarL.annotationType(), zzcuVarL);
        zzb = new C2294b("appId", c.r(map));
        zzcu zzcuVarL2 = AbstractC1173g.l(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarL2.annotationType(), zzcuVarL2);
        zzc = new C2294b("appVersion", c.r(map2));
        zzcu zzcuVarL3 = AbstractC1173g.l(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarL3.annotationType(), zzcuVarL3);
        zzd = new C2294b("firebaseProjectId", c.r(map3));
        zzcu zzcuVarL4 = AbstractC1173g.l(4);
        HashMap map4 = new HashMap();
        map4.put(zzcuVarL4.annotationType(), zzcuVarL4);
        zze = new C2294b("mlSdkVersion", c.r(map4));
        zzcu zzcuVarL5 = AbstractC1173g.l(5);
        HashMap map5 = new HashMap();
        map5.put(zzcuVarL5.annotationType(), zzcuVarL5);
        zzf = new C2294b("tfliteSchemaVersion", c.r(map5));
        zzcu zzcuVarL6 = AbstractC1173g.l(6);
        HashMap map6 = new HashMap();
        map6.put(zzcuVarL6.annotationType(), zzcuVarL6);
        zzg = new C2294b("gcmSenderId", c.r(map6));
        zzcu zzcuVarL7 = AbstractC1173g.l(7);
        HashMap map7 = new HashMap();
        map7.put(zzcuVarL7.annotationType(), zzcuVarL7);
        zzh = new C2294b("apiKey", c.r(map7));
        zzcu zzcuVarL8 = AbstractC1173g.l(8);
        HashMap map8 = new HashMap();
        map8.put(zzcuVarL8.annotationType(), zzcuVarL8);
        zzi = new C2294b("languages", c.r(map8));
        zzcu zzcuVarL9 = AbstractC1173g.l(9);
        HashMap map9 = new HashMap();
        map9.put(zzcuVarL9.annotationType(), zzcuVarL9);
        zzj = new C2294b("mlSdkInstanceId", c.r(map9));
        zzcu zzcuVarL10 = AbstractC1173g.l(10);
        HashMap map10 = new HashMap();
        map10.put(zzcuVarL10.annotationType(), zzcuVarL10);
        zzk = new C2294b("isClearcutClient", c.r(map10));
        zzcu zzcuVarL11 = AbstractC1173g.l(11);
        HashMap map11 = new HashMap();
        map11.put(zzcuVarL11.annotationType(), zzcuVarL11);
        zzl = new C2294b("isStandaloneMlkit", c.r(map11));
        zzcu zzcuVarL12 = AbstractC1173g.l(12);
        HashMap map12 = new HashMap();
        map12.put(zzcuVarL12.annotationType(), zzcuVarL12);
        zzm = new C2294b("isJsonLogging", c.r(map12));
        zzcu zzcuVarL13 = AbstractC1173g.l(13);
        HashMap map13 = new HashMap();
        map13.put(zzcuVarL13.annotationType(), zzcuVarL13);
        zzn = new C2294b("buildLevel", c.r(map13));
        zzcu zzcuVarL14 = AbstractC1173g.l(14);
        HashMap map14 = new HashMap();
        map14.put(zzcuVarL14.annotationType(), zzcuVarL14);
        zzo = new C2294b("optionalModuleVersion", c.r(map14));
    }

    private zzip() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzmv zzmvVar = (zzmv) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(zzb, zzmvVar.zzg());
        interfaceC2296d.add(zzc, zzmvVar.zzh());
        interfaceC2296d.add(zzd, (Object) null);
        interfaceC2296d.add(zze, zzmvVar.zzj());
        interfaceC2296d.add(zzf, zzmvVar.zzk());
        interfaceC2296d.add(zzg, (Object) null);
        interfaceC2296d.add(zzh, (Object) null);
        interfaceC2296d.add(zzi, zzmvVar.zza());
        interfaceC2296d.add(zzj, zzmvVar.zzi());
        interfaceC2296d.add(zzk, zzmvVar.zzb());
        interfaceC2296d.add(zzl, zzmvVar.zzd());
        interfaceC2296d.add(zzm, zzmvVar.zzc());
        interfaceC2296d.add(zzn, zzmvVar.zze());
        interfaceC2296d.add(zzo, zzmvVar.zzf());
    }
}
