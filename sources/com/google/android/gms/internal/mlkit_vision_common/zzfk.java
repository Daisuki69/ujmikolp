package com.google.android.gms.internal.mlkit_vision_common;

import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.HashMap;
import u2.C2294b;
import u2.InterfaceC2295c;

/* JADX INFO: loaded from: classes3.dex */
final class zzfk implements InterfaceC2295c {
    static final zzfk zza = new zzfk();
    private static final C2294b zzb;
    private static final C2294b zzc;
    private static final C2294b zzd;
    private static final C2294b zze;
    private static final C2294b zzf;

    static {
        zzai zzaiVarK = AbstractC1173g.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        zzb = new C2294b("inferenceCommonLogEvent", c.r(map));
        zzai zzaiVarK2 = AbstractC1173g.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        zzc = new C2294b("imageInfo", c.r(map2));
        zzai zzaiVarK3 = AbstractC1173g.k(4);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        zzd = new C2294b("captionCount", c.r(map3));
        zzai zzaiVarK4 = AbstractC1173g.k(5);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        zze = new C2294b("highestScore", c.r(map4));
        zzai zzaiVarK5 = AbstractC1173g.k(6);
        HashMap map5 = new HashMap();
        map5.put(zzaiVarK5.annotationType(), zzaiVarK5);
        zzf = new C2294b("imageType", c.r(map5));
    }

    private zzfk() {
    }

    @Override // u2.InterfaceC2293a
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
