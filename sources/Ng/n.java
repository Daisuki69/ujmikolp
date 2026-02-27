package Ng;

import io.ktor.http.IllegalHeaderNameException;
import io.ktor.http.IllegalHeaderValueException;
import java.util.List;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends Rg.u {
    @Override // Rg.u
    public final void t(String name) {
        kotlin.jvm.internal.j.g(name, "name");
        List list = q.f4436a;
        int i = 0;
        int i4 = 0;
        while (i < name.length()) {
            char cCharAt = name.charAt(i);
            int i6 = i4 + 1;
            if (kotlin.jvm.internal.j.i(cCharAt, 32) <= 0 || C2576A.y("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                StringBuilder sbW = We.s.w("Header name '", name, "' contains illegal character '");
                sbW.append(name.charAt(i4));
                sbW.append("' (code ");
                throw new IllegalHeaderNameException(We.s.m(sbW, name.charAt(i4) & 255, ')'));
            }
            i++;
            i4 = i6;
        }
    }

    @Override // Rg.u
    public final void u(String value) {
        kotlin.jvm.internal.j.g(value, "value");
        List list = q.f4436a;
        int i = 0;
        int i4 = 0;
        while (i < value.length()) {
            char cCharAt = value.charAt(i);
            int i6 = i4 + 1;
            if (kotlin.jvm.internal.j.i(cCharAt, 32) < 0 && cCharAt != '\t') {
                StringBuilder sbW = We.s.w("Header value '", value, "' contains illegal character '");
                sbW.append(value.charAt(i4));
                sbW.append("' (code ");
                throw new IllegalHeaderValueException(We.s.m(sbW, value.charAt(i4) & 255, ')'));
            }
            i++;
            i4 = i6;
        }
    }
}
