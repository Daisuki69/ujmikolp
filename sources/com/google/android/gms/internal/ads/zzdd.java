package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import com.dynatrace.android.agent.Global;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdd {
    private static final Pattern zza = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern zzb = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern zzc = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        zzd = map;
        androidx.camera.core.impl.a.z(-984833, map, "aliceblue", -332841, "antiquewhite");
        androidx.camera.core.impl.a.D(map, "aqua", -16711681, -8388652, "aquamarine");
        androidx.camera.core.impl.a.z(-983041, map, "azure", -657956, "beige");
        androidx.camera.core.impl.a.z(-6972, map, "bisque", -16777216, "black");
        androidx.camera.core.impl.a.z(-5171, map, "blanchedalmond", -16776961, "blue");
        androidx.camera.core.impl.a.z(-7722014, map, "blueviolet", -5952982, "brown");
        androidx.camera.core.impl.a.z(-2180985, map, "burlywood", -10510688, "cadetblue");
        androidx.camera.core.impl.a.z(-8388864, map, "chartreuse", -2987746, "chocolate");
        androidx.camera.core.impl.a.z(-32944, map, "coral", -10185235, "cornflowerblue");
        androidx.camera.core.impl.a.z(-1828, map, "cornsilk", -2354116, "crimson");
        androidx.camera.core.impl.a.D(map, "cyan", -16711681, -16777077, "darkblue");
        androidx.camera.core.impl.a.z(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        androidx.camera.core.impl.a.D(map, "darkgray", -5658199, -16751616, "darkgreen");
        androidx.camera.core.impl.a.D(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        androidx.camera.core.impl.a.z(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        androidx.camera.core.impl.a.z(-29696, map, "darkorange", -6737204, "darkorchid");
        androidx.camera.core.impl.a.z(-7667712, map, "darkred", -1468806, "darksalmon");
        androidx.camera.core.impl.a.z(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        androidx.camera.core.impl.a.D(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        androidx.camera.core.impl.a.z(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        androidx.camera.core.impl.a.D(map, "dodgerblue", -14774017, -5103070, "firebrick");
        androidx.camera.core.impl.a.z(-1296, map, "floralwhite", -14513374, "forestgreen");
        androidx.camera.core.impl.a.D(map, "fuchsia", -65281, -2302756, "gainsboro");
        androidx.camera.core.impl.a.z(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        androidx.camera.core.impl.a.z(-16744448, map, "green", -5374161, "greenyellow");
        androidx.camera.core.impl.a.D(map, "grey", -8355712, -983056, "honeydew");
        androidx.camera.core.impl.a.z(-38476, map, "hotpink", -3318692, "indianred");
        androidx.camera.core.impl.a.z(-11861886, map, "indigo", -16, "ivory");
        androidx.camera.core.impl.a.z(-989556, map, "khaki", -1644806, "lavender");
        androidx.camera.core.impl.a.z(-3851, map, "lavenderblush", -8586240, "lawngreen");
        androidx.camera.core.impl.a.z(-1331, map, "lemonchiffon", -5383962, "lightblue");
        androidx.camera.core.impl.a.z(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        androidx.camera.core.impl.a.z(-18751, map, "lightpink", -24454, "lightsalmon");
        androidx.camera.core.impl.a.z(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        androidx.camera.core.impl.a.D(map, "lightsteelblue", -5192482, -32, "lightyellow");
        androidx.camera.core.impl.a.z(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        androidx.camera.core.impl.a.z(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        androidx.camera.core.impl.a.z(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        androidx.camera.core.impl.a.z(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        androidx.camera.core.impl.a.z(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        androidx.camera.core.impl.a.z(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        androidx.camera.core.impl.a.z(-15132304, map, "midnightblue", -655366, "mintcream");
        androidx.camera.core.impl.a.z(-6943, map, "mistyrose", -6987, "moccasin");
        androidx.camera.core.impl.a.z(-8531, map, "navajowhite", -16777088, "navy");
        androidx.camera.core.impl.a.z(-133658, map, "oldlace", -8355840, "olive");
        androidx.camera.core.impl.a.z(-9728477, map, "olivedrab", -23296, "orange");
        androidx.camera.core.impl.a.z(-47872, map, "orangered", -2461482, "orchid");
        androidx.camera.core.impl.a.z(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        androidx.camera.core.impl.a.z(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        androidx.camera.core.impl.a.z(-4139, map, "papayawhip", -9543, "peachpuff");
        androidx.camera.core.impl.a.z(-3308225, map, "peru", -16181, "pink");
        androidx.camera.core.impl.a.z(-2252579, map, "plum", -5185306, "powderblue");
        androidx.camera.core.impl.a.z(-8388480, map, "purple", -10079335, "rebeccapurple");
        androidx.camera.core.impl.a.z(-65536, map, "red", -4419697, "rosybrown");
        androidx.camera.core.impl.a.z(-12490271, map, "royalblue", -7650029, "saddlebrown");
        androidx.camera.core.impl.a.z(-360334, map, "salmon", -744352, "sandybrown");
        androidx.camera.core.impl.a.z(-13726889, map, "seagreen", -2578, "seashell");
        androidx.camera.core.impl.a.z(-6270419, map, "sienna", -4144960, "silver");
        androidx.camera.core.impl.a.z(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        androidx.camera.core.impl.a.D(map, "snow", -1286, -16711809, "springgreen");
        androidx.camera.core.impl.a.z(-12156236, map, "steelblue", -2968436, "tan");
        androidx.camera.core.impl.a.z(-16744320, map, "teal", -2572328, "thistle");
        androidx.camera.core.impl.a.z(-40121, map, "tomato", 0, "transparent");
        androidx.camera.core.impl.a.z(-12525360, map, "turquoise", -1146130, "violet");
        androidx.camera.core.impl.a.z(-663885, map, "wheat", -1, "white");
        androidx.camera.core.impl.a.z(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    @ColorInt
    public static int zza(String str) {
        return zzc(str, false);
    }

    @ColorInt
    public static int zzb(String str) {
        return zzc(str, true);
    }

    @ColorInt
    private static int zzc(String str, boolean z4) {
        int i;
        zzghc.zza(!TextUtils.isEmpty(str));
        String strReplace = str.replace(Global.BLANK, "");
        if (strReplace.charAt(0) == '#') {
            int i4 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i4;
            }
            if (strReplace.length() == 9) {
                return ((i4 & 255) << 24) | (i4 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z4 ? zzc : zzb).matcher(strReplace);
            if (matcher.matches()) {
                if (z4) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i6 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i10 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i6, i10, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = zza.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i11 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i12 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i11, i12, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) zzd.get(zzggj.zza(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
