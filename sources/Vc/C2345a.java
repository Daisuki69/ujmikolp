package vc;

import N5.Y0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.UpdateProfileSelectionItem;
import defpackage.AbstractC1414e;
import eb.g;
import java.util.List;
import kotlin.jvm.internal.j;
import ph.C2070f1;
import zc.C2556a;
import zc.b;

/* JADX INFO: renamed from: vc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2345a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20486b;
    public final g c;

    public C2345a(List items, String str, g gVar) {
        j.g(items, "items");
        this.f20485a = items;
        this.f20486b = str;
        this.c = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f20485a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        b holder = (b) viewHolder;
        j.g(holder, "holder");
        UpdateProfileSelectionItem item = (UpdateProfileSelectionItem) this.f20485a.get(i);
        j.g(item, "item");
        C2070f1 c2070f1 = holder.c;
        c2070f1.getClass();
        String name = item.getText();
        b bVar = (b) c2070f1.f19463b;
        j.g(name, "name");
        Y0 y0 = bVar.f21370a;
        y0.f4039d.setText(name);
        boolean zB = j.b(item.getCode(), this.f20486b);
        ImageView imageView = y0.c;
        ConstraintLayout constraintLayout = y0.f4038b;
        if (zB) {
            constraintLayout.setBackgroundResource(R.drawable.maya_background_selected_card_green);
            imageView.setVisibility(0);
        } else {
            constraintLayout.setBackgroundResource(R.drawable.maya_background_card_gray);
            imageView.setVisibility(8);
        }
        ConstraintLayout constraintLayout2 = holder.f21370a.f4038b;
        j.f(constraintLayout2, "getRoot(...)");
        C.r0(constraintLayout2, new C2556a(0, holder, item));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        View viewE = AbstractC1414e.e(parent, R.layout.maya_view_holder_profile_update_single_selection_item, parent, false);
        int i4 = R.id.image_view_checkmark;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewE, R.id.image_view_checkmark);
        if (imageView != null) {
            i4 = R.id.text_view_item_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewE, R.id.text_view_item_name);
            if (textView != null) {
                return new b(new Y0((ConstraintLayout) viewE, imageView, textView, 3), this.c);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewE.getResources().getResourceName(i4)));
    }
}
