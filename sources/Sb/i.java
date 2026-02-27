package Sb;

import android.util.Log;
import b5.C0909a;
import com.paymaya.domain.model.UIValue;
import gj.C1527b;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import u5.AbstractC2302a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5703a;

    public /* synthetic */ i(int i) {
        this.f5703a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.c cVar;
        switch (this.f5703a) {
            case 0:
                String adUnitId = (String) obj;
                C0909a adKitError = (C0909a) obj2;
                kotlin.jvm.internal.j.g(adUnitId, "adUnitId");
                kotlin.jvm.internal.j.g(adKitError, "adKitError");
                Log.e("VerticalBannerAd", "Ad with id:" + adUnitId + " failed to load: code:" + adKitError.f8514a + " message:" + adKitError.f8515b);
                return Unit.f18162a;
            case 1:
                String adUnitId2 = (String) obj;
                C0909a adKitError2 = (C0909a) obj2;
                kotlin.jvm.internal.j.g(adUnitId2, "adUnitId");
                kotlin.jvm.internal.j.g(adKitError2, "adKitError");
                Log.e("BannerAdsCarousel", "Ad with id:" + adUnitId2 + " failed to load: code:" + adKitError2.f8514a + " message:" + adKitError2.f8515b);
                return Unit.f18162a;
            case 2:
                UIValue o12 = (UIValue) obj;
                UIValue o22 = (UIValue) obj2;
                kotlin.jvm.internal.j.g(o12, "o1");
                kotlin.jvm.internal.j.g(o22, "o2");
                String strDisplay = o12.display();
                kotlin.jvm.internal.j.f(strDisplay, "display(...)");
                String strDisplay2 = o22.display();
                kotlin.jvm.internal.j.f(strDisplay2, "display(...)");
                return Integer.valueOf(strDisplay.compareToIgnoreCase(strDisplay2));
            case 3:
                String strDisplay3 = ((UIValue) obj).display();
                kotlin.jvm.internal.j.f(strDisplay3, "display(...)");
                String strDisplay4 = ((UIValue) obj2).display();
                kotlin.jvm.internal.j.f(strDisplay4, "display(...)");
                return Integer.valueOf(strDisplay3.compareToIgnoreCase(strDisplay4));
            case 4:
                kotlin.jvm.internal.j.g((String) obj, "adUnitId");
                kotlin.jvm.internal.j.g((C0909a) obj2, "adKitError");
                yk.a.a();
                return Unit.f18162a;
            case 5:
                String acc = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                kotlin.jvm.internal.j.g(acc, "acc");
                kotlin.jvm.internal.j.g(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 6:
                CoroutineContext acc2 = (CoroutineContext) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                kotlin.jvm.internal.j.g(acc2, "acc");
                kotlin.jvm.internal.j.g(element2, "element");
                CoroutineContext coroutineContextMinusKey = acc2.minusKey(element2.getKey());
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f18170a;
                if (coroutineContextMinusKey == gVar) {
                    return element2;
                }
                C1527b c1527b = kotlin.coroutines.d.f18169N;
                kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContextMinusKey.get(c1527b);
                if (dVar == null) {
                    cVar = new kotlin.coroutines.c(element2, coroutineContextMinusKey);
                } else {
                    CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(c1527b);
                    if (coroutineContextMinusKey2 == gVar) {
                        return new kotlin.coroutines.c(dVar, element2);
                    }
                    cVar = new kotlin.coroutines.c(dVar, new kotlin.coroutines.c(element2, coroutineContextMinusKey2));
                }
                return cVar;
            case 7:
                kotlin.jvm.internal.j.g((String) obj, "adUnitId");
                kotlin.jvm.internal.j.g((C0909a) obj2, "adKitError");
                yk.a.a();
                return Unit.f18162a;
            case 8:
                kotlin.jvm.internal.j.g((String) obj, "adUnitId");
                kotlin.jvm.internal.j.g((C0909a) obj2, "adKitError");
                yk.a.c();
                return Unit.f18162a;
            default:
                u5.b threatEventType = (u5.b) obj;
                Map metadata = (Map) obj2;
                kotlin.jvm.internal.j.g(threatEventType, "threatEventType");
                kotlin.jvm.internal.j.g(metadata, "metadata");
                threatEventType.toString();
                metadata.toString();
                yk.a.a();
                C5.a aVar = AbstractC2302a.f20267d;
                String lowerCase = threatEventType.f20271a.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
                aVar.f(lowerCase);
                LinkedHashMap linkedHashMap = AbstractC2302a.f20266b;
                synchronized (linkedHashMap) {
                    threatEventType.toString();
                    metadata.toString();
                    yk.a.a();
                    linkedHashMap.put(threatEventType, metadata);
                }
                return Unit.f18162a;
        }
    }
}
