package com.shield.android.f;

import android.content.SharedPreferences;
import cj.C1110A;
import cj.C1114E;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.ShieldCallback;
import com.shield.android.ShieldException;
import dOYHB6.yFtIp6.svM7M6;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15305d = {2136054399, 1576724382, 1338985524, 1204798580};
    private final SharedPreferences is;

    public a(SharedPreferences sharedPreferences) {
        this.is = sharedPreferences;
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15305d[0]) ^ 2136054399;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15305d;
            long j = jArr[2];
            long j6 = jArr[3];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 1338986827) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 1338986827) + (((int) j6) ^ 1204798581), i4 | (~(((int) j) ^ 1338986827)), i6, (((int) j) ^ 1338986827) + cCharAt + (((int) j6) ^ 1204798581) + ((~(((int) j) ^ 1338986827)) | i4)));
            long j7 = f15305d[3];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1204798581) + (((int) j7) ^ 1204798581) + ((~(((int) j7) ^ 1204798581)) | i10) + (((((int) j7) ^ 1204798581) + i) - ((((((int) j7) ^ 1204798581) + i) + (((int) j7) ^ 1204798581)) + ((~(((int) j7) ^ 1204798581)) | i10)));
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.shield.android.f.b
    public final void a(ShieldCallback<com.shield.android.internal.c> shieldCallback) {
        com.shield.android.internal.c cVar;
        List<String> listBw;
        List<String> listBC;
        List<String> listBD;
        kotlin.jvm.internal.j.g(shieldCallback, g("ᴜᴞᴓᴓᴝᴞᴜᴔ"));
        try {
            long[] jArr = f15305d;
            long j = jArr[0];
            cVar = new com.shield.android.internal.c(((int) j) ^ 2136054399, ((int) j) ^ 2136054399, ((int) j) ^ 2136054399, ((int) j) ^ 2136054399, ((int) j) ^ 2136054399, 0L, null, ((int) j) ^ 2136054399, ((int) j) ^ 2136054399, ((int) j) ^ 2136054399, null, ((int) j) ^ 2136054399, null, null, ((int) j) ^ 2136054399, ((int) j) ^ 2136054399, ((int) jArr[1]) ^ 1576671329);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            SharedPreferences sharedPreferences = this.is;
            if (sharedPreferences != null) {
                cVar.g(sharedPreferences.getBoolean(g("ᴚᴑᴜᴯᴳ"), cVar.br()));
                cVar.h(sharedPreferences.getBoolean(g("ᴙᴏᴾᴑᴞᴓᴆᴋᴖᴜᴌ"), cVar.bs()));
                cVar.i(sharedPreferences.getBoolean(g("ᴛᴖᴌᴞᴝᴓᴚᴾᴊᴋᴐᴹᴏ"), cVar.bt()));
                cVar.b(sharedPreferences.getInt(g("ᴌᴚᴋᴋᴖᴑᴘᴌᴩᴚᴍᴌᴖᴐᴑ"), cVar.getVersion()));
                cVar.c(sharedPreferences.getInt(g("ᴙᴏᴬᴚᴋᴋᴖᴑᴘᴼᴞᴜᴗᴚ"), cVar.bu()));
                cVar.a(sharedPreferences.getLong(g("ᴙᴏᴼᴐᴑᴙᴖᴘᴫᴖᴒᴚᴌᴋᴞᴒᴏᴴᴚᴆ"), cVar.bv()));
                String strG = g("ᴛᴖᴌᴞᴝᴓᴚᴛᴲᴐᴛᴊᴓᴚᴌ");
                C1114E c1114e = C1114E.f9379a;
                Set<String> stringSet = sharedPreferences.getStringSet(strG, c1114e);
                if (stringSet == null || (listBw = C1110A.V(stringSet)) == null) {
                    listBw = cVar.bw();
                }
                cVar.b(listBw);
                cVar.j(sharedPreferences.getBoolean(g("ᴑᴋᴺᴑᴞᴝᴓᴚᴛ"), cVar.bx()));
                cVar.e(sharedPreferences.getInt(g("ᴓᴐᴜᴞᴋᴖᴐᴑᴫᴍᴞᴜᴔᴖᴑᴘᴫᴖᴒᴚᴐᴊᴋ"), cVar.bz()));
                cVar.d(sharedPreferences.getInt(g("ᴓᴐᴜᴞᴋᴖᴐᴑᴼᴐᴓᴓᴚᴜᴋᴖᴐᴑᴶᴑᴋᴚᴍᴉᴞᴓ"), cVar.by()));
                String string = svM7M6.getString(sharedPreferences, g("ᴓᴐᴜᴞᴋᴖᴐᴑᴼᴐᴓᴓᴚᴜᴋᴖᴐᴑᴪᴭᴳ"), cVar.bA());
                if (string == null) {
                    string = cVar.bA();
                }
                cVar.k(string);
                cVar.k(sharedPreferences.getBoolean(g("ᴛᴖᴌᴞᴝᴓᴚᴾᴏᴖᴼᴐᴊᴑᴋ"), cVar.bB()));
                Set<String> stringSet2 = sharedPreferences.getStringSet(g("ᴚᴑᴞᴝᴓᴚᴛᴹᴚᴞᴋᴊᴍᴚᴌ"), c1114e);
                if (stringSet2 == null || (listBC = C1110A.V(stringSet2)) == null) {
                    listBC = cVar.bC();
                }
                cVar.c(listBC);
                Set<String> stringSet3 = sharedPreferences.getStringSet(g("ᴛᴖᴌᴞᴝᴓᴚᴛᴯᴚᴍᴒᴖᴌᴌᴖᴐᴑᴌ"), c1114e);
                if (stringSet3 == null || (listBD = C1110A.V(stringSet3)) == null) {
                    listBD = cVar.bD();
                }
                cVar.d(listBD);
                cVar.l(sharedPreferences.getBoolean(g("ᴚᴑᴞᴝᴓᴚᴬᴋᴐᴏ"), cVar.bE()));
                cVar.m(sharedPreferences.getBoolean(g("ᴜᴐᴓᴓᴚᴜᴋᴶᴑᴏᴊᴋᴬᴐᴊᴍᴜᴚᴹᴚᴞᴋᴊᴍᴚ"), cVar.bF()));
            }
            shieldCallback.onSuccess(cVar);
        } catch (Throwable th3) {
            th = th3;
            shieldCallback.onFailure(ShieldException.unexpectedError(th));
        }
    }

    @Override // com.shield.android.f.b
    public final void ce() {
        SharedPreferences sharedPreferences = this.is;
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove(g("ᴚᴑᴜᴯᴳ"));
            editorEdit.remove(g("ᴌᴚᴋᴋᴖᴑᴘᴌᴩᴚᴍᴌᴖᴐᴑ"));
            editorEdit.remove(g("ᴙᴏᴾᴑᴞᴓᴆᴋᴖᴜᴌ"));
            editorEdit.remove(g("ᴛᴖᴌᴞᴝᴓᴚᴾᴊᴋᴐᴹᴏ"));
            editorEdit.remove(g("ᴙᴏᴬᴚᴋᴋᴖᴑᴘᴼᴞᴜᴗᴚ"));
            editorEdit.remove(g("ᴙᴏᴼᴐᴑᴙᴖᴘᴫᴖᴒᴚᴌᴋᴞᴒᴏᴴᴚᴆ"));
            editorEdit.remove(g("ᴛᴖᴌᴞᴝᴓᴚᴛᴲᴐᴛᴊᴓᴚᴌ"));
            editorEdit.remove(g("ᴑᴋᴺᴑᴞᴝᴓᴚᴛ"));
            editorEdit.remove(g("ᴓᴐᴜᴞᴋᴖᴐᴑᴫᴍᴞᴜᴔᴖᴑᴘᴫᴖᴒᴚᴐᴊᴋ"));
            editorEdit.remove(g("ᴓᴐᴜᴞᴋᴖᴐᴑᴼᴐᴓᴓᴚᴜᴋᴖᴐᴑᴶᴑᴋᴚᴍᴉᴞᴓ"));
            editorEdit.remove(g("ᴓᴐᴜᴞᴋᴖᴐᴑᴼᴐᴓᴓᴚᴜᴋᴖᴐᴑᴪᴭᴳ"));
            editorEdit.remove(g("ᴛᴖᴌᴞᴝᴓᴚᴾᴏᴖᴼᴐᴊᴑᴋ"));
            editorEdit.remove(g("ᴚᴑᴞᴝᴓᴚᴛᴹᴚᴞᴋᴊᴍᴚᴌ"));
            editorEdit.remove(g("ᴛᴖᴌᴞᴝᴓᴚᴛᴯᴚᴍᴒᴖᴌᴌᴖᴐᴑᴌ"));
            editorEdit.remove(g("ᴚᴑᴞᴝᴓᴚᴬᴋᴐᴏ"));
            editorEdit.remove(g("ᴜᴐᴓᴓᴚᴜᴋᴶᴑᴏᴊᴋᴬᴐᴊᴍᴜᴚᴹᴚᴞᴋᴊᴍᴚ"));
            editorEdit.apply();
        }
    }
}
