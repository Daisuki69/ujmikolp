package Y4;

import Bj.H;
import Bj.r;
import C2.f;
import android.app.Activity;
import b5.AbstractC0911c;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f6756a;

    public d(Activity context) {
        j.g(context, "context");
        this.f6756a = context;
    }

    public static AdRequest a(Map map) {
        AdRequest.Builder builder = new AdRequest.Builder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Iterable) value).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String string = next != null ? next.toString() : null;
                    if (string != null) {
                        arrayList.add(string);
                    }
                }
            }
        }
        AdRequest adRequestBuild = builder.build();
        j.f(adRequestBuild, "build(...)");
        return adRequestBuild;
    }

    public final Object b(String str, String str2, Map map, AbstractC0911c abstractC0911c, Function1 function1, AbstractC1609c abstractC1609c) throws Throwable {
        r rVarB = H.b();
        AdLoader adLoaderBuild = new AdLoader.Builder(this.f6756a, str).forCustomFormatAd(str2, new A7.r(26, function1, rVarB), new f(24)).withAdListener(new b(rVarB, abstractC0911c)).build();
        j.f(adLoaderBuild, "build(...)");
        AdRequest adRequestBuild = new AdRequest.Builder().build();
        j.f(adRequestBuild, "build(...)");
        if (map != null && !map.isEmpty()) {
            adRequestBuild = a(map);
        }
        adLoaderBuild.loadAd(adRequestBuild);
        Object objA = rVarB.A(abstractC1609c);
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objA;
    }
}
