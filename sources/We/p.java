package We;

import android.util.LruCache;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends LruCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6414a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, int i4) {
        super(i);
        this.f6414a = i4;
    }

    private final void a(boolean z4, Object obj, Object obj2, Object obj3) {
    }

    @Override // android.util.LruCache
    public Object create(Object obj) {
        switch (this.f6414a) {
            case 1:
                return null;
            default:
                return super.create(obj);
        }
    }

    @Override // android.util.LruCache
    public void entryRemoved(boolean z4, Object obj, Object obj2, Object obj3) {
        switch (this.f6414a) {
            case 1:
                break;
            default:
                super.entryRemoved(z4, obj, obj2, obj3);
                break;
        }
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        switch (this.f6414a) {
            case 0:
                return ((q) obj2).f6416b;
            default:
                return S1.r.t(obj2);
        }
    }
}
