package We;

import android.util.Log;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class s {
    public static float a(float f, float f3, float f7, float f10) {
        return ((f - f3) * f7) + f10;
    }

    public static int b(int i, int i4, int i6, int i10) {
        return i + i4 + i6 + i10;
    }

    public static SurfaceCombination c(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, SurfaceCombination surfaceCombination, ArrayList arrayList, SurfaceCombination surfaceCombination2) {
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination2);
        return new SurfaceCombination();
    }

    public static SurfaceCombination d(ArrayList arrayList, SurfaceCombination surfaceCombination) {
        arrayList.add(surfaceCombination);
        return new SurfaceCombination();
    }

    public static Object e(int i, List list) {
        return list.get(list.size() - i);
    }

    public static String f(int i, String str) {
        return str + i;
    }

    public static String g(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String h(long j, String str, StringBuilder sb2) {
        sb2.append(j);
        sb2.append(str);
        return sb2.toString();
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String l(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String m(StringBuilder sb2, int i, char c) {
        sb2.append(i);
        sb2.append(c);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, String str, float f) {
        sb2.append(f);
        sb2.append(str);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, String str, int i) {
        sb2.append(i);
        sb2.append(str);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String q(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String r(StringBuilder sb2, List list, String str) {
        sb2.append(list);
        sb2.append(str);
        return sb2.toString();
    }

    public static String s(StringBuilder sb2, boolean z4, String str) {
        sb2.append(z4);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder t(int i, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder u(String str, int i, String str2, int i4, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i);
        sb2.append(str2);
        sb2.append(i4);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder v(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder w(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder x(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static void y(int i, String str, String str2) {
        Log.e(str2, str + i);
    }

    public static void z(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, SurfaceCombination surfaceCombination, SurfaceConfig.ConfigType configType2, SurfaceConfig.ConfigSize configSize2) {
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
    }
}
