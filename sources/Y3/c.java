package Y3;

import C3.l;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K3.b f6740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f6741b;
    public l c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f6742d;
    public l e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6743g;
    public int h;
    public int i;

    public c(K3.b bVar, l lVar, l lVar2, l lVar3, l lVar4) throws NotFoundException {
        if ((lVar == null && lVar3 == null) || ((lVar2 == null && lVar4 == null) || ((lVar != null && lVar2 == null) || (lVar3 != null && lVar4 == null)))) {
            throw NotFoundException.c;
        }
        this.f6740a = bVar;
        this.f6741b = lVar;
        this.c = lVar2;
        this.f6742d = lVar3;
        this.e = lVar4;
        a();
    }

    public final void a() {
        l lVar = this.f6741b;
        if (lVar == null) {
            this.f6741b = new l(0.0f, this.f6742d.f728b);
            this.c = new l(0.0f, this.e.f728b);
        } else if (this.f6742d == null) {
            int i = this.f6740a.f2589a;
            this.f6742d = new l(i - 1, lVar.f728b);
            this.e = new l(i - 1, this.c.f728b);
        }
        this.f = (int) Math.min(this.f6741b.f727a, this.c.f727a);
        this.f6743g = (int) Math.max(this.f6742d.f727a, this.e.f727a);
        this.h = (int) Math.min(this.f6741b.f728b, this.f6742d.f728b);
        this.i = (int) Math.max(this.c.f728b, this.e.f728b);
    }
}
