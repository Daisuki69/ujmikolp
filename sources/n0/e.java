package n0;

import Rg.j;
import android.content.IntentFilter;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.paymaya.ui.shopv3.view.widget.SliderActionView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18545a;

    public /* synthetic */ e(int i) {
        this.f18545a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18545a) {
            case 0:
                return ReviewManagerFactory.class;
            case 1:
                return null;
            case 2:
                return Unit.f18162a;
            case 3:
                IntentFilter intentFilter = new IntentFilter();
                for (u5.b bVar : u5.b.values()) {
                    intentFilter.addAction(bVar.f20271a);
                }
                return intentFilter;
            case 4:
                return Unit.f18162a;
            case 5:
                return Unit.f18162a;
            case 6:
                return new j();
            case 7:
                return Unit.f18162a;
            case 8:
                return Unit.f18162a;
            case 9:
                return Unit.f18162a;
            case 10:
                int i = SliderActionView.f14896e0;
                return new AccelerateDecelerateInterpolator();
            case 11:
                int i4 = SliderActionView.f14896e0;
                return new AccelerateInterpolator();
            case 12:
                int i6 = SliderActionView.f14896e0;
                return new DecelerateInterpolator();
            case 13:
                return new String[21];
            default:
                return new String[21];
        }
    }
}
