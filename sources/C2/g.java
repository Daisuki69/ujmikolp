package C2;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f682b;

    public g(k kVar, TaskCompletionSource taskCompletionSource) {
        this.f681a = kVar;
        this.f682b = taskCompletionSource;
    }

    @Override // C2.j
    public final boolean a(D2.b bVar) {
        if (bVar.f971b != 4 || this.f681a.a(bVar)) {
            return false;
        }
        String str = bVar.c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f682b.setResult(new a(str, bVar.e, bVar.f));
        return true;
    }

    @Override // C2.j
    public final boolean b(Exception exc) {
        this.f682b.trySetException(exc);
        return true;
    }
}
