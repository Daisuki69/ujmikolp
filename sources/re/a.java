package Re;

import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;
import pg.t;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f5491b;

    public /* synthetic */ a(t tVar, int i) {
        this.f5490a = i;
        this.f5491b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5490a) {
            case 0:
                this.f5491b.success(new HashMap());
                break;
            case 1:
                this.f5491b.success(new HashMap());
                break;
            case 2:
                this.f5491b.success(new HashMap());
                break;
            case 3:
                this.f5491b.success(numX49.tnTj78("bZpPx"));
                break;
            default:
                this.f5491b.error(numX49.tnTj78("bZpPf"), numX49.tnTj78("bZpP1"), numX49.tnTj78("bZpPn"));
                break;
        }
    }
}
