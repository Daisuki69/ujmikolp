package ue;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopSearchListItem;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ue.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2310B extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20286b;

    public C2310B(ArrayList arrayList, List list) {
        kotlin.jvm.internal.j.g(arrayList, numX49.tnTj78("bFlPb"));
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("bFlP2"));
        this.f20285a = new ArrayList(arrayList);
        this.f20286b = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return kotlin.jvm.internal.j.b(this.f20285a.get(i), this.f20286b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        ArrayList arrayList = this.f20285a;
        ShopSearchListItem.VIEW_TYPE viewType = ((ShopSearchListItem) arrayList.get(i)).getViewType();
        ArrayList arrayList2 = this.f20286b;
        if (viewType != ((ShopSearchListItem) arrayList2.get(i4)).getViewType()) {
            return false;
        }
        if (((ShopSearchListItem) arrayList.get(i)).getViewType() != ShopSearchListItem.VIEW_TYPE.VIEW_TYPE_PRODUCT) {
            return true;
        }
        ProductV3 productV3 = (ProductV3) arrayList.get(i);
        ProductV3 productV32 = (ProductV3) arrayList2.get(i4);
        return kotlin.jvm.internal.j.b(productV3 != null ? productV3.getId() : null, productV32 != null ? productV32.getId() : null);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f20286b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f20285a.size();
    }
}
