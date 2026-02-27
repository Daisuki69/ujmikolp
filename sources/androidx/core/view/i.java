package androidx.core.view;

import android.view.View;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7812b;

    public /* synthetic */ i(Object obj, int i) {
        this.f7811a = i;
        this.f7812b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7811a) {
            case 0:
                SoftwareKeyboardControllerCompat.Impl20.lambda$show$0((View) this.f7812b);
                break;
            default:
                ((Function0) this.f7812b).invoke();
                break;
        }
    }
}
