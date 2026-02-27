package A7;

import androidx.media3.datasource.cache.CacheSpan;
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import com.paymaya.domain.model.CarouselItem;
import com.paymaya.domain.model.Dated;
import com.paymaya.domain.model.FundSource;
import com.paymaya.domain.model.InboxMessage;
import java.io.File;
import java.util.Comparator;
import java.util.Map;
import k2.C1697G;
import k2.s0;
import n2.C1914a;
import org.joda.time.ReadableInstant;
import v1.C2335b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222a;

    public /* synthetic */ l(int i) {
        this.f222a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f222a) {
            case 0:
                Dated dated1 = (Dated) obj;
                Dated dated2 = (Dated) obj2;
                kotlin.jvm.internal.j.g(dated1, "dated1");
                kotlin.jvm.internal.j.g(dated2, "dated2");
                return dated2.getLocalDateTime().compareTo((ReadableInstant) dated1.getLocalDateTime());
            case 1:
                Dated dated12 = (Dated) obj;
                Dated dated22 = (Dated) obj2;
                kotlin.jvm.internal.j.g(dated12, "dated1");
                kotlin.jvm.internal.j.g(dated22, "dated2");
                return dated22.getLocalDateTime().compareTo((ReadableInstant) dated12.getLocalDateTime());
            case 2:
                CarouselItem carouselItem = (CarouselItem) obj;
                CarouselItem carouselItem2 = (CarouselItem) obj2;
                int iCompare = Integer.compare(carouselItem.getPriority().getValue(), carouselItem2.getPriority().getValue());
                return iCompare != 0 ? iCompare : Integer.compare(carouselItem.getCarouselPosition(), carouselItem2.getCarouselPosition());
            case 3:
                Dated dated13 = (Dated) obj;
                Dated dated23 = (Dated) obj2;
                kotlin.jvm.internal.j.g(dated13, "dated1");
                kotlin.jvm.internal.j.g(dated23, "dated2");
                return dated23.getLocalDateTime().compareTo((ReadableInstant) dated13.getLocalDateTime());
            case 4:
                return LeastRecentlyUsedCacheEvictor.compare((CacheSpan) obj, (CacheSpan) obj2);
            case 5:
                return SlowMotionData.Segment.lambda$static$0((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
            case 6:
                FundSource fundSource = (FundSource) obj;
                FundSource fundSource2 = (FundSource) obj2;
                if (fundSource.mType().equals("virtual") && fundSource2.mType().equals("physical")) {
                    return -1;
                }
                if (fundSource.mType().equals("physical") && fundSource2.mType().equals("virtual")) {
                    return 1;
                }
                if (fundSource.mType().equals("physical") && fundSource2.mType().equals("physical")) {
                    return fundSource.mId().compareTo(fundSource2.mId());
                }
                return 0;
            case 7:
                return com.shield.android.j.d.a((com.shield.android.j.e) obj, (com.shield.android.j.e) obj2);
            case 8:
                String str = (String) obj;
                String str2 = (String) obj2;
                int iMin = Math.min(str.length(), str2.length());
                int i = 4;
                while (true) {
                    if (i >= iMin) {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length < length2) {
                            return -1;
                        }
                    } else {
                        char cCharAt = str.charAt(i);
                        char cCharAt2 = str2.charAt(i);
                        if (cCharAt == cCharAt2) {
                            i++;
                        } else if (cCharAt < cCharAt2) {
                            return -1;
                        }
                    }
                }
                return 1;
            case 9:
                return ((String) obj).compareTo((String) obj2);
            case 10:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 11:
                return ((C1697G) ((s0) obj)).f17849a.compareTo(((C1697G) ((s0) obj2)).f17849a);
            case 12:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 13:
                String name = ((File) obj).getName();
                int i4 = C1914a.f;
                return name.substring(0, i4).compareTo(((File) obj2).getName().substring(0, i4));
            case 14:
                InboxMessage inboxMessage1 = (InboxMessage) obj;
                InboxMessage inboxMessage2 = (InboxMessage) obj2;
                kotlin.jvm.internal.j.g(inboxMessage1, "inboxMessage1");
                kotlin.jvm.internal.j.g(inboxMessage2, "inboxMessage2");
                return inboxMessage2.mDate().compareTo((ReadableInstant) inboxMessage1.mDate());
            case 15:
                Dated dated14 = (Dated) obj;
                Dated dated24 = (Dated) obj2;
                kotlin.jvm.internal.j.g(dated14, "dated1");
                kotlin.jvm.internal.j.g(dated24, "dated2");
                return dated24.getLocalDateTime().compareTo((ReadableInstant) dated14.getLocalDateTime());
            case 16:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 17:
                int i6 = C2335b.f20451b;
                return 0;
            default:
                return Float.compare(((Number) ((Map.Entry) obj).getValue()).floatValue(), ((Number) ((Map.Entry) obj2).getValue()).floatValue());
        }
    }
}
