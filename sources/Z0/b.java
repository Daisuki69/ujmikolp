package Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6872a;

    public b(Integer num) {
        this.f6872a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        Integer num = this.f6872a;
        return num == null ? bVar.f6872a == null : num.equals(bVar.f6872a);
    }

    public final int hashCode() {
        Integer num = this.f6872a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f6872a + "}";
    }
}
