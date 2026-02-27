package D8;

import com.paymaya.domain.model.MayaEKYCSelectedDocument;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f1007b;

    public /* synthetic */ C(D d10, int i) {
        this.f1006a = i;
        this.f1007b = d10;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f1006a) {
            case 0:
                D d10 = this.f1007b;
                MayaEKYCSelectedDocument mayaEKYCSelectedDocumentU = d10.u();
                kotlin.jvm.internal.j.d(mayaEKYCSelectedDocumentU);
                d10.C(mayaEKYCSelectedDocumentU);
                break;
            default:
                D d11 = this.f1007b;
                MayaEKYCSelectedDocument mayaEKYCSelectedDocumentU2 = d11.u();
                if (mayaEKYCSelectedDocumentU2 == null) {
                    d11.B(new Throwable("Selected document is null"));
                } else {
                    d11.C(mayaEKYCSelectedDocumentU2);
                }
                break;
        }
    }
}
