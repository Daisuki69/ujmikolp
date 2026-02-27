package com.paymaya.mayaui.common.view.widget;

import N5.j1;
import W4.c;
import Y6.o;
import a7.C0653n;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaExpandableContainerView extends ConstraintLayout {
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j1 f12045d;
    public final FrameLayout e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f12046g;
    public final ImageView h;
    public final C0653n i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaExpandableContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.j);
        String string = typedArrayObtainStyledAttributes.getString(14);
        string = string == null ? "" : string;
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(15, 0);
        String string2 = typedArrayObtainStyledAttributes.getString(21);
        this.i = new C0653n(string, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5, resourceId, string2 == null ? "" : string2, typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(19, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(18, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(20, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(17, 0), typedArrayObtainStyledAttributes.getResourceId(22, 0), ContextCompat.getDrawable(getContext(), typedArrayObtainStyledAttributes.getResourceId(0, 0)), ContextCompat.getDrawable(getContext(), typedArrayObtainStyledAttributes.getResourceId(2, 0)), typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0), typedArrayObtainStyledAttributes.getResourceId(1, 0));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        View viewInflate = layoutInflaterFrom.inflate(R.layout.maya_view_expandable_container, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.center_guideline;
        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.center_guideline)) != null) {
            i = R.id.frame_layout_content;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_content);
            if (frameLayout != null) {
                i = R.id.image_view_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_icon);
                if (imageView != null) {
                    i = R.id.text_view_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title);
                    if (textView != null) {
                        i = R.id.text_view_title_two;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_two);
                        if (textView2 != null) {
                            this.f12045d = new j1((ConstraintLayout) viewInflate, frameLayout, imageView, textView, textView2);
                            FrameLayout frameLayout2 = getBinding().f4128b;
                            this.e = frameLayout2;
                            C0653n c0653n = this.i;
                            if (c0653n == null) {
                                j.n("mExpandableContainerViewAttrs");
                                throw null;
                            }
                            frameLayout2.addView(layoutInflaterFrom.inflate(c0653n.f7046v, (ViewGroup) frameLayout2, false));
                            TextView textView3 = getBinding().f4129d;
                            this.f = textView3;
                            C0653n c0653n2 = this.i;
                            if (c0653n2 == null) {
                                j.n("mExpandableContainerViewAttrs");
                                throw null;
                            }
                            textView3.setText(c0653n2.f7032a);
                            TextView textView4 = this.f;
                            if (textView4 == null) {
                                j.n("mTextViewTitle");
                                throw null;
                            }
                            int i4 = c0653n2.f7033b;
                            textView4.setPadding(i4, i4, i4, i4);
                            if (i4 == 0) {
                                TextView textView5 = this.f;
                                if (textView5 == null) {
                                    j.n("mTextViewTitle");
                                    throw null;
                                }
                                textView5.setPadding(c0653n2.c, c0653n2.e, c0653n2.f7034d, c0653n2.f);
                            }
                            TextView textView6 = this.f;
                            if (textView6 == null) {
                                j.n("mTextViewTitle");
                                throw null;
                            }
                            textView6.setTextAppearance(c0653n2.f7035g);
                            TextView textView7 = getBinding().e;
                            this.f12046g = textView7;
                            C0653n c0653n3 = this.i;
                            if (c0653n3 == null) {
                                j.n("mExpandableContainerViewAttrs");
                                throw null;
                            }
                            textView7.setText(c0653n3.h);
                            TextView textView8 = this.f12046g;
                            if (textView8 == null) {
                                j.n("mTextViewTitleTwo");
                                throw null;
                            }
                            int i6 = c0653n3.i;
                            textView8.setPadding(i6, i6, i6, i6);
                            if (i6 == 0) {
                                TextView textView9 = this.f12046g;
                                if (textView9 == null) {
                                    j.n("mTextViewTitleTwo");
                                    throw null;
                                }
                                textView9.setPadding(c0653n3.j, c0653n3.f7037l, c0653n3.f7036k, c0653n3.m);
                            }
                            TextView textView10 = this.f12046g;
                            if (textView10 == null) {
                                j.n("mTextViewTitleTwo");
                                throw null;
                            }
                            textView10.setTextAppearance(c0653n3.f7038n);
                            ImageView imageView2 = getBinding().c;
                            this.h = imageView2;
                            C0653n c0653n4 = this.i;
                            if (c0653n4 == null) {
                                j.n("mExpandableContainerViewAttrs");
                                throw null;
                            }
                            imageView2.setImageDrawable(c0653n4.f7040p);
                            ImageView imageView3 = this.h;
                            if (imageView3 == null) {
                                j.n("mImageViewIcon");
                                throw null;
                            }
                            int i10 = c0653n4.f7041q;
                            imageView3.setPadding(i10, i10, i10, i10);
                            if (i10 == 0) {
                                ImageView imageView4 = this.h;
                                if (imageView4 == null) {
                                    j.n("mImageViewIcon");
                                    throw null;
                                }
                                imageView4.setPadding(c0653n4.f7042r, c0653n4.f7044t, c0653n4.f7043s, c0653n4.f7045u);
                            }
                            ImageView imageView5 = this.h;
                            if (imageView5 == null) {
                                j.n("mImageViewIcon");
                                throw null;
                            }
                            imageView5.setOnClickListener(new o(this, 5));
                            typedArrayObtainStyledAttributes.recycle();
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    private final j1 getBinding() {
        j1 j1Var = this.f12045d;
        j.d(j1Var);
        return j1Var;
    }

    public final void b() {
        TransitionManager.beginDelayedTransition(getBinding().f4127a, new AutoTransition());
        FrameLayout frameLayout = this.e;
        if (frameLayout == null) {
            j.n("mFrameLayoutContent");
            throw null;
        }
        frameLayout.setVisibility(8);
        ImageView imageView = this.h;
        if (imageView == null) {
            j.n("mImageViewIcon");
            throw null;
        }
        C0653n c0653n = this.i;
        if (c0653n != null) {
            imageView.setImageDrawable(c0653n.f7039o);
        } else {
            j.n("mExpandableContainerViewAttrs");
            throw null;
        }
    }

    public final void c() {
        TransitionManager.beginDelayedTransition(getBinding().f4127a, new AutoTransition());
        FrameLayout frameLayout = this.e;
        if (frameLayout == null) {
            j.n("mFrameLayoutContent");
            throw null;
        }
        frameLayout.setVisibility(0);
        ImageView imageView = this.h;
        if (imageView == null) {
            j.n("mImageViewIcon");
            throw null;
        }
        C0653n c0653n = this.i;
        if (c0653n != null) {
            imageView.setImageDrawable(c0653n.f7040p);
        } else {
            j.n("mExpandableContainerViewAttrs");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }
}
