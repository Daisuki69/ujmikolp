package com.google.android.gms.internal.mlkit_vision_face;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;

/* JADX INFO: loaded from: classes3.dex */
final class zzif implements InterfaceC2295c {
    static final zzif zza = new zzif();
    private static final C2294b zzb;
    private static final C2294b zzc;
    private static final C2294b zzd;

    static {
        zzcu zzcuVarL = AbstractC1173g.l(3);
        HashMap map = new HashMap();
        map.put(zzcuVarL.annotationType(), zzcuVarL);
        zzb = new C2294b("languageOption", c.r(map));
        zzcu zzcuVarL2 = AbstractC1173g.l(4);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarL2.annotationType(), zzcuVarL2);
        zzc = new C2294b("isUsingLegacyApi", c.r(map2));
        zzcu zzcuVarL3 = AbstractC1173g.l(5);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarL3.annotationType(), zzcuVarL3);
        zzd = new C2294b("sdkVersion", c.r(map3));
    }

    private zzif() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
