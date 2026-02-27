package Hc;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2161a;

    public a(int i) {
        this.f2161a = i;
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
        int i = this.f2161a;
        outRect.left = i;
        outRect.right = i;
        if (childAdapterPosition == 0) {
            outRect.top = i * 2;
            outRect.bottom = i;
        } else {
            outRect.top = i;
            outRect.bottom = i;
        }
    }
}
