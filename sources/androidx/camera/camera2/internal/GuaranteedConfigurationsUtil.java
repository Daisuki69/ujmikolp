package androidx.camera.camera2.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuaranteedConfigurationsUtil {
    private GuaranteedConfigurationsUtil() {
    }

    @NonNull
    public static List<SurfaceCombination> generateSupportedCombinationList(int i, boolean z4, boolean z5) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getLegacySupportedCombinationList());
        if (i == 0 || i == 1 || i == 3) {
            arrayList.addAll(getLimitedSupportedCombinationList());
        }
        if (i == 1 || i == 3) {
            arrayList.addAll(getFullSupportedCombinationList());
        }
        if (z4) {
            arrayList.addAll(getRAWSupportedCombinationList());
        }
        if (z5 && i == 0) {
            arrayList.addAll(getBurstSupportedCombinationList());
        }
        if (i == 3) {
            arrayList.addAll(getLevel3SupportedCombinationList());
        }
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> get10BitSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationC = We.s.c(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationC2 = We.s.c(configType2, configSize, surfaceCombinationC, arrayList, surfaceCombinationC);
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombinationC2.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination surfaceCombinationC3 = We.s.c(configType3, configSize, surfaceCombinationC2, arrayList, surfaceCombinationC2);
        We.s.z(configType, configSize2, surfaceCombinationC3, configType2, configSize);
        SurfaceCombination surfaceCombinationD = We.s.d(arrayList, surfaceCombinationC3);
        We.s.z(configType2, configSize2, surfaceCombinationD, configType2, configSize);
        SurfaceCombination surfaceCombinationD2 = We.s.d(arrayList, surfaceCombinationD);
        surfaceCombinationD2.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.RECORD;
        SurfaceCombination surfaceCombinationC4 = We.s.c(configType, configSize3, surfaceCombinationD2, arrayList, surfaceCombinationD2);
        We.s.z(configType, configSize2, surfaceCombinationC4, configType, configSize3);
        SurfaceCombination surfaceCombinationC5 = We.s.c(configType2, configSize3, surfaceCombinationC4, arrayList, surfaceCombinationC4);
        We.s.z(configType, configSize2, surfaceCombinationC5, configType, configSize3);
        surfaceCombinationC5.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3));
        arrayList.add(surfaceCombinationC5);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getBurstSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationC = We.s.c(configType, configSize2, surfaceCombination, arrayList, surfaceCombination);
        surfaceCombinationC.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationC2 = We.s.c(configType2, configSize2, surfaceCombinationC, arrayList, surfaceCombinationC);
        We.s.z(configType2, configSize, surfaceCombinationC2, configType2, configSize2);
        arrayList.add(surfaceCombinationC2);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getConcurrentSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.s1440p;
        SurfaceCombination surfaceCombinationC = We.s.c(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceCombination surfaceCombinationC2 = We.s.c(configType2, configSize, surfaceCombinationC, arrayList, surfaceCombinationC);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination surfaceCombinationC3 = We.s.c(configType3, configSize, surfaceCombinationC2, arrayList, surfaceCombinationC2);
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.s720p;
        We.s.z(configType, configSize2, surfaceCombinationC3, configType3, configSize);
        SurfaceCombination surfaceCombinationD = We.s.d(arrayList, surfaceCombinationC3);
        We.s.z(configType2, configSize2, surfaceCombinationD, configType3, configSize);
        SurfaceCombination surfaceCombinationD2 = We.s.d(arrayList, surfaceCombinationD);
        We.s.z(configType, configSize2, surfaceCombinationD2, configType, configSize);
        SurfaceCombination surfaceCombinationD3 = We.s.d(arrayList, surfaceCombinationD2);
        We.s.z(configType, configSize2, surfaceCombinationD3, configType2, configSize);
        SurfaceCombination surfaceCombinationD4 = We.s.d(arrayList, surfaceCombinationD3);
        We.s.z(configType2, configSize2, surfaceCombinationD4, configType, configSize);
        SurfaceCombination surfaceCombinationD5 = We.s.d(arrayList, surfaceCombinationD4);
        We.s.z(configType2, configSize2, surfaceCombinationD5, configType2, configSize);
        arrayList.add(surfaceCombinationD5);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getFullSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationC = We.s.c(configType, configSize2, surfaceCombination, arrayList, surfaceCombination);
        surfaceCombinationC.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationC2 = We.s.c(configType2, configSize2, surfaceCombinationC, arrayList, surfaceCombinationC);
        We.s.z(configType2, configSize, surfaceCombinationC2, configType2, configSize2);
        SurfaceCombination surfaceCombinationD = We.s.d(arrayList, surfaceCombinationC2);
        We.s.z(configType, configSize, surfaceCombinationD, configType, configSize);
        SurfaceCombination surfaceCombinationC3 = We.s.c(SurfaceConfig.ConfigType.JPEG, configSize2, surfaceCombinationD, arrayList, surfaceCombinationD);
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.VGA;
        We.s.z(configType2, configSize3, surfaceCombinationC3, configType, configSize);
        SurfaceCombination surfaceCombinationC4 = We.s.c(configType2, configSize2, surfaceCombinationC3, arrayList, surfaceCombinationC3);
        We.s.z(configType2, configSize3, surfaceCombinationC4, configType2, configSize);
        surfaceCombinationC4.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombinationC4);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getLegacySupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationC = We.s.c(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination surfaceCombinationC2 = We.s.c(configType2, configSize, surfaceCombinationC, arrayList, surfaceCombinationC);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationC3 = We.s.c(configType3, configSize, surfaceCombinationC2, arrayList, surfaceCombinationC2);
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        We.s.z(configType, configSize2, surfaceCombinationC3, configType2, configSize);
        SurfaceCombination surfaceCombinationD = We.s.d(arrayList, surfaceCombinationC3);
        We.s.z(configType3, configSize2, surfaceCombinationD, configType2, configSize);
        SurfaceCombination surfaceCombinationD2 = We.s.d(arrayList, surfaceCombinationD);
        We.s.z(configType, configSize2, surfaceCombinationD2, configType, configSize2);
        SurfaceCombination surfaceCombinationD3 = We.s.d(arrayList, surfaceCombinationD2);
        We.s.z(configType, configSize2, surfaceCombinationD3, configType3, configSize2);
        SurfaceCombination surfaceCombinationD4 = We.s.d(arrayList, surfaceCombinationD3);
        We.s.z(configType, configSize2, surfaceCombinationD4, configType3, configSize2);
        surfaceCombinationD4.addSurfaceConfig(SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombinationD4);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getLevel3SupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.VGA;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType2, configSize3));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.RAW;
        SurfaceCombination surfaceCombinationC = We.s.c(configType3, configSize3, surfaceCombination, arrayList, surfaceCombination);
        We.s.z(configType, configSize, surfaceCombinationC, configType, configSize2);
        We.s.z(SurfaceConfig.ConfigType.JPEG, configSize3, surfaceCombinationC, configType3, configSize3);
        arrayList.add(surfaceCombinationC);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getLimitedSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.RECORD;
        SurfaceCombination surfaceCombinationC = We.s.c(configType, configSize2, surfaceCombination, arrayList, surfaceCombination);
        surfaceCombinationC.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationC2 = We.s.c(configType2, configSize2, surfaceCombinationC, arrayList, surfaceCombinationC);
        We.s.z(configType2, configSize, surfaceCombinationC2, configType2, configSize2);
        SurfaceCombination surfaceCombinationD = We.s.d(arrayList, surfaceCombinationC2);
        We.s.z(configType, configSize, surfaceCombinationD, configType, configSize2);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination surfaceCombinationC3 = We.s.c(configType3, configSize2, surfaceCombinationD, arrayList, surfaceCombinationD);
        We.s.z(configType, configSize, surfaceCombinationC3, configType2, configSize2);
        SurfaceCombination surfaceCombinationC4 = We.s.c(configType3, configSize2, surfaceCombinationC3, arrayList, surfaceCombinationC3);
        We.s.z(configType2, configSize, surfaceCombinationC4, configType2, configSize);
        surfaceCombinationC4.addSurfaceConfig(SurfaceConfig.create(configType3, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombinationC4);
        return arrayList;
    }

    @NonNull
    @RequiresApi(api = 33)
    public static List<SurfaceCombination> getPreviewStabilizationSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.s1440p;
        SurfaceCombination surfaceCombinationC = We.s.c(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationC2 = We.s.c(configType2, configSize, surfaceCombinationC, arrayList, surfaceCombinationC);
        surfaceCombinationC2.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationC3 = We.s.c(configType3, configSize2, surfaceCombinationC2, arrayList, surfaceCombinationC2);
        We.s.z(configType2, configSize, surfaceCombinationC3, configType3, configSize2);
        SurfaceCombination surfaceCombinationD = We.s.d(arrayList, surfaceCombinationC3);
        We.s.z(configType, configSize, surfaceCombinationD, configType2, configSize2);
        SurfaceCombination surfaceCombinationD2 = We.s.d(arrayList, surfaceCombinationD);
        We.s.z(configType2, configSize, surfaceCombinationD2, configType2, configSize2);
        SurfaceCombination surfaceCombinationD3 = We.s.d(arrayList, surfaceCombinationD2);
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.PREVIEW;
        We.s.z(configType, configSize3, surfaceCombinationD3, configType, configSize);
        SurfaceCombination surfaceCombinationD4 = We.s.d(arrayList, surfaceCombinationD3);
        We.s.z(configType2, configSize3, surfaceCombinationD4, configType, configSize);
        SurfaceCombination surfaceCombinationD5 = We.s.d(arrayList, surfaceCombinationD4);
        We.s.z(configType, configSize3, surfaceCombinationD5, configType2, configSize);
        SurfaceCombination surfaceCombinationD6 = We.s.d(arrayList, surfaceCombinationD5);
        We.s.z(configType2, configSize3, surfaceCombinationD6, configType2, configSize);
        arrayList.add(surfaceCombinationD6);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getRAWSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.RAW;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationC = We.s.c(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        We.s.z(configType2, configSize2, surfaceCombinationC, configType, configSize);
        SurfaceCombination surfaceCombinationD = We.s.d(arrayList, surfaceCombinationC);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        We.s.z(configType3, configSize2, surfaceCombinationD, configType, configSize);
        SurfaceCombination surfaceCombinationD2 = We.s.d(arrayList, surfaceCombinationD);
        We.s.z(configType2, configSize2, surfaceCombinationD2, configType2, configSize2);
        SurfaceCombination surfaceCombinationC2 = We.s.c(configType, configSize, surfaceCombinationD2, arrayList, surfaceCombinationD2);
        We.s.z(configType2, configSize2, surfaceCombinationC2, configType3, configSize2);
        SurfaceCombination surfaceCombinationC3 = We.s.c(configType, configSize, surfaceCombinationC2, arrayList, surfaceCombinationC2);
        We.s.z(configType3, configSize2, surfaceCombinationC3, configType3, configSize2);
        SurfaceCombination surfaceCombinationC4 = We.s.c(configType, configSize, surfaceCombinationC3, arrayList, surfaceCombinationC3);
        surfaceCombinationC4.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.JPEG;
        We.s.z(configType4, configSize, surfaceCombinationC4, configType, configSize);
        SurfaceCombination surfaceCombinationD3 = We.s.d(arrayList, surfaceCombinationC4);
        We.s.z(configType3, configSize2, surfaceCombinationD3, configType4, configSize);
        surfaceCombinationD3.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombinationD3);
        return arrayList;
    }

    @NonNull
    @RequiresApi(api = 33)
    public static List<SurfaceCombination> getStreamUseCaseSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.s1440p;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize, 4L));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(configType2, configSize, 4L));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.RECORD;
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(configType, configSize2, 3L));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2, 3L));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3, 2L));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(configType2, configSize3, 2L));
        arrayList.add(surfaceCombination6);
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3, 2L));
        arrayList.add(surfaceCombination7);
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(configType2, configSize3, 2L));
        arrayList.add(surfaceCombination8);
        SurfaceCombination surfaceCombination9 = new SurfaceCombination();
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.create(configType, configSize2, 3L));
        arrayList.add(surfaceCombination9);
        SurfaceCombination surfaceCombination10 = new SurfaceCombination();
        surfaceCombination10.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination10.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2, 3L));
        arrayList.add(surfaceCombination10);
        SurfaceCombination surfaceCombination11 = new SurfaceCombination();
        surfaceCombination11.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination11.addSurfaceConfig(SurfaceConfig.create(configType2, configSize4, 1L));
        arrayList.add(surfaceCombination11);
        SurfaceCombination surfaceCombination12 = new SurfaceCombination();
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.create(configType, configSize2, 3L));
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2, 2L));
        arrayList.add(surfaceCombination12);
        SurfaceCombination surfaceCombination13 = new SurfaceCombination();
        surfaceCombination13.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination13.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2, 3L));
        surfaceCombination13.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2, 2L));
        arrayList.add(surfaceCombination13);
        SurfaceCombination surfaceCombination14 = new SurfaceCombination();
        surfaceCombination14.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination14.addSurfaceConfig(SurfaceConfig.create(configType2, configSize4, 1L));
        surfaceCombination14.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3, 2L));
        arrayList.add(surfaceCombination14);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getUltraHdrSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.JPEG_R;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationC = We.s.c(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        We.s.z(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, surfaceCombinationC, configType, configSize);
        arrayList.add(surfaceCombinationC);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getUltraHighResolutionSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.ULTRA_MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.RECORD;
        SurfaceCombination surfaceCombinationC = We.s.c(configType2, configSize3, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        We.s.z(configType3, configSize, surfaceCombinationC, configType2, configSize2);
        SurfaceCombination surfaceCombinationC2 = We.s.c(configType2, configSize3, surfaceCombinationC, arrayList, surfaceCombinationC);
        SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.RAW;
        We.s.z(configType4, configSize, surfaceCombinationC2, configType2, configSize2);
        SurfaceCombination surfaceCombinationC3 = We.s.c(configType2, configSize3, surfaceCombinationC2, arrayList, surfaceCombinationC2);
        We.s.z(configType, configSize, surfaceCombinationC3, configType2, configSize2);
        SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationC4 = We.s.c(configType3, configSize4, surfaceCombinationC3, arrayList, surfaceCombinationC3);
        We.s.z(configType3, configSize, surfaceCombinationC4, configType2, configSize2);
        SurfaceCombination surfaceCombinationC5 = We.s.c(configType3, configSize4, surfaceCombinationC4, arrayList, surfaceCombinationC4);
        We.s.z(configType4, configSize, surfaceCombinationC5, configType2, configSize2);
        SurfaceCombination surfaceCombinationC6 = We.s.c(configType3, configSize4, surfaceCombinationC5, arrayList, surfaceCombinationC5);
        We.s.z(configType, configSize, surfaceCombinationC6, configType2, configSize2);
        SurfaceCombination surfaceCombinationC7 = We.s.c(configType, configSize4, surfaceCombinationC6, arrayList, surfaceCombinationC6);
        We.s.z(configType3, configSize, surfaceCombinationC7, configType2, configSize2);
        SurfaceCombination surfaceCombinationC8 = We.s.c(configType, configSize4, surfaceCombinationC7, arrayList, surfaceCombinationC7);
        We.s.z(configType4, configSize, surfaceCombinationC8, configType2, configSize2);
        SurfaceCombination surfaceCombinationC9 = We.s.c(configType, configSize4, surfaceCombinationC8, arrayList, surfaceCombinationC8);
        We.s.z(configType, configSize, surfaceCombinationC9, configType2, configSize2);
        SurfaceCombination surfaceCombinationC10 = We.s.c(configType4, configSize4, surfaceCombinationC9, arrayList, surfaceCombinationC9);
        We.s.z(configType3, configSize, surfaceCombinationC10, configType2, configSize2);
        SurfaceCombination surfaceCombinationC11 = We.s.c(configType4, configSize4, surfaceCombinationC10, arrayList, surfaceCombinationC10);
        We.s.z(configType4, configSize, surfaceCombinationC11, configType2, configSize2);
        surfaceCombinationC11.addSurfaceConfig(SurfaceConfig.create(configType4, configSize4));
        arrayList.add(surfaceCombinationC11);
        return arrayList;
    }
}
