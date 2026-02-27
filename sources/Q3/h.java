package Q3;

import bg.AbstractC0983W;
import p3.C2011b;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends C2011b {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i) {
        super(13);
        this.c = i;
    }

    @Override // p3.C2011b
    public final int c(char c, StringBuilder sb2) {
        switch (this.c) {
            case 0:
                if (c == ' ') {
                    sb2.append((char) 3);
                    return 1;
                }
                if (c >= '0' && c <= '9') {
                    sb2.append((char) (c - ','));
                    return 1;
                }
                if (c >= 'a' && c <= 'z') {
                    sb2.append((char) (c - 'S'));
                    return 1;
                }
                if (c >= 0 && c <= 31) {
                    sb2.append((char) 0);
                    sb2.append(c);
                } else if (c >= '!' && c <= '/') {
                    sb2.append((char) 1);
                    sb2.append((char) (c - '!'));
                } else if (c >= ':' && c <= '@') {
                    sb2.append((char) 1);
                    sb2.append((char) (c - '+'));
                } else if (c >= '[' && c <= '_') {
                    sb2.append((char) 1);
                    sb2.append((char) (c - 'E'));
                } else if (c == '`') {
                    sb2.append((char) 2);
                    sb2.append((char) (c - '`'));
                } else if (c >= 'A' && c <= 'Z') {
                    sb2.append((char) 2);
                    sb2.append((char) (c - '@'));
                } else {
                    if (c < '{' || c > 127) {
                        if (c >= 128) {
                            sb2.append("\u0001\u001e");
                            return c((char) (c - 128), sb2) + 2;
                        }
                        AbstractC0983W.m(c);
                        throw null;
                    }
                    sb2.append((char) 2);
                    sb2.append((char) (c - '`'));
                }
                return 2;
            default:
                if (c == '\r') {
                    sb2.append((char) 0);
                } else if (c == ' ') {
                    sb2.append((char) 3);
                } else if (c == '*') {
                    sb2.append((char) 1);
                } else if (c == '>') {
                    sb2.append((char) 2);
                } else if (c >= '0' && c <= '9') {
                    sb2.append((char) (c - ','));
                } else {
                    if (c < 'A' || c > 'Z') {
                        AbstractC0983W.m(c);
                        throw null;
                    }
                    sb2.append((char) (c - '3'));
                }
                return 1;
        }
    }

    @Override // p3.C2011b, Q3.c
    public void g(d dVar) {
        switch (this.c) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    if (dVar.b()) {
                        char cA = dVar.a();
                        dVar.f5208d++;
                        c(cA, sb2);
                        if (sb2.length() % 3 == 0) {
                            C2011b.k(dVar, sb2);
                            if (AbstractC0983W.s(dVar.f5206a, dVar.f5208d, 3) != 3) {
                                dVar.e = 0;
                            }
                        }
                    }
                }
                i(dVar, sb2);
                break;
            default:
                super.g(dVar);
                break;
        }
    }

    @Override // p3.C2011b
    public final int h() {
        switch (this.c) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    @Override // p3.C2011b
    public void i(d dVar, StringBuilder sb2) {
        switch (this.c) {
            case 1:
                StringBuilder sb3 = dVar.c;
                dVar.c(sb3.length());
                int length = dVar.f.f5214b - sb3.length();
                dVar.f5208d -= sb2.length();
                String str = dVar.f5206a;
                if ((str.length() - dVar.f5209g) - dVar.f5208d > 1 || length > 1 || (str.length() - dVar.f5209g) - dVar.f5208d != length) {
                    dVar.d((char) 254);
                }
                if (dVar.e < 0) {
                    dVar.e = 0;
                }
                break;
            default:
                super.i(dVar, sb2);
                break;
        }
    }
}
