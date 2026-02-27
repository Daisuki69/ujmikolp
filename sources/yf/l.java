package yf;

import We.s;
import com.dynatrace.android.agent.Global;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes11.dex */
public abstract class l extends b {
    static {
        i[] iVarArr = i.c;
        i[] iVarArr2 = i.c;
    }

    public static l g(String str) throws IOException {
        if (str.length() == 1) {
            char cCharAt = str.charAt(0);
            if ('0' <= cCharAt && cCharAt <= '9') {
                return i.m(((long) cCharAt) - 48);
            }
            if (cCharAt == '-' || cCharAt == '.') {
                return i.f21163d;
            }
            throw new IOException("Not a number: ".concat(str));
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 == '.' || cCharAt2 == 'e') {
                f fVar = new f();
                try {
                    fVar.f21160b = str;
                    fVar.f21159a = new BigDecimal(fVar.f21160b);
                    fVar.m();
                    return fVar;
                } catch (NumberFormatException e) {
                    if (str.startsWith("--")) {
                        fVar.f21160b = str.substring(1);
                    } else {
                        if (!str.matches("^0\\.0*\\-\\d+")) {
                            throw new IOException(s.j("Error expected floating point number actual='", str, "'"), e);
                        }
                        fVar.f21160b = Global.HYPHEN + fVar.f21160b.replaceFirst("\\-", "");
                    }
                    try {
                        fVar.f21159a = new BigDecimal(fVar.f21160b);
                        fVar.m();
                        return fVar;
                    } catch (NumberFormatException e7) {
                        throw new IOException(s.j("Error expected floating point number actual='", str, "'"), e7);
                    }
                }
            }
        }
        try {
            return str.charAt(0) == '+' ? i.m(Long.parseLong(str.substring(1))) : i.m(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            if (((str.startsWith("+") || str.startsWith(Global.HYPHEN)) ? str.substring(1) : str).matches("[0-9]*")) {
                return str.startsWith(Global.HYPHEN) ? i.f21164g : i.f;
            }
            throw new IOException("Not a number: ".concat(str));
        }
    }

    public abstract float f();

    public abstract int i();

    public abstract long k();
}
