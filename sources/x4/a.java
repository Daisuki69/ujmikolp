package X4;

import Bj.H;
import Bj.r;
import Y4.d;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f6527a;

    public a(d adService) {
        j.g(adService, "adService");
        this.f6527a = adService;
    }

    public final Object a(String str, Map map, Function1 function1, Function1 function12, AbstractC1609c abstractC1609c) throws Throwable {
        d dVar = this.f6527a;
        dVar.getClass();
        r rVarB = H.b();
        y yVar = new y();
        AdLoader adLoaderBuild = new AdLoader.Builder(dVar.f6756a, str).forNativeAd(new A7.r(25, yVar, rVarB)).withAdListener(new Y4.c(function12, yVar, function1, rVarB, str)).build();
        j.f(adLoaderBuild, "build(...)");
        AdRequest adRequestBuild = new AdRequest.Builder().build();
        j.f(adRequestBuild, "build(...)");
        if (map != null && !map.isEmpty()) {
            adRequestBuild = d.a(map);
        }
        adLoaderBuild.loadAd(adRequestBuild);
        Object objA = rVarB.A(abstractC1609c);
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objA;
    }
}
