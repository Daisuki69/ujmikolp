package sd;

import Ah.p;
import com.paymaya.domain.model.EDDFinancialDocument;
import com.paymaya.domain.model.FileUploadResponse;
import com.paymaya.domain.store.S;
import dOYHB6.tiZVw8.numX49;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import zj.C2576A;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lb.a f20042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EDDFinancialDocument f20043b;
    public final /* synthetic */ ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f20044d;

    public f(Lb.a aVar, EDDFinancialDocument eDDFinancialDocument, ArrayList arrayList, Integer num) {
        this.f20042a = aVar;
        this.f20043b = eDDFinancialDocument;
        this.c = arrayList;
        this.f20044d = num;
    }

    @Override // Ch.f
    public final Object apply(Object obj) throws FileNotFoundException {
        byte[] bArr;
        FileUploadResponse fileUploadResponse = (FileUploadResponse) obj;
        j.g(fileUploadResponse, numX49.tnTj78("bFGPu"));
        EDDFinancialDocument eDDFinancialDocument = this.f20043b;
        String fileUrl = eDDFinancialDocument.getFileUrl();
        Lb.a aVar = this.f20042a;
        if (fileUrl != null) {
            try {
            } catch (Exception unused) {
                yk.a.b();
                bArr = null;
            }
            if (C2576A.H(fileUrl)) {
                bArr = null;
            } else {
                File file = new File(fileUrl);
                byte[] bArr2 = new byte[(int) file.length()];
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    if (fileInputStream.read(bArr2) != file.length()) {
                        bArr2 = null;
                    }
                    fileInputStream.close();
                    bArr = bArr2;
                } finally {
                }
            }
        } else {
            bArr = null;
        }
        if (bArr == null) {
            throw new FileNotFoundException();
        }
        RequestBody.Companion companion = RequestBody.Companion;
        MediaType.Companion companion2 = MediaType.Companion;
        String strTnTj78 = numX49.tnTj78("bFGPV");
        RequestBody requestBodyCreate$default = RequestBody.Companion.create$default(companion, companion2.get(strTnTj78), bArr, 0, 0, 12, (Object) null);
        eDDFinancialDocument.setUrl(fileUploadResponse.mUrl());
        Integer num = this.f20044d;
        j.d(num);
        this.c.set(num.intValue(), eDDFinancialDocument);
        p<ResponseBody> pVarUpload = ((S) aVar.f2942g).f11386a.upload(fileUploadResponse.mUploadUrl(), strTnTj78, numX49.tnTj78("bFGPS"), requestBodyCreate$default);
        o6.f fVar = new o6.f(eDDFinancialDocument, 8);
        pVarUpload.getClass();
        return new Lh.f(pVarUpload, fVar, 0);
    }
}
