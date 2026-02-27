package butterknife.internal;

import I8.f;
import android.view.View;
import com.dynatrace.android.callback.Callback;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DebouncingOnClickListener implements View.OnClickListener {
    private static final Runnable ENABLE_AGAIN = new f(3);
    static boolean enabled = true;

    public abstract void doClick(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.onClick_enter(view);
        try {
            if (enabled) {
                enabled = false;
                view.post(ENABLE_AGAIN);
                doClick(view);
            }
            Callback.onClick_exit();
        } catch (Throwable th2) {
            Callback.onClick_exit();
            throw th2;
        }
    }
}
