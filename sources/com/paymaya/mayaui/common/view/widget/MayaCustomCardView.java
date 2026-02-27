package com.paymaya.mayaui.common.view.widget;

import N5.C0491z;
import W4.c;
import Y6.o;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaCustomCardView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f12038b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0491z f12039a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaCustomCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_view_custom_card_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.bottom_right_image_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.bottom_right_image_view);
        if (imageView != null) {
            CardView cardView = (CardView) viewInflate;
            i = R.id.custom_card_view_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.custom_card_view_container);
            if (constraintLayout != null) {
                i = R.id.label_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.label_text_view);
                if (textView != null) {
                    i = R.id.primary_text_text_view;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.primary_text_text_view);
                    if (textView2 != null) {
                        i = R.id.secondary_text_text_view;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.secondary_text_text_view);
                        if (textView3 != null) {
                            this.f12039a = new C0491z(cardView, imageView, cardView, constraintLayout, textView, textView2, textView3);
                            if (attributeSet != null) {
                                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.h);
                                j.f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                                String string = typedArrayObtainStyledAttributes.getString(4);
                                String string2 = typedArrayObtainStyledAttributes.getString(5);
                                String string3 = typedArrayObtainStyledAttributes.getString(3);
                                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.attr.mayaContentViewBackgroundColor);
                                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, R.attr.mayaContentViewBackgroundColorSecondary);
                                setPrimaryText(string);
                                setSecondaryText(string2);
                                setLabelText(string3);
                                setBottomRightImage(drawable);
                                setBackgroundPrimaryColor(resourceId);
                                setBackgroundSecondaryColor(resourceId2);
                                typedArrayObtainStyledAttributes.recycle();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    private final void setBackgroundPrimaryColor(@ColorRes int i) {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f12039a.f4303b;
        constraintLayout.setBackgroundColor(ContextCompat.getColor(constraintLayout.getContext(), i));
    }

    private final void setBackgroundSecondaryColor(@ColorRes int i) {
        TextView textView = (TextView) this.f12039a.f4305g;
        textView.setBackgroundColor(ContextCompat.getColor(textView.getContext(), i));
    }

    private final void setBottomRightImage(Drawable drawable) {
        ImageView imageView = (ImageView) this.f12039a.e;
        j.d(imageView);
        imageView.setVisibility(drawable != null ? 0 : 8);
        imageView.setImageDrawable(drawable);
    }

    private final void setLabelText(String str) {
        TextView textView = (TextView) this.f12039a.f4304d;
        j.d(textView);
        textView.setVisibility(str == null || str.length() == 0 ? 8 : 0);
        textView.setText(str);
    }

    private final void setPrimaryText(String str) {
        TextView textView = (TextView) this.f12039a.h;
        j.d(textView);
        textView.setVisibility(str == null || str.length() == 0 ? 8 : 0);
        textView.setText(str);
    }

    private final void setSecondaryText(String str) {
        TextView textView = (TextView) this.f12039a.f4305g;
        j.d(textView);
        textView.setVisibility(str == null || str.length() == 0 ? 8 : 0);
        textView.setText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setOnClickAction(Function0<Unit> function0) {
        ((CardView) this.f12039a.f).setOnClickListener(new o(function0, 4));
    }
}
