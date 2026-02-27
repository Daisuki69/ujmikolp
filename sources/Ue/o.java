package ue;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.ShopHomeCarouselListItem;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.domain.model.ShopHomeSectionItem;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f20303b;

    public o(ArrayList arrayList, List list) {
        kotlin.jvm.internal.j.g(arrayList, numX49.tnTj78("bFlR"));
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("bFlp"));
        this.f20302a = arrayList;
        this.f20303b = list;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        List<ShopHomeCarouselListItem> list;
        ShopHomeSectionItem shopHomeSectionItem = (ShopHomeSectionItem) this.f20302a.get(i);
        ShopHomeSectionItem shopHomeSectionItem2 = (ShopHomeSectionItem) this.f20303b.get(i4);
        if (!(shopHomeSectionItem instanceof ShopHomeSectionCarousel) || !(shopHomeSectionItem2 instanceof ShopHomeSectionCarousel)) {
            return kotlin.jvm.internal.j.b(shopHomeSectionItem, shopHomeSectionItem2);
        }
        List<ShopHomeCarouselListItem> list2 = ((ShopHomeSectionCarousel) shopHomeSectionItem).getList();
        List<ShopHomeCarouselListItem> list3 = ((ShopHomeSectionCarousel) shopHomeSectionItem2).getList();
        List<ShopHomeCarouselListItem> list4 = list2;
        if (list4 == null || list4.isEmpty() || (list = list3) == null || list.isEmpty() || list2.size() != list3.size()) {
            return true;
        }
        int size = list2.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!kotlin.jvm.internal.j.b(list2.get(i6), list3.get(i6))) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        return kotlin.jvm.internal.j.b((ShopHomeSectionItem) this.f20302a.get(i), (ShopHomeSectionItem) this.f20303b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f20303b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f20302a.size();
    }
}
