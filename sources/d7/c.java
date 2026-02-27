package D7;

import A7.i;
import N5.C0450f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.DynamicStatusBadge;
import com.paymaya.domain.model.FeatureDynamicStatus;
import com.paymaya.domain.model.SecondaryFeature;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutInflater f989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f990b;
    public final b c;

    public c(Context context, b secondaryFeatureAdapterListener) {
        j.g(context, "context");
        j.g(secondaryFeatureAdapterListener, "secondaryFeatureAdapterListener");
        Object systemService = context.getSystemService("layout_inflater");
        j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f989a = (LayoutInflater) systemService;
        this.f990b = new ArrayList();
        this.c = secondaryFeatureAdapterListener;
    }

    public final void e(Collection collection) {
        ArrayList arrayList = this.f990b;
        arrayList.clear();
        arrayList.addAll(collection);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f990b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        String promoDisplayText;
        j.g(holder, "holder");
        final I7.c cVar = (I7.c) holder;
        Object obj = this.f990b.get(i);
        j.f(obj, "get(...)");
        final SecondaryFeature secondaryFeature = (SecondaryFeature) obj;
        i iVar = cVar.e;
        iVar.getClass();
        String strMLabel = secondaryFeature.mLabel();
        j.f(strMLabel, "mLabel(...)");
        I7.c cVar2 = iVar.f218a;
        cVar2.f2224b.setText(strMLabel);
        cVar2.c.setImageResource(secondaryFeature.mImageResource());
        FeatureDynamicStatus featureDynamicStatusMFeatureDynamicStatus = secondaryFeature.mFeatureDynamicStatus();
        if (featureDynamicStatusMFeatureDynamicStatus != null && AbstractC1234x.m(featureDynamicStatusMFeatureDynamicStatus.getStartDate(), featureDynamicStatusMFeatureDynamicStatus.getEndDate())) {
            String status = featureDynamicStatusMFeatureDynamicStatus.getStatus();
            int iHashCode = status.hashCode();
            DynamicStatusBadge promoBadge = null;
            if (iHashCode != 99657) {
                if (iHashCode != 108960) {
                    if (iHashCode == 106940687 && status.equals("promo") && (promoDisplayText = featureDynamicStatusMFeatureDynamicStatus.getPromoDisplayText()) != null && !C2576A.H(promoDisplayText)) {
                        promoBadge = new DynamicStatusBadge.PromoBadge(featureDynamicStatusMFeatureDynamicStatus.getPromoDisplayText());
                    }
                } else if (status.equals("new")) {
                    promoBadge = DynamicStatusBadge.NewBadge.INSTANCE;
                }
            } else if (status.equals("dot")) {
                promoBadge = DynamicStatusBadge.DotBadge.INSTANCE;
            }
            cVar2.f2225d = promoBadge;
        }
        final int i4 = 0;
        cVar.c.setOnClickListener(new View.OnClickListener() { // from class: I7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        c cVar3 = cVar;
                        SecondaryFeature secondaryFeature2 = secondaryFeature;
                        Callback.onClick_enter(view);
                        try {
                            cVar3.f2223a.M(secondaryFeature2, cVar3.getAbsoluteAdapterPosition() + 1);
                            return;
                        } finally {
                        }
                    default:
                        c cVar4 = cVar;
                        SecondaryFeature secondaryFeature3 = secondaryFeature;
                        Callback.onClick_enter(view);
                        try {
                            cVar4.f2223a.M(secondaryFeature3, cVar4.getAbsoluteAdapterPosition() + 1);
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i6 = 1;
        cVar.f2224b.setOnClickListener(new View.OnClickListener() { // from class: I7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        c cVar3 = cVar;
                        SecondaryFeature secondaryFeature2 = secondaryFeature;
                        Callback.onClick_enter(view);
                        try {
                            cVar3.f2223a.M(secondaryFeature2, cVar3.getAbsoluteAdapterPosition() + 1);
                            return;
                        } finally {
                        }
                    default:
                        c cVar4 = cVar;
                        SecondaryFeature secondaryFeature3 = secondaryFeature;
                        Callback.onClick_enter(view);
                        try {
                            cVar4.f2223a.M(secondaryFeature3, cVar4.getAbsoluteAdapterPosition() + 1);
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        View viewInflate = this.f989a.inflate(R.layout.maya_view_holder_feature_v2, parent, false);
        int i4 = R.id.image_button_secondary_feature_icon;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(viewInflate, R.id.image_button_secondary_feature_icon);
        if (appCompatImageButton != null) {
            i4 = R.id.text_view_secondary_feature_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_secondary_feature_name);
            if (textView != null) {
                return new I7.c(new C0450f((ViewGroup) viewInflate, (Object) appCompatImageButton, (Object) textView, 18), this.c);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
