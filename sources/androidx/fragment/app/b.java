package androidx.fragment.app;

import androidx.fragment.app.DefaultSpecialEffectsController;
import java.util.ArrayList;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7849b;

    public /* synthetic */ b(Object obj, int i) {
        this.f7848a = i;
        this.f7849b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7848a) {
            case 0:
                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$14((ArrayList) this.f7849b);
                break;
            case 1:
                DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$4((y) this.f7849b);
                break;
            default:
                ((Fragment) this.f7849b).lambda$performCreateView$0();
                break;
        }
    }
}
