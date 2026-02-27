package vf;

import com.tencent.could.huiyansdk.fragments.BaseFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f20493b;

    public /* synthetic */ b(BaseFragment baseFragment, int i) {
        this.f20492a = i;
        this.f20493b = baseFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20492a) {
            case 0:
                this.f20493b.exit();
                break;
            default:
                this.f20493b.exit();
                break;
        }
    }
}
