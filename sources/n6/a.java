package N6;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4320a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4321b;

    public a(int i) {
        this.f4321b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        j.g(outRect, "outRect");
        j.g(view, "view");
        j.g(recyclerView, "recyclerView");
        j.g(state, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int i = this.f4320a;
        int i4 = childAdapterPosition % i;
        int i6 = this.f4321b;
        if (i4 == 0) {
            outRect.left = 0;
            outRect.right = 0;
        } else {
            outRect.left = i6;
            outRect.right = 0;
        }
        if (childAdapterPosition / i == 0) {
            outRect.top = 0;
            outRect.bottom = 0;
        } else {
            outRect.top = i6;
            outRect.bottom = 0;
        }
    }
}
