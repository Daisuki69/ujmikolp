package O1;

/* JADX INFO: loaded from: classes2.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4558b;
    public final Object c;

    public V(Object obj, Object obj2, Object obj3) {
        this.f4557a = obj;
        this.f4558b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f4557a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f4558b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.c);
        return new IllegalArgumentException(sb2.toString());
    }
}
