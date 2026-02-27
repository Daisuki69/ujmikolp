package ea;

import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16616b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f16617d;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        kotlin.jvm.internal.j.g(rect, numX49.tnTj78("bdWP"));
        kotlin.jvm.internal.j.g(view, numX49.tnTj78("bdWb"));
        kotlin.jvm.internal.j.g(recyclerView, numX49.tnTj78("bdW2"));
        kotlin.jvm.internal.j.g(state, numX49.tnTj78("bdWL"));
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int i = this.f16615a;
        rect.left = i;
        rect.right = i;
        int i4 = this.c;
        if (childAdapterPosition == 0) {
            rect.top = i4;
        } else if (childAdapterPosition == state.getItemCount() - 1) {
            rect.bottom = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDrawOver(android.graphics.Canvas r18, androidx.recyclerview.widget.RecyclerView r19, androidx.recyclerview.widget.RecyclerView.State r20) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.i.onDrawOver(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State):void");
    }
}
