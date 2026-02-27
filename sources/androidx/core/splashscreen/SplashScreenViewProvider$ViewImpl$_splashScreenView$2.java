package androidx.core.splashscreen;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.splashscreen.SplashScreenViewProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes.dex */
public final class SplashScreenViewProvider$ViewImpl$_splashScreenView$2 extends k implements Function0<ViewGroup> {
    final /* synthetic */ SplashScreenViewProvider.ViewImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashScreenViewProvider$ViewImpl$_splashScreenView$2(SplashScreenViewProvider.ViewImpl viewImpl) {
        super(0);
        this.this$0 = viewImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewGroup invoke() {
        View viewInflate = View.inflate(this.this$0.getActivity(), R.layout.splash_screen_view, null);
        if (viewInflate != null) {
            return (ViewGroup) viewInflate;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
