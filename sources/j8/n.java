package J8;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2480b;
    public final int c;

    public n(int i, int i4, int i6, int i10) {
        i = (i10 & 1) != 0 ? 0 : i;
        i4 = (i10 & 2) != 0 ? 0 : i4;
        i6 = (i10 & 4) != 0 ? 0 : i6;
        this.f2479a = i;
        this.f2480b = i4;
        this.c = i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        kotlin.jvm.internal.j.g(outRect, "outRect");
        kotlin.jvm.internal.j.g(view, "view");
        kotlin.jvm.internal.j.g(parent, "parent");
        kotlin.jvm.internal.j.g(state, "state");
        if (parent.getChildAdapterPosition(view) != 0) {
            outRect.top = this.f2479a;
        }
        if (parent.getChildLayoutPosition(view) == state.getItemCount() - 1) {
            outRect.bottom = this.c;
        }
        int i = this.f2480b;
        outRect.left = i;
        outRect.right = i;
    }
}
