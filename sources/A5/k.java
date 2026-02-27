package A5;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Ch.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f171b = new k(0);
    public static final k c = new k(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f172d = new k(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173a;

    public /* synthetic */ k(int i) {
        this.f173a = i;
    }

    @Override // Ch.g
    public final boolean test(Object obj) {
        switch (this.f173a) {
            case 0:
                U5.a aVar = (U5.a) obj;
                if (aVar == U5.a.f5944d || aVar == U5.a.c || aVar == U5.a.e) {
                }
                break;
            case 1:
                U5.a aVar2 = (U5.a) obj;
                if (aVar2 == U5.a.f5944d || aVar2 == U5.a.c || aVar2 == U5.a.f) {
                }
                break;
            default:
                U5.a aVar3 = (U5.a) obj;
                if (aVar3 == U5.a.f5944d || aVar3 == U5.a.c || aVar3 == U5.a.e) {
                }
                break;
        }
        return true;
    }
}
