package com.shield.android.e;

import cj.C1110A;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.ShieldException;
import com.shield.android.e.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15252d = {2117534337, 1833063673, 447820695, 243782357, 1502371902, 514566870, 1679682126};

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private String f15253bf;
    private ShieldException bp;
    private HashMap<String, String> gT;
    private String gl;

    /* JADX INFO: renamed from: hf, reason: collision with root package name */
    private final String f15254hf;

    /* JADX INFO: renamed from: hg, reason: collision with root package name */
    private final String f15255hg;

    /* JADX INFO: renamed from: hh, reason: collision with root package name */
    private final String f15256hh;

    /* JADX INFO: renamed from: hi, reason: collision with root package name */
    private final String f15257hi;

    /* JADX INFO: renamed from: hj, reason: collision with root package name */
    private com.shield.android.internal.c f15258hj;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15259d = {2025071124, 248721755, 393452952};

        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    static {
        new a((((int) 2117534337) ^ 2117534337) == true ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(String str, String str2, String str3, String str4) {
        kotlin.jvm.internal.j.g(str, f("̴̡̺̤̟̳"));
        kotlin.jvm.internal.j.g(str2, f("̶̡̳̣̳̣̟̰̣"));
        kotlin.jvm.internal.j.g(str3, f("̶̸̡̢̣̺̜̿̾"));
        kotlin.jvm.internal.j.g(str4, f("̴̸̱̹̣̝̱̿"));
        this.f15254hf = str;
        this.f15255hg = str2;
        this.f15256hh = str3;
        this.f15257hi = str4;
        this.gl = f("");
        this.f15253bf = f("");
        long[] jArr = f15252d;
        long j = jArr[0];
        this.f15258hj = new com.shield.android.internal.c(((int) j) ^ 2117534337, ((int) j) ^ 2117534337, ((int) j) ^ 2117534337, ((int) j) ^ 2117534337, ((int) j) ^ 2117534337, 0L, null, ((int) j) ^ 2117534337, ((int) j) ^ 2117534337, ((int) j) ^ 2117534337, null, ((int) j) ^ 2117534337, null, null, ((int) j) ^ 2117534337, ((int) j) ^ 2117534337, ((int) jArr[1]) ^ 1833085702);
        this.gT = new HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List<String> a(JSONObject jSONObject, String str, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            long[] jArr = f15252d;
            if (z.n(next, ((int) jArr[3]) ^ 243782359, str, ((int) jArr[0]) ^ 2117534337) && jSONObject.optInt(next, ((int) f15252d[0]) ^ 2117534337) == (((int) f15252d[2]) ^ 447820694)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15252d[0]) ^ 2117534337;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15252d;
            long j = jArr[6];
            long j6 = jArr[2];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 1679681820) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 1679681820)) + (((int) j6) ^ 447820694), (~(((int) j) ^ 1679681820)) | i4, i6, (((((int) j) ^ 1679681820) + cCharAt) + (((int) j6) ^ 447820694)) + ((~(((int) j) ^ 1679681820)) | i4)) ^ (i % (((int) jArr[1]) ^ 1833085702))));
            long j7 = f15252d[2];
            int i10 = ~i;
            i = i + (((int) j7) ^ 447820694) + (((int) j7) ^ 447820694) + ((~(((int) j7) ^ 447820694)) | i10) + (((((int) j7) ^ 447820694) + i) - ((((((int) j7) ^ 447820694) + i) + (((int) j7) ^ 447820694)) + ((~(((int) j7) ^ 447820694)) | i10)));
        }
        return sb2.toString();
    }

    @Override // com.shield.android.e.g
    public final String ag() {
        return this.f15254hf;
    }

    @Override // com.shield.android.e.g
    public final String bG() {
        return f("ͽ̸̸̠̳̻̰\u0378̼̫ͷ̯ͯͰ̴̡̨̱̲̠̪̬̤̮̪̼̬̣̣̗ͩͨͣ̔̂̚");
    }

    @Override // com.shield.android.e.g
    public final HashMap<String, String> bV() {
        this.gT.putAll(g.c(this.f15254hf, this.f15256hh));
        return this.gT;
    }

    @Override // com.shield.android.e.g
    public final String bW() {
        return this.gl;
    }

    @Override // com.shield.android.e.g
    public final g.a bX() {
        return g.a.hm;
    }

    @Override // com.shield.android.e.g
    public final g.b bY() {
        return null;
    }

    @Override // com.shield.android.e.g
    public final Map<String, Object> bZ() {
        return null;
    }

    @Override // com.shield.android.e.g
    public final void c(ShieldException shieldException) {
        ShieldException.Kind kind;
        if (shieldException != null) {
            try {
                kind = shieldException.kind;
            } catch (Exception unused) {
                return;
            }
        } else {
            kind = null;
        }
        if (kind == ShieldException.Kind.HTTP) {
            com.shield.android.k.a aVarDL = com.shield.android.k.a.dL();
            String strF = f("ͷ̠ͰͼͶͲ̧");
            long[] jArr = f15252d;
            Object[] objArr = new Object[((int) jArr[3]) ^ 243782359];
            objArr[2117534337 ^ ((int) jArr[0])] = shieldException.message;
            objArr[((int) jArr[2]) ^ 447820694] = shieldException.body;
            aVarDL.a(shieldException, strF, objArr);
        } else {
            com.shield.android.k.a.dL().a(shieldException, shieldException != null ? shieldException.message : null, new Object[((int) f15252d[0]) ^ 2117534337]);
        }
        this.bp = shieldException;
    }

    public final ShieldException ca() {
        return this.bp;
    }

    public final com.shield.android.internal.c cb() {
        return this.f15258hj;
    }

    @Override // com.shield.android.e.g
    public final String getVersion() {
        return this.f15253bf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.shield.android.e.g
    public final void r(String str) {
        int i;
        char c;
        int i4;
        String str2;
        int i6;
        String str3;
        String str4;
        try {
            com.shield.android.k.a.dL().a(f("̔̃Ͱ̲̹̹̲̼̽ͻ̵̨̪̼̭̯̳̳̱̦ͧ͠") + str, new Object[((int) f15252d[0]) ^ 2117534337]);
            this.f15258hj.a(System.currentTimeMillis());
            this.bp = null;
            JSONObject jSONObject = str != null ? new JSONObject(str) : null;
            if (jSONObject != null) {
                boolean zHas = jSONObject.has(f("̷̱̳̺̲̰̽"));
                long[] jArr = f15252d;
                i = 2117534337;
                c = 2;
                i6 = ((int) jArr[2]) ^ 447820694;
                if (zHas != i6) {
                    i6 = ((int) jArr[0]) ^ 2117534337;
                }
                i4 = 447820694;
                str2 = "̛̛̛̞̜̞̖̜̓̐̂̅̒̍̍̊̎";
            } else {
                i = 2117534337;
                c = 2;
                i4 = 447820694;
                str2 = "̛̛̛̞̜̞̖̜̓̐̂̅̒̍̍̊̎";
                i6 = ((int) f15252d[0]) ^ 2117534337;
            }
            if (i6 != 0) {
                Object obj = jSONObject.get(f("̷̱̳̺̲̰̽"));
                kotlin.jvm.internal.j.e(obj, f("̼̦̼̽Ͷ̴̵̴̴̻̬\u0379̼̺ͼ̴̨̧̛̣̰̲̫̥̥̻̣̠͖̜̖̖̼̾ͤͥͭ̆̊̀̔́̒͗̐̓̑̇̂̎͡"));
                if (!((Boolean) obj).booleanValue()) {
                    this.f15258hj.g(((int) f15252d[c]) ^ i4);
                    this.f15258hj.b(-1);
                    this.f15258hj.h(((int) f15252d[0]) ^ i);
                    this.f15258hj.i(((int) f15252d[0]) ^ i);
                    this.f15258hj.c(((int) f15252d[4]) ^ 1502147550);
                    com.shield.android.internal.c cVar = this.f15258hj;
                    C1112C c1112c = C1112C.f9377a;
                    cVar.b(c1112c);
                    this.f15258hj.j(((int) f15252d[0]) ^ i);
                    this.f15258hj.e(((int) f15252d[5]) ^ 514539702);
                    this.f15258hj.d(10000);
                    this.f15258hj.k(f(""));
                    this.f15258hj.k(((int) f15252d[0]) ^ i);
                    this.f15258hj.c(c1112c);
                    this.f15258hj.d(c1112c);
                    return;
                }
                if (jSONObject.has(f("̶̸̢̢̤̺̿"))) {
                    Object obj2 = jSONObject.get(f("̶̸̢̢̤̺̿"));
                    com.shield.android.internal.c cVar2 = this.f15258hj;
                    kotlin.jvm.internal.j.e(obj2, f("̼̦̼̽Ͷ̴̵̴̴̻̬\u0379̼̺ͼ̴̨̧̛̣̰̲̫̥̥̻̣̠͖̜̖̖̭̾ͤͥͭ̆̊̀̔́̒͗̋̎̔̌̄͡"));
                    cVar2.b(Integer.parseInt((String) obj2));
                }
                if (jSONObject.has(f("̶̡̤̥̹̳̦̿"))) {
                    Object obj3 = jSONObject.get(f("̶̡̤̥̹̳̦̿"));
                    kotlin.jvm.internal.j.e(obj3, f("̼̦̼̽Ͷ̴̵̴̴̻̬\u0379̼̺ͼ̴̶̨̧̣̰̲̫̥̥̻̣̠͖̘͔̖̮̭̭̯̾ͤͥͭ̆̊̀̔̆̒̑̋̐͑̃̌̂̇̑͡"));
                    JSONObject jSONObject2 = (JSONObject) obj3;
                    if (jSONObject2.has(f("̗̝̞̘̜̓̃̏̇̀̐̄̈̇̓̓̆"))) {
                        com.shield.android.internal.c cVar3 = this.f15258hj;
                        Object obj4 = jSONObject2.get(f("̗̝̞̘̜̓̃̏̇̀̐̄̈̇̓̓̆"));
                        kotlin.jvm.internal.j.e(obj4, f("̼̦̼̽Ͷ̴̵̴̴̻̬\u0379̼̺ͼ̴̷̨̧̛̣̰̲̫̥̥̻̣̠͖̜̖̖̾ͤͥͭ̆̊̀̔́̒͗̑̈͡"));
                        int iIntValue = ((Integer) obj4).intValue();
                        long[] jArr2 = f15252d;
                        str3 = "̼̦̼̽Ͷ̴̵̴̴̻̬\u0379̼̺ͼ̴̷̨̧̛̣̰̲̫̥̥̻̣̠͖̜̖̖̾ͤͥͭ̆̊̀̔́̒͗̑̈͡";
                        str4 = "̛̛̛̞̜̞̓̐̂̅̏̑̔̐̉̉";
                        int i10 = ((int) jArr2[c]) ^ i4;
                        cVar3.g(iIntValue == i10 ? i10 : ((int) jArr2[0]) ^ i);
                    } else {
                        str3 = "̼̦̼̽Ͷ̴̵̴̴̻̬\u0379̼̺ͼ̴̷̨̧̛̣̰̲̫̥̥̻̣̠͖̜̖̖̾ͤͥͭ̆̊̀̔́̒͗̑̈͡";
                        str4 = "̛̛̛̞̜̞̓̐̂̅̏̑̔̐̉̉";
                        this.bp = ShieldException.unexpectedError(new Throwable(f("̼̼Ͱ̴̸̴̦̬̪̯̽̽;̵̶̸̧̼̳̳̤̪̣̪͡")));
                    }
                    if (jSONObject2.has(f("̛̘̖̘̔̃̏̐̌̎̒̊"))) {
                        com.shield.android.internal.c cVar4 = this.f15258hj;
                        Object obj5 = jSONObject2.get(f("̛̘̖̘̔̃̏̐̌̎̒̊"));
                        kotlin.jvm.internal.j.e(obj5, f(str3));
                        int iIntValue2 = ((Integer) obj5).intValue();
                        long[] jArr3 = f15252d;
                        int i11 = ((int) jArr3[c]) ^ i4;
                        cVar4.h(iIntValue2 == i11 ? i11 : ((int) jArr3[0]) ^ i);
                    }
                    if (jSONObject2.has(f("̟̗̖̞̘̔̃̏̄̇̋̋̓̕̕"))) {
                        com.shield.android.internal.c cVar5 = this.f15258hj;
                        Object obj6 = jSONObject2.get(f("̟̗̖̞̘̔̃̏̄̇̋̋̓̕̕"));
                        kotlin.jvm.internal.j.e(obj6, f(str3));
                        int iIntValue3 = ((Integer) obj6).intValue();
                        long[] jArr4 = f15252d;
                        int i12 = ((int) jArr4[c]) ^ i4;
                        cVar5.i(iIntValue3 == i12 ? i12 : ((int) jArr4[0]) ^ i);
                    }
                    if (jSONObject2.has(f("̜̜̟̜̘̔̃̏̂̓̃̀̔̇̔̚"))) {
                        com.shield.android.internal.c cVar6 = this.f15258hj;
                        Object obj7 = jSONObject2.get(f("̜̜̟̜̘̔̃̏̂̓̃̀̔̇̔̚"));
                        kotlin.jvm.internal.j.e(obj7, f(str3));
                        cVar6.c(((Integer) obj7).intValue() * 1000);
                    }
                    if (jSONObject2.has(f("̜̘̖̖̙̟̟̇̏̔"))) {
                        com.shield.android.internal.c cVar7 = this.f15258hj;
                        Object obj8 = jSONObject2.get(f("̜̘̖̖̙̟̟̇̏̔"));
                        kotlin.jvm.internal.j.e(obj8, f(str3));
                        int iIntValue4 = ((Integer) obj8).intValue();
                        long[] jArr5 = f15252d;
                        int i13 = ((int) jArr5[c]) ^ i4;
                        cVar7.j(iIntValue4 == i13 ? i13 : ((int) jArr5[0]) ^ i);
                    }
                    if (jSONObject2.has(f(str4))) {
                        com.shield.android.internal.c cVar8 = this.f15258hj;
                        Object obj9 = jSONObject2.get(f(str4));
                        kotlin.jvm.internal.j.e(obj9, f(str3));
                        cVar8.e(((Integer) obj9).intValue());
                    }
                    if (jSONObject2.has(f(str2))) {
                        com.shield.android.internal.c cVar9 = this.f15258hj;
                        Object obj10 = jSONObject2.get(f(str2));
                        kotlin.jvm.internal.j.e(obj10, f(str3));
                        cVar9.d(((Integer) obj10).intValue());
                    }
                    if (jSONObject2.has(f("̛̖̟̗̘̘̃̐̔̑̊̉̓̆̑̈̎̏̉̆̃̉̇̀̊̀̚̕"))) {
                        com.shield.android.internal.c cVar10 = this.f15258hj;
                        Object obj11 = jSONObject2.get(f("̛̖̟̗̘̘̃̐̔̑̊̉̓̆̑̈̎̏̉̆̃̉̇̀̊̀̚̕"));
                        kotlin.jvm.internal.j.e(obj11, f(str3));
                        int iIntValue5 = ((Integer) obj11).intValue();
                        long[] jArr6 = f15252d;
                        int i14 = ((int) jArr6[c]) ^ i4;
                        cVar10.k(iIntValue5 == i14 ? i14 : ((int) jArr6[0]) ^ i);
                    }
                    if (jSONObject2.has(f("̗̝̑̓̒̋̆̎̔̈̚"))) {
                        com.shield.android.internal.c cVar11 = this.f15258hj;
                        int iOptInt = jSONObject2.optInt(f("̗̝̑̓̒̋̆̎̔̈̚"), ((int) f15252d[c]) ^ i4);
                        long[] jArr7 = f15252d;
                        int i15 = ((int) jArr7[c]) ^ i4;
                        cVar11.l(iOptInt == i15 ? i15 : ((int) jArr7[0]) ^ i);
                    }
                    if (jSONObject2.has(f("̶̱̹̤̦̌̿̉"))) {
                        com.shield.android.internal.c cVar12 = this.f15258hj;
                        int iOptInt2 = ((JSONObject) obj3).optInt(f("̶̱̹̤̦̌̿̉"), ((int) f15252d[0]) ^ i);
                        long[] jArr8 = f15252d;
                        int i16 = ((int) jArr8[c]) ^ i4;
                        cVar12.m(iOptInt2 == i16 ? i16 : ((int) jArr8[0]) ^ i);
                    }
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strF = f("̛̞̟̍̃̑̕");
                        long[] jArr9 = f15252d;
                        if (z.n(next, ((int) jArr9[3]) ^ 243782359, strF, ((int) jArr9[0]) ^ i) && jSONObject2.getInt(next) == 0) {
                            com.shield.android.internal.c cVar13 = this.f15258hj;
                            cVar13.b(C1110A.M(next, cVar13.bw()));
                        }
                    }
                    this.f15258hj.c(a(jSONObject2, f("̍̐̂̂̆̐̕̕"), ((int) f15252d[c]) ^ i4));
                    this.f15258hj.d(a(jSONObject2, f("̛̞̖̍̃̃̇̆̓̔̕"), ((int) f15252d[c]) ^ i4));
                }
                if (jSONObject.has(f("̵̢̼̳̰̻̻̮̪̾̾̅"))) {
                    this.f15258hj.k(jSONObject.get(f("̵̢̼̳̰̻̻̮̪̾̾̅")).toString());
                }
            }
        } catch (Throwable th2) {
            this.bp = ShieldException.unexpectedError(th2);
            com.shield.android.k.a.dL().a(th2);
        }
    }

    public final void v(String str) {
        if (str == null) {
            str = f("");
        }
        this.gl = str;
    }

    public final void w(String str) {
        if (str == null) {
            str = f("");
        }
        this.f15253bf = str;
    }
}
