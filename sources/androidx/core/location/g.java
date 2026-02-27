package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f7775b;
    public final /* synthetic */ Location c;

    public /* synthetic */ g(Consumer consumer, Location location, int i) {
        this.f7774a = i;
        this.f7775b = consumer;
        this.c = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7774a) {
            case 0:
                this.f7775b.accept(this.c);
                break;
            default:
                this.f7775b.accept(this.c);
                break;
        }
    }
}
