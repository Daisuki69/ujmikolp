package sf;

import com.tencent.could.huiyansdk.manager.f;

/* JADX INFO: renamed from: sf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class RunnableC2257a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f20074b;

    public /* synthetic */ RunnableC2257a(f fVar, int i) {
        this.f20073a = i;
        this.f20074b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f20073a) {
            case 0:
                this.f20074b.g();
                break;
            case 1:
                this.f20074b.e();
                break;
            default:
                this.f20074b.f();
                break;
        }
    }
}
