package androidx.core.splashscreen;

import androidx.core.splashscreen.SplashScreen;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements SplashScreen.KeepOnScreenCondition {
    @Override // androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition
    public final boolean shouldKeepOnScreen() {
        return SplashScreen.Impl.m81splashScreenWaitPredicate$lambda0();
    }
}
