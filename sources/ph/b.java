package Ph;

import Ah.e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f5174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5175b;

    public b(e eVar) {
        this.f5174a = eVar;
    }

    @Override // Fh.c
    public final int b(int i) {
        lazySet(8);
        return 2;
    }

    @Override // Fh.g
    public final void clear() {
        lazySet(32);
        this.f5175b = null;
    }

    public final void e(Object obj) {
        int i = get();
        do {
            e eVar = this.f5174a;
            if (i == 8) {
                this.f5175b = obj;
                lazySet(16);
                eVar.onNext(obj);
                if (get() != 4) {
                    eVar.onComplete();
                    return;
                }
                return;
            }
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                eVar.onNext(obj);
                if (get() != 4) {
                    eVar.onComplete();
                    return;
                }
                return;
            }
            this.f5175b = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i = get();
            }
        } while (i != 4);
        this.f5175b = null;
    }

    @Override // Fh.g
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj) {
        e(obj);
    }

    @Override // Fh.g
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f5175b;
        this.f5175b = null;
        return obj;
    }

    @Override // nk.c
    public final void request(long j) {
        Object obj;
        if (d.c(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.f5175b) == null) {
                        return;
                    }
                    this.f5175b = null;
                    e eVar = this.f5174a;
                    eVar.onNext(obj);
                    if (get() != 4) {
                        eVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
