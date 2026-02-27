package jf;

import ef.AbstractRunnableC1438a;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends AbstractRunnableC1438a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17776b;
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f17777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, Object[] objArr, int i) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f17776b = 2;
        this.f17777d = kVar;
        this.c = i;
    }

    private final void b() {
        k kVar = this.f17777d;
        mg.c cVar = kVar.j;
        int i = this.c;
        cVar.getClass();
        try {
            kVar.f17772t.b(i, 6);
            synchronized (this.f17777d) {
                this.f17777d.f17774v.remove(Integer.valueOf(this.c));
            }
        } catch (IOException unused) {
        }
    }

    private final void c() {
        k kVar = this.f17777d;
        mg.c cVar = kVar.j;
        int i = this.c;
        cVar.getClass();
        try {
            kVar.f17772t.b(i, 6);
            synchronized (this.f17777d) {
                this.f17777d.f17774v.remove(Integer.valueOf(this.c));
            }
        } catch (IOException unused) {
        }
    }

    @Override // ef.AbstractRunnableC1438a
    public final void a() {
        switch (this.f17776b) {
            case 0:
                b();
                return;
            case 1:
                c();
                return;
            default:
                k kVar = this.f17777d;
                kVar.j.getClass();
                synchronized (kVar) {
                    this.f17777d.f17774v.remove(Integer.valueOf(this.c));
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, Object[] objArr, int i, ArrayList arrayList, int i4) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f17776b = i4;
        switch (i4) {
            case 1:
                this.f17777d = kVar;
                this.c = i;
                super("OkHttp %s Push Headers[%s]", objArr);
                break;
            default:
                this.f17777d = kVar;
                this.c = i;
                break;
        }
    }
}
