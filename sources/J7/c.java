package J7;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.FeatureDynamicStatus;
import com.paymaya.domain.model.SecondaryFeature;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.functions.Function2;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f2438d;
    public final CardView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f2439g;
    public final AppCompatImageButton h;
    public final TextView i;
    public final Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC1033d f2440k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC1033d f2441l;
    public final InterfaceC1033d m;

    public c(Context context) {
        super(context, null, 0, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_view_holder_services_core_item, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.card_view_badge_container_v2;
        CardView cardView = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_badge_container_v2);
        if (cardView != null) {
            ConstraintLayout container = (ConstraintLayout) viewInflate;
            int i4 = R.id.image_button_secondary_feature_icon;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(viewInflate, R.id.image_button_secondary_feature_icon);
            if (appCompatImageButton != null) {
                i4 = R.id.image_view_badge_dot;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_badge_dot);
                if (appCompatImageView != null) {
                    i4 = R.id.text_view_badge_label;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_badge_label);
                    if (textView != null) {
                        i4 = R.id.text_view_secondary_feature_name;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_secondary_feature_name);
                        if (textView2 != null) {
                            kotlin.jvm.internal.j.f(container, "container");
                            this.f2438d = container;
                            this.e = cardView;
                            this.f = textView;
                            this.f2439g = appCompatImageView;
                            this.h = appCompatImageButton;
                            this.i = textView2;
                            this.j = container.getContext();
                            this.f2440k = C1034e.b(new a(context, 0));
                            this.f2441l = C1034e.b(new a(context, 1));
                            this.m = C1034e.b(new a(context, 2));
                            return;
                        }
                    }
                }
            }
            i = i4;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    private final int getMDynamicStatusDefaultBackgroundColor() {
        return ((Number) this.m.getValue()).intValue();
    }

    private final int getMStatusBetaBackgroundColor() {
        return ((Number) this.f2441l.getValue()).intValue();
    }

    private final int getMStatusNewBackgroundColor() {
        return ((Number) this.f2440k.getValue()).intValue();
    }

    private final void setDynamicStatusText(String str) {
        TextView textView = this.f;
        textView.setVisibility(0);
        this.f2439g.setVisibility(8);
        textView.setText(str);
        int mDynamicStatusDefaultBackgroundColor = getMDynamicStatusDefaultBackgroundColor();
        CardView cardView = this.e;
        cardView.setCardBackgroundColor(mDynamicStatusDefaultBackgroundColor);
        if (Build.VERSION.SDK_INT >= 28) {
            cardView.setOutlineAmbientShadowColor(getMDynamicStatusDefaultBackgroundColor());
            cardView.setOutlineSpotShadowColor(getMDynamicStatusDefaultBackgroundColor());
        }
        cardView.setVisibility(0);
    }

    public final void b(final int i, final SecondaryFeature secondaryFeature, final Function2 function2) {
        String promoDisplayText;
        kotlin.jvm.internal.j.g(secondaryFeature, "secondaryFeature");
        FeatureDynamicStatus featureDynamicStatusMFeatureDynamicStatus = secondaryFeature.mFeatureDynamicStatus();
        CardView cardView = this.e;
        cardView.setVisibility(8);
        Context context = this.j;
        if (featureDynamicStatusMFeatureDynamicStatus != null && AbstractC1234x.m(featureDynamicStatusMFeatureDynamicStatus.getStartDate(), featureDynamicStatusMFeatureDynamicStatus.getEndDate())) {
            if (kotlin.jvm.internal.j.b(featureDynamicStatusMFeatureDynamicStatus.getStatus(), "dot")) {
                this.f.setVisibility(8);
                AppCompatImageView appCompatImageView = this.f2439g;
                appCompatImageView.setVisibility(0);
                appCompatImageView.setColorFilter(getMDynamicStatusDefaultBackgroundColor(), PorterDuff.Mode.SRC_IN);
                if (Build.VERSION.SDK_INT >= 28) {
                    cardView.setOutlineAmbientShadowColor(getMDynamicStatusDefaultBackgroundColor());
                    cardView.setOutlineSpotShadowColor(getMDynamicStatusDefaultBackgroundColor());
                }
                cardView.setVisibility(0);
            } else if (kotlin.jvm.internal.j.b(featureDynamicStatusMFeatureDynamicStatus.getStatus(), "new")) {
                String string = context.getString(R.string.maya_label_new_capitalize);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                setDynamicStatusText(string);
            } else if (kotlin.jvm.internal.j.b(featureDynamicStatusMFeatureDynamicStatus.getStatus(), "promo") && (promoDisplayText = featureDynamicStatusMFeatureDynamicStatus.getPromoDisplayText()) != null && !C2576A.H(promoDisplayText)) {
                setDynamicStatusText(featureDynamicStatusMFeatureDynamicStatus.getPromoDisplayText());
            }
        }
        kotlin.jvm.internal.j.f(context, "context");
        int iN = jk.b.n(context, R.attr.mayaColorBackgroundPrimary);
        AppCompatImageButton appCompatImageButton = this.h;
        appCompatImageButton.setBackgroundColor(iN);
        appCompatImageButton.setImageResource(secondaryFeature.mImageResource());
        final int i4 = 0;
        appCompatImageButton.setOnClickListener(new View.OnClickListener() { // from class: J7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        int i6 = i;
                        SecondaryFeature secondaryFeature2 = secondaryFeature;
                        Callback.onClick_enter(view);
                        Function2 function22 = function2;
                        if (function22 != null) {
                            try {
                                function22.invoke(Integer.valueOf(i6), secondaryFeature2);
                            } finally {
                            }
                        }
                        return;
                    default:
                        int i10 = i;
                        SecondaryFeature secondaryFeature3 = secondaryFeature;
                        Callback.onClick_enter(view);
                        Function2 function23 = function2;
                        if (function23 != null) {
                            try {
                                function23.invoke(Integer.valueOf(i10), secondaryFeature3);
                            } finally {
                            }
                        }
                        return;
                }
            }
        });
        String strMLabel = secondaryFeature.mLabel();
        TextView textView = this.i;
        textView.setText(strMLabel);
        final int i6 = 1;
        textView.setOnClickListener(new View.OnClickListener() { // from class: J7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        int i62 = i;
                        SecondaryFeature secondaryFeature2 = secondaryFeature;
                        Callback.onClick_enter(view);
                        Function2 function22 = function2;
                        if (function22 != null) {
                            try {
                                function22.invoke(Integer.valueOf(i62), secondaryFeature2);
                            } finally {
                            }
                        }
                        return;
                    default:
                        int i10 = i;
                        SecondaryFeature secondaryFeature3 = secondaryFeature;
                        Callback.onClick_enter(view);
                        Function2 function23 = function2;
                        if (function23 != null) {
                            try {
                                function23.invoke(Integer.valueOf(i10), secondaryFeature3);
                            } finally {
                            }
                        }
                        return;
                }
            }
        });
        setVisible(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setVisible(boolean z4) {
        this.f2438d.setVisibility(z4 ? 0 : 8);
    }
}
