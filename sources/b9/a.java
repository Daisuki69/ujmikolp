package B9;

import O.i;
import Xh.o;
import com.paymaya.domain.model.CarouselItem;
import com.paymaya.domain.model.ClevertapAd;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.domain.model.PushApprovalPendingRequest;
import com.paymaya.domain.model.ShopHomeSectionItem;
import ej.C1449a;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f381a;

    public /* synthetic */ a(int i) {
        this.f381a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f381a) {
            case 0:
                return C1449a.a(((MissionV2) obj).getTitle(), ((MissionV2) obj2).getTitle());
            case 1:
                return C1449a.a(((MissionV2) obj).getEndDate(), ((MissionV2) obj2).getEndDate());
            case 2:
                return C1449a.a(((MissionV2) obj).getEndDate(), ((MissionV2) obj2).getEndDate());
            case 3:
                return C1449a.a(((MissionV2) obj2).getStatus(), ((MissionV2) obj).getStatus());
            case 4:
                return C1449a.a(((MissionV2) obj).getEndDate(), ((MissionV2) obj2).getEndDate());
            case 5:
                return ((G3.e) obj).f1710d - ((G3.e) obj2).f1710d;
            case 6:
                return C1449a.a(((i) obj).f4517a, ((i) obj2).f4517a);
            case 7:
                int i = ((S0.b) obj).e;
                int i4 = ((S0.b) obj2).e;
                if (i == i4) {
                    return 0;
                }
                return i > i4 ? 1 : -1;
            case 8:
                return ((o) obj).compareTo((o) obj2);
            case 9:
                CarouselItem carouselItem = (CarouselItem) obj;
                ClevertapAd clevertapAd = carouselItem instanceof ClevertapAd ? (ClevertapAd) carouselItem : null;
                int iValueOf = clevertapAd != null ? Integer.valueOf(clevertapAd.getBannerPriority()) : Integer.MAX_VALUE;
                CarouselItem carouselItem2 = (CarouselItem) obj2;
                ClevertapAd clevertapAd2 = carouselItem2 instanceof ClevertapAd ? (ClevertapAd) carouselItem2 : null;
                return C1449a.a(iValueOf, clevertapAd2 != null ? Integer.valueOf(clevertapAd2.getBannerPriority()) : Integer.MAX_VALUE);
            case 10:
                return C1449a.a(Integer.valueOf(((ShopHomeSectionItem) obj).getPosition()), Integer.valueOf(((ShopHomeSectionItem) obj2).getPosition()));
            case 11:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 12:
                return ((Comparable) obj).compareTo(obj2);
            case 13:
                return C1449a.a(Integer.valueOf(((ShopHomeSectionItem) obj).getPosition()), Integer.valueOf(((ShopHomeSectionItem) obj2).getPosition()));
            case 14:
                return Integer.compare(Integer.parseInt((String) obj), Integer.parseInt((String) obj2));
            default:
                return C1449a.a(((PushApprovalPendingRequest) obj).getCreatedAt(), ((PushApprovalPendingRequest) obj2).getCreatedAt());
        }
    }
}
