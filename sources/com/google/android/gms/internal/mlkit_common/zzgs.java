package com.google.android.gms.internal.mlkit_common;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;
import u2.InterfaceC2296d;

/* JADX INFO: loaded from: classes3.dex */
final class zzgs implements InterfaceC2295c {
    static final zzgs zza = new zzgs();
    private static final C2294b zzb;
    private static final C2294b zzc;
    private static final C2294b zzd;
    private static final C2294b zze;

    static {
        zzbc zzbcVarG = AbstractC1173g.g(1);
        HashMap map = new HashMap();
        map.put(zzbcVarG.annotationType(), zzbcVarG);
        zzb = new C2294b("modelInfo", c.r(map));
        zzbc zzbcVarG2 = AbstractC1173g.g(2);
        HashMap map2 = new HashMap();
        map2.put(zzbcVarG2.annotationType(), zzbcVarG2);
        zzc = new C2294b("initialDownloadConditions", c.r(map2));
        zzbc zzbcVarG3 = AbstractC1173g.g(3);
        HashMap map3 = new HashMap();
        map3.put(zzbcVarG3.annotationType(), zzbcVarG3);
        zzd = new C2294b("updateDownloadConditions", c.r(map3));
        zzbc zzbcVarG4 = AbstractC1173g.g(4);
        HashMap map4 = new HashMap();
        map4.put(zzbcVarG4.annotationType(), zzbcVarG4);
        zze = new C2294b("isModelUpdateEnabled", c.r(map4));
    }

    private zzgs() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        InterfaceC2296d interfaceC2296d = (InterfaceC2296d) obj2;
        interfaceC2296d.add(zzb, ((zznl) obj).zza());
        interfaceC2296d.add(zzc, (Object) null);
        interfaceC2296d.add(zzd, (Object) null);
        interfaceC2296d.add(zze, (Object) null);
    }
}
