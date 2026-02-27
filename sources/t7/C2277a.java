package t7;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.OnlinePaymentListItem;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: t7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2277a extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20180b;

    public C2277a(ArrayList arrayList, ArrayList arrayList2) {
        j.d(arrayList);
        this.f20179a = new ArrayList(arrayList);
        this.f20180b = new ArrayList(arrayList2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return areItemsTheSame(i, i4);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        OnlinePaymentListItem onlinePaymentListItem = (OnlinePaymentListItem) this.f20179a.get(i);
        OnlinePaymentListItem onlinePaymentListItem2 = (OnlinePaymentListItem) this.f20180b.get(i4);
        if (onlinePaymentListItem.getViewType() == OnlinePaymentListItem.VIEW_TYPE.VIEW_TYPE_LOADING && onlinePaymentListItem.getViewType() == onlinePaymentListItem2.getViewType()) {
            return true;
        }
        return onlinePaymentListItem.equals(onlinePaymentListItem2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f20180b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f20179a.size();
    }
}
