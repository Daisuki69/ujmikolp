package Z;

import android.view.View;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.dynatrace.android.callback.Callback;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6812b;

    public e(f fVar, int i) {
        this.f6812b = fVar;
        this.f6811a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f fVar = this.f6812b;
        Callback.onClick_enter(view);
        try {
            CTInboxListViewFragment cTInboxListViewFragment = (CTInboxListViewFragment) fVar.e.get();
            if (cTInboxListViewFragment != null) {
                cTInboxListViewFragment.o1(fVar.f, this.f6811a);
            }
            Callback.onClick_exit();
        } catch (Throwable th2) {
            Callback.onClick_exit();
            throw th2;
        }
    }
}
