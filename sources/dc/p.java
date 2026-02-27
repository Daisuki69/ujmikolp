package dc;

import N5.C0466m;
import ac.C0674C;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.domain.model.ShopPurchaseHistory;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0674C f16350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f16351b;
    public final ImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f16352d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f16353g;
    public final LinearLayout h;
    public final Q6.n i;
    public ShopPurchaseHistory j;

    /* JADX WARN: Illegal instructions before constructor call */
    public p(C0466m c0466m, com.paymaya.data.preference.a preference, C0674C c0674c) {
        kotlin.jvm.internal.j.g(preference, "preference");
        ConstraintLayout constraintLayout = (ConstraintLayout) c0466m.f4150b;
        super(constraintLayout);
        this.f16350a = c0674c;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) c0466m.c;
        kotlin.jvm.internal.j.f(constraintLayout2, "layoutContainerPmaViewSh…haseHistoryProcessingItem");
        this.f16351b = constraintLayout2;
        this.c = (ImageView) c0466m.f4152g;
        this.f16352d = (TextView) c0466m.h;
        this.e = (TextView) c0466m.f;
        this.f = (TextView) c0466m.e;
        this.f16353g = (TextView) c0466m.i;
        this.h = (LinearLayout) c0466m.f4151d;
        this.i = new Q6.n(preference, this);
        constraintLayout.setOnClickListener(new Y6.o(this, 23));
    }

    public final void D(HashMap map) {
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            LinearLayout linearLayout = this.h;
            if (i >= linearLayout.getChildCount()) {
                return;
            }
            View childAt = linearLayout.getChildAt(i);
            TextView textView = (TextView) childAt.findViewById(R.id.shop_dynamic_field_label_text_view);
            TextView textView2 = (TextView) childAt.findViewById(R.id.shop_dynamic_field_value_text_view);
            textView.setText((CharSequence) entry.getKey());
            textView2.setText((CharSequence) entry.getValue());
            childAt.setVisibility(0);
            i++;
        }
    }
}
