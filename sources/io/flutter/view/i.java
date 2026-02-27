package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import d4.AbstractC1331a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f17427C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f17428D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f17429E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f17430F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f17431G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f17432H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f17433I;
    public float J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f17434K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f17435L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f17436M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float[] f17437N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public i f17438O;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ArrayList f17441R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public f f17442S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public f f17443T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float[] f17445V;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public float[] f17447X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Rect f17448Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f17449a;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17451d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17452g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17453k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f17454l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f17455n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f17456o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f17457p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f17458q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f17459r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f17460s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f17461t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f17462u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f17463v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f17464w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f17465x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f17466y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f17467z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17450b = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f17425A = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f17426B = false;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final ArrayList f17439P = new ArrayList();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ArrayList f17440Q = new ArrayList();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f17444U = true;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f17446W = true;

    public i(l lVar) {
        this.f17449a = lVar;
    }

    public static boolean a(i iVar, e eVar) {
        return (iVar.f17451d & eVar.f17420a) != 0;
    }

    public static CharSequence b(i iVar) {
        CharSequence[] charSequenceArr = {d(iVar.f17459r, iVar.f17460s), d(iVar.f17457p, iVar.f17458q), d(iVar.f17465x, iVar.f17466y)};
        CharSequence charSequenceConcat = null;
        for (int i = 0; i < 3; i++) {
            CharSequence charSequence = charSequenceArr[i];
            if (charSequence != null && charSequence.length() > 0) {
                charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
            }
        }
        return charSequenceConcat;
    }

    public static SpannableString d(String str, ArrayList arrayList) {
        if (str == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                int iC = AbstractC2217b.c(kVar.c);
                if (iC == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), kVar.f17468a, kVar.f17469b, 0);
                } else if (iC == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((g) kVar).f17424d)), kVar.f17468a, kVar.f17469b, 0);
                }
            }
        }
        return spannableString;
    }

    public static ArrayList f(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i = byteBuffer.getInt();
        if (i == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i4 = 0; i4 < i; i4++) {
            int i6 = byteBuffer.getInt();
            int i10 = byteBuffer.getInt();
            int i11 = AbstractC2217b.d(2)[byteBuffer.getInt()];
            int iC = AbstractC2217b.c(i11);
            if (iC == 0) {
                byteBuffer.getInt();
                j jVar = new j();
                jVar.f17468a = i6;
                jVar.f17469b = i10;
                jVar.c = i11;
                arrayList.add(jVar);
            } else if (iC == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                g gVar = new g();
                gVar.f17468a = i6;
                gVar.f17469b = i10;
                gVar.c = i11;
                gVar.f17424d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    public static void j(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f = fArr[3];
        fArr[0] = fArr[0] / f;
        fArr[1] = fArr[1] / f;
        fArr[2] = fArr[2] / f;
        fArr[3] = 0.0f;
    }

    public final void c(ArrayList arrayList) {
        if (g(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f17439P.iterator();
        while (it.hasNext()) {
            ((i) it.next()).c(arrayList);
        }
    }

    public final String e() {
        String str;
        if (g(13) && (str = this.f17457p) != null && !str.isEmpty()) {
            return this.f17457p;
        }
        Iterator it = this.f17439P.iterator();
        while (it.hasNext()) {
            String strE = ((i) it.next()).e();
            if (strE != null && !strE.isEmpty()) {
                return strE;
            }
        }
        return null;
    }

    public final boolean g(int i) {
        return (AbstractC1331a.i(i) & this.c) != 0;
    }

    public final i h(float[] fArr, boolean z4) {
        float f = fArr[3];
        boolean z5 = false;
        float f3 = fArr[0] / f;
        float f7 = fArr[1] / f;
        if (f3 < this.J || f3 >= this.f17435L || f7 < this.f17434K || f7 >= this.f17436M) {
            return null;
        }
        float[] fArr2 = new float[4];
        for (i iVar : this.f17440Q) {
            if (!iVar.g(14)) {
                if (iVar.f17444U) {
                    iVar.f17444U = false;
                    if (iVar.f17445V == null) {
                        iVar.f17445V = new float[16];
                    }
                    if (!Matrix.invertM(iVar.f17445V, 0, iVar.f17437N, 0)) {
                        Arrays.fill(iVar.f17445V, 0.0f);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, iVar.f17445V, 0, fArr3, 0);
                i iVarH = iVar.h(fArr2, z4);
                if (iVarH != null) {
                    return iVarH;
                }
                fArr = fArr3;
            }
        }
        if (z4 && this.i != -1) {
            z5 = true;
        }
        if (i() || z5) {
            return this;
        }
        return null;
    }

    public final boolean i() {
        if (g(12)) {
            return false;
        }
        if (g(22)) {
            return true;
        }
        int i = this.f17451d;
        int i4 = l.f17470z;
        if ((i & (-61)) != 0 || (this.c & 10682871) != 0) {
            return true;
        }
        String str = this.f17457p;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        String str2 = this.f17459r;
        if (str2 != null && !str2.isEmpty()) {
            return true;
        }
        String str3 = this.f17465x;
        return (str3 == null || str3.isEmpty()) ? false : true;
    }

    public final void k(float[] fArr, HashSet hashSet, boolean z4) {
        hashSet.add(this);
        if (this.f17446W) {
            z4 = true;
        }
        if (z4) {
            if (this.f17447X == null) {
                this.f17447X = new float[16];
            }
            if (this.f17437N == null) {
                this.f17437N = new float[16];
            }
            Matrix.multiplyMM(this.f17447X, 0, fArr, 0, this.f17437N, 0);
            float[] fArr2 = {this.J, this.f17434K, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            j(fArr3, this.f17447X, fArr2);
            fArr2[0] = this.f17435L;
            fArr2[1] = this.f17434K;
            j(fArr4, this.f17447X, fArr2);
            fArr2[0] = this.f17435L;
            fArr2[1] = this.f17436M;
            j(fArr5, this.f17447X, fArr2);
            fArr2[0] = this.J;
            fArr2[1] = this.f17436M;
            j(fArr6, this.f17447X, fArr2);
            if (this.f17448Y == null) {
                this.f17448Y = new Rect();
            }
            this.f17448Y.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f17446W = false;
        }
        int i = -1;
        for (i iVar : this.f17439P) {
            iVar.f17425A = i;
            i = iVar.f17450b;
            iVar.k(this.f17447X, hashSet, z4);
        }
    }
}
