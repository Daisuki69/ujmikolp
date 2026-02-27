package bg;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import cj.C1129o;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bg.Z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0986Z extends kotlin.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0990b0 f8916b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0986Z(C0990b0 c0990b0, int i) {
        super(1);
        this.f8915a = i;
        this.f8916b = c0990b0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.f8915a) {
            case 0:
                C0990b0 c0990b0 = this.f8916b;
                CameraCharacteristics cameraCharacteristicsH = C0990b0.h(c0990b0, str);
                CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
                kotlin.jvm.internal.j.c(key, "CameraCharacteristics.FLASH_INFO_AVAILABLE");
                Boolean bool = (Boolean) (cameraCharacteristicsH != null ? cameraCharacteristicsH.get(key) : null);
                if (bool == null) {
                    return null;
                }
                boolean zBooleanValue = bool.booleanValue();
                c0990b0.getClass();
                return String.valueOf(zBooleanValue ? 1 : 0);
            case 1:
                CameraCharacteristics cameraCharacteristicsH2 = C0990b0.h(this.f8916b, str);
                CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
                kotlin.jvm.internal.j.c(key2, "CameraCharacteristics.IN…_SUPPORTED_HARDWARE_LEVEL");
                Object obj2 = cameraCharacteristicsH2 != null ? cameraCharacteristicsH2.get(key2) : null;
                if (obj2 != null) {
                    return obj2.toString();
                }
                return null;
            case 2:
                CameraCharacteristics cameraCharacteristicsH3 = C0990b0.h(this.f8916b, str);
                CameraCharacteristics.Key key3 = CameraCharacteristics.LENS_FACING;
                kotlin.jvm.internal.j.c(key3, "CameraCharacteristics.LENS_FACING");
                Object obj3 = cameraCharacteristicsH3 != null ? cameraCharacteristicsH3.get(key3) : null;
                if (obj3 != null) {
                    return obj3.toString();
                }
                return null;
            case 3:
                CameraCharacteristics cameraCharacteristicsH4 = C0990b0.h(this.f8916b, str);
                CameraCharacteristics.Key key4 = CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES;
                kotlin.jvm.internal.j.c(key4, "CameraCharacteristics.LE…_INFO_AVAILABLE_APERTURES");
                float[] fArr = (float[]) (cameraCharacteristicsH4 != null ? cameraCharacteristicsH4.get(key4) : null);
                if (fArr == null) {
                    return null;
                }
                Float[] fArr2 = new Float[fArr.length];
                int length = fArr.length;
                for (int i = 0; i < length; i++) {
                    fArr2[i] = Float.valueOf(fArr[i]);
                }
                return C1129o.w(fArr2, Global.SEMICOLON, null, 62);
            case 4:
                CameraCharacteristics cameraCharacteristicsH5 = C0990b0.h(this.f8916b, str);
                CameraCharacteristics.Key key5 = CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS;
                kotlin.jvm.internal.j.c(key5, "CameraCharacteristics.LE…O_AVAILABLE_FOCAL_LENGTHS");
                float[] fArr3 = (float[]) (cameraCharacteristicsH5 != null ? cameraCharacteristicsH5.get(key5) : null);
                if (fArr3 == null) {
                    return null;
                }
                Float[] fArr4 = new Float[fArr3.length];
                int length2 = fArr3.length;
                for (int i4 = 0; i4 < length2; i4++) {
                    fArr4[i4] = Float.valueOf(fArr3[i4]);
                }
                return C1129o.w(fArr4, Global.SEMICOLON, null, 62);
            case 5:
                CameraCharacteristics cameraCharacteristicsH6 = C0990b0.h(this.f8916b, str);
                CameraCharacteristics.Key key6 = CameraCharacteristics.REQUEST_MAX_NUM_OUTPUT_PROC;
                kotlin.jvm.internal.j.c(key6, "CameraCharacteristics.REQUEST_MAX_NUM_OUTPUT_PROC");
                Object obj4 = cameraCharacteristicsH6 != null ? cameraCharacteristicsH6.get(key6) : null;
                if (obj4 != null) {
                    return obj4.toString();
                }
                return null;
            case 6:
                CameraCharacteristics cameraCharacteristicsH7 = C0990b0.h(this.f8916b, str);
                CameraCharacteristics.Key key7 = CameraCharacteristics.REQUEST_MAX_NUM_OUTPUT_PROC_STALLING;
                kotlin.jvm.internal.j.c(key7, "CameraCharacteristics.RE…_NUM_OUTPUT_PROC_STALLING");
                Object obj5 = cameraCharacteristicsH7 != null ? cameraCharacteristicsH7.get(key7) : null;
                if (obj5 != null) {
                    return obj5.toString();
                }
                return null;
            case 7:
                CameraCharacteristics cameraCharacteristicsH8 = C0990b0.h(this.f8916b, str);
                CameraCharacteristics.Key key8 = CameraCharacteristics.REQUEST_MAX_NUM_OUTPUT_RAW;
                kotlin.jvm.internal.j.c(key8, "CameraCharacteristics.REQUEST_MAX_NUM_OUTPUT_RAW");
                Object obj6 = cameraCharacteristicsH8 != null ? cameraCharacteristicsH8.get(key8) : null;
                if (obj6 != null) {
                    return obj6.toString();
                }
                return null;
            case 8:
                CameraCharacteristics cameraCharacteristicsH9 = C0990b0.h(this.f8916b, str);
                CameraCharacteristics.Key key9 = CameraCharacteristics.REQUEST_PARTIAL_RESULT_COUNT;
                kotlin.jvm.internal.j.c(key9, "CameraCharacteristics.REQUEST_PARTIAL_RESULT_COUNT");
                Object obj7 = cameraCharacteristicsH9 != null ? cameraCharacteristicsH9.get(key9) : null;
                if (obj7 != null) {
                    return obj7.toString();
                }
                return null;
            case 9:
                CameraCharacteristics cameraCharacteristicsH10 = C0990b0.h(this.f8916b, str);
                StreamConfigurationMap streamConfigurationMap = cameraCharacteristicsH10 != null ? (StreamConfigurationMap) cameraCharacteristicsH10.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP) : null;
                Size[] outputSizes = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(256) : null;
                if (outputSizes == null) {
                    outputSizes = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(1144402265) : null;
                }
                if (outputSizes == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Size size : outputSizes) {
                    arrayList.add(String.valueOf(size.getWidth()) + "x" + size.getHeight());
                }
                Object[] array = arrayList.toArray(new Object[0]);
                if (array != null) {
                    return C1129o.w(array, Global.SEMICOLON, null, 62);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            case 10:
                CameraCharacteristics cameraCharacteristicsH11 = C0990b0.h(this.f8916b, str);
                CameraCharacteristics.Key key10 = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
                kotlin.jvm.internal.j.c(key10, "CameraCharacteristics.SC…VAILABLE_MAX_DIGITAL_ZOOM");
                Object obj8 = cameraCharacteristicsH11 != null ? cameraCharacteristicsH11.get(key10) : null;
                if (obj8 != null) {
                    return obj8.toString();
                }
                return null;
            case 11:
                CameraCharacteristics cameraCharacteristicsH12 = C0990b0.h(this.f8916b, str);
                CameraCharacteristics.Key key11 = CameraCharacteristics.SCALER_CROPPING_TYPE;
                kotlin.jvm.internal.j.c(key11, "CameraCharacteristics.SCALER_CROPPING_TYPE");
                Object obj9 = cameraCharacteristicsH12 != null ? cameraCharacteristicsH12.get(key11) : null;
                if (obj9 != null) {
                    return obj9.toString();
                }
                return null;
            case 12:
                CameraCharacteristics cameraCharacteristicsH13 = C0990b0.h(this.f8916b, str);
                CameraCharacteristics.Key key12 = CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT;
                kotlin.jvm.internal.j.c(key12, "CameraCharacteristics.SE…_COLOR_FILTER_ARRANGEMENT");
                Object obj10 = cameraCharacteristicsH13 != null ? cameraCharacteristicsH13.get(key12) : null;
                if (obj10 != null) {
                    return obj10.toString();
                }
                return null;
            case 13:
                CameraCharacteristics cameraCharacteristicsH14 = C0990b0.h(this.f8916b, str);
                Size size2 = cameraCharacteristicsH14 != null ? (Size) cameraCharacteristicsH14.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE) : null;
                if (size2 == null) {
                    return null;
                }
                return String.valueOf(size2.getWidth()) + "x" + size2.getHeight();
            case 14:
                CameraCharacteristics cameraCharacteristicsH15 = C0990b0.h(this.f8916b, str);
                CameraCharacteristics.Key key13 = CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
                kotlin.jvm.internal.j.c(key13, "CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE");
                Object obj11 = cameraCharacteristicsH15 != null ? cameraCharacteristicsH15.get(key13) : null;
                if (obj11 != null) {
                    return obj11.toString();
                }
                return null;
            default:
                CameraCharacteristics cameraCharacteristicsH16 = C0990b0.h(this.f8916b, str);
                CameraCharacteristics.Key key14 = CameraCharacteristics.SENSOR_ORIENTATION;
                kotlin.jvm.internal.j.c(key14, "CameraCharacteristics.SENSOR_ORIENTATION");
                Object obj12 = cameraCharacteristicsH16 != null ? cameraCharacteristicsH16.get(key14) : null;
                if (obj12 != null) {
                    return obj12.toString();
                }
                return null;
        }
    }
}
