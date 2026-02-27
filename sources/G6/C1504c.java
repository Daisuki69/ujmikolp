package g6;

import N5.C0491z;
import Y.e;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.utility.AbstractC1228q;
import com.paymaya.common.utility.C1222k;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: g6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1504c extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f16795b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f16796d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProgressBar f16797g;
    public final e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1504c(C0491z c0491z, Context mContext) {
        super((CardView) c0491z.f4303b);
        j.g(mContext, "mContext");
        this.f16794a = mContext;
        this.f16795b = (TextView) c0491z.f;
        this.c = (TextView) c0491z.f4304d;
        this.f16796d = (TextView) c0491z.e;
        this.e = (TextView) c0491z.h;
        this.f = (TextView) c0491z.f4305g;
        this.f16797g = (ProgressBar) c0491z.c;
        this.h = new e(this);
    }

    public final void D(double d10, boolean z4) {
        DecelerateInterpolator decelerateInterpolator = AbstractC1228q.f11227a;
        int i = (int) d10;
        final ProgressBar progressBar = this.f16797g;
        if (!z4) {
            progressBar.setProgress(i);
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(progressBar, "progress", progressBar.getProgress(), i);
        objectAnimatorOfInt.setDuration(600);
        objectAnimatorOfInt.setInterpolator(AbstractC1228q.f11227a);
        final TextView textView = this.f16796d;
        objectAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.paymaya.common.utility.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AbstractC1228q.d(((Integer) valueAnimator.getAnimatedValue()).intValue(), progressBar, textView);
            }
        });
        objectAnimatorOfInt.addListener(new C1222k(d10, progressBar, textView));
        objectAnimatorOfInt.start();
    }
}
