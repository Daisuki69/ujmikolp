package Z;

import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CTInboxMessage f6829b;
    public final /* synthetic */ k c;

    public j(k kVar, int i, CTInboxMessage cTInboxMessage) {
        this.c = kVar;
        this.f6828a = i;
        this.f6829b = cTInboxMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentActivity activity;
        CTInboxListViewFragment cTInboxListViewFragment = (CTInboxListViewFragment) this.c.m.get();
        if (cTInboxListViewFragment == null || (activity = cTInboxListViewFragment.getActivity()) == null) {
            return;
        }
        activity.runOnUiThread(new S1.v(22, this, cTInboxListViewFragment, false));
    }
}
