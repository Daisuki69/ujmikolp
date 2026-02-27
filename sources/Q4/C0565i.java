package Q4;

import M8.A0;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import bj.C1038i;
import defpackage.Camera;
import defpackage.Dimension;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Q4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0565i extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0566j f5242a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0565i(C0566j c0566j, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5242a = c0566j;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new C0565i(this.f5242a, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0565i) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        char c;
        int width;
        int height;
        Size[] outputSizes;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        C0566j c0566j = this.f5242a;
        Object systemService = c0566j.c.getSystemService("camera");
        CameraManager cameraManager = systemService instanceof CameraManager ? (CameraManager) systemService : null;
        try {
            C1037h.a aVar = C1037h.f9166b;
            objA = cameraManager != null ? cameraManager.getCameraIdList() : null;
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        Throwable thA = C1037h.a(objA);
        if (thA != null) {
            String strB = C1030a.b(thA);
            String strC = kotlin.jvm.internal.z.a(C0566j.class).c();
            if (strC == null) {
                strC = "CoroutineScopedExtractor";
            }
            A0.w(2, strB, strC);
            G4.b bVar = c0566j.f1548b;
            if (bVar != null) {
                bVar.a(thA);
            }
        }
        if (objA instanceof C1038i) {
            objA = null;
        }
        String[] strArr = (String[]) objA;
        ArrayList arrayList = c0566j.f5243d;
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            int i4 = 0;
            while (i4 < length) {
                String str = strArr[i4];
                try {
                    C1037h.a aVar3 = C1037h.f9166b;
                    CameraCharacteristics cameraCharacteristics = cameraManager != null ? cameraManager.getCameraCharacteristics(str) : null;
                    StreamConfigurationMap streamConfigurationMap = cameraCharacteristics != null ? (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP) : null;
                    Size[] outputSizes2 = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(256) : null;
                    Size size = (streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(256)) == null) ? null : outputSizes[i];
                    String str2 = (Build.VERSION.SDK_INT < 28 || cameraCharacteristics == null) ? null : (String) cameraCharacteristics.get(CameraCharacteristics.INFO_VERSION);
                    ArrayList arrayList2 = new ArrayList();
                    if (outputSizes2 != null) {
                        int length2 = outputSizes2.length;
                        int i6 = i;
                        width = i6;
                        height = width;
                        while (i6 < length2) {
                            Size size2 = outputSizes2[i6];
                            arrayList2.add(new Dimension(Integer.valueOf(size2.getWidth()), Integer.valueOf(size2.getHeight()), null, 4, null));
                            if (size2.getWidth() * size2.getHeight() > width * height) {
                                width = size2.getWidth();
                                height = size2.getHeight();
                            }
                            i6++;
                        }
                    } else {
                        width = 0;
                        height = 0;
                    }
                    arrayList.add(new Camera(new Dimension(Integer.valueOf(width), Integer.valueOf(height), null, 4, null), new Dimension(size != null ? Integer.valueOf(size.getWidth()) : null, size != null ? Integer.valueOf(size.getHeight()) : null, null, 4, null), arrayList2, str2, null, 16, null));
                    objA2 = Unit.f18162a;
                } catch (Throwable th3) {
                    C1037h.a aVar4 = C1037h.f9166b;
                    objA2 = AbstractC1039j.a(th3);
                }
                Throwable thA2 = C1037h.a(objA2);
                if (thA2 != null) {
                    String strB2 = C1030a.b(thA2);
                    String strC2 = kotlin.jvm.internal.z.a(C0566j.class).c();
                    if (strC2 == null) {
                        strC2 = "CoroutineScopedExtractor";
                    }
                    c = 2;
                    A0.w(2, strB2, strC2);
                    G4.b bVar2 = c0566j.f1548b;
                    if (bVar2 != null) {
                        bVar2.a(thA2);
                    }
                } else {
                    c = 2;
                }
                i4++;
                i = 0;
            }
        }
        G4.b bVar3 = c0566j.f1548b;
        if (bVar3 != null) {
            bVar3.b(new K4.l(arrayList));
        }
        return Unit.f18162a;
    }
}
