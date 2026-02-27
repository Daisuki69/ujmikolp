package com.paymaya.mayaui.common.view.widget;

import N5.r1;
import a.AbstractC0617a;
import a7.RunnableC0661v;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaStaticToolTipView;
import d4.AbstractC1331a;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaStaticToolTipView extends ConstraintLayout {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12091d;
    public int e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12092g;
    public final r1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaStaticToolTipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        this.f12091d = "";
        this.e = -1;
        this.f = "";
        this.f12092g = 2;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_view_tooltip, (ViewGroup) this, false);
        addView(viewInflate);
        int i4 = R.id.tooltip_arrow_down_image_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.tooltip_arrow_down_image_view);
        if (imageView != null) {
            i4 = R.id.tooltip_arrow_up_image_view;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.tooltip_arrow_up_image_view);
            if (imageView2 != null) {
                i4 = R.id.tooltip_bubble_container;
                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.tooltip_bubble_container)) != null) {
                    i4 = R.id.tooltip_text_view;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tooltip_text_view);
                    if (textView != null) {
                        this.h = new r1((ViewGroup) viewInflate, (View) imageView, (Object) imageView2, (Object) textView, 4);
                        setElevation(10.0f);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    public final void b(View view, int i4, String message) {
        j.g(message, "message");
        AbstractC1331a.r(i4, "position");
        this.f12091d = message;
        this.e = view.getId();
        this.f = view.getTag().toString();
        this.f12092g = i4;
        r1 r1Var = this.h;
        ((TextView) r1Var.f4198b).setText(message);
        ((ImageView) r1Var.e).setVisibility(i4 == 2 ? 0 : 8);
        ((ImageView) r1Var.f4199d).setVisibility(i4 != 1 ? 8 : 0);
        post(new RunnableC0661v(this, view, i4, 0));
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
        int i4;
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState((Parcelable) AbstractC0617a.D(bundle, "state_super_state", Parcelable.class));
        if (!bundle.getBoolean("state_tooltip_visible", false)) {
            setVisibility(8);
            return;
        }
        final String string = bundle.getString("state_tooltip_message", "");
        final int i6 = bundle.getInt("state_tooltip_anchor_id", -1);
        final String string2 = bundle.getString("state_tooltip_anchor_tag", "");
        String string3 = bundle.getString("state_tooltip_position", "BOTTOM");
        j.f(string3, "getString(...)");
        if (string3 == null) {
            throw new NullPointerException("Name is null");
        }
        if (string3.equals("TOP")) {
            i4 = 1;
        } else {
            if (!string3.equals("BOTTOM")) {
                throw new IllegalArgumentException("No enum constant com.paymaya.common.utility.Enum.TooltipPosition.".concat(string3));
            }
            i4 = 2;
        }
        final int i10 = i4;
        post(new Runnable() { // from class: a7.u
            @Override // java.lang.Runnable
            public final void run() {
                int i11 = MayaStaticToolTipView.i;
                MayaStaticToolTipView mayaStaticToolTipView = this;
                String str = string2;
                View viewFindViewWithTag = null;
                if (str == null || str.length() == 0) {
                    ViewParent parent = mayaStaticToolTipView.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewFindViewWithTag = viewGroup.findViewWithTag(Integer.valueOf(i6));
                    }
                } else {
                    ViewParent parent2 = mayaStaticToolTipView.getParent();
                    ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    if (viewGroup2 != null) {
                        viewFindViewWithTag = viewGroup2.findViewWithTag(str);
                    }
                }
                if (viewFindViewWithTag != null) {
                    String str2 = string;
                    kotlin.jvm.internal.j.d(str2);
                    mayaStaticToolTipView.b(viewFindViewWithTag, i10, str2);
                }
            }
        });
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        String str;
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_super_state", parcelableOnSaveInstanceState);
        bundle.putBoolean("state_tooltip_visible", getVisibility() == 0);
        bundle.putString("state_tooltip_message", this.f12091d);
        bundle.putInt("state_tooltip_anchor_id", this.e);
        bundle.putString("state_tooltip_anchor_tag", this.f);
        int i4 = this.f12092g;
        if (i4 == 1) {
            str = "TOP";
        } else {
            if (i4 != 2) {
                throw null;
            }
            str = "BOTTOM";
        }
        bundle.putString("state_tooltip_position", str);
        return bundle;
    }
}
