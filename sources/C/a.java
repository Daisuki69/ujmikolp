package C;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FastOutSlowInInterpolator f649a;

    static {
        new LinearInterpolator();
        f649a = new FastOutSlowInInterpolator();
        new DecelerateInterpolator();
    }
}
