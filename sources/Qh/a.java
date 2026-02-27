package Qh;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f5380b;
    public Object[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5381d;

    public a(int i) {
        this.f5379a = i;
        switch (i) {
            case 1:
                Object[] objArr = new Object[5];
                this.f5380b = objArr;
                this.c = objArr;
                break;
            default:
                Object[] objArr2 = new Object[5];
                this.f5380b = objArr2;
                this.c = objArr2;
                break;
        }
    }

    public final void a(Object obj) {
        switch (this.f5379a) {
            case 0:
                int i = this.f5381d;
                if (i == 4) {
                    Object[] objArr = new Object[5];
                    this.c[4] = objArr;
                    this.c = objArr;
                    i = 0;
                }
                this.c[i] = obj;
                this.f5381d = i + 1;
                break;
            default:
                int i4 = this.f5381d;
                if (i4 == 4) {
                    Object[] objArr2 = new Object[5];
                    this.c[4] = objArr2;
                    this.c = objArr2;
                    i4 = 0;
                }
                this.c[i4] = obj;
                this.f5381d = i4 + 1;
                break;
        }
    }
}
