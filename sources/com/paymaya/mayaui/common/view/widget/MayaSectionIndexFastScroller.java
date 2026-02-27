package com.paymaya.mayaui.common.view.widget;

import M8.X1;
import W4.c;
import a7.InterfaceC0658s;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaSectionIndexFastScroller extends ConstraintLayout {
    public static final /* synthetic */ int m = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f12087d;
    public final TextView e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12088g;
    public final int h;
    public final int i;
    public InterfaceC0658s j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f12089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f12090l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaSectionIndexFastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.g(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.maya_view_section_index_fast_scroller, this);
        int i = R.id.linear_layout_index_list_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(this, R.id.linear_layout_index_list_container);
        if (linearLayout != null) {
            i = R.id.text_view_index_popup;
            TextView textView = (TextView) ViewBindings.findChildViewById(this, R.id.text_view_index_popup);
            if (textView != null) {
                this.f12087d = linearLayout;
                this.e = textView;
                this.f = R.style.JekoBoldSmallText_Quaternary;
                this.f12088g = R.style.JekoBoldSmallText_Accent;
                this.f12089k = new ArrayList();
                X1 x12 = new X1(this, 4);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f6300p, 0, 0);
                j.d(typedArrayObtainStyledAttributes);
                this.f = typedArrayObtainStyledAttributes.getResourceId(0, R.style.JekoBoldSmallText_Quaternary);
                this.f12088g = typedArrayObtainStyledAttributes.getResourceId(2, R.style.JekoBoldSmallText_Accent);
                this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, (int) (getResources().getDisplayMetrics().density * 4.0f));
                this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, (int) (4.0f * getResources().getDisplayMetrics().density));
                textView.setBackground(AppCompatResources.getDrawable(getContext(), typedArrayObtainStyledAttributes.getResourceId(4, R.drawable.maya_bg_index_scroller_popup_light)));
                typedArrayObtainStyledAttributes.getResourceId(9, R.style.JekoBoldH5_Primary);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                j.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.maya_section_index_scroller_popup_width));
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.maya_section_index_scroller_popup_height));
                layoutParams2.setMargins(typedArrayObtainStyledAttributes.getDimensionPixelSize(7, typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.maya_section_index_scroller_popup_index_container_offset)), ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                textView.setLayoutParams(layoutParams2);
                textView.setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0), 0, typedArrayObtainStyledAttributes.getDimensionPixelSize(8, typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.maya_section_index_scroller_popup_right_padding)), 0);
                typedArrayObtainStyledAttributes.recycle();
                setOnTouchListener(x12);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setSectionIndexFastScrollListener(InterfaceC0658s listener) {
        j.g(listener, "listener");
        this.j = listener;
    }
}
