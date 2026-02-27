package pi;

import X2.e;
import android.util.LruCache;
import io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: pi.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2152b extends LruCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2153c f19709a;

    public C2152b(InterfaceC2153c interfaceC2153c) {
        super(2000);
        this.f19709a = interfaceC2153c;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z4, Object obj, Object obj2, Object obj3) {
        super.entryRemoved(z4, obj, obj2, obj3);
        InterfaceC2153c interfaceC2153c = this.f19709a;
        if (interfaceC2153c == null || !z4) {
            return;
        }
        e eVar = (e) interfaceC2153c;
        Long l6 = (Long) obj;
        ((ConcurrentHashMap) eVar.f6482d).remove(l6);
        ((ImpressionsObserverCacheDao) eVar.f6481b).delete(l6);
    }
}
