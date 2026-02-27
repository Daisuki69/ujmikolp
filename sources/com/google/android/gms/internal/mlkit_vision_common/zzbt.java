package com.google.android.gms.internal.mlkit_vision_common;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;

/* JADX INFO: loaded from: classes3.dex */
final class zzbt implements InterfaceC2295c {
    static final zzbt zza = new zzbt();
    private static final C2294b zzb;
    private static final C2294b zzc;
    private static final C2294b zzd;
    private static final C2294b zze;
    private static final C2294b zzf;
    private static final C2294b zzg;
    private static final C2294b zzh;

    static {
        zzai zzaiVarK = AbstractC1173g.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        zzb = new C2294b("durationMs", c.r(map));
        zzai zzaiVarK2 = AbstractC1173g.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        zzc = new C2294b("handledErrors", c.r(map2));
        zzai zzaiVarK3 = AbstractC1173g.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        zzd = new C2294b("partiallyHandledErrors", c.r(map3));
        zzai zzaiVarK4 = AbstractC1173g.k(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        zze = new C2294b("unhandledErrors", c.r(map4));
        zzai zzaiVarK5 = AbstractC1173g.k(5);
        HashMap map5 = new HashMap();
        map5.put(zzaiVarK5.annotationType(), zzaiVarK5);
        zzf = new C2294b("modelNamespace", c.r(map5));
        zzai zzaiVarK6 = AbstractC1173g.k(6);
        HashMap map6 = new HashMap();
        map6.put(zzaiVarK6.annotationType(), zzaiVarK6);
        zzg = new C2294b("delegateFilter", c.r(map6));
        zzai zzaiVarK7 = AbstractC1173g.k(7);
        HashMap map7 = new HashMap();
        map7.put(zzaiVarK7.annotationType(), zzaiVarK7);
        zzh = new C2294b("httpResponseCode", c.r(map7));
    }

    private zzbt() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
