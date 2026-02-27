package d9;

import N5.E0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import defpackage.AbstractC1414e;
import i9.b;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f16297a;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f16297a.isEmpty() ? 0 : Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        b holder = (b) viewHolder;
        j.g(holder, "holder");
        i9.a item = (i9.a) this.f16297a.get(i % this.f16297a.size());
        j.g(item, "item");
        Context context = holder.itemView.getContext();
        holder.f17127a.setImageDrawable(ContextCompat.getDrawable(context, item.f17125a));
        holder.f17128b.setText(context.getString(item.f17126b));
        holder.c.setText(context.getString(item.c));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        View viewE = AbstractC1414e.e(parent, R.layout.maya_view_pager_item_wizard_page, parent, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewE;
        int i4 = R.id.description_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewE, R.id.description_text_view);
        if (textView != null) {
            i4 = R.id.graphic_image_view;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewE, R.id.graphic_image_view);
            if (imageView != null) {
                i4 = R.id.left_guideline;
                if (((Guideline) ViewBindings.findChildViewById(viewE, R.id.left_guideline)) != null) {
                    i4 = R.id.right_guideline;
                    if (((Guideline) ViewBindings.findChildViewById(viewE, R.id.right_guideline)) != null) {
                        i4 = R.id.title_text_view;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewE, R.id.title_text_view);
                        if (textView2 != null) {
                            return new b(new E0(constraintLayout, textView, imageView, textView2));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewE.getResources().getResourceName(i4)));
    }
}
