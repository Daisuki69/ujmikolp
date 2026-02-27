package qf;

import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.fragments.AuthingFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthingFragment f19777b;
    public final /* synthetic */ CompareResult c;

    public /* synthetic */ c(AuthingFragment authingFragment, CompareResult compareResult, int i) {
        this.f19776a = i;
        this.f19777b = authingFragment;
        this.c = compareResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19776a) {
            case 0:
                this.f19777b.a(this.c);
                break;
            default:
                this.f19777b.b(this.c);
                break;
        }
    }
}
