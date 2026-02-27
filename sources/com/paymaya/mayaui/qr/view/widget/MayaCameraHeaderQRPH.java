package com.paymaya.mayaui.qr.view.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.widget.TextViewWithImagesKt;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaCameraHeaderQRPH extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextViewWithImagesKt f13651d;
    public final ImageView e;
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f13652g;
    public final ImageView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaCameraHeaderQRPH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_scan_qr_header_qrph_banks, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.image_view_supported_qrph_four;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_supported_qrph_four);
        if (imageView != null) {
            i = R.id.image_view_supported_qrph_one;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_supported_qrph_one);
            if (imageView2 != null) {
                i = R.id.image_view_supported_qrph_three;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_supported_qrph_three);
                if (imageView3 != null) {
                    i = R.id.image_view_supported_qrph_two;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_supported_qrph_two);
                    if (imageView4 != null) {
                        i = R.id.text_view_header_scan_qrph_code;
                        TextViewWithImagesKt textViewWithImagesKt = (TextViewWithImagesKt) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header_scan_qrph_code);
                        if (textViewWithImagesKt != null) {
                            i = R.id.view_supported_qrph_bank_background;
                            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.view_supported_qrph_bank_background)) != null) {
                                this.f13651d = textViewWithImagesKt;
                                this.e = imageView2;
                                this.f = imageView4;
                                this.f13652g = imageView3;
                                this.h = imageView;
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public final void b(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.maya_margin_large);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.maya_margin_normal);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.maya_margin_3x_small);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.maya_qr_supported_qrph_banks_width);
        int dimensionPixelSize5 = getResources().getDimensionPixelSize(R.dimen.maya_qr_supported_qrph_banks_height);
        int i4 = (dimensionPixelSize3 * 6) + (dimensionPixelSize4 * 4) + (dimensionPixelSize2 * 2) + (dimensionPixelSize * 2);
        float f = i < i4 ? i / i4 : 1.0f;
        int i6 = (int) (dimensionPixelSize4 * f);
        int i10 = (int) (dimensionPixelSize5 * f);
        ImageView imageView = this.e;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = i10;
        layoutParams.width = i6;
        imageView.setLayoutParams(layoutParams);
        ImageView imageView2 = this.f;
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        layoutParams2.height = i10;
        layoutParams2.width = i6;
        imageView2.setLayoutParams(layoutParams2);
        ImageView imageView3 = this.f13652g;
        ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
        layoutParams3.height = i10;
        layoutParams3.width = i6;
        imageView3.setLayoutParams(layoutParams3);
        ImageView imageView4 = this.h;
        ViewGroup.LayoutParams layoutParams4 = imageView4.getLayoutParams();
        layoutParams4.height = i10;
        layoutParams4.width = i6;
        imageView4.setLayoutParams(layoutParams4);
    }

    public final TextViewWithImagesKt getMTextViewHeader() {
        return this.f13651d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }
}
