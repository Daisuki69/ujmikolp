package Rc;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5486b;

    public d(Context context, int i, int i4) {
        j.g(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(i4);
        this.f5485a = dimensionPixelSize;
        this.f5486b = dimensionPixelSize2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        j.g(outRect, "outRect");
        j.g(view, "view");
        j.g(parent, "parent");
        j.g(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int itemCount = state.getItemCount();
        int i = this.f5485a;
        if (itemCount == 1) {
            outRect.left = i;
            outRect.right = i;
            return;
        }
        int i4 = this.f5486b;
        outRect.left = childAdapterPosition == 0 ? i : i4 / 2;
        RecyclerView.Adapter adapter = parent.getAdapter();
        j.d(adapter);
        if (childAdapterPosition != adapter.getItemCount() - 1) {
            i = i4 / 2;
        }
        outRect.right = i;
    }
}
