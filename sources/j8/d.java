package J8;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2461b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2462d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2460a = 3;
    public final boolean c = true;

    public d(int i) {
        this.f2461b = i;
        this.f2462d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        kotlin.jvm.internal.j.g(outRect, "outRect");
        kotlin.jvm.internal.j.g(view, "view");
        kotlin.jvm.internal.j.g(parent, "parent");
        kotlin.jvm.internal.j.g(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i = this.f2460a;
        int i4 = childAdapterPosition % i;
        int i6 = this.f2461b;
        outRect.left = i4 == 0 ? 0 : i6 / 2;
        outRect.right = i4 != i + (-1) ? i6 / 2 : 0;
        int i10 = this.f2462d;
        if (childAdapterPosition >= i) {
            outRect.top = i10;
        } else if (this.c) {
            outRect.top = i10;
        }
    }
}
