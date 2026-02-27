package J8;

import M8.M1;
import N5.k1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.KycSelectionItem;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSingleSelectionBottomSheetDialogFragment;
import defpackage.AbstractC1414e;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f2474b;
    public final M1 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MayaKycSingleSelectionBottomSheetDialogFragment f2475d;
    public List e;

    public k(List items, Integer num, M1 m12, MayaKycSingleSelectionBottomSheetDialogFragment mayaKycSingleSelectionBottomSheetDialogFragment) {
        kotlin.jvm.internal.j.g(items, "items");
        this.f2473a = items;
        this.f2474b = num;
        this.c = m12;
        this.f2475d = mayaKycSingleSelectionBottomSheetDialogFragment;
        this.e = items;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String warningMessage;
        N8.d holder = (N8.d) viewHolder;
        kotlin.jvm.internal.j.g(holder, "holder");
        KycSelectionItem item = (KycSelectionItem) this.e.get(i);
        kotlin.jvm.internal.j.g(item, "item");
        J5.a aVar = holder.c;
        aVar.getClass();
        String name = item.getText();
        N8.d dVar = (N8.d) aVar.f2414b;
        kotlin.jvm.internal.j.g(name, "name");
        k1 k1Var = dVar.f4333a;
        ((TextView) k1Var.f4139d).setText(name);
        int id = item.getId();
        ImageView imageView = (ImageView) k1Var.f4138b;
        LinearLayout linearLayout = (LinearLayout) k1Var.e;
        Integer num = this.f2474b;
        if (num != null && id == num.intValue()) {
            linearLayout.setBackgroundResource(R.drawable.maya_background_selected_card_green);
            imageView.setVisibility(0);
        } else {
            linearLayout.setBackgroundResource(R.drawable.maya_background_card_gray);
            imageView.setVisibility(8);
        }
        boolean showWarning = item.getShowWarning();
        LinearLayout linearLayout2 = (LinearLayout) k1Var.c;
        TextView textView = (TextView) k1Var.f;
        if (!showWarning || (warningMessage = item.getWarningMessage()) == null || warningMessage.length() == 0) {
            linearLayout2.setVisibility(8);
            textView.setVisibility(8);
        } else {
            String text = item.getWarningMessage();
            kotlin.jvm.internal.j.g(text, "text");
            textView.setText(text);
            linearLayout2.setVisibility(0);
            textView.setVisibility(0);
        }
        LinearLayout linearLayout3 = (LinearLayout) holder.f4333a.e;
        kotlin.jvm.internal.j.f(linearLayout3, "getRoot(...)");
        C.r0(linearLayout3, new Ag.l(12, holder, item));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.j.g(parent, "parent");
        View viewE = AbstractC1414e.e(parent, R.layout.maya_view_holder_kyc_single_selection_item, parent, false);
        int i4 = R.id.image_view_checkmark;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewE, R.id.image_view_checkmark);
        if (imageView != null) {
            i4 = R.id.image_warning_icon;
            if (((ImageView) ViewBindings.findChildViewById(viewE, R.id.image_warning_icon)) != null) {
                i4 = R.id.linear_container_warning;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewE, R.id.linear_container_warning);
                if (linearLayout != null) {
                    i4 = R.id.text_view_item_name;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewE, R.id.text_view_item_name);
                    if (textView != null) {
                        i4 = R.id.text_view_sub_item_name;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewE, R.id.text_view_sub_item_name);
                        if (textView2 != null) {
                            return new N8.d(new k1((ViewGroup) viewE, (View) imageView, (Object) linearLayout, textView, (View) textView2, 4), this.c);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewE.getResources().getResourceName(i4)));
    }
}
