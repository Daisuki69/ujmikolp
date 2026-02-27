package hg;

import android.content.Intent;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import java.util.concurrent.atomic.AtomicBoolean;
import pg.t;
import pg.w;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f17042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicBoolean f17043b;

    @Override // pg.w
    public final boolean onActivityResult(int i, int i4, Intent intent) {
        t tVar;
        if (i != 22643) {
            return false;
        }
        String str = SharePlusPendingIntent.f16387a;
        if (this.f17043b.compareAndSet(false, true) && (tVar = this.f17042a) != null) {
            tVar.success(str);
            this.f17042a = null;
        }
        return true;
    }
}
