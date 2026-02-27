package z2;

import android.content.Context;
import androidx.core.os.UserManagerCompat;
import b2.j;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements e, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f21358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f21359b;
    public final B2.b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f21360d;
    public final Executor e;

    public c(Context context, String str, Set set, B2.b bVar, Executor executor) {
        this.f21358a = new j(new U1.c(context, str));
        this.f21360d = set;
        this.e = executor;
        this.c = bVar;
        this.f21359b = context;
    }

    public final synchronized int a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        h hVar = (h) this.f21358a.get();
        if (!hVar.i(jCurrentTimeMillis)) {
            return 1;
        }
        hVar.g();
        return 3;
    }

    public final Task b() {
        if (!UserManagerCompat.isUserUnlocked(this.f21359b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.e, new b(this, 0));
    }

    public final void c() {
        if (this.f21360d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!UserManagerCompat.isUserUnlocked(this.f21359b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.e, new b(this, 1));
        }
    }
}
