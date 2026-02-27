package E9;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1332b;

    public b(FragmentActivity fragmentActivity) {
        int dimensionPixelSize = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.maya_margin_large);
        int dimensionPixelSize2 = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.maya_margin_10);
        this.f1331a = dimensionPixelSize;
        this.f1332b = dimensionPixelSize2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        kotlin.jvm.internal.j.g(outRect, "outRect");
        kotlin.jvm.internal.j.g(view, "view");
        kotlin.jvm.internal.j.g(parent, "parent");
        kotlin.jvm.internal.j.g(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int itemCount = state.getItemCount();
        int i = this.f1331a;
        if (itemCount == 1) {
            outRect.left = i;
            outRect.right = i;
            return;
        }
        int i4 = this.f1332b;
        outRect.left = childAdapterPosition == 0 ? i : i4 / 2;
        RecyclerView.Adapter adapter = parent.getAdapter();
        kotlin.jvm.internal.j.d(adapter);
        if (childAdapterPosition != adapter.getItemCount() - 1) {
            i = i4 / 2;
        }
        outRect.right = i;
    }
}
