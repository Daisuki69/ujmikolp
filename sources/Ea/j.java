package ea;

import N5.r1;
import Q6.n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.BillerCategory;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersCategoryFragment;
import dOYHB6.tiZVw8.numX49;
import ja.C1672a;
import w5.C2383a;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends ListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBillersCategoryFragment f16618a;

    public j(MayaBillersCategoryFragment mayaBillersCategoryFragment) {
        super(new C2383a());
        this.f16618a = mayaBillersCategoryFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1672a c1672a = (C1672a) viewHolder;
        kotlin.jvm.internal.j.g(c1672a, numX49.tnTj78("bdWU"));
        BillerCategory billerCategory = (BillerCategory) getItem(i);
        kotlin.jvm.internal.j.d(billerCategory);
        c1672a.f = billerCategory;
        n nVar = c1672a.e;
        nVar.getClass();
        String strMListUrl = billerCategory.mListUrl();
        kotlin.jvm.internal.j.d(strMListUrl);
        C1672a c1672a2 = (C1672a) nVar.f5284b;
        c1672a2.itemView.getContext();
        ImageView imageView = c1672a2.f17720b;
        C.e0(strMListUrl, imageView, R.drawable.maya_ic_pay_bills_category_placeholder);
        String strMName = billerCategory.mName();
        c1672a2.c.setText(strMName);
        imageView.setContentDescription(strMName);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("bdWe"));
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.maya_view_pay_bills_billers_category_item, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i4 = R.id.pay_bill_category_item_icon_container_frame;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.pay_bill_category_item_icon_container_frame);
        if (frameLayout != null) {
            i4 = R.id.pay_bill_category_item_icon_image_view;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.pay_bill_category_item_icon_image_view);
            if (imageView != null) {
                i4 = R.id.pay_bill_category_item_title_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.pay_bill_category_item_title_text_view);
                if (textView != null) {
                    return new C1672a(new r1((ViewGroup) constraintLayout, (View) frameLayout, (Object) imageView, (Object) textView, 1), this);
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bdW8").concat(viewInflate.getResources().getResourceName(i4)));
    }
}
