package C2;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f683a;

    public h(TaskCompletionSource taskCompletionSource) {
        this.f683a = taskCompletionSource;
    }

    @Override // C2.j
    public final boolean a(D2.b bVar) {
        int i = bVar.f971b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.f683a.trySetResult(bVar.f970a);
        return true;
    }

    @Override // C2.j
    public final boolean b(Exception exc) {
        return false;
    }
}
