package d6;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.domain.model.AccountLimitsItem;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: d6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1333b extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16285b;

    public C1333b(Context context) {
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.maya_margin_normal);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.maya_margin_normal);
        this.f16284a = dimensionPixelOffset;
        this.f16285b = dimensionPixelOffset2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        j.g(outRect, "outRect");
        j.g(view, "view");
        j.g(parent, "parent");
        j.g(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1 || parent.getAdapter() == null) {
            return;
        }
        RecyclerView.Adapter adapter = parent.getAdapter();
        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.getItemViewType(childAdapterPosition)) : null;
        int value = AccountLimitsItem.VIEW_TYPE.VIEW_TYPE_ITEM.getValue();
        if (numValueOf != null && numValueOf.intValue() == value) {
            if (childAdapterPosition == 0) {
                outRect.top = this.f16284a;
            } else {
                outRect.top = this.f16285b;
            }
        }
    }
}
