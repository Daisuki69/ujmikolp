package E8;

import Bj.C0165x;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1110A;
import cj.C1112C;
import com.paymaya.domain.model.KycCaptureGuide;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycDocument;
import com.paymaya.domain.model.KycDocumentTypeGuide;
import com.paymaya.domain.model.KycIdGuide;
import com.paymaya.domain.model.KycImageQualityConfidence;
import com.paymaya.domain.model.KycMatchingConfidence;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import kotlin.jvm.functions.Function0;
import oi.C1983a;
import pg.C2038a;

/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V2.c f1312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.paymaya.data.preference.a f1313b;
    public final S5.c c;
    public final InterfaceC1033d e;
    public final InterfaceC1033d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1033d f1315g;
    public final InterfaceC1033d h;
    public final InterfaceC1033d i;
    public final InterfaceC1033d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC1033d f1318n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1324t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public KycCmsContentData f1325u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final org.tensorflow.lite.a f1314d = new org.tensorflow.lite.a(26);
    public final PriorityQueue j = new PriorityQueue(12, new x(new C0165x(4), 1));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC1033d f1316k = C1034e.b(new A5.j(8));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC1033d f1317l = C1034e.b(new A5.j(9));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f1319o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f1320p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f1321q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f1322r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f1323s = "";

    public y(V2.c cVar, k kVar, com.paymaya.data.preference.a aVar, S5.c cVar2) {
        this.f1312a = cVar;
        this.f1313b = aVar;
        this.c = cVar2;
        final int i = 0;
        this.e = C1034e.b(new Function0(this) { // from class: E8.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f1309b;

            {
                this.f1309b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                y yVar = this.f1309b;
                switch (i) {
                    case 0:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_clf_20251001.tflite"), yVar.f1314d);
                    case 1:
                        return new float[][]{new float[((List) yVar.h.getValue()).size()]};
                    case 2:
                        return new float[][]{new float[((List) yVar.i.getValue()).size()]};
                    case 3:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_iqc_20250703_v1.tflite"), yVar.f1314d);
                    case 4:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_realtime_20251205_v2.tflite"), yVar.f1314d);
                    case 5:
                        try {
                            V2.c cVar3 = yVar.f1312a;
                            return V2.c.a(s.class);
                        } catch (IOException e) {
                            e.printStackTrace();
                            return C1112C.f9377a;
                        }
                    default:
                        try {
                            V2.c cVar4 = yVar.f1312a;
                            return V2.c.a(t.class);
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            return C1112C.f9377a;
                        }
                }
            }
        });
        final int i4 = 3;
        this.f = C1034e.b(new Function0(this) { // from class: E8.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f1309b;

            {
                this.f1309b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                y yVar = this.f1309b;
                switch (i4) {
                    case 0:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_clf_20251001.tflite"), yVar.f1314d);
                    case 1:
                        return new float[][]{new float[((List) yVar.h.getValue()).size()]};
                    case 2:
                        return new float[][]{new float[((List) yVar.i.getValue()).size()]};
                    case 3:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_iqc_20250703_v1.tflite"), yVar.f1314d);
                    case 4:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_realtime_20251205_v2.tflite"), yVar.f1314d);
                    case 5:
                        try {
                            V2.c cVar3 = yVar.f1312a;
                            return V2.c.a(s.class);
                        } catch (IOException e) {
                            e.printStackTrace();
                            return C1112C.f9377a;
                        }
                    default:
                        try {
                            V2.c cVar4 = yVar.f1312a;
                            return V2.c.a(t.class);
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            return C1112C.f9377a;
                        }
                }
            }
        });
        final int i6 = 4;
        this.f1315g = C1034e.b(new Function0(this) { // from class: E8.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f1309b;

            {
                this.f1309b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                y yVar = this.f1309b;
                switch (i6) {
                    case 0:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_clf_20251001.tflite"), yVar.f1314d);
                    case 1:
                        return new float[][]{new float[((List) yVar.h.getValue()).size()]};
                    case 2:
                        return new float[][]{new float[((List) yVar.i.getValue()).size()]};
                    case 3:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_iqc_20250703_v1.tflite"), yVar.f1314d);
                    case 4:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_realtime_20251205_v2.tflite"), yVar.f1314d);
                    case 5:
                        try {
                            V2.c cVar3 = yVar.f1312a;
                            return V2.c.a(s.class);
                        } catch (IOException e) {
                            e.printStackTrace();
                            return C1112C.f9377a;
                        }
                    default:
                        try {
                            V2.c cVar4 = yVar.f1312a;
                            return V2.c.a(t.class);
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            return C1112C.f9377a;
                        }
                }
            }
        });
        final int i10 = 5;
        this.h = C1034e.b(new Function0(this) { // from class: E8.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f1309b;

            {
                this.f1309b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                y yVar = this.f1309b;
                switch (i10) {
                    case 0:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_clf_20251001.tflite"), yVar.f1314d);
                    case 1:
                        return new float[][]{new float[((List) yVar.h.getValue()).size()]};
                    case 2:
                        return new float[][]{new float[((List) yVar.i.getValue()).size()]};
                    case 3:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_iqc_20250703_v1.tflite"), yVar.f1314d);
                    case 4:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_realtime_20251205_v2.tflite"), yVar.f1314d);
                    case 5:
                        try {
                            V2.c cVar3 = yVar.f1312a;
                            return V2.c.a(s.class);
                        } catch (IOException e) {
                            e.printStackTrace();
                            return C1112C.f9377a;
                        }
                    default:
                        try {
                            V2.c cVar4 = yVar.f1312a;
                            return V2.c.a(t.class);
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            return C1112C.f9377a;
                        }
                }
            }
        });
        final int i11 = 6;
        this.i = C1034e.b(new Function0(this) { // from class: E8.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f1309b;

            {
                this.f1309b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                y yVar = this.f1309b;
                switch (i11) {
                    case 0:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_clf_20251001.tflite"), yVar.f1314d);
                    case 1:
                        return new float[][]{new float[((List) yVar.h.getValue()).size()]};
                    case 2:
                        return new float[][]{new float[((List) yVar.i.getValue()).size()]};
                    case 3:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_iqc_20250703_v1.tflite"), yVar.f1314d);
                    case 4:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_realtime_20251205_v2.tflite"), yVar.f1314d);
                    case 5:
                        try {
                            V2.c cVar3 = yVar.f1312a;
                            return V2.c.a(s.class);
                        } catch (IOException e) {
                            e.printStackTrace();
                            return C1112C.f9377a;
                        }
                    default:
                        try {
                            V2.c cVar4 = yVar.f1312a;
                            return V2.c.a(t.class);
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            return C1112C.f9377a;
                        }
                }
            }
        });
        final int i12 = 1;
        this.m = C1034e.b(new Function0(this) { // from class: E8.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f1309b;

            {
                this.f1309b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                y yVar = this.f1309b;
                switch (i12) {
                    case 0:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_clf_20251001.tflite"), yVar.f1314d);
                    case 1:
                        return new float[][]{new float[((List) yVar.h.getValue()).size()]};
                    case 2:
                        return new float[][]{new float[((List) yVar.i.getValue()).size()]};
                    case 3:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_iqc_20250703_v1.tflite"), yVar.f1314d);
                    case 4:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_realtime_20251205_v2.tflite"), yVar.f1314d);
                    case 5:
                        try {
                            V2.c cVar3 = yVar.f1312a;
                            return V2.c.a(s.class);
                        } catch (IOException e) {
                            e.printStackTrace();
                            return C1112C.f9377a;
                        }
                    default:
                        try {
                            V2.c cVar4 = yVar.f1312a;
                            return V2.c.a(t.class);
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            return C1112C.f9377a;
                        }
                }
            }
        });
        final int i13 = 2;
        this.f1318n = C1034e.b(new Function0(this) { // from class: E8.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f1309b;

            {
                this.f1309b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                y yVar = this.f1309b;
                switch (i13) {
                    case 0:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_clf_20251001.tflite"), yVar.f1314d);
                    case 1:
                        return new float[][]{new float[((List) yVar.h.getValue()).size()]};
                    case 2:
                        return new float[][]{new float[((List) yVar.i.getValue()).size()]};
                    case 3:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_iqc_20250703_v1.tflite"), yVar.f1314d);
                    case 4:
                        return new org.tensorflow.lite.b(yVar.f1312a.c("kyc_realtime_20251205_v2.tflite"), yVar.f1314d);
                    case 5:
                        try {
                            V2.c cVar3 = yVar.f1312a;
                            return V2.c.a(s.class);
                        } catch (IOException e) {
                            e.printStackTrace();
                            return C1112C.f9377a;
                        }
                    default:
                        try {
                            V2.c cVar4 = yVar.f1312a;
                            return V2.c.a(t.class);
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            return C1112C.f9377a;
                        }
                }
            }
        });
    }

    public static String a(KycCmsContentData kycCmsContentData, String str) {
        List<KycCaptureGuide> captureGuides;
        Object next;
        KycDocumentTypeGuide document;
        String key;
        if (kycCmsContentData == null || (captureGuides = kycCmsContentData.getCaptureGuides()) == null) {
            captureGuides = C1112C.f9377a;
        }
        Iterator<T> it = captureGuides.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List<KycIdGuide> idGuide = ((KycCaptureGuide) next).getIdGuide();
            if (!(idGuide instanceof Collection) || !idGuide.isEmpty()) {
                Iterator<T> it2 = idGuide.iterator();
                while (it2.hasNext()) {
                    if (kotlin.jvm.internal.j.b(((KycIdGuide) it2.next()).getFront(), str)) {
                        break loop0;
                    }
                }
            }
        }
        KycCaptureGuide kycCaptureGuide = (KycCaptureGuide) next;
        return (kycCaptureGuide == null || (document = kycCaptureGuide.getDocument()) == null || (key = document.getKey()) == null) ? str : key;
    }

    public static boolean e(KycCmsContentData kycCmsContentData, String targetModel) {
        KycCaptureGuide kycCaptureGuide;
        List<KycIdGuide> idGuide;
        List<KycCaptureGuide> captureGuides;
        Object next;
        kotlin.jvm.internal.j.g(targetModel, "targetModel");
        Object obj = null;
        if (kycCmsContentData == null || (captureGuides = kycCmsContentData.getCaptureGuides()) == null) {
            kycCaptureGuide = null;
        } else {
            Iterator<T> it = captureGuides.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                KycDocumentTypeGuide document = ((KycCaptureGuide) next).getDocument();
                if (kotlin.jvm.internal.j.b(document != null ? document.getKey() : null, targetModel)) {
                    break;
                }
            }
            kycCaptureGuide = (KycCaptureGuide) next;
        }
        if (kycCaptureGuide != null && (idGuide = kycCaptureGuide.getIdGuide()) != null) {
            Iterator<T> it2 = idGuide.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (kotlin.jvm.internal.j.b(((KycIdGuide) next2).getFront(), targetModel)) {
                    obj = next2;
                    break;
                }
            }
            obj = (KycIdGuide) obj;
        }
        return obj != null;
    }

    public final float b(int i, String str) {
        if (str.equals("ID CLASSIFICATION")) {
            return ((float[][]) this.m.getValue())[0][i];
        }
        if (str.equals("IMAGE QUALITY")) {
            return ((float[][]) this.f1318n.getValue())[0][i];
        }
        return 0.0f;
    }

    public final KycImageQualityConfidence c(File file, MayaEKYCSelectedDocument mayaEKYCSelectedDocument) {
        Bitmap bitmapDecodeFile;
        PriorityQueue priorityQueue;
        InterfaceC1033d interfaceC1033d;
        InterfaceC1033d interfaceC1033d2;
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
        } catch (Exception unused) {
            bitmapDecodeFile = null;
        }
        if (bitmapDecodeFile == null) {
            return KycImageQualityConfidence.Companion.qualityResultGoodQuality(mayaEKYCSelectedDocument, 0.0f);
        }
        ((org.tensorflow.lite.b) this.f.getValue()).c((ByteBuffer) new Ag.f(1, this, y.class, "preProcessImageQualityV1", "preProcessImageQualityV1(Landroid/graphics/Bitmap;)Ljava/nio/ByteBuffer;", 0, 7).invoke(bitmapDecodeFile), (float[][]) this.f1318n.getValue());
        bitmapDecodeFile.recycle();
        InterfaceC1033d interfaceC1033d3 = this.i;
        int size = ((List) interfaceC1033d3.getValue()).size();
        int i = 0;
        int i4 = 0;
        while (true) {
            priorityQueue = this.j;
            if (i4 >= size) {
                break;
            }
            priorityQueue.add(new AbstractMap.SimpleEntry(((List) interfaceC1033d3.getValue()).get(i4), Float.valueOf(b(i4, "IMAGE QUALITY"))));
            if (priorityQueue.size() > 12) {
                priorityQueue.poll();
            }
            i4++;
        }
        int size2 = priorityQueue.size();
        while (true) {
            interfaceC1033d = this.f1317l;
            interfaceC1033d2 = this.f1316k;
            if (i >= size2) {
                break;
            }
            Map.Entry entry = (Map.Entry) priorityQueue.poll();
            float fFloatValue = entry != null ? ((Number) entry.getValue()).floatValue() : 0.0f;
            ((String[]) interfaceC1033d2.getValue())[i] = entry != null ? (String) entry.getKey() : null;
            String[] strArr = (String[]) interfaceC1033d.getValue();
            String str = new DecimalFormat("##.##", new DecimalFormatSymbols(Locale.US)).format(Float.valueOf(fFloatValue));
            kotlin.jvm.internal.j.f(str, "format(...)");
            strArr[i] = str;
            i++;
        }
        String str2 = ((String[]) interfaceC1033d2.getValue())[11];
        if (str2 == null) {
            str2 = "";
        }
        this.f1320p = str2;
        String str3 = ((String[]) interfaceC1033d.getValue())[11];
        float f = str3 != null ? Float.parseFloat(str3) : 0.0f;
        String str4 = this.f1320p;
        return kotlin.jvm.internal.j.b(str4, "PAPER") ? KycImageQualityConfidence.Companion.qualityResultPaper(mayaEKYCSelectedDocument, f) : kotlin.jvm.internal.j.b(str4, "GOOD_QUALITY") ? KycImageQualityConfidence.Companion.qualityResultGoodQuality(mayaEKYCSelectedDocument, f) : KycImageQualityConfidence.Companion.qualityResultOthers(str4, mayaEKYCSelectedDocument, f);
    }

    public final ArrayList d(Bitmap bitmap) {
        C2038a c2038a = new C2038a(21);
        c2038a.d(new wk.a());
        c2038a.d(new wk.b(new uk.a()));
        ArrayList arrayList = (ArrayList) c2038a.f19100b;
        Collections.unmodifiableMap((HashMap) c2038a.c);
        vk.d dVar = new vk.d(3);
        dVar.f20511b = new C1983a(bitmap);
        Iterator it = arrayList.iterator();
        Object objApply = dVar;
        while (it.hasNext()) {
            objApply = ((sk.a) it.next()).apply(objApply);
        }
        vk.d dVar2 = (vk.d) objApply;
        kotlin.jvm.internal.j.f(dVar2, "process(...)");
        InterfaceC1033d interfaceC1033d = this.f1315g;
        FloatBuffer floatBufferAllocate = FloatBuffer.allocate(((org.tensorflow.lite.b) interfaceC1033d.getValue()).b().a()[1]);
        floatBufferAllocate.rewind();
        org.tensorflow.lite.b bVar = (org.tensorflow.lite.b) interfaceC1033d.getValue();
        vk.b bVar2 = dVar2.f20511b;
        if (bVar2 == null) {
            throw new IllegalStateException("No image has been loaded yet.");
        }
        bVar.c(bVar2.b(dVar2.f20510a).f21025a, floatBufferAllocate);
        floatBufferAllocate.rewind();
        int iCapacity = floatBufferAllocate.capacity();
        float[] fArr = new float[iCapacity];
        floatBufferAllocate.get(fArr);
        ArrayList arrayList2 = new ArrayList(iCapacity);
        for (int i = 0; i < iCapacity; i++) {
            arrayList2.add(Float.valueOf(fArr[i]));
        }
        return arrayList2;
    }

    public final boolean f(KycCmsContentData kycCmsContentData, String str) {
        List<KycDocument> recommendedDocuments;
        List<KycDocument> otherPrimaryDocuments;
        List<KycDocument> secondaryDocuments;
        if (kycCmsContentData == null || (recommendedDocuments = kycCmsContentData.getRecommendedDocuments()) == null) {
            recommendedDocuments = C1112C.f9377a;
        }
        if (kycCmsContentData == null || (otherPrimaryDocuments = kycCmsContentData.getOtherPrimaryDocuments()) == null) {
            otherPrimaryDocuments = C1112C.f9377a;
        }
        if (kycCmsContentData == null || (secondaryDocuments = kycCmsContentData.getSecondaryDocuments()) == null) {
            secondaryDocuments = C1112C.f9377a;
        }
        ArrayList arrayListL = C1110A.L(secondaryDocuments, C1110A.L(otherPrimaryDocuments, recommendedDocuments));
        if (arrayListL.isEmpty()) {
            return false;
        }
        Iterator it = arrayListL.iterator();
        while (it.hasNext()) {
            if (zj.z.o(((KycDocument) it.next()).getKey(), a(this.f1325u, str), true)) {
                return true;
            }
        }
        return false;
    }

    public final KycMatchingConfidence g(MayaEKYCSelectedDocument mayaEKYCSelectedDocument, String str, String str2) {
        if (!str2.equals("BACK")) {
            return KycMatchingConfidence.Companion.notMatch$default(KycMatchingConfidence.Companion, mayaEKYCSelectedDocument, str, 0.0f, 4, null);
        }
        KycMatchingConfidence.Companion companion = KycMatchingConfidence.Companion;
        String str3 = this.f1321q;
        if (str3 == null) {
            str3 = "";
        }
        return companion.guideMismatch(str3, str);
    }
}
