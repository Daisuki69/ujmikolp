package G5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.paymaya.common.widget.ItemSlideLayoutView;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ItemSlideLayoutView f1773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f1774b;

    public z(ItemSlideLayoutView itemSlideLayoutView, float f) {
        this.f1773a = itemSlideLayoutView;
        this.f1774b = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.j.g(animation, "animation");
        super.onAnimationEnd(animation);
        ItemSlideLayoutView itemSlideLayoutView = this.f1773a;
        itemSlideLayoutView.j = false;
        itemSlideLayoutView.setPrimaryViewTranslationX(this.f1774b);
        itemSlideLayoutView.f11275k = 0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        kotlin.jvm.internal.j.g(animation, "animation");
        super.onAnimationStart(animation);
        ItemSlideLayoutView itemSlideLayoutView = this.f1773a;
        itemSlideLayoutView.j = true;
        itemSlideLayoutView.f11275k = 3;
    }
}
