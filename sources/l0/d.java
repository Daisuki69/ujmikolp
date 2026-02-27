package l0;

import S1.v;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f18221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18222b;
    public final Object c;

    public d(Executor executor, Object obj, int i) {
        this.f18222b = i;
        this.f18221a = executor;
        this.c = obj;
    }

    public final void a(Object obj) {
        switch (this.f18222b) {
            case 0:
                this.f18221a.execute(new v(27, this, obj, false));
                break;
            default:
                this.f18221a.execute(new io.flutter.plugins.firebase.core.a(7, this, obj));
                break;
        }
    }
}
