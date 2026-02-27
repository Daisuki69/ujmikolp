package xe;

import N5.C0466m;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.domain.model.ShopPurchaseHistory;
import java.util.HashMap;
import java.util.Map;
import ue.x;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f20975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f20976b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f20977d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Group f20978g;
    public final LinearLayout h;
    public final o6.f i;
    public ShopPurchaseHistory j;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(C0466m c0466m, com.paymaya.data.preference.a preference, x xVar) {
        kotlin.jvm.internal.j.g(preference, "preference");
        ConstraintLayout constraintLayout = (ConstraintLayout) c0466m.f4150b;
        super(constraintLayout);
        this.f20975a = xVar;
        this.f20976b = (ImageView) c0466m.f4152g;
        this.c = (TextView) c0466m.h;
        this.f20977d = (TextView) c0466m.f;
        this.e = (TextView) c0466m.i;
        this.f = (TextView) c0466m.e;
        this.f20978g = (Group) c0466m.f4151d;
        this.h = (LinearLayout) c0466m.c;
        this.i = new o6.f(preference, this);
        constraintLayout.setOnClickListener(new qf.d(this, 22));
    }

    public final void D(HashMap map) {
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            LinearLayout linearLayout = this.h;
            if (i >= linearLayout.getChildCount()) {
                return;
            }
            View childAt = linearLayout.getChildAt(i);
            TextView textView = (TextView) childAt.findViewById(R.id.label_text_view_pma_view_shop_v3_purchase_history_list_dynamic_field);
            TextView textView2 = (TextView) childAt.findViewById(R.id.value_text_view_pma_view_shop_v3_purchase_history_list_dynamic_field);
            textView.setText(this.itemView.getContext().getString(R.string.pma_label_format_dynamic_field_label_colon, entry.getKey()));
            textView2.setText((CharSequence) entry.getValue());
            childAt.setVisibility(0);
            i++;
        }
    }
}
