package Q3;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f5207b;
    public final StringBuilder c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5208d;
    public int e;
    public f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5209g;

    public d(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c);
        }
        this.f5206a = sb2.toString();
        this.f5207b = g.f5217a;
        this.c = new StringBuilder(str.length());
        this.e = -1;
    }

    public final char a() {
        return this.f5206a.charAt(this.f5208d);
    }

    public final boolean b() {
        return this.f5208d < this.f5206a.length() - this.f5209g;
    }

    public final void c(int i) {
        f fVar = this.f;
        if (fVar == null || i > fVar.f5214b) {
            this.f = f.e(i, this.f5207b);
        }
    }

    public final void d(char c) {
        this.c.append(c);
    }
}
