package com.paymaya.mayaui.common.view.widget;

import G5.ViewOnFocusChangeListenerC0253c;
import W4.c;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import bg.AbstractC0983W;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaProfileInputLayout extends MayaInputLayout {
    public static final /* synthetic */ int m0 = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Function2 f12076b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Function0 f12077c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Function0 f12078d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final boolean f12079e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final boolean f12080f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final boolean f12081g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final boolean f12082h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final boolean f12083i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final boolean f12084j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final String f12085k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Pair f12086l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaProfileInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.g(context, "context");
        this.f12082h0 = true;
        this.f12085k0 = "";
        this.f12086l0 = new Pair(Boolean.TRUE, "");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f6297l, 0, 0);
        this.f12079e0 = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.f12080f0 = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f12081g0 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        this.f12083i0 = typedArrayObtainStyledAttributes.getBoolean(38, false);
        String string = typedArrayObtainStyledAttributes.getString(39);
        this.f12085k0 = string != null ? string : "";
        this.f12084j0 = typedArrayObtainStyledAttributes.getBoolean(31, false);
        AbstractC0983W.y(this, this.f12079e0);
        setVisibilityOfPrefix(this.f12080f0);
        setVisibilityOfPrimaryIcon(this.f12081g0);
        setVisibilityOfSubLabel(this.f12083i0);
        setSubLabelText(this.f12085k0);
        setCloseIconVisibility(this.f12084j0);
        final int i = 0;
        getFormContainerLayout().post(new Runnable(this) { // from class: a7.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaProfileInputLayout f7050b;

            {
                this.f7050b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MayaProfileInputLayout mayaProfileInputLayout = this.f7050b;
                switch (i) {
                    case 0:
                        int i4 = MayaProfileInputLayout.m0;
                        ConstraintLayout formContainerLayout = mayaProfileInputLayout.getFormContainerLayout();
                        formContainerLayout.setMinHeight(0);
                        formContainerLayout.setPadding(0, 0, 0, 0);
                        break;
                    default:
                        int i6 = MayaProfileInputLayout.m0;
                        ImageView primaryIconImageView = mayaProfileInputLayout.getPrimaryIconImageView();
                        primaryIconImageView.setPadding((int) (8 * primaryIconImageView.getContext().getResources().getDisplayMetrics().density), 0, 0, 0);
                        break;
                }
            }
        });
        final int i4 = 1;
        getPrimaryIconImageView().post(new Runnable(this) { // from class: a7.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaProfileInputLayout f7050b;

            {
                this.f7050b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MayaProfileInputLayout mayaProfileInputLayout = this.f7050b;
                switch (i4) {
                    case 0:
                        int i42 = MayaProfileInputLayout.m0;
                        ConstraintLayout formContainerLayout = mayaProfileInputLayout.getFormContainerLayout();
                        formContainerLayout.setMinHeight(0);
                        formContainerLayout.setPadding(0, 0, 0, 0);
                        break;
                    default:
                        int i6 = MayaProfileInputLayout.m0;
                        ImageView primaryIconImageView = mayaProfileInputLayout.getPrimaryIconImageView();
                        primaryIconImageView.setPadding((int) (8 * primaryIconImageView.getContext().getResources().getDisplayMetrics().density), 0, 0, 0);
                        break;
                }
            }
        });
        ViewGroup.LayoutParams layoutParams = getHelperErrorSpielTextView().getLayoutParams();
        j.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = 0;
        layoutParams2.goneLeftMargin = 0;
        getHelperErrorSpielTextView().setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = getLabelTextView().getLayoutParams();
        j.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams.setMargins(0, 0, 0, (int) (4 * getContext().getResources().getDisplayMetrics().density));
        getLabelTextView().setLayoutParams(marginLayoutParams);
        AppCompatEditText inputEditText = getInputEditText();
        Context context2 = getContext();
        j.f(context2, "getContext(...)");
        AbstractC0983W.B(inputEditText, context2, R.style.CerebriBookH5);
        AppCompatEditText floatingPrefix = getFloatingPrefix();
        Context context3 = getContext();
        j.f(context3, "getContext(...)");
        AbstractC0983W.B(floatingPrefix, context3, R.style.CerebriBookH5);
        TextView labelTextView = getLabelTextView();
        Context context4 = getContext();
        j.f(context4, "getContext(...)");
        AbstractC0983W.B(labelTextView, context4, R.style.JekoBoldLink);
        TextView helperErrorSpielTextView = getHelperErrorSpielTextView();
        Context context5 = getContext();
        j.f(context5, "getContext(...)");
        AbstractC0983W.B(helperErrorSpielTextView, context5, R.style.CerebriBookSmallText);
        TextView subLabelTextView = getSubLabelTextView();
        Context context6 = getContext();
        j.f(context6, "getContext(...)");
        AbstractC0983W.B(subLabelTextView, context6, R.style.CerebriBookLongRead_Tertiary);
        u();
        getInputEditText().setOnFocusChangeListener(new ViewOnFocusChangeListenerC0253c(this, 3));
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(getFormContainerLayout());
        constraintSet.connect(getPrimaryIconImageView().getId(), 3, getInputEditText().getId(), 3, 0);
        constraintSet.connect(getPrimaryIconImageView().getId(), 4, getInputEditText().getId(), 4, 0);
        constraintSet.applyTo(getFormContainerLayout());
        final int i6 = 0;
        getPrimaryIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: a7.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaProfileInputLayout f7052b;

            {
                this.f7052b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MayaProfileInputLayout mayaProfileInputLayout = this.f7052b;
                switch (i6) {
                    case 0:
                        int i10 = MayaProfileInputLayout.m0;
                        Callback.onClick_enter(view);
                        try {
                            Function0 function0 = mayaProfileInputLayout.f12077c0;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            return;
                        } finally {
                        }
                    default:
                        int i11 = MayaProfileInputLayout.m0;
                        Callback.onClick_enter(view);
                        try {
                            Function0 function02 = mayaProfileInputLayout.f12078d0;
                            if (function02 != null) {
                                function02.invoke();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i10 = 1;
        getCloseIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: a7.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaProfileInputLayout f7052b;

            {
                this.f7052b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MayaProfileInputLayout mayaProfileInputLayout = this.f7052b;
                switch (i10) {
                    case 0:
                        int i102 = MayaProfileInputLayout.m0;
                        Callback.onClick_enter(view);
                        try {
                            Function0 function0 = mayaProfileInputLayout.f12077c0;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            return;
                        } finally {
                        }
                    default:
                        int i11 = MayaProfileInputLayout.m0;
                        Callback.onClick_enter(view);
                        try {
                            Function0 function02 = mayaProfileInputLayout.f12078d0;
                            if (function02 != null) {
                                function02.invoke();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    private final void setCloseIconVisibility(boolean z4) {
        if (z4) {
            this.f12053Q = true;
            l();
        } else {
            this.f12053Q = false;
            l();
        }
    }

    private final void setLabelTextColor(@ColorInt int i) {
        getLabelTextView().setTextColor(i);
    }

    private final void setSubLabelText(String str) {
        getSubLabelTextView().setText(str);
    }

    private final void setSubLabelTextColor(@ColorInt int i) {
        getSubLabelTextView().setTextColor(i);
    }

    private final void setVisibilityOfPrefix(boolean z4) {
        if (z4) {
            getFloatingPrefix().setVisibility(0);
        } else {
            getFloatingPrefix().setVisibility(8);
        }
    }

    private final void setVisibilityOfPrimaryIcon(boolean z4) {
        if (z4) {
            r();
        } else {
            h();
        }
    }

    private final void setVisibilityOfSubLabel(boolean z4) {
        getSubLabelTextView().setVisibility(z4 ? 0 : 8);
    }

    public final Pair<Boolean, String> getLastValidationResult() {
        return this.f12086l0;
    }

    @Override // com.paymaya.mayaui.common.view.widget.MayaInputLayout
    public final void l() {
        super.l();
        u();
        TextView labelTextView = getLabelTextView();
        Context context = getContext();
        j.f(context, "getContext(...)");
        AbstractC0983W.B(labelTextView, context, R.style.JekoBoldLink);
        TextView subLabelTextView = getSubLabelTextView();
        Context context2 = getContext();
        j.f(context2, "getContext(...)");
        AbstractC0983W.B(subLabelTextView, context2, R.style.CerebriBookLongRead_Tertiary);
        if (getShouldShowError()) {
            TextView helperErrorSpielTextView = getHelperErrorSpielTextView();
            CharSequence text = getHelperErrorSpielTextView().getText();
            String string = text != null ? text.toString() : null;
            helperErrorSpielTextView.setVisibility(string == null || string.length() == 0 ? 8 : 0);
            getHelperErrorIconImageView().setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paymaya.mayaui.common.view.widget.MayaInputLayout, androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setLastValidationResult(Pair<Boolean, String> pair) {
        j.g(pair, "<set-?>");
        this.f12086l0 = pair;
    }

    public final void setOnCloseIconClickListener(Function0<Unit> listener) {
        j.g(listener, "listener");
        this.f12078d0 = listener;
    }

    public final void setOnMayaProfileInputFocusChangeListener(Function2<? super View, ? super Boolean, Unit> listener) {
        j.g(listener, "listener");
        this.f12076b0 = listener;
    }

    public final void setOnPrimaryIconClickListener(Function0<Unit> listener) {
        j.g(listener, "listener");
        this.f12077c0 = listener;
    }

    public final void u() {
        setLabelTextColor(ContextCompat.getColor(getContext(), R.color.maya_shades_of_grey_5));
        int color = ContextCompat.getColor(getContext(), R.color.maya_primary_black);
        int color2 = ContextCompat.getColor(getContext(), R.color.maya_shades_of_grey_4);
        getInputEditText().setTextColor(color);
        getFloatingPrefix().setTextColor(color);
        getInputEditText().setHintTextColor(color2);
        setSubLabelTextColor(ContextCompat.getColor(getContext(), R.color.maya_shades_of_grey_6));
        getFormContainerLayout().setBackground(null);
    }
}
