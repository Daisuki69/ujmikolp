package U7;

import N5.l1;
import R4.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.domain.model.FavoriteDynamicField;
import f8.C1468a;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends ListAdapter {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1468a holder = (C1468a) viewHolder;
        j.g(holder, "holder");
        Object item = getItem(i);
        j.f(item, "getItem(...)");
        FavoriteDynamicField favoriteDynamicField = (FavoriteDynamicField) item;
        i iVar = holder.e;
        iVar.getClass();
        String key = favoriteDynamicField.getKey();
        j.f(key, "getKey(...)");
        C1468a c1468a = (C1468a) iVar.f5470b;
        c1468a.f16730a.setText(key);
        String value = favoriteDynamicField.getValue();
        j.f(value, "getValue(...)");
        c1468a.f16731b.setText(value);
        String extraValue = favoriteDynamicField.getExtraValue();
        TextView textView = c1468a.c;
        if (extraValue == null || C2576A.H(extraValue)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(extraValue);
        }
        String subValue = favoriteDynamicField.getSubValue();
        TextView textView2 = c1468a.f16732d;
        if (subValue == null || C2576A.H(subValue)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(subValue);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.maya_view_holder_add_favorite_detail, parent, false);
        int i4 = R.id.text_view_add_favorite_extra_value;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_add_favorite_extra_value);
        if (textView != null) {
            i4 = R.id.text_view_add_favorite_label;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_add_favorite_label);
            if (textView2 != null) {
                i4 = R.id.text_view_add_favorite_sub_value;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_add_favorite_sub_value);
                if (textView3 != null) {
                    i4 = R.id.text_view_add_favorite_value;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_add_favorite_value);
                    if (textView4 != null) {
                        return new C1468a(new l1((ConstraintLayout) viewInflate, textView, textView2, textView3, textView4, 0));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
