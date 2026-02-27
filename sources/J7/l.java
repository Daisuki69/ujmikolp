package J7;

import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f2448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2449b = R.layout.maya_view_holder_date_header_alt_activity;

    public l(k kVar) {
        this.f2448a = kVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        kotlin.jvm.internal.j.g(c, "c");
        kotlin.jvm.internal.j.g(parent, "parent");
        kotlin.jvm.internal.j.g(state, "state");
        super.onDrawOver(c, parent, state);
        int childLayoutPosition = parent.getChildLayoutPosition(parent.getChildAt(0));
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.f2449b, (ViewGroup) parent, false);
        k kVar = this.f2448a;
        if (kVar != null) {
            kotlin.jvm.internal.j.d(viewInflate);
            kVar.b(childLayoutPosition, viewInflate);
        }
        if (viewInflate != null) {
            View childAt = parent.getChildAt(1);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(parent.getHeight(), 0);
            viewInflate.measure(ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, parent.getPaddingRight() + parent.getPaddingLeft(), viewInflate.getLayoutParams().width), ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, parent.getPaddingBottom() + parent.getPaddingTop(), viewInflate.getLayoutParams().height));
            viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
            int bottom = viewInflate.getBottom();
            if (childAt != null && childAt.getBottom() > bottom && childAt.getTop() <= bottom && kVar != null && kVar.c(parent.getChildLayoutPosition(childAt)) && childLayoutPosition > 0) {
                parent.getChildLayoutPosition(childAt);
                c.save();
                c.translate(0.0f, BigDecimal.valueOf(((double) childAt.getTop()) - ((double) viewInflate.getHeight())).floatValue());
                viewInflate.draw(c);
                c.restore();
                return;
            }
            if (kVar == null || !kVar.a(childLayoutPosition)) {
                return;
            }
            c.save();
            c.translate(0.0f, 0.0f);
            viewInflate.draw(c);
            c.restore();
        }
    }
}
