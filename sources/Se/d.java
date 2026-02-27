package se;

import com.paymaya.domain.model.ShopHomeSectionTemplate;
import ej.C1449a;
import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return C1449a.a(Integer.valueOf(((ShopHomeSectionTemplate) obj).getPosition()), Integer.valueOf(((ShopHomeSectionTemplate) obj2).getPosition()));
    }
}
