package E9;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1345b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1346d;

    public j(FragmentActivity fragmentActivity) {
        int dimensionPixelSize = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.maya_margin_normal);
        int dimensionPixelSize2 = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.maya_margin_normal);
        int dimensionPixelSize3 = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.maya_margin_medium);
        int dimensionPixelSize4 = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.maya_margin_large);
        this.f1344a = dimensionPixelSize;
        this.f1345b = dimensionPixelSize2;
        this.c = dimensionPixelSize3;
        this.f1346d = dimensionPixelSize4;
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
        int i = this.f1346d;
        outRect.left = i;
        outRect.right = i;
        int itemCount = state.getItemCount();
        int i4 = this.f1345b;
        int i6 = this.f1344a;
        if (itemCount == 1) {
            outRect.top = i6;
            outRect.bottom = i4;
            return;
        }
        int i10 = this.c;
        if (childAdapterPosition != 0) {
            i6 = i10 / 2;
        }
        outRect.top = i6;
        RecyclerView.Adapter adapter = parent.getAdapter();
        kotlin.jvm.internal.j.d(adapter);
        if (childAdapterPosition != adapter.getItemCount() - 1) {
            i4 = i10 / 2;
        }
        outRect.bottom = i4;
    }
}
