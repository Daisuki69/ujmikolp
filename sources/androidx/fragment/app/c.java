package androidx.fragment.app;

import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f7851b;
    public final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect c;

    public /* synthetic */ c(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController.TransitionEffect transitionEffect, int i) {
        this.f7850a = i;
        this.f7851b = operation;
        this.c = transitionEffect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7850a) {
            case 0:
                DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$5(this.f7851b, this.c);
                break;
            default:
                DefaultSpecialEffectsController.TransitionEffect.onCommit$lambda$11$lambda$10(this.f7851b, this.c);
                break;
        }
    }
}
