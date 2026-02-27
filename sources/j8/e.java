package J8;

import N5.Z;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.domain.model.KycDocument;
import defpackage.AbstractC1414e;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2463a;

    public e(List list) {
        this.f2463a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f2463a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        N8.a holder = (N8.a) viewHolder;
        kotlin.jvm.internal.j.g(holder, "holder");
        KycDocument kycDocument = (KycDocument) this.f2463a.get(i);
        kotlin.jvm.internal.j.g(kycDocument, "kycDocument");
        J5.c cVar = holder.f4329b;
        cVar.getClass();
        String additionalDescription = kycDocument.getAdditionalDescription();
        Z z4 = ((N8.a) cVar.f2418b).f4328a;
        if (additionalDescription == null || additionalDescription.length() == 0) {
            z4.c.setText(kycDocument.getDescription());
            z4.f4042d.setVisibility(8);
            return;
        }
        z4.c.setText(kycDocument.getDescription());
        String additionalDescription2 = kycDocument.getAdditionalDescription();
        TextView textView = z4.f4042d;
        textView.setText(additionalDescription2);
        textView.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.j.g(parent, "parent");
        View viewE = AbstractC1414e.e(parent, R.layout.maya_view_holder_kyc_accepted_id_item, parent, false);
        int i4 = R.id.maya_kyc_accepted_ids_document_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewE, R.id.maya_kyc_accepted_ids_document_text_view);
        if (textView != null) {
            i4 = R.id.maya_kyc_accepted_ids_foreigners_text_view;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewE, R.id.maya_kyc_accepted_ids_foreigners_text_view);
            if (textView2 != null) {
                i4 = R.id.maya_kyc_accepted_ids_icon_image_view;
                if (((ImageView) ViewBindings.findChildViewById(viewE, R.id.maya_kyc_accepted_ids_icon_image_view)) != null) {
                    return new N8.a(new Z((ConstraintLayout) viewE, textView, textView2, 2));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewE.getResources().getResourceName(i4)));
    }
}
