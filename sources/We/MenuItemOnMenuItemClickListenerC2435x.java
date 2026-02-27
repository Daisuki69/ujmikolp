package we;

import android.view.MenuItem;
import com.dynatrace.android.callback.Callback;

/* JADX INFO: renamed from: we.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class MenuItemOnMenuItemClickListenerC2435x implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20779a;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem it) {
        switch (this.f20779a) {
            case 0:
                Callback.onMenuItemClick_enter(it);
                try {
                    kotlin.jvm.internal.j.g(it, "it");
                    return true;
                } finally {
                }
            default:
                Callback.onMenuItemClick_enter(it);
                try {
                    kotlin.jvm.internal.j.g(it, "it");
                    return true;
                } finally {
                }
        }
    }
}
