package T7;

import N5.h1;
import S.b;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h1 f5812d;
    public final AppCompatCheckBox e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f5813g;
    public final AppCompatImageView h;
    public final Drawable i;
    public final Drawable j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Function1 f5814k;

    public a(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.maya_view_data_privacy_consent_item, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.consent_description_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.consent_description_text_view);
        if (textView != null) {
            i = R.id.consent_enabled_checkbox;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(viewInflate, R.id.consent_enabled_checkbox);
            if (appCompatCheckBox != null) {
                i = R.id.consent_name_text_view;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.consent_name_text_view);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i = R.id.expand_collapse_content_image_view;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.expand_collapse_content_image_view);
                    if (appCompatImageView != null) {
                        this.f5812d = new h1(constraintLayout, textView, appCompatCheckBox, textView2, appCompatImageView);
                        this.e = getBinding().c;
                        this.f = getBinding().f4113d;
                        this.f5813g = getBinding().f4112b;
                        this.h = getBinding().e;
                        TypedValue typedValue = new TypedValue();
                        getContext().getTheme().resolveAttribute(R.attr.mayaDrawable_CommonExpandContentIcon, typedValue, true);
                        this.i = ContextCompat.getDrawable(getContext(), typedValue.resourceId);
                        TypedValue typedValue2 = new TypedValue();
                        getContext().getTheme().resolveAttribute(R.attr.mayaDrawable_CommonCollapseContentIcon, typedValue2, true);
                        this.j = ContextCompat.getDrawable(getContext(), typedValue2.resourceId);
                        AppCompatImageView appCompatImageView2 = this.h;
                        if (appCompatImageView2 != null) {
                            appCompatImageView2.setOnClickListener(new b(this, 12));
                            return;
                        } else {
                            j.n("mExpandCollapseContentImageView");
                            throw null;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public static final void b(a aVar) {
        TextView textView = aVar.f5813g;
        if (textView == null) {
            j.n("mConsentDescriptionTextView");
            throw null;
        }
        if (textView.getVisibility() == 8) {
            Function1 function1 = aVar.f5814k;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            AppCompatImageView appCompatImageView = aVar.h;
            if (appCompatImageView == null) {
                j.n("mExpandCollapseContentImageView");
                throw null;
            }
            appCompatImageView.setImageDrawable(aVar.j);
            TextView textView2 = aVar.f5813g;
            if (textView2 != null) {
                textView2.setVisibility(0);
                return;
            } else {
                j.n("mConsentDescriptionTextView");
                throw null;
            }
        }
        Function1 function12 = aVar.f5814k;
        if (function12 != null) {
            function12.invoke(Boolean.FALSE);
        }
        AppCompatImageView appCompatImageView2 = aVar.h;
        if (appCompatImageView2 == null) {
            j.n("mExpandCollapseContentImageView");
            throw null;
        }
        appCompatImageView2.setImageDrawable(aVar.i);
        TextView textView3 = aVar.f5813g;
        if (textView3 != null) {
            textView3.setVisibility(8);
        } else {
            j.n("mConsentDescriptionTextView");
            throw null;
        }
    }

    private final h1 getBinding() {
        h1 h1Var = this.f5812d;
        j.d(h1Var);
        return h1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("state_child_views");
            if (sparseParcelableArray != null) {
                jk.b.t(this, sparseParcelableArray);
            }
            parcelable = bundle.getParcelable("state_super_state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_super_state", super.onSaveInstanceState());
        bundle.putSparseParcelableArray("state_child_views", jk.b.u(this));
        return bundle;
    }

    public final void setCheckBoxConsentChecked(boolean z4) {
        AppCompatCheckBox appCompatCheckBox = this.e;
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setChecked(z4);
        } else {
            j.n("mConsentEnabledCheckBox");
            throw null;
        }
    }

    public final void setConsentItemExpandListener(Function1<? super Boolean, Unit> onClickedExpand) {
        j.g(onClickedExpand, "onClickedExpand");
        this.f5814k = onClickedExpand;
    }
}
