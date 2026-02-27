package j3;

import com.dynatrace.android.agent.Global;
import com.google.gson.i;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class b implements Closeable, Flushable, AutoCloseable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f17702l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] m = new String[128];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f17703n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Writer f17704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f17705b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f17706d;
    public String e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17707g;
    public int h;
    public boolean i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17708k;

    static {
        for (int i = 0; i <= 31; i++) {
            m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f17703n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f17705b = iArr;
        this.c = 0;
        if (iArr.length == 0) {
            this.f17705b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f17705b;
        int i = this.c;
        this.c = i + 1;
        iArr2[i] = 6;
        this.h = 2;
        this.f17708k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f17704a = writer;
        t(i.f9873d);
    }

    public void B(long j) throws IOException {
        G();
        b();
        this.f17704a.write(Long.toString(j));
    }

    public void C(Boolean bool) throws IOException {
        if (bool == null) {
            r();
            return;
        }
        G();
        b();
        this.f17704a.write(bool.booleanValue() ? "true" : "false");
    }

    public void D(Number number) throws IOException {
        if (number == null) {
            r();
            return;
        }
        G();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.h != 1) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f17702l.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        b();
        this.f17704a.append((CharSequence) string);
    }

    public void E(String str) throws IOException {
        if (str == null) {
            r();
            return;
        }
        G();
        b();
        y(str);
    }

    public void F(boolean z4) throws IOException {
        G();
        b();
        this.f17704a.write(z4 ? "true" : "false");
    }

    public final void G() throws IOException {
        if (this.j != null) {
            int iPeek = peek();
            if (iPeek == 5) {
                this.f17704a.write(this.f);
            } else if (iPeek != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            q();
            this.f17705b[this.c - 1] = 4;
            y(this.j);
            this.j = null;
        }
    }

    public final void b() throws IOException {
        int iPeek = peek();
        if (iPeek == 1) {
            this.f17705b[this.c - 1] = 2;
            q();
            return;
        }
        Writer writer = this.f17704a;
        if (iPeek == 2) {
            writer.append((CharSequence) this.f);
            q();
        } else {
            if (iPeek == 4) {
                writer.append((CharSequence) this.e);
                this.f17705b[this.c - 1] = 5;
                return;
            }
            if (iPeek != 6) {
                if (iPeek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.h != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f17705b[this.c - 1] = 7;
        }
    }

    public void c() throws IOException {
        G();
        b();
        int i = this.c;
        int[] iArr = this.f17705b;
        if (i == iArr.length) {
            this.f17705b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f17705b;
        int i4 = this.c;
        this.c = i4 + 1;
        iArr2[i4] = 1;
        this.f17704a.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f17704a.close();
        int i = this.c;
        if (i > 1 || (i == 1 && this.f17705b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.c = 0;
    }

    public void f() throws IOException {
        G();
        b();
        int i = this.c;
        int[] iArr = this.f17705b;
        if (i == iArr.length) {
            this.f17705b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f17705b;
        int i4 = this.c;
        this.c = i4 + 1;
        iArr2[i4] = 3;
        this.f17704a.write(123);
    }

    public void flush() throws IOException {
        if (this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f17704a.flush();
    }

    public final void g(int i, int i4, char c) throws IOException {
        int iPeek = peek();
        if (iPeek != i4 && iPeek != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.j != null) {
            throw new IllegalStateException("Dangling name: " + this.j);
        }
        this.c--;
        if (iPeek == i4) {
            q();
        }
        this.f17704a.write(c);
    }

    public void i() throws IOException {
        g(1, 2, ']');
    }

    public void k() throws IOException {
        g(3, 5, '}');
    }

    public void m(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iPeek = peek();
        if (iPeek != 3 && iPeek != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.j = str;
    }

    public final int peek() {
        int i = this.c;
        if (i != 0) {
            return this.f17705b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void q() throws IOException {
        if (this.f17707g) {
            return;
        }
        String str = this.f17706d.f9874a;
        Writer writer = this.f17704a;
        writer.write(str);
        int i = this.c;
        for (int i4 = 1; i4 < i; i4++) {
            writer.write(this.f17706d.f9875b);
        }
    }

    public b r() throws IOException {
        if (this.j != null) {
            if (!this.f17708k) {
                this.j = null;
                return this;
            }
            G();
        }
        b();
        this.f17704a.write("null");
        return this;
    }

    public final void t(i iVar) {
        Objects.requireNonNull(iVar);
        this.f17706d = iVar;
        this.f = ",";
        if (iVar.c) {
            this.e = ": ";
            if (iVar.f9874a.isEmpty()) {
                this.f = ", ";
            }
        } else {
            this.e = Global.COLON;
        }
        this.f17707g = this.f17706d.f9874a.isEmpty() && this.f17706d.f9875b.isEmpty();
    }

    public final void w(int i) {
        if (i == 0) {
            throw null;
        }
        this.h = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = j3.b.f17703n
            goto L9
        L7:
            java.lang.String[] r0 = j3.b.m
        L9:
            java.io.Writer r1 = r8.f17704a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.b.y(java.lang.String):void");
    }

    public void z(double d10) throws IOException {
        G();
        if (this.h == 1 || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            b();
            this.f17704a.append((CharSequence) Double.toString(d10));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
    }
}
