package hd;

import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigDecimal;

/* JADX INFO: renamed from: hd.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1562b extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1561a f17029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17030b;

    public C1562b(InterfaceC1561a interfaceC1561a, int i) {
        this.f17029a = interfaceC1561a;
        this.f17030b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDrawOver(canvas, recyclerView, state);
        int childLayoutPosition = recyclerView.getChildLayoutPosition(recyclerView.getChildAt(0));
        View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(this.f17030b, (ViewGroup) recyclerView, false);
        InterfaceC1561a interfaceC1561a = this.f17029a;
        interfaceC1561a.b(childLayoutPosition, viewInflate);
        View childAt = recyclerView.getChildAt(1);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0);
        viewInflate.measure(ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, recyclerView.getPaddingRight() + recyclerView.getPaddingLeft(), viewInflate.getLayoutParams().width), ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, recyclerView.getPaddingBottom() + recyclerView.getPaddingTop(), viewInflate.getLayoutParams().height));
        viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
        int bottom = viewInflate.getBottom();
        if (childAt != null && childAt.getBottom() > bottom && childAt.getTop() <= bottom && interfaceC1561a.c(recyclerView.getChildLayoutPosition(childAt)) && childLayoutPosition > 0) {
            recyclerView.getChildLayoutPosition(childAt);
            canvas.save();
            canvas.translate(0.0f, BigDecimal.valueOf(((double) childAt.getTop()) - ((double) viewInflate.getHeight())).floatValue());
            viewInflate.draw(canvas);
            canvas.restore();
            return;
        }
        if (interfaceC1561a.a(childLayoutPosition)) {
            canvas.save();
            canvas.translate(0.0f, 0.0f);
            viewInflate.draw(canvas);
            canvas.restore();
        }
    }
}
