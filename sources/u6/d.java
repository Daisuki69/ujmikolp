package U6;

import N5.Y0;
import N5.Z;
import Q6.n;
import Z6.f;
import Z6.g;
import Z6.h;
import a7.AbstractC0665z;
import a7.C0663x;
import a7.C0664y;
import android.content.Context;
import android.view.LayoutInflater;
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
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutInflater f5954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5955b;

    public d(Context context) {
        Object systemService = context.getSystemService("layout_inflater");
        j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f5954a = (LayoutInflater) systemService;
        this.f5955b = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f5955b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((AbstractC0665z) this.f5955b.get(i)).f7066a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        j.g(holder, "holder");
        AbstractC0665z abstractC0665z = (AbstractC0665z) this.f5955b.get(i);
        if (abstractC0665z instanceof C0664y) {
            C0664y c0664y = (C0664y) abstractC0665z;
            String label = c0664y.f7065b;
            j.g(label, "label");
            n nVar = ((h) holder).c;
            nVar.getClass();
            h hVar = (h) nVar.f5284b;
            hVar.f6903a.setText(label);
            hVar.f6904b.setText(c0664y.c);
            return;
        }
        if (abstractC0665z instanceof C0663x) {
            C0663x c0663x = (C0663x) abstractC0665z;
            String str = c0663x.f7064b;
            Gb.d dVar = ((g) holder).f6902d;
            dVar.getClass();
            g gVar = (g) dVar.f1942b;
            gVar.f6900a.setText(str);
            gVar.f6901b.setImageDrawable(ContextCompat.getDrawable(gVar.c, c0663x.c));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        int i4 = R.id.text_view_activity_list_label;
        LayoutInflater layoutInflater = this.f5954a;
        if (i == 0) {
            View viewInflate = layoutInflater.inflate(R.layout.maya_view_holder_activity_list_label_value_field_string, parent, false);
            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.text_view_activity_list_divider)) != null) {
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_activity_list_label);
                if (textView != null) {
                    i4 = R.id.text_view_activity_list_value;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_activity_list_value);
                    if (textView2 != null) {
                        return new h(new Z((ConstraintLayout) viewInflate, textView, textView2, 1));
                    }
                }
            } else {
                i4 = R.id.text_view_activity_list_divider;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
        }
        if (i != 1) {
            View viewInflate2 = layoutInflater.inflate(R.layout.maya_view_holder_activity_list_label_value_field_divider, parent, false);
            if (ViewBindings.findChildViewById(viewInflate2, R.id.text_view_activity_list_divider) != null) {
                return new f((ConstraintLayout) viewInflate2);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(R.id.text_view_activity_list_divider)));
        }
        View viewInflate3 = layoutInflater.inflate(R.layout.maya_view_holder_activity_list_label_value_field_image, parent, false);
        if (((Guideline) ViewBindings.findChildViewById(viewInflate3, R.id.text_view_activity_list_divider)) != null) {
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate3, R.id.text_view_activity_list_image);
            if (imageView != null) {
                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.text_view_activity_list_label);
                if (textView3 != null) {
                    return new g(new Y0((ConstraintLayout) viewInflate3, imageView, textView3, 1));
                }
            } else {
                i4 = R.id.text_view_activity_list_image;
            }
        } else {
            i4 = R.id.text_view_activity_list_divider;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i4)));
    }
}
