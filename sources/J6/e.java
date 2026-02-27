package J6;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2427a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2428b;
    public final int c;

    public e(int i, int i4) {
        this.f2428b = i;
        this.c = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        j.g(outRect, "outRect");
        j.g(view, "view");
        j.g(parent, "parent");
        j.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i = this.f2427a;
        int i4 = childAdapterPosition % i;
        int i6 = this.f2428b;
        outRect.left = (i4 * i6) / i;
        outRect.right = i6 - (((i4 + 1) * i6) / i);
        outRect.bottom = this.c;
    }
}
