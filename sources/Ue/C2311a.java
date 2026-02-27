package ue;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.ShopHomeCarouselListItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ue.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2311a extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20288b;

    public C2311a(ArrayList arrayList, List list) {
        kotlin.jvm.internal.j.d(arrayList);
        this.f20287a = new ArrayList(arrayList);
        this.f20288b = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return kotlin.jvm.internal.j.b((ShopHomeCarouselListItem) this.f20287a.get(i), (ShopHomeCarouselListItem) this.f20288b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        return ((ShopHomeCarouselListItem) this.f20287a.get(i)).getViewTypeShopHomeCarouselItem() == ((ShopHomeCarouselListItem) this.f20288b.get(i4)).getViewTypeShopHomeCarouselItem();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f20288b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f20287a.size();
    }
}
