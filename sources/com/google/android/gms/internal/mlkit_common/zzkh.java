package com.google.android.gms.internal.mlkit_common;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzkh implements InterfaceC2295c {
    static final zzkh zza = new zzkh();
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
        zzbc zzbcVarG = AbstractC1173g.g(1);
        HashMap map = new HashMap();
        map.put(zzbcVarG.annotationType(), zzbcVarG);
        zzb = new C2294b("appId", c.r(map));
        zzbc zzbcVarG2 = AbstractC1173g.g(2);
        HashMap map2 = new HashMap();
        map2.put(zzbcVarG2.annotationType(), zzbcVarG2);
        zzc = new C2294b("appVersion", c.r(map2));
        zzbc zzbcVarG3 = AbstractC1173g.g(3);
        HashMap map3 = new HashMap();
        map3.put(zzbcVarG3.annotationType(), zzbcVarG3);
        zzd = new C2294b("firebaseProjectId", c.r(map3));
        zzbc zzbcVarG4 = AbstractC1173g.g(4);
        HashMap map4 = new HashMap();
        map4.put(zzbcVarG4.annotationType(), zzbcVarG4);
        zze = new C2294b("mlSdkVersion", c.r(map4));
        zzbc zzbcVarG5 = AbstractC1173g.g(5);
        HashMap map5 = new HashMap();
        map5.put(zzbcVarG5.annotationType(), zzbcVarG5);
        zzf = new C2294b("tfliteSchemaVersion", c.r(map5));
        zzbc zzbcVarG6 = AbstractC1173g.g(6);
        HashMap map6 = new HashMap();
        map6.put(zzbcVarG6.annotationType(), zzbcVarG6);
        zzg = new C2294b("gcmSenderId", c.r(map6));
        zzbc zzbcVarG7 = AbstractC1173g.g(7);
        HashMap map7 = new HashMap();
        map7.put(zzbcVarG7.annotationType(), zzbcVarG7);
        zzh = new C2294b("apiKey", c.r(map7));
        zzbc zzbcVarG8 = AbstractC1173g.g(8);
        HashMap map8 = new HashMap();
        map8.put(zzbcVarG8.annotationType(), zzbcVarG8);
        zzi = new C2294b("languages", c.r(map8));
        zzbc zzbcVarG9 = AbstractC1173g.g(9);
        HashMap map9 = new HashMap();
        map9.put(zzbcVarG9.annotationType(), zzbcVarG9);
        zzj = new C2294b("mlSdkInstanceId", c.r(map9));
        zzbc zzbcVarG10 = AbstractC1173g.g(10);
        HashMap map10 = new HashMap();
        map10.put(zzbcVarG10.annotationType(), zzbcVarG10);
        zzk = new C2294b("isClearcutClient", c.r(map10));
        zzbc zzbcVarG11 = AbstractC1173g.g(11);
        HashMap map11 = new HashMap();
        map11.put(zzbcVarG11.annotationType(), zzbcVarG11);
        zzl = new C2294b("isStandaloneMlkit", c.r(map11));
        zzbc zzbcVarG12 = AbstractC1173g.g(12);
        HashMap map12 = new HashMap();
        map12.put(zzbcVarG12.annotationType(), zzbcVarG12);
        zzm = new C2294b("isJsonLogging", c.r(map12));
        zzbc zzbcVarG13 = AbstractC1173g.g(13);
        HashMap map13 = new HashMap();
        map13.put(zzbcVarG13.annotationType(), zzbcVarG13);
        zzn = new C2294b("buildLevel", c.r(map13));
        zzbc zzbcVarG14 = AbstractC1173g.g(14);
        HashMap map14 = new HashMap();
        map14.put(zzbcVarG14.annotationType(), zzbcVarG14);
        zzo = new C2294b("optionalModuleVersion", c.r(map14));
    }

    private zzkh() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqv zzqvVar = (zzqv) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(zzb, zzqvVar.zzg());
        interfaceC2296d.add(zzc, zzqvVar.zzh());
        interfaceC2296d.add(zzd, (Object) null);
        interfaceC2296d.add(zze, zzqvVar.zzj());
        interfaceC2296d.add(zzf, zzqvVar.zzk());
        interfaceC2296d.add(zzg, (Object) null);
        interfaceC2296d.add(zzh, (Object) null);
        interfaceC2296d.add(zzi, zzqvVar.zza());
        interfaceC2296d.add(zzj, zzqvVar.zzi());
        interfaceC2296d.add(zzk, zzqvVar.zzb());
        interfaceC2296d.add(zzl, zzqvVar.zzd());
        interfaceC2296d.add(zzm, zzqvVar.zzc());
        interfaceC2296d.add(zzn, zzqvVar.zze());
        interfaceC2296d.add(zzo, zzqvVar.zzf());
    }
}
