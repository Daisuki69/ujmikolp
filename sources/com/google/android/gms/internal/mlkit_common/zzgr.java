package com.google.android.gms.internal.mlkit_common;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzgr implements InterfaceC2295c {
    static final zzgr zza = new zzgr();
    private static final C2294b zzb;
    private static final C2294b zzc;
    private static final C2294b zzd;
    private static final C2294b zze;
    private static final C2294b zzf;
    private static final C2294b zzg;
    private static final C2294b zzh;
    private static final C2294b zzi;
    private static final C2294b zzj;

    static {
        zzbc zzbcVarG = AbstractC1173g.g(1);
        HashMap map = new HashMap();
        map.put(zzbcVarG.annotationType(), zzbcVarG);
        zzb = new C2294b(AppMeasurementSdk.ConditionalUserProperty.NAME, c.r(map));
        zzbc zzbcVarG2 = AbstractC1173g.g(2);
        HashMap map2 = new HashMap();
        map2.put(zzbcVarG2.annotationType(), zzbcVarG2);
        zzc = new C2294b("version", c.r(map2));
        zzbc zzbcVarG3 = AbstractC1173g.g(3);
        HashMap map3 = new HashMap();
        map3.put(zzbcVarG3.annotationType(), zzbcVarG3);
        zzd = new C2294b("source", c.r(map3));
        zzbc zzbcVarG4 = AbstractC1173g.g(4);
        HashMap map4 = new HashMap();
        map4.put(zzbcVarG4.annotationType(), zzbcVarG4);
        zze = new C2294b("uri", c.r(map4));
        zzbc zzbcVarG5 = AbstractC1173g.g(5);
        HashMap map5 = new HashMap();
        map5.put(zzbcVarG5.annotationType(), zzbcVarG5);
        zzf = new C2294b("hash", c.r(map5));
        zzbc zzbcVarG6 = AbstractC1173g.g(6);
        HashMap map6 = new HashMap();
        map6.put(zzbcVarG6.annotationType(), zzbcVarG6);
        zzg = new C2294b("modelType", c.r(map6));
        zzbc zzbcVarG7 = AbstractC1173g.g(7);
        HashMap map7 = new HashMap();
        map7.put(zzbcVarG7.annotationType(), zzbcVarG7);
        zzh = new C2294b("size", c.r(map7));
        zzbc zzbcVarG8 = AbstractC1173g.g(8);
        HashMap map8 = new HashMap();
        map8.put(zzbcVarG8.annotationType(), zzbcVarG8);
        zzi = new C2294b("hasLabelMap", c.r(map8));
        zzbc zzbcVarG9 = AbstractC1173g.g(9);
        HashMap map9 = new HashMap();
        map9.put(zzbcVarG9.annotationType(), zzbcVarG9);
        zzj = new C2294b("isManifestModel", c.r(map9));
    }

    private zzgr() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zznh zznhVar = (zznh) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(zzb, zznhVar.zzd());
        interfaceC2296d.add(zzc, (Object) null);
        interfaceC2296d.add(zzd, zznhVar.zzb());
        interfaceC2296d.add(zze, (Object) null);
        interfaceC2296d.add(zzf, zznhVar.zzc());
        interfaceC2296d.add(zzg, zznhVar.zza());
        interfaceC2296d.add(zzh, (Object) null);
        interfaceC2296d.add(zzi, (Object) null);
        interfaceC2296d.add(zzj, (Object) null);
    }
}
