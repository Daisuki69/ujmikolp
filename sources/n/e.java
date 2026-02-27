package N;

import M8.T;
import We.s;
import cj.C1112C;
import dOYHB6.tiZVw8.numX49;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3459a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3460b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3461d;
    public final Object e;
    public final Object f;

    public e(Uj.b bVar, Vj.j jVar, e eVar, Rj.d dVar) {
        kotlin.jvm.internal.j.g(bVar, numX49.tnTj78("PJPR"));
        kotlin.jvm.internal.j.g(dVar, numX49.tnTj78("PJPp"));
        this.c = bVar;
        this.f3461d = jVar;
        this.e = eVar;
        this.f3460b = -1;
        this.f = bVar.f6006a.f6008a ? null : new Vj.e(dVar);
    }

    public static /* synthetic */ void x(e eVar, String str, int i, int i4) {
        if ((i4 & 2) != 0) {
            i = eVar.f3460b;
        }
        eVar.w(i, str, (i4 & 4) != 0 ? numX49.tnTj78("PJPg") : numX49.tnTj78("PJPf"));
        throw null;
    }

    public int A(long j, String str) {
        List listB;
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("PJP1"));
        Y.b bVar = ((Y.f) this.c).f6710b;
        if (bVar == null || (listB = bVar.b(str)) == null) {
            listB = C1112C.f9377a;
        }
        int size = listB.size() - 1;
        int i = 0;
        while (i <= size) {
            int i4 = (i + size) >>> 1;
            if (((Number) listB.get(i4)).longValue() < j) {
                i = i4 + 1;
            } else {
                size = i4 - 1;
            }
        }
        return listB.size() - i;
    }

    public int B(int i) {
        if (i < ((String) this.f).length()) {
            return i;
        }
        return -1;
    }

    public int C() {
        char cCharAt;
        int i = this.f3460b;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = (String) this.f;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.f3460b = i;
        return i;
    }

    public boolean D() {
        int iC = C();
        String str = (String) this.f;
        if (iC >= str.length() || iC == -1 || str.charAt(iC) != ',') {
            return false;
        }
        this.f3460b++;
        return true;
    }

    public void E(char c) {
        int i = this.f3460b;
        if (i > 0 && c == '\"') {
            try {
                this.f3460b = i - 1;
                String strI = i();
                this.f3460b = i;
                if (kotlin.jvm.internal.j.b(strI, numX49.tnTj78("PJPn"))) {
                    w(this.f3460b - 1, numX49.tnTj78("PJPs"), numX49.tnTj78("PJPx"));
                    throw null;
                }
            } catch (Throwable th2) {
                this.f3460b = i;
                throw th2;
            }
        }
        y(Vj.f.b(c), true);
        throw null;
    }

    public int a(CharSequence charSequence, int i) {
        int i4 = i + 4;
        if (i4 < charSequence.length()) {
            ((StringBuilder) this.e).append((char) (z(charSequence, i + 3) + (z(charSequence, i) << 12) + (z(charSequence, i + 1) << 8) + (z(charSequence, i + 2) << 4)));
            return i4;
        }
        this.f3460b = i;
        if (i4 < charSequence.length()) {
            return a(charSequence, this.f3460b);
        }
        x(this, numX49.tnTj78("PJP5"), 0, 6);
        throw null;
    }

    public e b(Rj.d dVar) {
        byte b8;
        kotlin.jvm.internal.j.g(dVar, numX49.tnTj78("PJPJ"));
        Uj.b bVar = (Uj.b) this.c;
        Vj.j jVarG = Vj.f.g(dVar, bVar);
        e eVar = (e) this.e;
        F.i iVar = (F.i) eVar.c;
        int i = iVar.c + 1;
        iVar.c = i;
        Object[] objArr = (Object[]) iVar.f1503b;
        if (i == objArr.length) {
            int i4 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i4);
            String strTnTj78 = numX49.tnTj78("PJPI");
            kotlin.jvm.internal.j.f(objArrCopyOf, strTnTj78);
            iVar.f1503b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) iVar.f1504d, i4);
            kotlin.jvm.internal.j.f(iArrCopyOf, strTnTj78);
            iVar.f1504d = iArrCopyOf;
        }
        ((Object[]) iVar.f1503b)[i] = dVar;
        eVar.f(jVarG.f6151a);
        int i6 = eVar.f3460b;
        while (true) {
            int iB = eVar.B(i6);
            b8 = 10;
            if (iB == -1) {
                eVar.f3460b = iB;
                break;
            }
            char cCharAt = ((String) eVar.f).charAt(iB);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                eVar.f3460b = iB;
                b8 = Vj.f.b(cCharAt);
                break;
            }
            i6 = iB + 1;
        }
        if (b8 != 4) {
            int iOrdinal = jVarG.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new e(bVar, jVarG, eVar, dVar) : (((Vj.j) this.f3461d) == jVarG && bVar.f6006a.f6008a) ? this : new e(bVar, jVarG, eVar, dVar);
        }
        x(eVar, numX49.tnTj78("PJPq"), 0, 6);
        throw null;
    }

    public boolean c() {
        int i = this.f3460b;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = (String) this.f;
            if (i >= str.length()) {
                this.f3460b = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f3460b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
    }

    public void d(int i, String str) {
        String str2 = (String) this.f;
        if (str2.length() - i < str.length()) {
            x(this, numX49.tnTj78("PJPl"), 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (str.charAt(i4) != (str2.charAt(i + i4) | ' ')) {
                x(this, numX49.tnTj78("PJPz") + i() + '\'', 0, 6);
                throw null;
            }
        }
        this.f3460b = str.length() + i;
    }

    public String e() {
        f('\"');
        int i = this.f3460b;
        String str = (String) this.f;
        int iE = C2576A.E(str, '\"', i, 4);
        if (iE == -1) {
            i();
            y((byte) 1, false);
            throw null;
        }
        int i4 = i;
        while (i4 < iE) {
            if (str.charAt(i4) == '\\') {
                int iB = this.f3460b;
                char cCharAt = str.charAt(i4);
                boolean z4 = false;
                while (cCharAt != '\"') {
                    String strTnTj78 = numX49.tnTj78("PJPW");
                    if (cCharAt == '\\') {
                        ((StringBuilder) this.e).append((CharSequence) str, iB, i4);
                        int iB2 = B(i4 + 1);
                        if (iB2 == -1) {
                            x(this, numX49.tnTj78("PJbP"), 0, 6);
                            throw null;
                        }
                        int iA = iB2 + 1;
                        char cCharAt2 = str.charAt(iB2);
                        if (cCharAt2 == 'u') {
                            iA = a(str, iA);
                        } else {
                            char c = cCharAt2 < 'u' ? Vj.d.f6137a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                x(this, numX49.tnTj78("PJb9") + cCharAt2 + '\'', 0, 6);
                                throw null;
                            }
                            ((StringBuilder) this.e).append(c);
                        }
                        iB = B(iA);
                        if (iB == -1) {
                            x(this, strTnTj78, iB, 4);
                            throw null;
                        }
                    } else {
                        i4++;
                        if (i4 >= str.length()) {
                            ((StringBuilder) this.e).append((CharSequence) str, iB, i4);
                            iB = B(i4);
                            if (iB == -1) {
                                x(this, strTnTj78, iB, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i4);
                        }
                    }
                    i4 = iB;
                    z4 = true;
                    cCharAt = str.charAt(i4);
                }
                String string = !z4 ? str.subSequence(iB, i4).toString() : u(iB, i4);
                this.f3460b = i4 + 1;
                return string;
            }
            i4++;
        }
        this.f3460b = iE + 1;
        String strSubstring = str.substring(i, iE);
        kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public void f(char c) {
        int i = this.f3460b;
        if (i == -1) {
            E(c);
            throw null;
        }
        while (true) {
            String str = (String) this.f;
            if (i >= str.length()) {
                this.f3460b = -1;
                E(c);
                throw null;
            }
            int i4 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f3460b = i4;
                if (cCharAt == c) {
                    return;
                }
                E(c);
                throw null;
            }
            i = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b3, code lost:
    
        x(r22, r6, 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01be, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01bf, code lost:
    
        if (r14 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c1, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c6, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c9, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ca, code lost:
    
        x(r22, r6, 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d0, code lost:
    
        x(r22, dOYHB6.tiZVw8.numX49.tnTj78("PJbd"), 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010b, code lost:
    
        x(r22, dOYHB6.tiZVw8.numX49.tnTj78("PJbB") + r15 + dOYHB6.tiZVw8.numX49.tnTj78("PJbu"), 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0130, code lost:
    
        if (r12 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0132, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0134, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0135, code lost:
    
        if (r1 == r12) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0137, code lost:
    
        if (r14 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013b, code lost:
    
        if (r1 == (r12 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0142, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0144, code lost:
    
        if (r3 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014c, code lost:
    
        if (r2.charAt(r12) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014e, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0151, code lost:
    
        x(r22, dOYHB6.tiZVw8.numX49.tnTj78("PJbV"), 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015d, code lost:
    
        x(r22, r4, 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0162, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0163, code lost:
    
        r22.f3460b = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0165, code lost:
    
        if (r21 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0167, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016a, code lost:
    
        if (r5 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x016c, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0174, code lost:
    
        if (r5 != true) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0176, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017b, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0180, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0186, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018e, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0190, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0192, code lost:
    
        x(r22, dOYHB6.tiZVw8.numX49.tnTj78("PJbS") + r1 + dOYHB6.tiZVw8.numX49.tnTj78("PJbj"), 0, 6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long g() {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.e.g():long");
    }

    public String h() {
        String str = (String) this.f3461d;
        if (str == null) {
            return e();
        }
        kotlin.jvm.internal.j.d(str);
        this.f3461d = null;
        return str;
    }

    public String i() {
        String str = (String) this.f3461d;
        if (str != null) {
            kotlin.jvm.internal.j.d(str);
            this.f3461d = null;
            return str;
        }
        int iC = C();
        String str2 = (String) this.f;
        if (iC >= str2.length() || iC == -1) {
            x(this, numX49.tnTj78("PJbE"), iC, 4);
            throw null;
        }
        byte b8 = Vj.f.b(str2.charAt(iC));
        if (b8 == 1) {
            return h();
        }
        if (b8 != 0) {
            x(this, numX49.tnTj78("PJbi") + str2.charAt(iC), 0, 6);
            throw null;
        }
        boolean z4 = false;
        while (Vj.f.b(str2.charAt(iC)) == 0) {
            iC++;
            if (iC >= str2.length()) {
                ((StringBuilder) this.e).append((CharSequence) str2, this.f3460b, iC);
                int iB = B(iC);
                if (iB == -1) {
                    this.f3460b = iC;
                    return u(0, 0);
                }
                iC = iB;
                z4 = true;
            }
        }
        String string = !z4 ? str2.subSequence(this.f3460b, iC).toString() : u(this.f3460b, iC);
        this.f3460b = iC;
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int j(Rj.d dVar) {
        kotlin.jvm.internal.j.g(dVar, numX49.tnTj78("PJbF"));
        Vj.j jVar = (Vj.j) this.f3461d;
        int iOrdinal = jVar.ordinal();
        e eVar = (e) this.e;
        String strTnTj78 = numX49.tnTj78("PJbH");
        int i = 0;
        zD = false;
        boolean zD = false;
        Uj.b bVar = (Uj.b) this.c;
        int iC = -1;
        if (iOrdinal == 0) {
            boolean zD2 = eVar.D();
            boolean zC = eVar.c();
            Vj.e eVar2 = (Vj.e) this.f;
            if (zC) {
                String strE = eVar.e();
                eVar.f(':');
                iC = Vj.f.c(dVar, bVar, strE);
                if (iC == -3) {
                    eVar.w(C2576A.J(((String) eVar.f).subSequence(0, eVar.f3460b).toString(), 0, 6, false, strE), androidx.media3.datasource.cache.c.g('\'', numX49.tnTj78("PJbe"), strE), numX49.tnTj78("PJb8"));
                    throw null;
                }
                if (eVar2 != null) {
                    Tj.d dVar2 = eVar2.f6139a;
                    if (iC < 64) {
                        dVar2.c |= 1 << iC;
                    } else {
                        int i4 = (iC >>> 6) - 1;
                        long[] jArr = dVar2.f5859d;
                        jArr[i4] = jArr[i4] | (1 << (iC & 63));
                    }
                }
            } else {
                if (zD2) {
                    Uj.d dVar3 = bVar.f6006a;
                    Vj.f.d(eVar, strTnTj78);
                    throw null;
                }
                if (eVar2 != null) {
                    Tj.d dVar4 = eVar2.f6139a;
                    Rj.d dVar5 = dVar4.f5857a;
                    int iD = dVar5.d();
                    while (true) {
                        long j = dVar4.c;
                        long j6 = -1;
                        T t5 = dVar4.f5858b;
                        if (j != -1) {
                            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                            dVar4.c |= 1 << iNumberOfTrailingZeros;
                            if (((Boolean) t5.invoke(dVar5, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
                                iC = iNumberOfTrailingZeros;
                                break;
                            }
                        } else if (iD > 64) {
                            long[] jArr2 = dVar4.f5859d;
                            int length = jArr2.length;
                            loop1: while (i < length) {
                                int i6 = i + 1;
                                int i10 = i6 * 64;
                                long j7 = j6;
                                long j9 = jArr2[i];
                                while (j9 != j7) {
                                    T t10 = t5;
                                    int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j9);
                                    j9 |= 1 << iNumberOfTrailingZeros2;
                                    iC = iNumberOfTrailingZeros2 + i10;
                                    if (((Boolean) t10.invoke(dVar5, Integer.valueOf(iC))).booleanValue()) {
                                        jArr2[i] = j9;
                                        break loop1;
                                    }
                                    t5 = t10;
                                }
                                jArr2[i] = j9;
                                i = i6;
                                j6 = j7;
                            }
                        }
                    }
                    iC = -1;
                } else {
                    iC = -1;
                }
            }
        } else if (iOrdinal != 2) {
            boolean zD3 = eVar.D();
            if (eVar.c()) {
                int i11 = this.f3460b;
                if (i11 != -1 && !zD3) {
                    x(eVar, numX49.tnTj78("PJbO"), 0, 6);
                    throw null;
                }
                iC = i11 + 1;
                this.f3460b = iC;
            } else if (zD3) {
                Uj.d dVar6 = bVar.f6006a;
                Vj.f.d(eVar, numX49.tnTj78("PJbQ"));
                throw null;
            }
        } else {
            int i12 = this.f3460b;
            Object[] objArr = i12 % 2 != 0;
            if (objArr != true) {
                eVar.f(':');
            } else if (i12 != -1) {
                zD = eVar.D();
            }
            if (eVar.c()) {
                if (objArr != false) {
                    if (this.f3460b == -1) {
                        int i13 = eVar.f3460b;
                        if (zD) {
                            x(eVar, numX49.tnTj78("PJbt"), i13, 4);
                            throw null;
                        }
                    } else {
                        int i14 = eVar.f3460b;
                        if (!zD) {
                            x(eVar, numX49.tnTj78("PJbU"), i14, 4);
                            throw null;
                        }
                    }
                }
                iC = this.f3460b + 1;
                this.f3460b = iC;
            } else if (zD) {
                Uj.d dVar7 = bVar.f6006a;
                Vj.f.d(eVar, strTnTj78);
                throw null;
            }
        }
        if (jVar != Vj.j.e) {
            F.i iVar = (F.i) eVar.c;
            ((int[]) iVar.f1504d)[iVar.c] = iC;
        }
        return iC;
    }

    public int k() {
        e eVar = (e) this.e;
        long jG = eVar.g();
        int i = (int) jG;
        if (jG == i) {
            return i;
        }
        x(eVar, numX49.tnTj78("PJbC") + jG + '\'', 0, 6);
        throw null;
    }

    public int l(Rj.d dVar, int i) {
        kotlin.jvm.internal.j.g(dVar, numX49.tnTj78("PJb4"));
        return k();
    }

    public long m() {
        return ((e) this.e).g();
    }

    public long n(Rj.d dVar, int i) {
        kotlin.jvm.internal.j.g(dVar, numX49.tnTj78("PJbo"));
        return m();
    }

    public boolean o() {
        Vj.e eVar = (Vj.e) this.f;
        if (!(eVar != null ? eVar.f6140b : false)) {
            e eVar2 = (e) this.e;
            int iB = eVar2.B(eVar2.C());
            String str = (String) eVar2.f;
            int length = str.length() - iB;
            boolean z4 = false;
            if (length >= 4 && iB != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if (numX49.tnTj78("PJbK").charAt(i) != str.charAt(iB + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || Vj.f.b(str.charAt(iB + 4)) != 0) {
                        eVar2.f3460b = iB + 4;
                        z4 = true;
                    }
                }
            }
            if (!z4) {
                return true;
            }
        }
        return false;
    }

    public Object p(Rj.d dVar, int i, Pj.a aVar, Object obj) {
        kotlin.jvm.internal.j.g(dVar, numX49.tnTj78("PJbw"));
        kotlin.jvm.internal.j.g(aVar, numX49.tnTj78("PJbc"));
        if (aVar.d().b() || o()) {
            return r(aVar);
        }
        return null;
    }

    public Object q(Rj.d dVar, int i, Pj.a aVar, Object obj) {
        kotlin.jvm.internal.j.g(dVar, numX49.tnTj78("PJbm"));
        kotlin.jvm.internal.j.g(aVar, numX49.tnTj78("PJbD"));
        boolean z4 = ((Vj.j) this.f3461d) == Vj.j.e && (i & 1) == 0;
        F.i iVar = (F.i) ((e) this.e).c;
        if (z4) {
            int[] iArr = (int[]) iVar.f1504d;
            int i4 = iVar.c;
            if (iArr[i4] == -2) {
                ((Object[]) iVar.f1503b)[i4] = Vj.g.f6142a;
            }
        }
        kotlin.jvm.internal.j.g(dVar, numX49.tnTj78("PJbh"));
        kotlin.jvm.internal.j.g(aVar, numX49.tnTj78("PJbM"));
        Object objR = r(aVar);
        if (z4) {
            int[] iArr2 = (int[]) iVar.f1504d;
            int i6 = iVar.c;
            if (iArr2[i6] != -2) {
                int i10 = i6 + 1;
                iVar.c = i10;
                Object[] objArr = (Object[]) iVar.f1503b;
                if (i10 == objArr.length) {
                    int i11 = i10 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
                    String strTnTj78 = numX49.tnTj78("PJbN");
                    kotlin.jvm.internal.j.f(objArrCopyOf, strTnTj78);
                    iVar.f1503b = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) iVar.f1504d, i11);
                    kotlin.jvm.internal.j.f(iArrCopyOf, strTnTj78);
                    iVar.f1504d = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) iVar.f1503b;
            int i12 = iVar.c;
            objArr2[i12] = objR;
            ((int[]) iVar.f1504d)[i12] = -2;
        }
        return objR;
    }

    public Object r(Pj.a aVar) {
        kotlin.jvm.internal.j.g(aVar, numX49.tnTj78("PJb6"));
        try {
            return aVar.a(this);
        } catch (MissingFieldException e) {
            String message = e.getMessage();
            kotlin.jvm.internal.j.d(message);
            if (C2576A.z(message, numX49.tnTj78("PJba"), false, 2)) {
                throw e;
            }
            throw new MissingFieldException(e.f18215a, e.getMessage() + numX49.tnTj78("PJbX") + ((F.i) ((e) this.e).c).e(), e);
        }
    }

    public String s() {
        return ((e) this.e).h();
    }

    public String t(Rj.d dVar, int i) {
        kotlin.jvm.internal.j.g(dVar, numX49.tnTj78("PJbG"));
        return s();
    }

    public String toString() {
        switch (this.f3459a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(numX49.tnTj78("PJb3"));
                sb2.append(this.f);
                sb2.append(numX49.tnTj78("PJby"));
                return s.m(sb2, this.f3460b, ')');
            default:
                return super.toString();
        }
    }

    public String u(int i, int i4) {
        ((StringBuilder) this.e).append((CharSequence) this.f, i, i4);
        StringBuilder sb2 = (StringBuilder) this.e;
        String string = sb2.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        sb2.setLength(0);
        return string;
    }

    public void v(Rj.d dVar) {
        kotlin.jvm.internal.j.g(dVar, numX49.tnTj78("PJbv"));
        Uj.d dVar2 = ((Uj.b) this.c).f6006a;
        e eVar = (e) this.e;
        if (eVar.D()) {
            Vj.f.d(eVar, numX49.tnTj78("PJb7"));
            throw null;
        }
        eVar.f(((Vj.j) this.f3461d).f6152b);
        F.i iVar = (F.i) eVar.c;
        int i = iVar.c;
        int[] iArr = (int[]) iVar.f1504d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            iVar.c = i - 1;
        }
        int i4 = iVar.c;
        if (i4 != -1) {
            iVar.c = i4 - 1;
        }
    }

    public void w(int i, String str, String str2) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("PJbA"));
        kotlin.jvm.internal.j.g(str2, numX49.tnTj78("PJbY"));
        String strTnTj78 = str2.length() == 0 ? numX49.tnTj78("PJbT") : numX49.tnTj78("PJbR").concat(str2);
        StringBuilder sbV = s.v(str, numX49.tnTj78("PJbp"));
        sbV.append(((F.i) this.c).e());
        sbV.append(strTnTj78);
        String string = sbV.toString();
        String str3 = (String) this.f;
        kotlin.jvm.internal.j.g(string, numX49.tnTj78("PJb0"));
        kotlin.jvm.internal.j.g(str3, numX49.tnTj78("PJbg"));
        String str4 = string + numX49.tnTj78("PJbf") + ((Object) Vj.f.e(str3, i));
        String strTnTj782 = numX49.tnTj78("PJb1");
        kotlin.jvm.internal.j.g(str4, strTnTj782);
        if (i >= 0) {
            str4 = numX49.tnTj78("PJbn") + i + numX49.tnTj78("PJbx") + str4;
        }
        kotlin.jvm.internal.j.g(str4, strTnTj782);
        throw new JsonDecodingException(str4);
    }

    public void y(byte b8, boolean z4) {
        String strTnTj78 = b8 == 1 ? numX49.tnTj78("PJbs") : b8 == 2 ? "string escape sequence '\\'" : b8 == 4 ? numX49.tnTj78("PJb5") : b8 == 5 ? numX49.tnTj78("PJbJ") : b8 == 6 ? "start of the object '{'" : b8 == 7 ? numX49.tnTj78("PJbI") : b8 == 8 ? "start of the array '['" : b8 == 9 ? numX49.tnTj78("PJbq") : b8 == 10 ? numX49.tnTj78("PJbz") : b8 == 127 ? numX49.tnTj78("PJbl") : "valid token";
        int i = z4 ? this.f3460b - 1 : this.f3460b;
        int i4 = this.f3460b;
        String str = (String) this.f;
        x(this, s.l(numX49.tnTj78("PJ29"), strTnTj78, numX49.tnTj78("PJ2P"), (i4 == str.length() || i < 0) ? numX49.tnTj78("PJbW") : String.valueOf(str.charAt(i)), numX49.tnTj78("PJ2b")), i, 4);
        throw null;
    }

    public int z(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        x(this, numX49.tnTj78("PJ22") + cCharAt + numX49.tnTj78("PJ2L"), 0, 6);
        throw null;
    }

    public e(Y.f fVar) {
        n0.c cVar = n0.c.f18542a;
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.j.g(locale, numX49.tnTj78("PJP0"));
        this.c = fVar;
        this.f3461d = cVar;
        this.e = locale;
        this.f = new LinkedHashMap();
    }

    public e(String source) {
        kotlin.jvm.internal.j.g(source, "source");
        F.i iVar = new F.i(3, (byte) 0);
        iVar.f1503b = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        iVar.f1504d = iArr;
        iVar.c = -1;
        this.c = iVar;
        this.e = new StringBuilder();
        this.f = source;
    }
}
