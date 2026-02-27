package J8;

import N5.q1;
import We.A;
import We.G;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.domain.model.KycBenefit;
import defpackage.AbstractC1414e;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f2465b;

    public f(List list, A a8) {
        this.f2464a = list;
        this.f2465b = a8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f2464a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        N8.b holder = (N8.b) viewHolder;
        kotlin.jvm.internal.j.g(holder, "holder");
        KycBenefit kycBenefit = (KycBenefit) this.f2464a.get(i);
        kotlin.jvm.internal.j.g(kycBenefit, "kycBenefit");
        J5.a aVar = holder.c;
        aVar.getClass();
        N8.b bVar = (N8.b) aVar.f2414b;
        G gH = bVar.f4331b.h(kycBenefit.getIconUrl());
        gH.h(2131231490);
        gH.b(2131231490);
        q1 q1Var = bVar.f4330a;
        gH.e(q1Var.c, null);
        q1Var.f4189d.setText(kycBenefit.getDescription());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.j.g(parent, "parent");
        View viewE = AbstractC1414e.e(parent, R.layout.maya_view_holder_kyc_benefit_item, parent, false);
        LinearLayout linearLayout = (LinearLayout) viewE;
        int i4 = R.id.maya_kyc_benefits_icon_image_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewE, R.id.maya_kyc_benefits_icon_image_view);
        if (imageView != null) {
            i4 = R.id.maya_kyc_benefits_text_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewE, R.id.maya_kyc_benefits_text_view);
            if (textView != null) {
                return new N8.b(new q1(linearLayout, imageView, textView, 0), this.f2465b);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewE.getResources().getResourceName(i4)));
    }
}
