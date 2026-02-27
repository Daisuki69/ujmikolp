package q7;

import androidx.recyclerview.widget.GridLayoutManager;
import com.paymaya.domain.model.OnlinePaymentListItem;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaCreatorStoreFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaCreatorStoreFragment f19750a;

    public c(MayaCreatorStoreFragment mayaCreatorStoreFragment) {
        this.f19750a = mayaCreatorStoreFragment;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        o7.b bVar = this.f19750a.y0;
        return (bVar == null || bVar.getItemViewType(i) != OnlinePaymentListItem.VIEW_TYPE.VIEW_TYPE_ITEM.getValue()) ? 2 : 1;
    }
}
