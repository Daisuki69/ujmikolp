package J8;

import N5.Y0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.domain.model.KycTip;
import java.util.ArrayList;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2478a;

    public m(ArrayList arrayList) {
        this.f2478a = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f2478a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        N8.e holder = (N8.e) viewHolder;
        kotlin.jvm.internal.j.g(holder, "holder");
        KycTip kycTip = (KycTip) this.f2478a.get(i);
        kotlin.jvm.internal.j.g(kycTip, "kycTip");
        A5.l lVar = holder.f4336b;
        lVar.getClass();
        Y0 y0 = ((N8.e) lVar.f175b).f4335a;
        y0.f4039d.setText(kycTip.getDescription());
        AbstractC1955a.w(y0.c, kycTip.getIconUrl(), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.j.g(parent, "parent");
        View viewInflate = x3.d.p(parent).inflate(R.layout.maya_view_holder_kyc_photo_tip, parent, false);
        int i4 = R.id.image_view_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_icon);
        if (imageView != null) {
            i4 = R.id.text_view_description;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description);
            if (textView != null) {
                return new N8.e(new Y0((ConstraintLayout) viewInflate, imageView, textView, 2));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
