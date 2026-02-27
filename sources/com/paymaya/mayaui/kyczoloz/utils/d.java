package com.paymaya.mayaui.kyczoloz.utils;

import com.paymaya.mayaui.kyczoloz.utils.KycMinorDocument;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static String a(File file, KycMinorDocument kycMinorDocument) {
        String path = file.getPath();
        String str = File.separator;
        return path + str + "zolozkyc" + str + kycMinorDocument.f12431a + ".jpg";
    }

    public static void b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file = null;
        }
        if (file != null) {
            file.delete();
        }
    }

    public static void c(File file) {
        b(a(file, KycMinorDocument.BirthCertificateKycDocument.f12432b));
        b(a(file, KycMinorDocument.ParentIdKycDocument.f12434b));
        b(a(file, KycMinorDocument.ConsentFormKycDocument.f12433b));
    }
}
