package Rg;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5539b;

    public i(String content) {
        kotlin.jvm.internal.j.g(content, "content");
        this.f5538a = content;
        int length = content.length();
        int lowerCase = 0;
        for (int i = 0; i < length; i++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(content.charAt(i));
        }
        this.f5539b = lowerCase;
    }

    public final boolean equals(Object obj) {
        String str;
        i iVar = obj instanceof i ? (i) obj : null;
        return (iVar == null || (str = iVar.f5538a) == null || !str.equalsIgnoreCase(this.f5538a)) ? false : true;
    }

    public final int hashCode() {
        return this.f5539b;
    }

    public final String toString() {
        return this.f5538a;
    }
}
