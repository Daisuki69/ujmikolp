package n;

/* JADX INFO: renamed from: n.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1881h implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18468b;

    public /* synthetic */ C1881h(String str, int i) {
        this.f18467a = i;
        this.f18468b = str;
    }

    @Override // n.u
    public final void onResult(Object obj) {
        switch (this.f18467a) {
            case 0:
                AbstractC1883j.f18472a.remove(this.f18468b);
                break;
            default:
                AbstractC1883j.f18472a.remove(this.f18468b);
                break;
        }
    }
}
