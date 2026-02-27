package com.google.android.gms.internal.mlkit_common;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzgq implements InterfaceC2295c {
    static final zzgq zza = new zzgq();
    private static final C2294b zzb;
    private static final C2294b zzc;
    private static final C2294b zzd;
    private static final C2294b zze;
    private static final C2294b zzf;
    private static final C2294b zzg;
    private static final C2294b zzh;

    static {
        zzbc zzbcVarG = AbstractC1173g.g(1);
        HashMap map = new HashMap();
        map.put(zzbcVarG.annotationType(), zzbcVarG);
        zzb = new C2294b("options", c.r(map));
        zzbc zzbcVarG2 = AbstractC1173g.g(2);
        HashMap map2 = new HashMap();
        map2.put(zzbcVarG2.annotationType(), zzbcVarG2);
        zzc = new C2294b("roughDownloadDurationMs", c.r(map2));
        zzbc zzbcVarG3 = AbstractC1173g.g(3);
        HashMap map3 = new HashMap();
        map3.put(zzbcVarG3.annotationType(), zzbcVarG3);
        zzd = new C2294b("errorCode", c.r(map3));
        zzbc zzbcVarG4 = AbstractC1173g.g(4);
        HashMap map4 = new HashMap();
        map4.put(zzbcVarG4.annotationType(), zzbcVarG4);
        zze = new C2294b("exactDownloadDurationMs", c.r(map4));
        zzbc zzbcVarG5 = AbstractC1173g.g(5);
        HashMap map5 = new HashMap();
        map5.put(zzbcVarG5.annotationType(), zzbcVarG5);
        zzf = new C2294b("downloadStatus", c.r(map5));
        zzbc zzbcVarG6 = AbstractC1173g.g(6);
        HashMap map6 = new HashMap();
        map6.put(zzbcVarG6.annotationType(), zzbcVarG6);
        zzg = new C2294b("downloadFailureStatus", c.r(map6));
        zzbc zzbcVarG7 = AbstractC1173g.g(7);
        HashMap map7 = new HashMap();
        map7.put(zzbcVarG7.annotationType(), zzbcVarG7);
        zzh = new C2294b("mddDownloadErrorCodes", c.r(map7));
    }

    private zzgq() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zznc zzncVar = (zznc) obj;
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(zzb, zzncVar.zzc());
        interfaceC2296d.add(zzc, zzncVar.zzf());
        interfaceC2296d.add(zzd, zzncVar.zza());
        interfaceC2296d.add(zze, zzncVar.zze());
        interfaceC2296d.add(zzf, zzncVar.zzb());
        interfaceC2296d.add(zzg, zzncVar.zzd());
        interfaceC2296d.add(zzh, (Object) null);
    }
}
