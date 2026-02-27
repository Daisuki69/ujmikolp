package com.paymaya.common.utility;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.paymaya.R;
import java.math.BigDecimal;

/* JADX INFO: renamed from: com.paymaya.common.utility.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1228q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DecelerateInterpolator f11227a = new DecelerateInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AccelerateInterpolator f11228b = new AccelerateInterpolator();

    public static void a(View view) {
        float f = view.getResources().getDisplayMetrics().density * 20.0f;
        view.setAlpha(0.0f);
        view.setTranslationY(f);
        view.setVisibility(0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        DecelerateInterpolator decelerateInterpolator = f11227a;
        objectAnimatorOfFloat.setInterpolator(decelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", 0.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        objectAnimatorOfFloat2.setInterpolator(decelerateInterpolator);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new C1226o());
        animatorSet.setStartDelay(450L);
        animatorSet.start();
    }

    public static void b(ProgressBar progressBar, int i) {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(progressBar, "progress", progressBar.getProgress(), i);
        objectAnimatorOfInt.setDuration(600);
        objectAnimatorOfInt.setInterpolator(f11227a);
        objectAnimatorOfInt.start();
    }

    public static void c(CardView cardView, ConstraintLayout constraintLayout, InterfaceC1227p interfaceC1227p) {
        if (BigDecimal.valueOf(cardView.getMeasuredHeight()).compareTo(BigDecimal.ZERO) == 0) {
            cardView.measure(View.MeasureSpec.makeMeasureSpec(constraintLayout.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(constraintLayout.getHeight(), Integer.MIN_VALUE));
        }
        float f = -cardView.getMeasuredHeight();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cardView, "translationY", f);
        objectAnimatorOfFloat.setRepeatCount(0);
        objectAnimatorOfFloat.setDuration(0L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(cardView, "translationY", 0.0f);
        objectAnimatorOfFloat2.setInterpolator(f11228b);
        objectAnimatorOfFloat2.setRepeatCount(0);
        objectAnimatorOfFloat2.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(cardView, "translationY", 0.0f);
        objectAnimatorOfFloat3.setRepeatCount(0);
        objectAnimatorOfFloat3.setDuration(10000L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(cardView, "translationY", f);
        objectAnimatorOfFloat4.setInterpolator(f11227a);
        objectAnimatorOfFloat4.setRepeatCount(0);
        objectAnimatorOfFloat4.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.addListener(new C1224m(cardView, interfaceC1227p));
        animatorSet.start();
    }

    public static void d(double d10, ProgressBar progressBar, TextView textView) {
        if (d10 <= 20.0d) {
            e(progressBar, textView, R.color.begonia_pink);
        } else if (d10 < 50.0d) {
            e(progressBar, textView, R.color.coral_orange);
        } else {
            e(progressBar, textView, R.color.grown_green);
        }
    }

    public static void e(ProgressBar progressBar, TextView textView, int i) {
        progressBar.setProgressTintList(progressBar.getContext().getColorStateList(i));
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), i));
    }
}
