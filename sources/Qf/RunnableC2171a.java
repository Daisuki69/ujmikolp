package qf;

import com.tencent.could.huiyansdk.fragments.AuthingFragment;

/* JADX INFO: renamed from: qf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC2171a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthingFragment f19774b;

    public /* synthetic */ RunnableC2171a(AuthingFragment authingFragment, int i) {
        this.f19773a = i;
        this.f19774b = authingFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19773a) {
            case 0:
                this.f19774b.g();
                break;
            case 1:
                this.f19774b.f();
                break;
            case 2:
                this.f19774b.d();
                break;
            default:
                this.f19774b.e();
                break;
        }
    }
}
