package Ac;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.VoucherListItem;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f256b;

    public d(ArrayList arrayList, ArrayList arrayList2) {
        j.d(arrayList);
        this.f255a = new ArrayList(arrayList);
        this.f256b = new ArrayList(arrayList2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return j.b((VoucherListItem) this.f255a.get(i), (VoucherListItem) this.f256b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        return ((VoucherListItem) this.f255a.get(i)).getViewType() == ((VoucherListItem) this.f256b.get(i4)).getViewType();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f256b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f255a.size();
    }
}
