package com.paymaya.data.api.deserializer;

import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.ImageUrl;
import com.paymaya.domain.model.ImageUrlIOS;
import com.paymaya.domain.model.ImageUrlUnfiltered;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BillerV3ResponseDeserializer implements n {
    public static Boolean a(q qVar, String str) {
        if (!qVar.f10034a.containsKey(str)) {
            return null;
        }
        o oVarM = qVar.m(str);
        oVarM.getClass();
        if (!(oVarM instanceof r)) {
            return null;
        }
        o oVarM2 = qVar.m(str);
        oVarM2.getClass();
        if (oVarM2 instanceof p) {
            return null;
        }
        return Boolean.valueOf(qVar.m(str).c());
    }

    public static ImageUrlUnfiltered b(q qVar, String str) {
        if (!qVar.f10034a.containsKey(str)) {
            return null;
        }
        o oVarM = qVar.m(str);
        oVarM.getClass();
        if (oVarM instanceof q) {
            return (ImageUrlUnfiltered) A.f10366a.b(qVar.m(str), ImageUrlUnfiltered.class);
        }
        o oVarM2 = qVar.m(str);
        oVarM2.getClass();
        if (!(oVarM2 instanceof r)) {
            return null;
        }
        String strJ = qVar.m(str).j();
        return ImageUrlUnfiltered.sBuilder().mAndroidImageUrl(ImageUrl.sBuilder().mHdpi(strJ).mMdpi(strJ).mXhdpi(strJ).build()).mIOSImageUrl(ImageUrlIOS.sBuilder().mRetina(strJ).m3x(strJ).build()).build();
    }

    public static List c(q qVar, String str) {
        if (!qVar.f10034a.containsKey(str)) {
            return null;
        }
        o oVarM = qVar.m(str);
        oVarM.getClass();
        if (!(oVarM instanceof l)) {
            return null;
        }
        o oVarM2 = qVar.m(str);
        oVarM2.getClass();
        if (oVarM2 instanceof p) {
            return null;
        }
        return (List) A.f10366a.f(qVar.m(str).toString(), new TypeToken<List<? extends String>>() { // from class: com.paymaya.data.api.deserializer.BillerV3ResponseDeserializer$jsonGetStringListOrNull$1
        }.getType());
    }

    public static String d(q qVar, String str) {
        if (!qVar.f10034a.containsKey(str)) {
            return null;
        }
        o oVarM = qVar.m(str);
        oVarM.getClass();
        if (!(oVarM instanceof r)) {
            return null;
        }
        o oVarM2 = qVar.m(str);
        oVarM2.getClass();
        if (oVarM2 instanceof p) {
            return null;
        }
        return qVar.m(str).j();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0232 A[SYNTHETIC] */
    @Override // com.google.gson.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deserialize(com.google.gson.o r22, java.lang.reflect.Type r23, com.google.gson.m r24) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.data.api.deserializer.BillerV3ResponseDeserializer.deserialize(com.google.gson.o, java.lang.reflect.Type, com.google.gson.m):java.lang.Object");
    }
}
