package com.shield.android.f;

import android.content.SharedPreferences;
import cj.C1110A;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.ShieldCallback;
import com.shield.android.e.i;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15306d = {1577738324, 304404680, 1583707144, 124245708};
    private final com.shield.android.e.e it;
    private final com.shield.android.e.i iu;
    private final SharedPreferences iv;

    public d(com.shield.android.e.e eVar, com.shield.android.e.i iVar, SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.j.g(eVar, f("璳璤璔璹璿璶璺璵璓璹璫璊璸璫環"));
        kotlin.jvm.internal.j.g(iVar, f("璻璱璣璂環璣璸璃璨璹璪璻"));
        this.it = eVar;
        this.iu = iVar;
        this.iv = sharedPreferences;
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15306d[0]) ^ 1577738324;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15306d;
            long j = jArr[1];
            long j6 = jArr[2];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 304393245) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 304393245)) + (((int) j6) ^ 1583707145), (~(((int) j) ^ 304393245)) | i4, i6, (((((int) j) ^ 304393245) + cCharAt) + (((int) j6) ^ 1583707145)) + ((~(((int) j) ^ 304393245)) | i4)) ^ (i % (((int) jArr[3]) ^ 124201267))));
            long j7 = f15306d[2];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1583707145) + (((int) j7) ^ 1583707145) + ((~(((int) j7) ^ 1583707145)) | i10) + (((((int) j7) ^ 1583707145) + i) - ((((((int) j7) ^ 1583707145) + i) + (((int) j7) ^ 1583707145)) + ((~(((int) j7) ^ 1583707145)) | i10)));
        }
        return sb2.toString();
    }

    @Override // com.shield.android.f.b
    public final void a(ShieldCallback<com.shield.android.internal.c> shieldCallback) {
        kotlin.jvm.internal.j.g(shieldCallback, f("璶璵璻璺璳璱環璹"));
        this.iu.a(this.it, new m(1, this, shieldCallback));
    }

    @Override // com.shield.android.f.b
    public final void ce() {
        SharedPreferences sharedPreferences = this.iv;
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove(f("環璺璴璆璝"));
            editorEdit.remove(f("璦璱璣璢璸璾璴璡璋璹璭璭環璷璵"));
            editorEdit.remove(f("璳璤璖璸環璼璪璦璴璿璬"));
            editorEdit.remove(f("璱璽璤璷璳璼璶璓璨璨環璘璩"));
            editorEdit.remove(f("璳璤璄璳璥璤璺璼璺璟璾璽璱璽"));
            editorEdit.remove(f("璳璤璔璹璿璶璺璵璉璵璲璻璪璬璺璷璵璏璢璿"));
            editorEdit.remove(f("璱璽璤璷璳璼璶璶璐璳璻璫璵璽璨"));
            editorEdit.remove(f("璻璠璒璸環璲璿璷璹"));
            editorEdit.remove(f("璹璻璴璷璥璹璼璼璉璮璾璽璲璱璵璽璑璭璪璣璮璵璷"));
            editorEdit.remove(f("璹璻璴璷璥璹璼璼璞璳璳璲璼璻璯璳璪璪璎璨璵璥璱璴璬璠"));
            editorEdit.remove(f("璹璻璴璷璥璹璼璼璞璳璳璲璼璻璯璳璪璪璒璔璍"));
            editorEdit.remove(f("璱璽璤璷璳璼璶璓璭璵璜璱璬璶璯"));
            editorEdit.remove(f("環璺璶璴璽璵璷璔璸璽璫璫璫璽璨"));
            editorEdit.remove(f("璱璽璤璷璳璼璶璶璍璹璭璳環璫璨璳璪璪璴"));
            editorEdit.remove(f("環璺璶璴璽璵璀璦璲璬"));
            editorEdit.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(d dVar, ShieldCallback shieldCallback, i.a aVar) {
        kotlin.jvm.internal.j.g(dVar, f("璡璼璾璥瓵瓠"));
        kotlin.jvm.internal.j.g(shieldCallback, f("瓱璷璶璺璽璲璲璱璶"));
        kotlin.jvm.internal.j.g(aVar, f("璦璠璶璢璴"));
        com.shield.android.k.a.dL().a(f("璲璱璣璢璸璾璴瓲璾璳璱璸環璿璨瓺璣璶璨璫瓡璮璦璶瓭璸璮璽璢"), new Object[((int) f15306d[0]) ^ 1577738324]);
        try {
            if (aVar == i.a.hB) {
                com.shield.android.k.a.dL().a(f("璲璱璣璢璸璾璴瓲璾璳璱璸環璿璨瓺璣璶璨璫瓡璮璦璶瓭璸璮璽璢瓨璭璣璛璇璞璞璔璔"), new Object[((int) f15306d[0]) ^ 1577738324]);
                com.shield.android.internal.c cVarCb = dVar.it.cb();
                SharedPreferences sharedPreferences = dVar.iv;
                if (sharedPreferences != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putBoolean(f("環璺璴璆璝"), cVarCb.br());
                    editorEdit.putInt(f("璦璱璣璢璸璾璴璡璋璹璭璭環璷璵"), cVarCb.getVersion());
                    editorEdit.putBoolean(f("璳璤璖璸環璼璪璦璴璿璬"), cVarCb.bs());
                    editorEdit.putBoolean(f("璱璽璤璷璳璼璶璓璨璨環璘璩"), cVarCb.bt());
                    editorEdit.putLong(f("璳璤璔璹璿璶璺璵璉璵璲璻璪璬璺璷璵璏璢璿"), cVarCb.bv());
                    editorEdit.putInt(f("璳璤璄璳璥璤璺璼璺璟璾璽璱璽"), cVarCb.bu());
                    editorEdit.putStringSet(f("璱璽璤璷璳璼璶璶璐璳璻璫璵璽璨"), C1110A.Z(cVarCb.bw()));
                    editorEdit.putBoolean(f("璻璠璒璸環璲璿璷璹"), cVarCb.bx());
                    editorEdit.putInt(f("璹璻璴璷璥璹璼璼璉璮璾璽璲璱璵璽璑璭璪璣璮璵璷"), cVarCb.bz());
                    editorEdit.putInt(f("璹璻璴璷璥璹璼璼璞璳璳璲璼璻璯璳璪璪璎璨璵璥璱璴璬璠"), cVarCb.by());
                    editorEdit.putString(f("璹璻璴璷璥璹璼璼璞璳璳璲璼璻璯璳璪璪璒璔璍"), cVarCb.bA());
                    editorEdit.putBoolean(f("璱璽璤璷璳璼璶璓璭璵璜璱璬璶璯"), cVarCb.bB());
                    editorEdit.putStringSet(f("環璺璶璴璽璵璷璔璸璽璫璫璫璽璨"), C1110A.Z(cVarCb.bC()));
                    editorEdit.putStringSet(f("璱璽璤璷璳璼璶璶璍璹璭璳環璫璨璳璪璪璴"), C1110A.Z(cVarCb.bD()));
                    editorEdit.putBoolean(f("環璺璶璴璽璵璀璦璲璬"), cVarCb.bE());
                    editorEdit.putBoolean(f("璶璻璻璺璴璳璧璛璳璬璪璪璊璷璮璨璦璡璁璣璠璴璶環璨"), cVarCb.bF());
                    editorEdit.apply();
                }
                if (dVar.it.ca() != null) {
                    com.shield.android.k.a.dL().a(dVar.it.ca());
                }
                shieldCallback.onSuccess(cVarCb);
            }
        } catch (Throwable th2) {
            com.shield.android.k.a.dL().a(th2);
            shieldCallback.onSuccess(dVar.it.cb());
        }
    }
}
