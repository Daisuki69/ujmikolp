package R;

import G7.F;
import com.paymaya.domain.model.CarouselItem;
import com.paymaya.domain.model.ClevertapAd;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.store.N0;
import ej.C1449a;
import java.util.Comparator;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5398b;

    public /* synthetic */ a(Object obj, int i) {
        this.f5397a = i;
        this.f5398b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5397a) {
            case 0:
                F f = (F) this.f5398b;
                return C1449a.a((Comparable) f.invoke((JSONObject) obj2), (Comparable) f.invoke((JSONObject) obj));
            case 1:
                int iCompare = ((B9.a) this.f5398b).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                CarouselItem carouselItem = (CarouselItem) obj;
                ClevertapAd clevertapAd = carouselItem instanceof ClevertapAd ? (ClevertapAd) carouselItem : null;
                String bannerKey = clevertapAd != null ? clevertapAd.getBannerKey() : null;
                CarouselItem carouselItem2 = (CarouselItem) obj2;
                ClevertapAd clevertapAd2 = carouselItem2 instanceof ClevertapAd ? (ClevertapAd) carouselItem2 : null;
                return C1449a.a(bannerKey, clevertapAd2 != null ? clevertapAd2.getBannerKey() : null);
            case 2:
                int iCompare2 = ((N0) this.f5398b).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : C1449a.a(((ShopProvider) obj).getPriority(), ((ShopProvider) obj2).getPriority());
            default:
                int iCompare3 = ((a) this.f5398b).compare(obj, obj2);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                String displayName = ((ShopProvider) obj).getDisplayName();
                Locale locale = Locale.ROOT;
                String lowerCase = displayName.toLowerCase(locale);
                kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((ShopProvider) obj2).getDisplayName().toLowerCase(locale);
                kotlin.jvm.internal.j.f(lowerCase2, "toLowerCase(...)");
                return C1449a.a(lowerCase, lowerCase2);
        }
    }
}
