package com.dynatrace.agent.userinteraction.util;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class UserInteractionMaskingValidator {
    private static final Companion Companion = new Companion(null);
    private static final String DT_MASK_TAG = "data-dt-mask";
    private static final int MASK_FOR_BITS = 4080;
    private static final String SR_MASK_TAG = "data-dtrum-mask";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final boolean isSecuredTextInputLayout(View view) {
        if (!isTextInputLayout(view)) {
            return false;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        FrameLayout frameLayout = childAt instanceof FrameLayout ? (FrameLayout) childAt : null;
        if (frameLayout == null) {
            return false;
        }
        int childCount = frameLayout.getChildCount();
        boolean z4 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt2 = frameLayout.getChildAt(i);
            j.d(childAt2);
            z4 = isSecuredTextView(childAt2) || z4;
        }
        return z4;
    }

    private final boolean isSecuredTextView(View view) {
        if (!(view instanceof TextView)) {
            return false;
        }
        int inputType = ((TextView) view).getInputType() & MASK_FOR_BITS;
        return (inputType == 128 || inputType == 144) || (inputType == 16) || (inputType == 224);
    }

    private final boolean isTextInputLayout(View view) {
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        return view.getClass().getName().equals("com.google.android.material.textfield.TextInputLayout") && !(viewGroup != null && viewGroup.getChildCount() == 0);
    }

    public final boolean isMaskedByTag(View view) {
        j.g(view, "view");
        return j.b(view.getTag(), DT_MASK_TAG) || j.b(view.getTag(), SR_MASK_TAG);
    }

    public final boolean isViewMasked(View view) {
        j.g(view, "view");
        return isMaskedByTag(view) || isSecuredTextView(view) || isSecuredTextInputLayout(view);
    }
}
